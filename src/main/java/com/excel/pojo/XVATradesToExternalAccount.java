package com.excel.pojo;


import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class XVATradesToExternalAccount {

    @ExcelRow                   
    private int rowIndex;

    @ExcelCellName("XVA TradeId")               
    private String xVaTradeId;    

    @ExcelCellName("External Account Id")
    private long extAccId;
    

	public int getRowIndex() {
		return rowIndex;
	}


	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}


	public String getxVaTradeId() {
		return xVaTradeId;
	}


	public void setxVaTradeId(String xVaTradeId) {
		this.xVaTradeId = xVaTradeId;
	}


	public Long getExtAccId() {
		return extAccId;
	}


	public void setExtAccId(Long extAccId) {
		this.extAccId = extAccId;
	}


	@Override
	public String toString() {
		return "XVATradesToExternalAccount [rowIndex=" + rowIndex + ", xVaTradeId=" + xVaTradeId + ", extAccId=" + extAccId
				+ "]";
	}
    
}