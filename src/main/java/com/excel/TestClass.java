package com.excel;

public class TestClass {

	public static void main(String[] args) {
		String str = "USD|USD_XVA_BQR 5.8_NAM_FINANCIALS_ANY_ANY|CLOSE";
		String[] crdtCurvNameArr = str.split("\\|");
		System.out.println(crdtCurvNameArr[1]);

	}

}
