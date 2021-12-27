package com.excel.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.excel.ExcelWriter;

import com.excel.pojo.ExcelAnnotated;

public class POIMainClass {

	public static void main(String[] args) {
		ExcelAnnotated exclAnn = new ExcelAnnotated("Dollar",15, 15000); 
		List<ExcelAnnotated> arrLst = new ArrayList<ExcelAnnotated>();
		arrLst.add(exclAnn);
		ExcelWriter.write("/Users/gangineni/Documents/JavaProjects/ExcelsForExcelUtility", "ExcelAnn.xlsx", arrLst);
	}

}
