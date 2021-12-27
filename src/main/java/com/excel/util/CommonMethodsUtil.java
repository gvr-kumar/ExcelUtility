package com.excel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.excel.pojo.AllXVACalypsos;
import com.excel.pojo.Recon;
import com.excel.pojo.RiskOvernightRates;
import com.excel.pojo.XVATradesToExternalAccount;

public class CommonMethodsUtil {
	
	/***
	 * 
	 * @param sheetName
	 * @param book
	 * 
	 * Purpose: Delete all other sheets except the one based on the sheet name 
	 */
	public static List returnList(String key, Map<String, List> allExcelsMap)
	{
		List<Object> resultList = null;
		//Set<String> keyid = allExcelsMap.keySet();
		
		//for (String key : keyid) {

				if (key.toUpperCase().indexOf("RiskOvernightRates".toUpperCase()) >= 0) {
					resultList = allExcelsMap.get(key);
				}
				else if (key.toUpperCase().indexOf("XVATradestoExternalAccount".toUpperCase()) >= 0) {
					resultList = allExcelsMap.get(key);
				}
				else if (key.toUpperCase().indexOf("AllXVACalypsos".toUpperCase()) >= 0) {
					resultList = allExcelsMap.get(key);
				}
				
		//}
		return resultList;
	}
	
	
	/***
	 * 
	 * @param sheetName
	 * @param book
	 * 
	 * Purpose: Delete all other sheets except the one based on the sheet name 
	 */
	
	public static void removeOtherSheets(String sheetName, File excelFile) { 
		XSSFWorkbook book;
		try {
			book = new XSSFWorkbook(new FileInputStream(excelFile));
			for(int i=book.getNumberOfSheets()-1;i>=0;i--){
	            XSSFSheet tmpSheet =book.getSheetAt(i);
	            if(!tmpSheet.getSheetName().trim().equals(sheetName.trim())){
	                book.removeSheetAt(i);
	                FileOutputStream output = new FileOutputStream(excelFile);
	                book.write(output);
	                output.close();
	            }
	        } 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}               
	}
	
	/***
	 * 
	 * @param sheetName
	 * @param book
	 * 
	 * Purpose: Rename sheet name 
	 */
	
	public static void renameSheet(String sheetName, String newSheetName, File excelFile) { 
		XSSFWorkbook book;
		try {
			book = new XSSFWorkbook(new FileInputStream(excelFile));
			for(int i=book.getNumberOfSheets()-1;i>=0;i--){
	            XSSFSheet tmpSheet =book.getSheetAt(i);
	            if(tmpSheet.getSheetName().trim().equals(sheetName.trim())){
	            	book.setSheetName(i, newSheetName);
	            	FileOutputStream output = new FileOutputStream(excelFile);
	                book.write(output);
	                output.close();
	            }
	        } 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}               
	}
	
	/***
	 * 
	 * 
	 * 
	 */
	public static int getNrColumns(String sheetName, File excelFile) {
		
		XSSFWorkbook book;
		int nrCol = 0;
		try {
			book = new XSSFWorkbook(new FileInputStream(excelFile));
			for(int i=book.getNumberOfSheets()-1;i>=0;i--){
	            XSSFSheet tmpSheet =book.getSheetAt(i);
	            if(tmpSheet.getSheetName().trim().equals(sheetName.trim())){
	            	// get header row
	        		Row headerRow = tmpSheet.getRow(i);
	        		nrCol = headerRow.getLastCellNum();
	        		System.out.println("Found " + nrCol + " columns.");
	        		FileOutputStream output = new FileOutputStream(excelFile);
	                book.write(output);
	                output.close();
	            }
	        } 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nrCol;
	}
	
	
	/***
	 * 
	 * @param workbook
	 * @param fileName
	 * @throws IOException
	 */
	
	public static void writeToFile(Workbook workbook, File excelFile)
			throws IOException {
		FileOutputStream fileOut = new FileOutputStream(excelFile);
		workbook.write(fileOut);
		//fileOut.close();
	}
	
	/***
	 * 
	 * @param workbook
	 * @param fileName
	 * @throws IOException
	 */
	
	public void saveAndClose(Workbook workbook, File excelFile) {
		assert workbook != null;

		try {
			FileOutputStream output = new FileOutputStream(excelFile);
			workbook.write(output);
            output.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/***
	 * 
	 * @param sourceDirectory
	 * @param destinationDirectory
	 * @param fileName
	 * 
	 * Purpose: Copy file from source to destination
	 *
	 */
	
	
	public static File copyFileFromSourcetoDestination(File sourceDirectory, File destinationDirectory, String fileName)
	{
		File tempSrcFile = new File(sourceDirectory + "/" + fileName); 
		  File tempDestFile = new File(destinationDirectory + "/" + fileName);
		  
		  boolean srcFileExists = tempSrcFile.exists(); 
		  boolean destFileExists = tempDestFile.exists();
		  
		  if(srcFileExists) {
			  if(!destFileExists)
		    	{
	  			try {
	  				tempDestFile.createNewFile();
					
		    			//Creating a FileInputStream object
		    			FileInputStream inputStream = new FileInputStream(tempSrcFile);
		    			 
		    			//Creating a FileInputStream object
		    			FileOutputStream outputStream = new FileOutputStream(tempDestFile);
	
		    			//Creating a byte array
		    			byte bytes[] = new byte[(int) tempSrcFile.length()];
		    			
		    			//Reading data into the byte array
	  			    inputStream.read(bytes);
	  			     
	  			     //Writing the contents of the Output Stream to a file
	  			    
	  			     outputStream.write(bytes);
	  			     outputStream.flush();
	  			     outputStream.close();
	  			     
	  			} catch (FileNotFoundException e) {
	  			e.printStackTrace();
	  			} catch (IOException e) {
						e.printStackTrace();
					} 
		    	}
	  	}
	  	else
	  	{
	  		System.out.println(fileName + " does not exist in the Source Directory.");
	  	}
		return tempDestFile;
	}
	
	/***
	 * 
	 * @param className
	 * @return
	 * Purpose: get the class name
	 */
	
	public static String getQualifiedFileName(String originalExcelName) 
	{
		String filename= null;
		
		if(originalExcelName.indexOf("XVACalypsoReconDealers_LDN")>=0)
		{
			filename = "XVACalypsoReconDealers_LDN";
		}
		else if(originalExcelName.indexOf("XVACalypsoReconDealers")>=0)
		{
			filename = "XVACalypsoReconDealers";
		}
		else if(originalExcelName.indexOf("XVACalypsoRecon_LDN")>=0)
		{
			filename = "XVACalypsoRecon_LDN";
		}
		else if(originalExcelName.indexOf("XVACalypsoRecon")>=0)
		{
			filename = "XVACalypsoRecon";
		}
		
		else if(originalExcelName.indexOf("RiskOvernightRates")>=0)
		{
			filename = "RiskOvernightRates";
		}
		else if(originalExcelName.indexOf("")>=0)
		{
			filename = "XVATradesToExternalAccount";
		}
		else if(originalExcelName.indexOf("Recon")>=0)
		{
			filename = "Recon";
		}
		return filename;
	}


}
