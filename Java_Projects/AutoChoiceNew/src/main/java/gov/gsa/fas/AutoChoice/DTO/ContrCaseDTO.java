package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(ContrCaseCompositePK.class)
@Table (name="contr_case")
public class ContrCaseDTO {
	
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNo = "";
	
	@Id
	@Length(max=3)
	@NotNull
	protected String mod = "";
	
	@Length(max=7)
	@NotNull
	@Column(name="Sch_Line")
	protected String schLine = "";
	
	@Column(name="Order_Date")
	protected Timestamp orderDate;
	
	@Column(name="Shipment_Date")
	protected Timestamp shipDate;
	
	@NotNull
	@Column(name="Shipment_Time")
	protected int shipTime = 0;
	
	@Length(max=1)
	@NotNull
	@Column(name="Del_Ship_Ind")
	protected String delShipInd = "";
	
	@Length(max=9)
	@NotNull
	@Column(name="Assembly_Pt_DUNS")
	protected String assPointDUNS = "";
	
	@Length(max=5)
	@NotNull
	@Column(name="Sc")
	protected String sc = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="FOB")
	protected String fob = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="Origin_City")
	protected String originCity = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Origin_State")
	protected String originState = "";
	
	@Length(max=20)
	@Column(name="Port_City")
	protected String portCity = "";
	
	@Length(max=2)
	@Column(name="Port_State")
	protected String portState = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Inspection_Point")
	protected String inspectPoint = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Buyer_Code")
	protected String buyerCode = "";
	
	@NotNull
	@Column(name="Quantity")
	protected int quantity = 0;
	
	@NotNull
	@Column(name="Unit_Price")
	protected double unitPrice = 0.0000;
	
	@NotNull
	@Column(name="Prev_Units")
	protected int prevUnit = 0;
	
	@NotNull
	@Column(name="Prev_Unit_Price")
	protected double prevUnitPrice = 0.0000;
	
	@NotNull
	@Column(name="Chg_Units")
	protected int changeUnit = 0;
	
	@NotNull
	@Column(name="Chg_Unit_Price")
	protected double changeUnitPrice = 0.0000;
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "";
	
	@NotNull
	@Column(name="Date_Initiated")
	protected Timestamp initDate;
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Additional_Cost")
	protected double addCost = 0.0000;
	
	@Column(name="Transportation_Cost")
	protected double transportCost = 0.0000;
	
	@Column(name="Ship_Days")
	protected int shipDays = 0;

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getSchLine() {
		return schLine;
	}

	public void setSchLine(String schLine) {
		this.schLine = schLine;
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

	public int getShipTime() {
		return shipTime;
	}

	public void setShipTime(int shipTime) {
		this.shipTime = shipTime;
	}

	public String getDelShipInd() {
		return delShipInd;
	}

	public void setDelShipInd(String delShipInd) {
		this.delShipInd = delShipInd;
	}

	public String getAssPointDUNS() {
		return assPointDUNS;
	}

	public void setAssPointDUNS(String assPointDUNS) {
		this.assPointDUNS = assPointDUNS;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getOriginState() {
		return originState;
	}

	public void setOriginState(String originState) {
		this.originState = originState;
	}

	public String getPortCity() {
		return portCity;
	}

	public void setPortCity(String portCity) {
		this.portCity = portCity;
	}

	public String getPortState() {
		return portState;
	}

	public void setPortState(String portState) {
		this.portState = portState;
	}

	public String getInspectPoint() {
		return inspectPoint;
	}

	public void setInspectPoint(String inspectPoint) {
		this.inspectPoint = inspectPoint;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getPrevUnit() {
		return prevUnit;
	}

	public void setPrevUnit(int prevUnit) {
		this.prevUnit = prevUnit;
	}

	public double getPrevUnitPrice() {
		return prevUnitPrice;
	}

	public void setPrevUnitPrice(double prevUnitPrice) {
		this.prevUnitPrice = prevUnitPrice;
	}

	public int getChangeUnit() {
		return changeUnit;
	}

	public void setChangeUnit(int changeUnit) {
		this.changeUnit = changeUnit;
	}

	public double getChangeUnitPrice() {
		return changeUnitPrice;
	}

	public void setChangeUnitPrice(double changeUnitPrice) {
		this.changeUnitPrice = changeUnitPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getInitDate() {
		return initDate;
	}

	public void setInitDate(Timestamp initDate) {
		this.initDate = initDate;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public double getAddCost() {
		return addCost;
	}

	public void setAddCost(double addCost) {
		this.addCost = addCost;
	}

	public double getTransportCost() {
		return transportCost;
	}

	public void setTransportCost(double transportCost) {
		this.transportCost = transportCost;
	}

	public int getShipDays() {
		return shipDays;
	}

	public void setShipDays(int shipDays) {
		this.shipDays = shipDays;
	}
}
