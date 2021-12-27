package com.excel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.excel.pojo.AllXVACalypsos;
import com.excel.pojo.BookToFile;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;

public class ReaderUtility {
	
	public static void main(String[] args) {
		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings()
		        .addListDelimiter(";") .build();
		
		
		String str = " ";
		System.out.println(str.split(",").length);
		//List<Employee> employees = Poiji.fromExcel(new File("employees.xls"), Employee.class, options);
		// alternatively
		try {
			InputStream stream = new FileInputStream(new File("/Users/gangineni/Documents/JavaProjects/ExcelsForExcelUtility/XVACalypsoRecon12-22-2021.xlsx"));
			List<AllXVACalypsos> bookToFile = Poiji.fromExcel(stream, PoijiExcelType.XLSX, AllXVACalypsos.class, options);
			System.out.println(bookToFile.size());
			for(AllXVACalypsos btf: bookToFile) {
				System.out.println(btf);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
