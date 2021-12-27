package com.excel.pojo;


import java.util.List;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class AllXVACalypsos {
	
    @ExcelRow                   
    private int rowIndex;
    
    @ExcelCellName("CPTY_ID")
	private long cptyId;
    
    @ExcelCellName("NPV")
    private double calypsoNPV;
    
    @ExcelCellName("CVA")
    private double calypsoCVA;
    
    @ExcelCellName("DVA")
    private double calypsoDVA;
    
    @ExcelCellName("PORTF_VAL")
    private double calypsoUnderlyingPortValue;
    
    @ExcelCellName("UNDERLYING_TRADE")               
    private String calypsoTradeCount;
    
    @ExcelCellName("CREDIT_CURVE_NAME")               
    private String calypsoCreditCurve;
    
    @ExcelCellName("RECOVERY_RATE")               
    private double calypsoRecoveryRate;
    
    
	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public long getCptyId() {
		return cptyId;
	}

	public void setCptyId(long cptyId) {
		this.cptyId = cptyId;
	}

	public double getCalypsoNPV() {
		return calypsoNPV;
	}

	public void setCalypsoNPV(double calypsoNPV) {
		this.calypsoNPV = calypsoNPV;
	}

	public double getCalypsoCVA() {
		return calypsoCVA;
	}

	public void setCalypsoCVA(double calypsoCVA) {
		this.calypsoCVA = calypsoCVA;
	}

	public double getCalypsoDVA() {
		return calypsoDVA;
	}

	public void setCalypsoDVA(double calypsoDVA) {
		this.calypsoDVA = calypsoDVA;
	}

	public double getCalypsoUnderlyingPortValue() {
		return calypsoUnderlyingPortValue;
	}

	public void setCalypsoUnderlyingPortValue(double calypsoUnderlyingPortValue) {
		this.calypsoUnderlyingPortValue = calypsoUnderlyingPortValue;
	}

	public String getCalypsoTradeCount() {
		return calypsoTradeCount;
	}

	public void setCalypsoTradeCount(String calypsoTradeCount) {
		this.calypsoTradeCount = calypsoTradeCount;
	}

	public String getCalypsoCreditCurve() {
		return calypsoCreditCurve;
	}

	public void setCalypsoCreditCurve(String calypsoCreditCurve) {
		this.calypsoCreditCurve = calypsoCreditCurve;
	}
	
	public double getCalypsoRecoveryRate() {
		return calypsoRecoveryRate;
	}

	public void setCalypsoRecoveryRate(double calypsoRecoveryRate) {
		this.calypsoRecoveryRate = calypsoRecoveryRate;
	}


	@Override
	public String toString() {
		return "AllXVACalypsos [rowIndex=" + rowIndex + ", cptyId = " + cptyId + ", calypsoNPV=" + calypsoNPV + ", calypsoCVA=" + calypsoCVA
				+ ", calypsoDVA=" + calypsoDVA + ", calypsoUnderlyingPortValue=" + calypsoUnderlyingPortValue + ", calypsoTradeCount="
				+ calypsoTradeCount + ", calypsoCreditCurve= " + calypsoCreditCurve + "]";
	}
	
    
}