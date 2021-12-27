package com.excel.util;

import java.text.ParseException;  
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;  
import java.util.Locale;


public class DateUtil {
	
	public static String mmddyyyyFmtSepByBckSlsh(LocalDate date)
	{	
		//SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return date.format(formatter);	
	}
	
	public static String mmddyyyyFmtSepByEiphen(LocalDate date)
	{	
		//SimpleDateFormat simplDateFormatter = new SimpleDateFormat("MM-dd-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		return date.format(formatter);	
	}
	
	public static String ddmmyyyyFmtSepByBckSlsh(LocalDate date)
	{	
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(formatter);	
	}
	
	public static String ddmmyyyyFmtSepByEiphen(LocalDate date)
	{	
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return date.format(formatter);
	}
	
	
	public static String yyyymmddFmtSepByEiphen(LocalDate date)
	{	
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return date.format(formatter);	
	}
	
	public static String yyyyddmmFmtSepByEiphen(LocalDate date)
	{	
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-dd-MM");  
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		return date.format(formatter);	
	}
	
	
}
