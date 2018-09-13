package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(ZLBDetailCompositePK.class)
@Table (name="zlb_detail")
public class ZLBDetailDTO {
	@Id
	@NotNull
	@NotEmpty(message="ZC Cycle Number cannot be empty")
	protected int ZC_CYCLE_NUM = 0;
	
	@Id
	@NotNull
	@NotEmpty(message="ZC Cycle Date cannot be empty")
	@Length(max=5)
	protected String ZC_CYCLE_DATE;
	
	@Id
	@NotNull
	@NotEmpty(message="ZC Record Number cannot be empty")
	protected int ZL_RECORD_NUM = 0;
	
	@Length(max=6)
	@Column(name="ZL_CASENO")
	protected String caseNo;
	
	@Length(max=3)
	@Column(name="ZL_DOCUMENT_ID")
	protected String documentID;
	
	@Length(max=2)
	@Column(name="ZL_HISTORY_CODE")
	protected String historyCode;
	
	@Length(max=3)
	@Column(name="ZL_PRN")
	protected String prn;
	
	@Length(max=1)
	@Column(name="ZL_EXPORT_CODE")
	protected String exportCode;
	
	@Length(max=5)
	@Column(name="ZL_CASENO_SHORT")
	protected String caseNoShort;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_A")
	protected String fillerA;
	
	@Length(max=8)
	@Column(name="ZL_PO_DATE")
	protected String poDate;
	
	@Column(name="ZL_ORIGINAL_AMT")
	protected double origAmt;
	
	@Length(max=3)
	@Column(name="ZL_AMEND_NUM")
	protected String amendNum;
	
	@Length(max=8)
	@Column(name="ZL_AMEND_DATE")
	protected String amendDate;
	
	@Length(max=12)
	@Column(name="ZL_INVOICE_NUM")
	protected String invoiceNum;
	
	@Length(max=15)
	@Column(name="ZL_NSN_STOCK_NUM")
	protected String nsnStockNum;
	
	@Length(max=6)
	@Column(name="ZL_FED_MIL_REQ_1")
	protected String filMilReq1;
	
	@Length(max=4)
	@Column(name="ZL_FED_MIL_REQ_2")
	protected String filMilReq2;
	
	@Length(max=4)
	@Column(name="ZL_FED_MIL_REQ_3")
	protected String filMilReq3;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_B")
	protected String fillerB;
	
	@Length(max=2)
	@Column(name="ZL_FILLER_1")
	protected String filler1;
	
	@Length(max=6)
	@Column(name="ZL_BOAC")
	protected String boac;
	
	@Length(max=2)
	@Column(name="ZL_FILLER_2")
	protected String filler2;
	
	@Length(max=2)
	@Column(name="ZL_UNIT_OF_ISSUE")
	protected String unitOfIssue;
	
	@Length(max=3)
	@Column(name="ZL_FILLER_3")
	protected String filler3;
	
	@Length(max=1)
	@Column(name="ZL_MONEY_ONLY")
	protected String moneyOnly;
	
	@Length(max=2)
	@Column(name="ZL_FILLER_4")
	protected String filler4;
	
	@Length(max=2)
	@Column(name="ZL_NON_MERCH_CODE")
	protected String nonMerchCode;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_5")
	protected String filler5;
	
	@Length(max=1)
	@Column(name="ZL_QTY_PAID_SIGN")
	protected String qtyPaidSign;
	
	@Length(max=6)
	@Column(name="ZL_QTY_PAID")
	protected String qtyPaid;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_6")
	protected String filler6;
	
	@Length(max=1)
	@Column(name="ZL_QTY_AVAIL_SIGN")
	protected String qtyAvailSign;
	
	@Length(max=6)
	@Column(name="ZL_QTY_AVAIL")
	protected String qtyAvail;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_7")
	protected String filler7;
	
	@Length(max=1)
	@Column(name="ZL_AMT_PAID_SIGN")
	protected String amtPaidSign;
	
	@Column(name="ZL_AMT_PAID")
	protected double amtPaid;
	
	@Length(max=1)
	@Column(name="ZL_FILLER_8")
	protected String filler8 = "";
	
	@Length(max=1)
	@Column(name="ZL_PO_AMT_SIGN")
	protected String poAmtSign;
	
	@Column(name="ZL_PO_AMT")
	protected double poAmt;

	public int getZC_CYCLE_NUM() {
		return ZC_CYCLE_NUM;
	}

	public void setZC_CYCLE_NUM(int zC_CYCLE_NUM) {
		ZC_CYCLE_NUM = zC_CYCLE_NUM;
	}

	public String getZC_CYCLE_DATE() {
		return ZC_CYCLE_DATE;
	}

	public void setZC_CYCLE_DATE(String zC_CYCLE_DATE) {
		ZC_CYCLE_DATE = zC_CYCLE_DATE;
	}

	public int getZL_RECORD_NUM() {
		return ZL_RECORD_NUM;
	}

	public void setZL_RECORD_NUM(int zL_RECORD_NUM) {
		ZL_RECORD_NUM = zL_RECORD_NUM;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getDocumentID() {
		return documentID;
	}

	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}

	public String getHistoryCode() {
		return historyCode;
	}

	public void setHistoryCode(String historyCode) {
		this.historyCode = historyCode;
	}

	public String getPrn() {
		return prn;
	}

	public void setPrn(String prn) {
		this.prn = prn;
	}

	public String getExportCode() {
		return exportCode;
	}

	public void setExportCode(String exportCode) {
		this.exportCode = exportCode;
	}

	public String getCaseNoShort() {
		return caseNoShort;
	}

	public void setCaseNoShort(String caseNoShort) {
		this.caseNoShort = caseNoShort;
	}

	public String getFillerA() {
		return fillerA;
	}

	public void setFillerA(String fillerA) {
		this.fillerA = fillerA;
	}

	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public double getOrigAmt() {
		return origAmt;
	}

	public void setOrigAmt(double origAmt) {
		this.origAmt = origAmt;
	}

	public String getAmendNum() {
		return amendNum;
	}

	public void setAmendNum(String amendNum) {
		this.amendNum = amendNum;
	}

	public String getAmendDate() {
		return amendDate;
	}

	public void setAmendDate(String amendDate) {
		this.amendDate = amendDate;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getNsnStockNum() {
		return nsnStockNum;
	}

	public void setNsnStockNum(String nsnStockNum) {
		this.nsnStockNum = nsnStockNum;
	}

	public String getFilMilReq1() {
		return filMilReq1;
	}

	public void setFilMilReq1(String filMilReq1) {
		this.filMilReq1 = filMilReq1;
	}

	public String getFilMilReq2() {
		return filMilReq2;
	}

	public void setFilMilReq2(String filMilReq2) {
		this.filMilReq2 = filMilReq2;
	}

	public String getFilMilReq3() {
		return filMilReq3;
	}

	public void setFilMilReq3(String filMilReq3) {
		this.filMilReq3 = filMilReq3;
	}

	public String getFillerB() {
		return fillerB;
	}

	public void setFillerB(String fillerB) {
		this.fillerB = fillerB;
	}

	public String getFiller1() {
		return filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public String getBoac() {
		return boac;
	}

	public void setBoac(String boac) {
		this.boac = boac;
	}

	public String getFiller2() {
		return filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getUnitOfIssue() {
		return unitOfIssue;
	}

	public void setUnitOfIssue(String unitOfIssue) {
		this.unitOfIssue = unitOfIssue;
	}

	public String getFiller3() {
		return filler3;
	}

	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}

	public String getMoneyOnly() {
		return moneyOnly;
	}

	public void setMoneyOnly(String moneyOnly) {
		this.moneyOnly = moneyOnly;
	}

	public String getFiller4() {
		return filler4;
	}

	public void setFiller4(String filler4) {
		this.filler4 = filler4;
	}

	public String getNonMerchCode() {
		return nonMerchCode;
	}

	public void setNonMerchCode(String nonMerchCode) {
		this.nonMerchCode = nonMerchCode;
	}

	public String getFiller5() {
		return filler5;
	}

	public void setFiller5(String filler5) {
		this.filler5 = filler5;
	}

	public String getQtyPaidSign() {
		return qtyPaidSign;
	}

	public void setQtyPaidSign(String qtyPaidSign) {
		this.qtyPaidSign = qtyPaidSign;
	}

	public String getQtyPaid() {
		return qtyPaid;
	}

	public void setQtyPaid(String qtyPaid) {
		this.qtyPaid = qtyPaid;
	}

	public String getFiller6() {
		return filler6;
	}

	public void setFiller6(String filler6) {
		this.filler6 = filler6;
	}

	public String getQtyAvailSign() {
		return qtyAvailSign;
	}

	public void setQtyAvailSign(String qtyAvailSign) {
		this.qtyAvailSign = qtyAvailSign;
	}

	public String getQtyAvail() {
		return qtyAvail;
	}

	public void setQtyAvail(String qtyAvail) {
		this.qtyAvail = qtyAvail;
	}

	public String getFiller7() {
		return filler7;
	}

	public void setFiller7(String filler7) {
		this.filler7 = filler7;
	}

	public String getAmtPaidSign() {
		return amtPaidSign;
	}

	public void setAmtPaidSign(String amtPaidSign) {
		this.amtPaidSign = amtPaidSign;
	}

	public double getAmtPaid() {
		return amtPaid;
	}

	public void setAmtPaid(double amtPaid) {
		this.amtPaid = amtPaid;
	}

	public String getFiller8() {
		return filler8;
	}

	public void setFiller8(String filler8) {
		this.filler8 = filler8;
	}

	public String getPoAmtSign() {
		return poAmtSign;
	}

	public void setPoAmtSign(String poAmtSign) {
		this.poAmtSign = poAmtSign;
	}

	public double getPoAmt() {
		return poAmt;
	}

	public void setPoAmt(double poAmt) {
		this.poAmt = poAmt;
	}

}
