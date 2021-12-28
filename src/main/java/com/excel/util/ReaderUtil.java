package com.excel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;

import com.excel.pojo.AllXVACalypsos;
import com.excel.pojo.Recon;
import com.excel.pojo.RiskOvernightRates;
import com.excel.pojo.XVATradesToExternalAccount;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;

public class ReaderUtil {
	
	public static Map<String, List> xcelDataToMap = new HashMap<String, List>();
	
	private static void populateList(String key, List lst)
	 {
		 List lst1 = xcelDataToMap.get(key);
		 if(lst1 == null)
		 {
			 lst1 = new ArrayList();
		 }
		 lst1.addAll(lst);
		 xcelDataToMap.put(key, lst1);
	 }

	public static Map<String, List> excelDataToMap(File excelFilePath) {
		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().addListDelimiter(";").build();
		
		  String excelName = CommonMethodsUtil.getQualifiedFileName(FilenameUtils.removeExtension(excelFilePath.getName()));
		  System.out.println("excelName: " + excelName);
		  
		//Class returnClass = null;
		  
		try {
			InputStream stream = new FileInputStream(excelFilePath);
			
			switch (excelName) {
			case "XVACalypsoReconDealers_LDN":
				List<AllXVACalypsos> XVACalypsoReconDealers_LDN = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AllXVACalypsos.class, options);
				populateList("AllXVACalypsos", XVACalypsoReconDealers_LDN);
				//xcelDataToMap.put("AllXVACalypsos", XVACalypsoReconDealers_LDN);
				break;
			case "XVACalypsoRecon_LDN":
				List<AllXVACalypsos> XVACalypsoRecon_LDN = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AllXVACalypsos.class, options);
				populateList("AllXVACalypsos", XVACalypsoRecon_LDN);
				//xcelDataToMap.put("AllXVACalypsos", XVACalypsoRecon_LDN);
				break;
			case "XVACalypsoReconDealers":
				List<AllXVACalypsos> XVACalypsoReconDealers = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AllXVACalypsos.class, options);
				populateList("AllXVACalypsos", XVACalypsoReconDealers);
				//xcelDataToMap.put("AllXVACalypsos", XVACalypsoReconDealers);
				break;
			case "XVACalypsoRecon":
				List<AllXVACalypsos> XVACalypsoRecon = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AllXVACalypsos.class, options);
				populateList("AllXVACalypsos", XVACalypsoRecon);
				//xcelDataToMap.put("AllXVACalypsos", XVACalypsoRecon);
				break;
			case "RiskOvernightRates":
				List<RiskOvernightRates> RiskOvernightRates = Poiji.fromExcel(stream, PoijiExcelType.XLSX, RiskOvernightRates.class, options);
				
				populateList(excelName, RiskOvernightRates);
				break;
			case "XVATradesToExternalAccount":
				List<XVATradesToExternalAccount> XVATradesToExternalAccount = Poiji.fromExcel(stream, PoijiExcelType.XLSX, XVATradesToExternalAccount.class, options);
				populateList(excelName, XVATradesToExternalAccount);
				break;
			case "Recon":
				List<Recon> Recon = Poiji.fromExcel(stream, PoijiExcelType.XLSX, Recon.class, options);
				populateList(excelName, Recon);
				break;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return xcelDataToMap;

	}

}
