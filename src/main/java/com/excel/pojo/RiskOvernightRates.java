package com.excel.pojo;


import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class RiskOvernightRates {
    
	@ExcelRow                   
    private int rowIndex;

    @ExcelCellName("Trade ID")               
    private String tradeId;    

    @ExcelCellName("Agreement ID")
    private String agreementId;
    
    @ExcelCellName("Book Description")               
    private String bookDescription;    

    @ExcelCellName("Cpty Legal Name")
    private String cptyLegalName;
    
    @ExcelCellName("NPV")               
    private Double nPV;    

    @ExcelCellName("CVA")
    private Double cVA;
    
    @ExcelCellName("DVA")               
    private Double dVA;    

    @ExcelCellName("Underlying Port Value")
    private Double underlyingPortValue;
    
    @ExcelCellName("Underlying Trade Count")               
    private long underlyingTradeCount; 
    
    @ExcelCellName("Recovery Rate")               
    private Double recoveryRate;
    
    @ExcelCellName("Credit Curve Name")               
    private String creditCurveName;
    
    
    
	public int getRowIndex() {
		return rowIndex;
	}



	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}



	public String getTradeId() {
		return tradeId;
	}



	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}



	public String getAgreementId() {
		return agreementId;
	}



	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}



	public String getBookDescription() {
		return bookDescription;
	}



	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}



	public String getCptyLegalName() {
		return cptyLegalName;
	}



	public void setCptyLegalName(String cptyLegalName) {
		this.cptyLegalName = cptyLegalName;
	}



	public Double getnPV() {
		return nPV;
	}



	public void setnPV(Double nPV) {
		this.nPV = nPV;
	}



	public Double getcVA() {
		return cVA;
	}



	public void setcVA(Double cVA) {
		this.cVA = cVA;
	}



	public Double getdVA() {
		return dVA;
	}



	public void setdVA(Double dVA) {
		this.dVA = dVA;
	}



	public Double getUnderlyingPortValue() {
		return underlyingPortValue;
	}



	public void setUnderlyingPortValue(Double underlyingPortValue) {
		this.underlyingPortValue = underlyingPortValue;
	}



	public long getUnderlyingTradeCount() {
		return underlyingTradeCount;
	}



	public void setUnderlyingTradeCount(long underlyingTradeCount) {
		this.underlyingTradeCount = underlyingTradeCount;
	}



	public Double getRecoveryRate() {
		return recoveryRate;
	}



	public void setRecoveryRate(Double recoveryRate) {
		this.recoveryRate = recoveryRate;
	}



	public String getCreditCurveName() {
		return creditCurveName;
	}



	public void setCreditCurveName(String creditCurveName) {
		this.creditCurveName = creditCurveName;
	}



	@Override
	public String toString() {
		return "RiskOvernightRates [rowIndex=" + rowIndex + ", tradeId=" + tradeId + ", agreementId=" + agreementId+ ", "
				+ " bookDescription=" + bookDescription + ", cptyLegalName=" + cptyLegalName + ", nPV=" + nPV + ", cVA=" + cVA + ", dVA=" + dVA + ", "
				+ " underlyingPortValue= " + underlyingPortValue + ", underlyingTradeCount= " + underlyingTradeCount + ", recoveryRate=" + recoveryRate + ", creditCurveName=" + creditCurveName + "]";
	}
    
}