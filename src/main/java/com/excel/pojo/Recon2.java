package com.excel.pojo;



import org.apache.poi.excel.annotation.ExcelCell;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

public class Recon2{
	
	@ExcelRow                   
    private int rowIndex;
	
	@ExcelCell(header = "String Column")
	public String string;

	@ExcelCellName("External Account")               
    private long externalAccount;
	
    @ExcelCellName("Trade ID")               
    private String tradeId;    
   
    @ExcelCellName("Credit Curve Name")
    private String creditCurveName;
    
    @ExcelCellName("Recovery Rate")
    private double recoveryRate;
    
    @ExcelCellName("Sum of Underlying Trade Count")
    private long sumOfUnderlyingTradeCount;
    
    @ExcelCellName("Sum of NPV")
    private double sumOfNPV;
    
    @ExcelCellName("Sum of CVA")
    private double sumOfCVA;
    
    @ExcelCellName("Sum of DVA")
    private double sumOfDVA;
    
    @ExcelCellName("Sum of Underlying Port Value")
    private double sumOfUnderLyingPortValue;
    
    @ExcelCellName("Calypso Trade Count")
    private long calypsoTradeCount;
    
    @ExcelCellName("Calypso NPV")
    private double calypsoNPV;
    
    @ExcelCellName("Calypso CVA")
    private double calypsoCVA;
    
    @ExcelCellName("Calypso DVA")
    private double calypsoDVA;
  
    @ExcelCellName("Calypso Underlying Port Value")
    private double calypsoUnderlyingPortValue;
    
    @ExcelCellName("Calypso Credit Curve")
    private String calypsoCreditCurve;
    
    @ExcelCellName("Calypso Recovery Rate")
    private double calypsoRecoveryRate;
    
    @ExcelCellName("Trades Diff")
    private double tradesDiff;
    
    @ExcelCellName("NPV Diff")
    private double nPVDiff;
    
    @ExcelCellName("CVA Diff")
    private double cVADiff;
    
    @ExcelCellName("DVA Diff")
    private double dVADiff;
    
    @ExcelCellName("PortVal Diff")
    private double portValDiff;
    
    @ExcelCellName("Credit Curve Match")
    private double creditCurveMatch;
    
    @ExcelCellName("RR Diff")
    private double rRDiff;
	
    @ExcelCellName("UL Trades Match")
    private double uLTradesMatch;
    					
	
    /*
	 * @ExcelCellName("Calypso File") private String calypsoFile;
	 */

	public int getRowIndex() {
		return rowIndex;
	}


	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}


	public long getExternalAccount() {
		return externalAccount;
	}


	public void setExternalAccount(long externalAccount) {
		this.externalAccount = externalAccount;
	}


	public String getTradeId() {
		return tradeId;
	}


	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}


	public String getCreditCurveName() {
		return creditCurveName;
	}


	public void setCreditCurveName(String creditCurveName) {
		this.creditCurveName = creditCurveName;
	}


	public double getRecoveryRate() {
		return recoveryRate;
	}


	public void setRecoveryRate(double recoveryRate) {
		this.recoveryRate = recoveryRate;
	}


	public long getSumOfUnderlyingTradeCount() {
		return sumOfUnderlyingTradeCount;
	}


	public void setSumOfUnderlyingTradeCount(long sumOfUnderlyingTradeCount) {
		this.sumOfUnderlyingTradeCount = sumOfUnderlyingTradeCount;
	}


	public double getSumOfNPV() {
		return sumOfNPV;
	}


	public void setSumOfNPV(double sumOfNPV) {
		this.sumOfNPV = sumOfNPV;
	}


	public double getSumOfCVA() {
		return sumOfCVA;
	}


	public void setSumOfCVA(double sumOfCVA) {
		this.sumOfCVA = sumOfCVA;
	}


	public double getSumOfDVA() {
		return sumOfDVA;
	}


	public void setSumOfDVA(double sumOfDVA) {
		this.sumOfDVA = sumOfDVA;
	}


	public double getSumOfUnderLyingPortValue() {
		return sumOfUnderLyingPortValue;
	}


	public void setSumOfUnderLyingPortValue(double sumOfUnderLyingPortValue) {
		this.sumOfUnderLyingPortValue = sumOfUnderLyingPortValue;
	}


	public long getCalypsoTradeCount() {
		return calypsoTradeCount;
	}


	public void setCalypsoTradeCount(long calypsoTradeCount) {
		this.calypsoTradeCount = calypsoTradeCount;
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


	public double getTradesDiff() {
		return tradesDiff;
	}


	public void setTradesDiff(double tradesDiff) {
		this.tradesDiff = tradesDiff;
	}


	public double getnPVDiff() {
		return nPVDiff;
	}


	public void setnPVDiff(double nPVDiff) {
		this.nPVDiff = nPVDiff;
	}


	public double getcVADiff() {
		return cVADiff;
	}


	public void setcVADiff(double cVADiff) {
		this.cVADiff = cVADiff;
	}


	public double getdVADiff() {
		return dVADiff;
	}


	public void setdVADiff(double dVADiff) {
		this.dVADiff = dVADiff;
	}


	public double getPortValDiff() {
		return portValDiff;
	}


	public void setPortValDiff(double portValDiff) {
		this.portValDiff = portValDiff;
	}


	public double getCreditCurveMatch() {
		return creditCurveMatch;
	}


	public void setCreditCurveMatch(double creditCurveMatch) {
		this.creditCurveMatch = creditCurveMatch;
	}


	public double getrRDiff() {
		return rRDiff;
	}


	public void setrRDiff(double rRDiff) {
		this.rRDiff = rRDiff;
	}


	public double getuLTradesMatch() {
		return uLTradesMatch;
	}


	public void setuLTradesMatch(double uLTradesMatch) {
		this.uLTradesMatch = uLTradesMatch;
	}


	@Override
	public String toString() {
		return "Recon [rowIndex=" + rowIndex + ", externalAccount= " + externalAccount + ", tradeId=" + tradeId + ", creditCurveName=" + creditCurveName + ", recoveryRate=" + recoveryRate + ", sumOfUnderlyingTradeCount="
		+ sumOfUnderlyingTradeCount + ", sumOfNPV=" + sumOfNPV +", sumOfCVA=" + sumOfCVA +", sumOfDVA=" + sumOfDVA +", sumOfUnderLyingPortValue=" + sumOfUnderLyingPortValue +", "
		+ "calypsoTradeCount = " + calypsoTradeCount + ", calypsoNPV= " + calypsoNPV + ", calypsoCVA= " + calypsoCVA + ", calypsoDVA= " + calypsoDVA + ", calypsoUnderlyingPortValue= " + calypsoUnderlyingPortValue + ", "
				+ "calypsoCreditCurve = " + calypsoCreditCurve + ", calypsoRecoveryRate= " + calypsoRecoveryRate + ", tradesDiff= " + tradesDiff + ", nPVDiff= " + nPVDiff + ", cVADiff= " + cVADiff + ", dVADiff = " + dVADiff + ", "
						+ "portValDiff= " + portValDiff + ", creditCurveMatch= " + creditCurveMatch +", rRDiff= " + rRDiff + ", uLTradesMatch= " + uLTradesMatch + "]";
	}
    
	      	  		  	
    //no need getters/setters to map excel cells to fields
    
    
    
    
}