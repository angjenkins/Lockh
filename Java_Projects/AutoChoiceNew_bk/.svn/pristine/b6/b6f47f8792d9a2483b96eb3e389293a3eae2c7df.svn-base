package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="zlb_req")
public class ZLBReqDTO {
	@Id
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	@Length(max=6)
	@Column(name="ZR_CASENO")
	protected String caseNo;
	
	@Length(max=1)
	@Column(name="ZR_EXPORT_CODE")
	protected String exportCode;
	
	@Length(max=3)
	@Column(name="ZR_MOD_F")
	protected String modF;
	
	@Length(max=6)
	@Column(name="ZR_FED_MIL_REQ_1")
	protected String fedMilReq1;
	
	@Length(max=4)
	@Column(name="ZR_FED_MIL_REQ_2")
	protected String fedMilReq2;
	
	@Length(max=4)
	@Column(name="ZR_FED_MIL_REQ_3")
	protected String fedMilReq3;
	
	@Length(max=1)
	@Column(name="ZR_FILLER_B")
	protected String fillerB;
	
	@Column(name="ZR_ORDER_DATE")
	protected Timestamp orderDate;
	
	@Column(name="ZR_SHIPMENT_DATE")
	protected Timestamp shipDate;
	
	@Column(name="ZR_QUANTITY")
	protected int qty;
	
	@Column(name="ZR_AMOUNT")
	protected double amount;
	
	@Length(max=1)
	@Column(name="ZR_STATUS_F")
	protected String statusF;
	
	@Column(name="ZR_DATE")
	protected Timestamp date;
	
	@Length(max=1)
	@Column(name="ZR_FIN_QTY_IND")
	protected String finQtyInd;
	
	@Column(name="ZR_FIN_QTY")
	protected int finQty;
	
	@Length(max=1)
	@Column(name="ZR_FIN_AMT_IND")
	protected String finAmtInd;
	
	@Column(name="ZR_FIN_AMT")
	protected double finAmt;
	
	@Column(name="ZR_FIN_CYCLE_NUM")
	protected int finCycleNum;
	
	@Length(max=5)
	@Column(name="ZR_FIN_CYCLE_DATE")
	protected String finCycleDate;

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getExportCode() {
		return exportCode;
	}

	public void setExportCode(String exportCode) {
		this.exportCode = exportCode;
	}

	public String getModF() {
		return modF;
	}

	public void setModF(String modF) {
		this.modF = modF;
	}

	public String getFedMilReq1() {
		return fedMilReq1;
	}

	public void setFedMilReq1(String fedMilReq1) {
		this.fedMilReq1 = fedMilReq1;
	}

	public String getFedMilReq2() {
		return fedMilReq2;
	}

	public void setFedMilReq2(String fedMilReq2) {
		this.fedMilReq2 = fedMilReq2;
	}

	public String getFedMilReq3() {
		return fedMilReq3;
	}

	public void setFedMilReq3(String fedMilReq3) {
		this.fedMilReq3 = fedMilReq3;
	}

	public String getFillerB() {
		return fillerB;
	}

	public void setFillerB(String fillerB) {
		this.fillerB = fillerB;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getShipDate() {
		return shipDate;
	}

	public void setShipDate(Timestamp shipDate) {
		this.shipDate = shipDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatusF() {
		return statusF;
	}

	public void setStatusF(String statusF) {
		this.statusF = statusF;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getFinQtyInd() {
		return finQtyInd;
	}

	public void setFinQtyInd(String finQtyInd) {
		this.finQtyInd = finQtyInd;
	}

	public int getFinQty() {
		return finQty;
	}

	public void setFinQty(int finQty) {
		this.finQty = finQty;
	}

	public String getFinAmtInd() {
		return finAmtInd;
	}

	public void setFinAmtInd(String finAmtInd) {
		this.finAmtInd = finAmtInd;
	}

	public double getFinAmt() {
		return finAmt;
	}

	public void setFinAmt(double finAmt) {
		this.finAmt = finAmt;
	}

	public int getFinCycleNum() {
		return finCycleNum;
	}

	public void setFinCycleNum(int finCycleNum) {
		this.finCycleNum = finCycleNum;
	}

	public String getFinCycleDate() {
		return finCycleDate;
	}

	public void setFinCycleDate(String finCycleDate) {
		this.finCycleDate = finCycleDate;
	}
	
}
