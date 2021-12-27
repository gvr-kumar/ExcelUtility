package com.excel.pojo;



import org.apache.poi.excel.annotation.ExcelCell;
import org.apache.poi.excel.annotation.ExcelSheet;
import org.apache.poi.excel.model.ExcelCellType;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;

@ExcelSheet(name = "Recon", heading = "Recon")
public class Recon{
	
	/*
	 * @ExcelRow private int rowIndex;
	 */
	
	@ExcelCell(header = "External Account", type = ExcelCellType.INTEGER)               
    private long externalAccount;
	
	@ExcelCell(header = "Trade ID")               
    private String tradeid;    
   
	@ExcelCell(header = "Credit Curve Name")
    private String creditcurvename;
    
	@ExcelCell(header = "Recovery Rate", type = ExcelCellType.DECIMAL)
    private double recoveryrate;
    
	@ExcelCell(header = "Sum of Underlying Trade Count", type = ExcelCellType.INTEGER)
    private long sumofunderlyingtradecount;
    
	@ExcelCell(header = "Sum of NPV", type = ExcelCellType.DECIMAL)
    private double sumofnpv;
    
	@ExcelCell(header = "Sum of CVA", type = ExcelCellType.DECIMAL)
    private double sumofcva;
    
	@ExcelCell(header = "Sum of DVA", type = ExcelCellType.DECIMAL)
    private double sumofdva;
    
	@ExcelCell(header = "Sum of Underlying Port Value", type = ExcelCellType.DECIMAL)
    private double sumofunderlyingportvalue;
    
	@ExcelCell(header = "Calypso Trade Count", type = ExcelCellType.INTEGER)
    private long calypsotradecount;
    
	@ExcelCell(header = "Calypso NPV", type = ExcelCellType.DECIMAL)
    private double calypsonpv;
    
	@ExcelCell(header = "Calypso CVA", type = ExcelCellType.DECIMAL)
    private double calypsocva;
    
	@ExcelCell(header = "Calypso DVA", type = ExcelCellType.DECIMAL)
    private double calypsodva;
  
	@ExcelCell(header = "Calypso Underlying Port Value", type = ExcelCellType.DECIMAL)
    private double calypsounderlyingportvalue;
    
	@ExcelCell(header = "Calypso Credit Curve")
    private String calypsocreditcurve;
    
	@ExcelCell(header = "Calypso Recovery Rate", type = ExcelCellType.DECIMAL)
    private double calypsorecoveryrate;
    
	@ExcelCell(header = "Trades Diff", type = ExcelCellType.DECIMAL)
    private double tradesdiff;
    
	@ExcelCell(header = "NPV Diff", type = ExcelCellType.DECIMAL)
    private double npvdiff;
    
	@ExcelCell(header = "CVA Diff", type = ExcelCellType.DECIMAL)
    private double cvadiff;
    
	@ExcelCell(header = "DVA Diff", type = ExcelCellType.DECIMAL)
    private double dvadiff;
    
	@ExcelCell(header = "PortVal Diff", type = ExcelCellType.DECIMAL)
    private double portvaldiff;
    
	@ExcelCell(header = "Credit Curve Match", type = ExcelCellType.DECIMAL)
    private double creditcurvematch;
    
	@ExcelCell(header = "RR Diff", type = ExcelCellType.DECIMAL)
    private double rrdiff;
	
	@ExcelCell(header = "UL Trades Match", type = ExcelCellType.DECIMAL)
    private double ultradesmatch;
    					
	
    /*
	 * @ExcelCellName("Calypso File") private String calypsoFile;
	 */

	/*
	 * public int getRowIndex() { return rowIndex; }
	 * 
	 * 
	 * public void setRowIndex(int rowIndex) { this.rowIndex = rowIndex; }
	 */

	public Recon() {
		super();
	}
	
	public Recon(long externalAccount, String tradeid, String creditcurvename, double recoveryrate,
			long sumofunderlyingtradecount, double sumofnpv, double sumofcva, double sumofdva,
			double sumofunderlyingportvalue, long calypsotradecount, double calypsonpv, double calypsocva,
			double calypsodva, double calypsounderlyingportvalue, String calypsocreditcurve, double calypsorecoveryrate,
			double tradesdiff, double npvdiff, double cvadiff, double dvadiff, double portvaldiff,
			double creditcurvematch, double rrdiff, double ultradesmatch) {
		super();
		this.externalAccount = externalAccount;
		this.tradeid = tradeid;
		this.creditcurvename = creditcurvename;
		this.recoveryrate = recoveryrate;
		this.sumofunderlyingtradecount = sumofunderlyingtradecount;
		this.sumofnpv = sumofnpv;
		this.sumofcva = sumofcva;
		this.sumofdva = sumofdva;
		this.sumofunderlyingportvalue = sumofunderlyingportvalue;
		this.calypsotradecount = calypsotradecount;
		this.calypsonpv = calypsonpv;
		this.calypsocva = calypsocva;
		this.calypsodva = calypsodva;
		this.calypsounderlyingportvalue = calypsounderlyingportvalue;
		this.calypsocreditcurve = calypsocreditcurve;
		this.calypsorecoveryrate = calypsorecoveryrate;
		this.tradesdiff = tradesdiff;
		this.npvdiff = npvdiff;
		this.cvadiff = cvadiff;
		this.dvadiff = dvadiff;
		this.portvaldiff = portvaldiff;
		this.creditcurvematch = creditcurvematch;
		this.rrdiff = rrdiff;
		this.ultradesmatch = ultradesmatch;
	}

	public long getExternalAccount() {
		return externalAccount;
	}

	public void setExternalAccount(long externalAccount) {
		this.externalAccount = externalAccount;
	}

	public String getTradeid() {
		return tradeid;
	}

	public void setTradeid(String tradeid) {
		this.tradeid = tradeid;
	}

	public String getCreditcurvename() {
		return creditcurvename;
	}

	public void setCreditcurvename(String creditcurvename) {
		this.creditcurvename = creditcurvename;
	}

	public double getRecoveryrate() {
		return recoveryrate;
	}

	public void setRecoveryrate(double recoveryrate) {
		this.recoveryrate = recoveryrate;
	}

	public long getSumofunderlyingtradecount() {
		return sumofunderlyingtradecount;
	}

	public void setSumofunderlyingtradecount(long sumofunderlyingtradecount) {
		this.sumofunderlyingtradecount = sumofunderlyingtradecount;
	}

	public double getSumofnpv() {
		return sumofnpv;
	}

	public void setSumofnpv(double sumofnpv) {
		this.sumofnpv = sumofnpv;
	}

	public double getSumofcva() {
		return sumofcva;
	}

	public void setSumofcva(double sumofcva) {
		this.sumofcva = sumofcva;
	}

	public double getSumofdva() {
		return sumofdva;
	}

	public void setSumofdva(double sumofdva) {
		this.sumofdva = sumofdva;
	}

	public double getSumofunderlyingportvalue() {
		return sumofunderlyingportvalue;
	}

	public void setSumofunderlyingportvalue(double sumofunderlyingportvalue) {
		this.sumofunderlyingportvalue = sumofunderlyingportvalue;
	}

	public long getCalypsotradecount() {
		return calypsotradecount;
	}

	public void setCalypsotradecount(long calypsotradecount) {
		this.calypsotradecount = calypsotradecount;
	}

	public double getCalypsonpv() {
		return calypsonpv;
	}

	public void setCalypsonpv(double calypsonpv) {
		this.calypsonpv = calypsonpv;
	}

	public double getCalypsocva() {
		return calypsocva;
	}

	public void setCalypsocva(double calypsocva) {
		this.calypsocva = calypsocva;
	}

	public double getCalypsodva() {
		return calypsodva;
	}

	public void setCalypsodva(double calypsodva) {
		this.calypsodva = calypsodva;
	}

	public double getCalypsounderlyingportvalue() {
		return calypsounderlyingportvalue;
	}

	public void setCalypsounderlyingportvalue(double calypsounderlyingportvalue) {
		this.calypsounderlyingportvalue = calypsounderlyingportvalue;
	}

	public String getCalypsocreditcurve() {
		return calypsocreditcurve;
	}

	public void setCalypsocreditcurve(String calypsocreditcurve) {
		this.calypsocreditcurve = calypsocreditcurve;
	}

	public double getCalypsorecoveryrate() {
		return calypsorecoveryrate;
	}

	public void setCalypsorecoveryrate(double calypsorecoveryrate) {
		this.calypsorecoveryrate = calypsorecoveryrate;
	}

	public double getTradesdiff() {
		return tradesdiff;
	}

	public void setTradesdiff(double tradesdiff) {
		this.tradesdiff = tradesdiff;
	}

	public double getNpvdiff() {
		return npvdiff;
	}

	public void setNpvdiff(double npvdiff) {
		this.npvdiff = npvdiff;
	}

	public double getCvadiff() {
		return cvadiff;
	}

	public void setCvadiff(double cvadiff) {
		this.cvadiff = cvadiff;
	}

	public double getDvadiff() {
		return dvadiff;
	}

	public void setDvadiff(double dvadiff) {
		this.dvadiff = dvadiff;
	}

	public double getPortvaldiff() {
		return portvaldiff;
	}

	public void setPortvaldiff(double portvaldiff) {
		this.portvaldiff = portvaldiff;
	}

	public double getCreditcurvematch() {
		return creditcurvematch;
	}

	public void setCreditcurvematch(double creditcurvematch) {
		this.creditcurvematch = creditcurvematch;
	}

	public double getRrdiff() {
		return rrdiff;
	}

	public void setRrdiff(double rrdiff) {
		this.rrdiff = rrdiff;
	}

	public double getUltradesmatch() {
		return ultradesmatch;
	}

	public void setUltradesmatch(double ultradesmatch) {
		this.ultradesmatch = ultradesmatch;
	}

	@Override
	public String toString() {
		return "Recon [externalAccount=" + externalAccount + ", tradeid=" + tradeid + ", creditcurvename="
				+ creditcurvename + ", recoveryrate=" + recoveryrate + ", sumofunderlyingtradecount="
				+ sumofunderlyingtradecount + ", sumofnpv=" + sumofnpv + ", sumofcva=" + sumofcva + ", sumofdva="
				+ sumofdva + ", sumofunderlyingportvalue=" + sumofunderlyingportvalue + ", calypsotradecount="
				+ calypsotradecount + ", calypsonpv=" + calypsonpv + ", calypsocva=" + calypsocva + ", calypsodva="
				+ calypsodva + ", calypsounderlyingportvalue=" + calypsounderlyingportvalue + ", calypsocreditcurve="
				+ calypsocreditcurve + ", calypsorecoveryrate=" + calypsorecoveryrate + ", tradesdiff=" + tradesdiff
				+ ", npvdiff=" + npvdiff + ", cvadiff=" + cvadiff + ", dvadiff=" + dvadiff + ", portvaldiff="
				+ portvaldiff + ", creditcurvematch=" + creditcurvematch + ", rrdiff=" + rrdiff + ", ultradesmatch="
				+ ultradesmatch + "]";
	}

	
}