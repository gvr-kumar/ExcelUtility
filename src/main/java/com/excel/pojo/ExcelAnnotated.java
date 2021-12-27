package com.excel.pojo;

import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.excel.annotation.ExcelCell;
import org.apache.poi.excel.annotation.ExcelSheet;
import org.apache.poi.excel.model.ExcelCellType;

@ExcelSheet(name = "Custom Sheet Name", heading = "Custom Sheet Heading")
public class ExcelAnnotated {

	@ExcelCell(header = "String Column")
	public String string;

	@ExcelCell(header = "Integer Column", type = ExcelCellType.INTEGER)
	public int integer;

	@ExcelCell(header = "Currency Column", type = ExcelCellType.CURRENCY)
	public int currency;

	public ExcelAnnotated(String string, int integer, int currency) {
		super();
		this.string = string;
		this.integer = integer;
		this.currency = currency;
	}

}
