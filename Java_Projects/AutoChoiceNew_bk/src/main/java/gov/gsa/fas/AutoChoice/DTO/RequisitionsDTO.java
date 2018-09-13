package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table (name="requisitions")
@Component
public class RequisitionsDTO {

	@Id
	@NotNull
	@Length(max=6)
	@Column(name="CaseNo")
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNumber;
	
	@NotNull
	@Length(max=4)
	@Column(name="Std_Item")
	protected String stdItem;
	
	@Length(max=60)
	@Column(name="Non_Std_Desc")
	protected String nonStdDesc;
	
	@Length(max=60)
	@Column(name="Veh_Color")
	protected String vehColor;
	
	@Length(max=1)
	@Column(name="Export_Code")
	protected String exportCode;
	
	@Length(max=2)
	@Column(name="ACRN")
	protected String acrn;
	
	@Length(max=30)
	@Column(name="Mark_For")
	protected String markFor;
	
	@Length(max=30)
	@Column(name="TCN")
	protected String tcn;
	
	@Column(name="Quantity")
	protected int quantity;
		
	@Column(name="Est_Unit_Price")
	protected double estUnitPrice = 0.0000;	
	
	@Length(max=2)
	@Column(name="Buyer_Code")
	protected String buyerCode;
	
	@Length(max=7)
	@Column(name="Purch_Des_No")
	protected String purchDesNo;

	@NotNull
	@Length(max=20)
	@Column(name="Agency_Order_No")
	protected String agencyOrderNo ="";
	
	@NotNull
	@Length(max=2)
	@Column(name="Agency_Code")
	protected String agencyCode ="";
	
	@NotNull
	@Length(max=2)
	@Column(name="Bureau_Code")
	protected String bureauCode ="";
	
	@Length(max=1)
	@Column(name="Funded")
	protected String funded;
	
	@Column(name="Date_Funded")
	protected Timestamp fundedDate;
	
	@Column(name="Date_Received")
	protected Timestamp receivedDate;
	
	@Column(name="Date_Initiated")
	protected Timestamp initDate;
	
	@Column(name="Date_Canceled")
	protected Timestamp cancelDate;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated ="";
	
	@NotNull
	@Length(max=6)
	@Column(name="Fed_Mil_Req_No_1")
	protected String fedMilReq1 ="";
	
	@NotNull
	@Length(max=4)
	@Column(name="Fed_Mil_Req_No_2")
	protected String fedMilReq2 ="";
	
	@NotNull
	@Length(max=4)
	@Column(name="Fed_Mil_Req_No_3")
	protected String fedMilReq3 ="";
	
	@Length(max=6)
	@Column(name="Fed_Mil_Sup_Add")
	protected String fedMilSupAdd;
	
	@Length(max=1)
	@Column(name="Fed_Mil_Signal")
	protected String fedMilSignal;
	
	@Length(max=2)
	@Column(name="Fed_Mil_Fund")
	protected String fedMilFund;
	
	@Length(max=35)
	@Column(name="Message_Line1")
	protected String messageLine1 = "";
	
	@Length(max=35)
	@Column(name="Message_Line2")
	protected String messageLine2 = "";
	
	@Length(max=35)
	@Column(name="Message_Line3")
	protected String messageLine3 = "";
	
	@Length(max=35)
	@Column(name="Message_Line4")
	protected String messageLine4 = "";
	
	@Length(max=35)
	@Column(name="Req_Add_Line1")
	protected String reqAddLine1 = "";
	
	@Length(max=35)
	@Column(name="Req_Add_Line2")
	protected String reqAddLine2 = "";
	
	@Length(max=35)
	@Column(name="Req_Add_Line3")
	protected String reqAddLine3 = "";
	
	@Length(max=35)
	@Column(name="Req_Add_Line4")
	protected String reqAddLine4 = "";
	
	@Length(max=15)
	@Column(name="Req_Add_Country")
	protected String reqAddCountry = "";
	
	@Length(max=20)
	@Column(name="Req_Add_City")
	protected String reqAddCity = "";
	
	@Length(max=2)
	@Column(name="Req_Add_State")
	protected String reqAddState = "";
	
	@Length(max=5)
	@Column(name="Req_Add_Zip")
	protected String reqAddZip = "";
	
	@Length(max=4)
	@Column(name="Req_Add_Zip_Sfx")
	protected String reqAddZipSfx = "";	
	
	@Length(max=35)
	@Column(name="Mail_Add_Line1")
	protected String mailAddLine1 = "";
	
	@Length(max=35)
	@Column(name="Mail_Add_Line2")
	protected String mailAddLine2 = "";
	
	@Length(max=35)
	@Column(name="Mail_Add_Line3")
	protected String mailAddLine3 = "";
	
	@Length(max=35)
	@Column(name="Mail_Add_Line4")
	protected String mailAddLine4 = "";
	
	@Length(max=15)
	@Column(name="Mail_Add_Country")
	protected String mailAddCountry = "";
	
	@Length(max=20)
	@Column(name="Mail_Add_City")
	protected String mailAddCity = "";
	
	@Length(max=2)
	@Column(name="Mail_Add_State")
	protected String mailAddState = "";
	
	@Length(max=5)
	@Column(name="Mail_Add_Zip")
	protected String mailAddZip = "";
	
	@Length(max=4)
	@Column(name="Mail_Add_Zip_Sfx")
	protected String mailAddZipSfx = "";	
	
	@Length(max=35)
	@Column(name="Con_Add_Line1")
	protected String conAddLine1 = "";
	
	@Length(max=35)
	@Column(name="Con_Add_Line2")
	protected String conAddLine2 = "";
	
	@Length(max=35)
	@Column(name="Con_Add_Line3")
	protected String conAddLine3 = "";
	
	@Length(max=35)
	@Column(name="Con_Add_Line4")
	protected String conAddLine4 = "";
	
	@Length(max=15)
	@Column(name="Con_Add_Country")
	protected String conAddCountry = "";
	
	@Length(max=20)
	@Column(name="Con_Add_City")
	protected String conAddCity = "";
	
	@Length(max=2)
	@Column(name="Con_Add_State")
	protected String conAddState = "";
	
	@Length(max=5)
	@Column(name="Con_Add_Zip")
	protected String conAddZip = "";
	
	@Length(max=4)
	@Column(name="Con_Add_Zip_Sfx")
	protected String conAddZipSfx = "";	
	
	@Length(max=35)
	@Column(name="Bill_Add_Line1")
	protected String billAddLine1 = "";
	
	@Length(max=35)
	@Column(name="Bill_Add_Line2")
	protected String billAddLine2 = "";
	
	@Length(max=35)
	@Column(name="Bill_Add_Line3")
	protected String billAddLine3 = "";
	
	@Length(max=35)
	@Column(name="Bill_Add_Line4")
	protected String billAddLine4 = "";
	
	@Length(max=15)
	@Column(name="Bill_Add_Country")
	protected String billAddCountry = "";
	
	@Length(max=20)
	@Column(name="Bill_Add_City")
	protected String billAddCity = "";
	
	@Length(max=2)
	@Column(name="Bill_Add_State")
	protected String billAddState = "";
	
	@Length(max=5)
	@Column(name="Bill_Add_Zip")
	protected String billAddZip = "";
	
	@Length(max=4)
	@Column(name="Bill_Add_Zip_Sfx")
	protected String billAddZipSfx = "";	
	
	@Length(max=1)
	@Column(name="Status")
	protected String status = "";	
	
	@Length(max=1)
	@Column(name="Section")
	protected String section = "";	
	
	@Length(max=35)
	@Column(name="Message_Line5")
	protected String messageLine5 = "";	
	
	@Length(max=40)
	@Column(name="Mess_over2")
	protected String messOver2;	
	
	@Length(max=5)
	@Column(name="Contract")
	protected String contract;	
	
	@Length(max=10)
	@Column(name="Sch_Line")
	protected String schLine;	
	
	@Column(name="MPG")
	protected Double mpg;	
	
	@Length(max=10)
	@Column(name="Model")
	protected String model = "";		
	
	@Length(max=16)
	@Column(name="NSN")
	protected String nsn = "";		

	@Length(max=20)
	@Column(name="Registration_No")
	protected String registrationNum;	
	
	@Length(max=1)
	@Column(name="Source")
	protected String source;	
	
	@Column(name="Batch_No")
	protected int batchNum;	
	
	@Length(max=4)
	@Column(name="Fair_Opportunity")
	protected String fairOpp = "";		
	
	@Length(max=1)
	@Column(name="Express_Desk")
	protected String expressDesk = "N";		
	
	@Length(max=50)
	@Column(name="Con_Email_Address")
	protected String conEmailAdd;		
	
	@Length(max=1)
	@Column(name="Con_Fax_Intl")
	protected String conFaxIntl = "N";		
	
	@Length(max=20)
	@Column(name="Con_Fax_Number")
	protected String conFaxNum;		
	
	@Length(max=50)
	@Column(name="Req_Email_Address")
	protected String reqEmailAdd;		
	
	@Length(max=1)
	@Column(name="Req_Fax_Intl")
	protected String reqFaxIntl = "N";		
	
	@Length(max=20)
	@Column(name="Req_Fax_Number")
	protected String reqFaxNum;		
	
	@Length(max=50)
	@Column(name="Mail_Email_Address")
	protected String mailEmailAdd;		
	
	@Length(max=1)
	@Column(name="Mail_Fax_Intl")
	protected String mailFaxIntl = "N";		
	
	@Length(max=10)
	@Column(name="Mail_Fax_Number")
	protected String mailFaxNum;	
	
	@Length(max=35)
	@Column(name="Message_Line6")
	protected String messageLine6 = "";	
	
	@Length(max=35)
	@Column(name="Message_Line7")
	protected String messageLine7 = "";	
	
	@Length(max=35)
	@Column(name="Message_Line8")
	protected String messageLine8 = "";	
	
	@Length(max=6)
	@Column(name="Line_Item")
	protected String lineItem;
	
	@Column(name="Sequence")
	protected Double sequence;
	
	@Length(max=1)
	@Column(name="AFV_Flag")
	protected String afvFlag = "N";
	
	@NotNull
	@Length(max=20)
	@Column(name="TAS")
	protected String tas = "";
	
	@Length(max=2)
	@Column(name="Agency_OnBehalf")
	protected String agencyOnBehalf = "";
	
	@Length(max=2)
	@Column(name="Bureau_OnBehalf")
	protected String bureauOnBehalf = "";
	
	@Length(max=80)
	@Column(name="Remarks")
	protected String remarks = "";
	
	@Transient
	protected String trContract=""; 
	
	@Transient
	protected String trContrDUNS="";
	
	@Transient
	protected String trSchLine="";
	
	@Transient
	protected Timestamp trShipmentDate;
	
	@Transient
	protected Timestamp trOrderDate;
	
	@Transient
	protected String trMod="";
	
	@Transient
	protected int trQuantity=0;
	
	@Transient
	protected String trVehOrderNo="";
	
	@Transient
	protected String trVIN="";
	
	@Transient
	protected String trStatus="";
	
	@Transient
	protected String trName="";
	
	@Transient
	protected String trAddress="";
	
	@Transient
	protected String trCity="";
	
	@Transient
	protected String trState="";
	
	
	@Transient
	protected String trZip="";
	
	@Transient
	protected String trZipSuffix="";
	
	@Transient
	protected Timestamp trStatusDate;
	
	@Transient
	protected String trContactName="";
	
	@Transient
	protected String trContactTelno="";
	
	@Transient
	protected Timestamp trDeliveryDate;
	
		  	    
	

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getNonStdDesc() {
		return nonStdDesc;
	}

	public void setNonStdDesc(String nonStdDesc) {
		this.nonStdDesc = nonStdDesc;
	}

	public String getVehColor() {
		return vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getExportCode() {
		return exportCode;
	}

	public void setExportCode(String exportCode) {
		this.exportCode = exportCode;
	}

	public String getAcrn() {
		return acrn;
	}

	public void setAcrn(String acrn) {
		this.acrn = acrn;
	}

	public String getMarkFor() {
		return markFor;
	}

	public void setMarkFor(String markFor) {
		this.markFor = markFor;
	}

	public String getTcn() {
		return tcn;
	}

	public void setTcn(String tcn) {
		this.tcn = tcn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getEstUnitPrice() {
		return estUnitPrice;
	}

	public void setEstUnitPrice(double estUnitPrice) {
		this.estUnitPrice = estUnitPrice;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getPurchDesNo() {
		return purchDesNo;
	}

	public void setPurchDesNo(String purchDesNo) {
		this.purchDesNo = purchDesNo;
	}

	public String getAgencyOrderNo() {
		return agencyOrderNo;
	}

	public void setAgencyOrderNo(String agencyOrderNo) {
		this.agencyOrderNo = agencyOrderNo;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getBureauCode() {
		return bureauCode;
	}

	public void setBureauCode(String bureauCode) {
		this.bureauCode = bureauCode;
	}

	public String getFunded() {
		return funded;
	}

	public void setFunded(String funded) {
		this.funded = funded;
	}

	public Timestamp getFundedDate() {
		return fundedDate;
	}

	public void setFundedDate(Timestamp fundedDate) {
		this.fundedDate = fundedDate;
	}

	public Timestamp getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Timestamp receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Timestamp getInitDate() {
		return initDate;
	}

	public void setInitDate(Timestamp initDate) {
		this.initDate = initDate;
	}

	public Timestamp getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Timestamp cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
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

	public String getFedMilSupAdd() {
		return fedMilSupAdd;
	}

	public void setFedMilSupAdd(String fedMilSupAdd) {
		this.fedMilSupAdd = fedMilSupAdd;
	}

	public String getFedMilSignal() {
		return fedMilSignal;
	}

	public void setFedMilSignal(String fedMilSignal) {
		this.fedMilSignal = fedMilSignal;
	}

	public String getFedMilFund() {
		return fedMilFund;
	}

	public void setFedMilFund(String fedMilFund) {
		this.fedMilFund = fedMilFund;
	}

	public String getMessageLine1() {
		return messageLine1;
	}

	public void setMessageLine1(String messageLine1) {
		this.messageLine1 = messageLine1;
	}

	public String getMessageLine2() {
		return messageLine2;
	}

	public void setMessageLine2(String messageLine2) {
		this.messageLine2 = messageLine2;
	}

	public String getMessageLine3() {
		return messageLine3;
	}

	public void setMessageLine3(String messageLine3) {
		this.messageLine3 = messageLine3;
	}

	public String getMessageLine4() {
		return messageLine4;
	}

	public void setMessageLine4(String messageLine4) {
		this.messageLine4 = messageLine4;
	}

	public String getReqAddLine1() {
		return reqAddLine1;
	}

	public void setReqAddLine1(String reqAddLine1) {
		this.reqAddLine1 = reqAddLine1;
	}

	public String getReqAddLine2() {
		return reqAddLine2;
	}

	public void setReqAddLine2(String reqAddLine2) {
		this.reqAddLine2 = reqAddLine2;
	}

	public String getReqAddLine3() {
		return reqAddLine3;
	}

	public void setReqAddLine3(String reqAddLine3) {
		this.reqAddLine3 = reqAddLine3;
	}

	public String getReqAddLine4() {
		return reqAddLine4;
	}

	public void setReqAddLine4(String reqAddLine4) {
		this.reqAddLine4 = reqAddLine4;
	}

	public String getReqAddCountry() {
		return reqAddCountry;
	}

	public void setReqAddCountry(String reqAddCountry) {
		this.reqAddCountry = reqAddCountry;
	}

	public String getReqAddCity() {
		return reqAddCity;
	}

	public void setReqAddCity(String reqAddCity) {
		this.reqAddCity = reqAddCity;
	}

	public String getReqAddState() {
		return reqAddState;
	}

	public void setReqAddState(String reqAddState) {
		this.reqAddState = reqAddState;
	}

	public String getReqAddZip() {
		return reqAddZip;
	}

	public void setReqAddZip(String reqAddZip) {
		this.reqAddZip = reqAddZip;
	}

	public String getReqAddZipSfx() {
		return reqAddZipSfx;
	}

	public void setReqAddZipSfx(String reqAddZipSfx) {
		this.reqAddZipSfx = reqAddZipSfx;
	}

	public String getMailAddLine1() {
		return mailAddLine1;
	}

	public void setMailAddLine1(String mailAddLine1) {
		this.mailAddLine1 = mailAddLine1;
	}

	public String getMailAddLine2() {
		return mailAddLine2;
	}

	public void setMailAddLine2(String mailAddLine2) {
		this.mailAddLine2 = mailAddLine2;
	}

	public String getMailAddLine3() {
		return mailAddLine3;
	}

	public void setMailAddLine3(String mailAddLine3) {
		this.mailAddLine3 = mailAddLine3;
	}

	public String getMailAddLine4() {
		return mailAddLine4;
	}

	public void setMailAddLine4(String mailAddLine4) {
		this.mailAddLine4 = mailAddLine4;
	}

	public String getMailAddCountry() {
		return mailAddCountry;
	}

	public void setMailAddCountry(String mailAddCountry) {
		this.mailAddCountry = mailAddCountry;
	}

	public String getMailAddCity() {
		return mailAddCity;
	}

	public void setMailAddCity(String mailAddCity) {
		this.mailAddCity = mailAddCity;
	}

	public String getMailAddState() {
		return mailAddState;
	}

	public void setMailAddState(String mailAddState) {
		this.mailAddState = mailAddState;
	}

	public String getMailAddZip() {
		return mailAddZip;
	}

	public void setMailAddZip(String mailAddZip) {
		this.mailAddZip = mailAddZip;
	}

	public String getMailAddZipSfx() {
		return mailAddZipSfx;
	}

	public void setMailAddZipSfx(String mailAddZipSfx) {
		this.mailAddZipSfx = mailAddZipSfx;
	}

	public String getConAddLine1() {
		return conAddLine1;
	}

	public void setConAddLine1(String conAddLine1) {
		this.conAddLine1 = conAddLine1;
	}

	public String getConAddLine2() {
		return conAddLine2;
	}

	public void setConAddLine2(String conAddLine2) {
		this.conAddLine2 = conAddLine2;
	}

	public String getConAddLine3() {
		return conAddLine3;
	}

	public void setConAddLine3(String conAddLine3) {
		this.conAddLine3 = conAddLine3;
	}

	public String getConAddLine4() {
		return conAddLine4;
	}

	public void setConAddLine4(String conAddLine4) {
		this.conAddLine4 = conAddLine4;
	}

	public String getConAddCountry() {
		return conAddCountry;
	}

	public void setConAddCountry(String conAddCountry) {
		this.conAddCountry = conAddCountry;
	}

	public String getConAddCity() {
		return conAddCity;
	}

	public void setConAddCity(String conAddCity) {
		this.conAddCity = conAddCity;
	}

	public String getConAddState() {
		return conAddState;
	}

	public void setConAddState(String conAddState) {
		this.conAddState = conAddState;
	}

	public String getConAddZip() {
		return conAddZip;
	}

	public void setConAddZip(String conAddZip) {
		this.conAddZip = conAddZip;
	}

	public String getConAddZipSfx() {
		return conAddZipSfx;
	}

	public void setConAddZipSfx(String conAddZipSfx) {
		this.conAddZipSfx = conAddZipSfx;
	}

	public String getBillAddLine1() {
		return billAddLine1;
	}

	public void setBillAddLine1(String billAddLine1) {
		this.billAddLine1 = billAddLine1;
	}

	public String getBillAddLine2() {
		return billAddLine2;
	}

	public void setBillAddLine2(String billAddLine2) {
		this.billAddLine2 = billAddLine2;
	}

	public String getBillAddLine3() {
		return billAddLine3;
	}

	public void setBillAddLine3(String billAddLine3) {
		this.billAddLine3 = billAddLine3;
	}

	public String getBillAddLine4() {
		return billAddLine4;
	}

	public void setBillAddLine4(String billAddLine4) {
		this.billAddLine4 = billAddLine4;
	}

	public String getBillAddCountry() {
		return billAddCountry;
	}

	public void setBillAddCountry(String billAddCountry) {
		this.billAddCountry = billAddCountry;
	}

	public String getBillAddCity() {
		return billAddCity;
	}

	public void setBillAddCity(String billAddCity) {
		this.billAddCity = billAddCity;
	}

	public String getBillAddState() {
		return billAddState;
	}

	public void setBillAddState(String billAddState) {
		this.billAddState = billAddState;
	}

	public String getBillAddZip() {
		return billAddZip;
	}

	public void setBillAddZip(String billAddZip) {
		this.billAddZip = billAddZip;
	}

	public String getBillAddZipSfx() {
		return billAddZipSfx;
	}

	public void setBillAddZipSfx(String billAddZipSfx) {
		this.billAddZipSfx = billAddZipSfx;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getMessageLine5() {
		return messageLine5;
	}

	public void setMessageLine5(String messageLine5) {
		this.messageLine5 = messageLine5;
	}

	public String getMessOver2() {
		return messOver2;
	}

	public void setMessOver2(String messOver2) {
		this.messOver2 = messOver2;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSchLine() {
		return schLine;
	}

	public void setSchLine(String schLine) {
		this.schLine = schLine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNsn() {
		return nsn;
	}

	public void setNsn(String nsn) {
		this.nsn = nsn;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(int batchNum) {
		this.batchNum = batchNum;
	}

	public String getFairOpp() {
		return fairOpp;
	}

	public void setFairOpp(String fairOpp) {
		this.fairOpp = fairOpp;
	}

	public String getExpressDesk() {
		return expressDesk;
	}

	public void setExpressDesk(String expressDesk) {
		this.expressDesk = expressDesk;
	}

	public String getConEmailAdd() {
		return conEmailAdd;
	}

	public void setConEmailAdd(String conEmailAdd) {
		this.conEmailAdd = conEmailAdd;
	}

	public String getConFaxIntl() {
		return conFaxIntl;
	}

	public void setConFaxIntl(String conFaxIntl) {
		this.conFaxIntl = conFaxIntl;
	}

	public String getConFaxNum() {
		return conFaxNum;
	}

	public void setConFaxNum(String conFaxNum) {
		this.conFaxNum = conFaxNum;
	}

	public String getReqEmailAdd() {
		return reqEmailAdd;
	}

	public void setReqEmailAdd(String reqEmailAdd) {
		this.reqEmailAdd = reqEmailAdd;
	}

	public String getReqFaxIntl() {
		return reqFaxIntl;
	}

	public void setReqFaxIntl(String reqFaxIntl) {
		this.reqFaxIntl = reqFaxIntl;
	}

	public String getReqFaxNum() {
		return reqFaxNum;
	}

	public void setReqFaxNum(String reqFaxNum) {
		this.reqFaxNum = reqFaxNum;
	}

	public String getMailEmailAdd() {
		return mailEmailAdd;
	}

	public void setMailEmailAdd(String mailEmailAdd) {
		this.mailEmailAdd = mailEmailAdd;
	}

	public String getMailFaxIntl() {
		return mailFaxIntl;
	}

	public void setMailFaxIntl(String mailFaxIntl) {
		this.mailFaxIntl = mailFaxIntl;
	}

	public String getMailFaxNum() {
		return mailFaxNum;
	}

	public void setMailFaxNum(String mailFaxNum) {
		this.mailFaxNum = mailFaxNum;
	}

	public String getMessageLine6() {
		return messageLine6;
	}

	public void setMessageLine6(String messageLine6) {
		this.messageLine6 = messageLine6;
	}

	public String getMessageLine7() {
		return messageLine7;
	}

	public void setMessageLine7(String messageLine7) {
		this.messageLine7 = messageLine7;
	}

	public String getMessageLine8() {
		return messageLine8;
	}

	public void setMessageLine8(String messageLine8) {
		this.messageLine8 = messageLine8;
	}

	public String getLineItem() {
		return lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	public String getAfvFlag() {
		return afvFlag;
	}

	public void setAfvFlag(String afvFlag) {
		this.afvFlag = afvFlag;
	}

	public String getTas() {
		return tas;
	}

	public void setTas(String tas) {
		this.tas = tas;
	}

	public String getAgencyOnBehalf() {
		return agencyOnBehalf;
	}

	public void setAgencyOnBehalf(String agencyOnBehalf) {
		this.agencyOnBehalf = agencyOnBehalf;
	}

	public String getBureauOnBehalf() {
		return bureauOnBehalf;
	}

	public void setBureauOnBehalf(String bureauOnBehalf) {
		this.bureauOnBehalf = bureauOnBehalf;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTrContract() {
		return trContract;
	}

	public void setTrContract(String trContract) {
		this.trContract = trContract;
	}

	public String getTrContrDUNS() {
		return trContrDUNS;
	}

	public void setTrContrDUNS(String trContrDUNS) {
		this.trContrDUNS = trContrDUNS;
	}

	public String getTrSchLine() {
		return trSchLine;
	}

	public void setTrSchLine(String trSchLine) {
		this.trSchLine = trSchLine;
	}

	public Timestamp getTrShipmentDate() {
		return trShipmentDate;
	}

	public void setTrShipmentDate(Timestamp trShipmentDate) {
		this.trShipmentDate = trShipmentDate;
	}

	public Timestamp getTrOrderDate() {
		return trOrderDate;
	}

	public void setTrOrderDate(Timestamp trOrderDate) {
		this.trOrderDate = trOrderDate;
	}

	public String getTrMod() {
		return trMod;
	}

	public void setTrMod(String trMod) {
		this.trMod = trMod;
	}

	public int getTrQuantity() {
		return trQuantity;
	}

	public void setTrQuantity(int trQuantity) {
		this.trQuantity = trQuantity;
	}

	public String getTrVehOrderNo() {
		return trVehOrderNo;
	}

	public void setTrVehOrderNo(String trVehOrderNo) {
		this.trVehOrderNo = trVehOrderNo;
	}

	public String getTrVIN() {
		return trVIN;
	}

	public void setTrVIN(String trVIN) {
		this.trVIN = trVIN;
	}

	public String getTrStatus() {
		return trStatus;
	}

	public void setTrStatus(String trStatus) {
		this.trStatus = trStatus;
	}

	public String getTrName() {
		return trName;
	}

	public void setTrName(String trName) {
		this.trName = trName;
	}

	public String getTrAddress() {
		return trAddress;
	}

	public void setTrAddress(String trAddress) {
		this.trAddress = trAddress;
	}

	public String getTrCity() {
		return trCity;
	}

	public void setTrCity(String trCity) {
		this.trCity = trCity;
	}

	public String getTrState() {
		return trState;
	}

	public void setTrState(String trState) {
		this.trState = trState;
	}

	public String getTrZip() {
		return trZip;
	}

	public void setTrZip(String trZip) {
		this.trZip = trZip;
	}

	public String getTrZipSuffix() {
		return trZipSuffix;
	}

	public void setTrZipSuffix(String trZipSuffix) {
		this.trZipSuffix = trZipSuffix;
	}

	public Timestamp getTrStatusDate() {
		return trStatusDate;
	}

	public void setTrStatusDate(Timestamp trStatusDate) {
		this.trStatusDate = trStatusDate;
	}

	public String getTrContactName() {
		return trContactName;
	}

	public void setTrContactName(String trContactName) {
		this.trContactName = trContactName;
	}

	public String getTrContactTelno() {
		return trContactTelno;
	}

	public void setTrContactTelno(String trContactTelno) {
		this.trContactTelno = trContactTelno;
	}

	public Timestamp getTrDeliveryDate() {
		return trDeliveryDate;
	}

	public void setTrDeliveryDate(Timestamp trDeliveryDate) {
		this.trDeliveryDate = trDeliveryDate;
	}

	public Double getMpg() {
		return mpg;
	}

	public void setMpg(Double mpg) {
		this.mpg = mpg;
	}

	public Double getSequence() {
		return sequence;
	}

	public void setSequence(Double sequence) {
		this.sequence = sequence;
	}
	
	
}
