package com.excel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.excel.ExcelWriter;
//import org.apache.poi.excel.ExcelWriter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.excel.enums.ExcelUtilityEnums;
import com.excel.pojo.AllXVACalypsos;
import com.excel.pojo.Recon;
import com.excel.pojo.RiskOvernightRates;
import com.excel.pojo.XVATradesToExternalAccount;
import com.excel.util.CommonMethodsUtil;
import com.excel.util.DateUtil;
import com.excel.util.ReaderUtil;

public class Processor {

	public static void main(String[] args) {
		Map<String, List> allExcelsMap = new HashMap<String, List>();
		List<Recon> reconList = new ArrayList<Recon>();
		Map<Long, List> reconMap = new HashMap<Long, List>();
		if (args.length == 0 || args.length != 3) 
		{
			System.out.println("PLEASE PROVIDE SOURCE/ DESTINATION, XVA TRADE ACCOUNTS FILES AND THE NUMBER OF DAYS BACKWARDS TO PROCESS THE FILES.");
			return;
		}
		
		

		String sourceFilePath = args[0];
		int noOfDaysBackwards = Integer.parseInt(args[2]);
		Date currdate = new Date();
		LocalDate prevDate = LocalDate.now().minusDays(noOfDaysBackwards);
		LocalDate oldDate = LocalDate.now().minusDays(noOfDaysBackwards + 1);
		String destinationFilePath = args[1] + "/" + DateUtil.mmddyyyyFmtSepByEiphen(prevDate);
		
		
		
		String newSheetName = "All XVA Trades Tab";
		String reconFile = "Recon$$";
		String ratesOvernightRisk = "RiskOvernightRates$$";
		String xvaTradesToExternalAccount = "XVATradestoExternalAccount.xlsx";
		String xvaCalypsoRecon = "XVACalypsoRecon$$";
		String xvaCalypsoReconLDN = "XVACalypsoRecon_LDN$$";
		String xvaCalypsoReconDealers = "XVACalypsoReconDealers$$";
		String xvaCalypsoReconDealersLDN = "XVACalypsoReconDealers_LDN$$";

		reconFile = reconFile.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(prevDate));
		ratesOvernightRisk = ratesOvernightRisk.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(prevDate));
		xvaCalypsoRecon = xvaCalypsoRecon.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(oldDate));
		xvaCalypsoReconLDN = xvaCalypsoReconLDN.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(oldDate));
		xvaCalypsoReconDealers = xvaCalypsoReconDealers.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(oldDate));
		xvaCalypsoReconDealersLDN = xvaCalypsoReconDealersLDN.replace("$$", DateUtil.mmddyyyyFmtSepByEiphen(oldDate));

		reconFile = reconFile + ".xlsx";
		ratesOvernightRisk = ratesOvernightRisk + ".xlsx";
		xvaCalypsoRecon = xvaCalypsoRecon + ".xlsx";
		xvaCalypsoReconLDN = xvaCalypsoReconLDN + ".xlsx";
		xvaCalypsoReconDealers = xvaCalypsoReconDealers + ".xlsx";
		xvaCalypsoReconDealersLDN = xvaCalypsoReconDealersLDN + ".xlsx";

		List<String> xvaCalypsoFilesList = new ArrayList<String>();

		xvaCalypsoFilesList.add(xvaCalypsoRecon);
		xvaCalypsoFilesList.add(xvaCalypsoReconLDN);
		xvaCalypsoFilesList.add(xvaCalypsoReconDealers);
		xvaCalypsoFilesList.add(xvaCalypsoReconDealersLDN);

		
		
			

			File sourceDirectory = new File(sourceFilePath);

			if (!sourceDirectory.exists()) {
				System.out.println("Soure File Directory not found.");
			}

			// Step1: Create a folder with T-1 date

			File destinationDirectory = new File(destinationFilePath);
			if (!destinationDirectory.exists()) {
				destinationDirectory.mkdirs();
			}

			// All T-2 files should be there:
			// TODO: need to handle for date if T-2 is not there, need to confirm if all the
			// calypso files have to be of same date
			// Step2: copy all the Calypso files from source to destination

			for (String calypsoFile : xvaCalypsoFilesList) {
				System.out.println("calypsoFile: " + calypsoFile);
				File tempCalypsoDestFile = CommonMethodsUtil.copyFileFromSourcetoDestination(sourceDirectory,
						destinationDirectory, calypsoFile);
				allExcelsMap = ReaderUtil.excelDataToMap(tempCalypsoDestFile);
			}

			// Step3: Copy XVA Trades to External Account file from source to destination

			File tempXVATradesExtAccDestFile = CommonMethodsUtil.copyFileFromSourcetoDestination(sourceDirectory,
					destinationDirectory, xvaTradesToExternalAccount);
			allExcelsMap = ReaderUtil.excelDataToMap(tempXVATradesExtAccDestFile);

			// Step4: Copy Rates Overnight Risk file from source to destination

			File tempRatesOvrnghtRiskDestFile = CommonMethodsUtil.copyFileFromSourcetoDestination(sourceDirectory,
					destinationDirectory, ratesOvernightRisk);

			CommonMethodsUtil.removeOtherSheets("NPV Results", tempRatesOvrnghtRiskDestFile);

			allExcelsMap = ReaderUtil.excelDataToMap(tempRatesOvrnghtRiskDestFile);

			// Using Hashmap.forEach()
			allExcelsMap.forEach((k, v) -> System.out.println(k + " : " + v));

			// Getting the data from the maps

			List<Object> xvaTradExtAccList = CommonMethodsUtil.returnList("XVATradesToExternalAccount", allExcelsMap);
			List<Object> riskOvrnghtRatesList = CommonMethodsUtil.returnList("RiskOvernightRates", allExcelsMap);
			List<Object> allCalypsosList = CommonMethodsUtil.returnList("AllXVACalypsos", allExcelsMap);

			for (Object riskRateObj : riskOvrnghtRatesList) {
				if (riskRateObj instanceof RiskOvernightRates) {
					Recon recon = new Recon();
					RiskOvernightRates rskOvrRat = (RiskOvernightRates) riskRateObj;
					String tradeId = rskOvrRat.getTradeId();

					long extAccId = getExternalAccountId(reconMap, xvaTradExtAccList, tradeId);
					if(extAccId != 0)
					{
						recon.setExternalAccount(extAccId);
						recon.setTradeid(tradeId);
						recon.setCreditcurvename(rskOvrRat.getCreditCurveName());
						recon.setRecoveryrate(rskOvrRat.getRecoveryRate());
						recon.setSumofunderlyingtradecount(rskOvrRat.getUnderlyingTradeCount());
						recon.setSumofnpv(rskOvrRat.getnPV());
						recon.setSumofcva(rskOvrRat.getcVA());
						recon.setSumofdva(rskOvrRat.getdVA());
						recon.setSumofunderlyingportvalue(rskOvrRat.getUnderlyingPortValue());
	
						for (Object calypsoObj : allCalypsosList) {
							if (calypsoObj instanceof AllXVACalypsos) {
								AllXVACalypsos allCalypso = (AllXVACalypsos) calypsoObj;
								if (extAccId == allCalypso.getCptyId()) {
									String calTradeCount = allCalypso.getCalypsoTradeCount();
									System.out.println(calTradeCount);
									if (calTradeCount != null && !calTradeCount.trim().equalsIgnoreCase("")) {
										String[] calTradeCountArr = calTradeCount.split(",");
										System.out.println(calTradeCountArr.length);
										recon.setCalypsotradecount(calTradeCountArr.length);
									} else {
										recon.setCalypsotradecount(0);
									}
									recon.setCalypsonpv(allCalypso.getCalypsoNPV());
									recon.setCalypsocva(allCalypso.getCalypsoCVA());
									recon.setCalypsodva(allCalypso.getCalypsoDVA());
									recon.setCalypsounderlyingportvalue(allCalypso.getCalypsoUnderlyingPortValue());
									recon.setCalypsocreditcurve(allCalypso.getCalypsoCreditCurve());
									recon.setCalypsorecoveryrate(allCalypso.getCalypsoRecoveryRate());
								}
							}
	
						}
	
						// Calculate Differences
						recon.setTradesdiff(recon.getSumofunderlyingtradecount() - recon.getCalypsotradecount());
						recon.setNpvdiff(recon.getSumofnpv() - recon.getCalypsonpv());
						recon.setCvadiff(recon.getSumofcva() - recon.getCalypsocva());
						recon.setDvadiff(recon.getSumofdva() - recon.getCalypsodva());
						recon.setPortvaldiff(recon.getSumofunderlyingportvalue() - recon.getCalypsounderlyingportvalue());
						
						System.out.println(rskOvrRat.getCreditCurveName());
						System.out.println(recon.getCalypsocreditcurve());
						if(rskOvrRat.getCreditCurveName().contains("|"))
						{
							String str = rskOvrRat.getCreditCurveName();
							String[] crdtCurvNameArr = str.split("\\|");
							
							//String rplcStr = rskOvrRat.getCreditCurveName();
							//rplcStr = rplcStr.replaceAll("\\|", "");
							
							System.out.println(crdtCurvNameArr[1]);
							System.out.println(recon.getCalypsocreditcurve());
							if(crdtCurvNameArr[1].equalsIgnoreCase(recon.getCalypsocreditcurve()))
							{
								recon.setCreditcurvematch(ExcelUtilityEnums.MATCH);
							}
							else
							{
								recon.setCreditcurvematch(ExcelUtilityEnums.DONT_MATCH);
							}
						}
						recon.setRrdiff(recon.getRecoveryrate() - recon.getCalypsorecoveryrate());
						
						// recon.setuLTradesMatch(recon.get);
						recon.setUltradesmatch(Math.abs(recon.getSumofunderlyingtradecount() - recon.getCalypsotradecount()));
						System.out.println("Recon: " + recon);
						reconList.add(recon);
					}

				}
			}

			for (Object obj : reconList) {
				if (obj instanceof Recon) {
					Recon rcn = (Recon) obj;
					System.out.println(rcn);
				}

			}

			System.out.println("destinationFilePath: " + destinationFilePath);
			System.out.println("reconFile: " + reconFile);
			
			// Step5: Create an excel with name: ReconT-1 with tab name: All XVA Trades Tab and copy all the data from NPV results sheet in Rates Overnight Risk file
			ExcelWriter.write(destinationFilePath, reconFile, reconList);
		
	}

	/***
	 * TODO: use streams
	 * 
	 * @param reconMap
	 * @param xvaTradExtAccList
	 * @param tradeId
	 * @return
	 */
	private static long getExternalAccountId(Map<Long, List> reconMap, List<Object> xvaTradExtAccList, String tradeId) {
		long extAccId = 0;
		for (Object xvaObj : xvaTradExtAccList) {
			if (xvaObj instanceof XVATradesToExternalAccount) {
				XVATradesToExternalAccount xvaTradsExtAcc = (XVATradesToExternalAccount) xvaObj;
				if (tradeId.equalsIgnoreCase(xvaTradsExtAcc.getxVaTradeId())) {
					extAccId = xvaTradsExtAcc.getExtAccId();
					// List<RiskOvernightRates> riskOvrNghtRateList = new
					// ArrayList<RiskOvernightRates>();
					// Collections.addAll(riskOvrNghtRateList, elements);
					// recon.set
					// reconMap.put(xvaTradsExtAcc.getExtAccId(), riskOvrNghtRateList);
				}
			}

		}
		return extAccId;
	}
}
