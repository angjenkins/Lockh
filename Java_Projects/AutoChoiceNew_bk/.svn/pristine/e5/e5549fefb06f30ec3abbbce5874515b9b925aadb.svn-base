	package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(ContrLineCompositePK.class)
@Table (name="contr_line")
public class ContrLineDTO {
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	protected String sch_Line = "";
	
	@Length(max=4)
	@NotNull
	@Column(name="Std_Item")	
	protected String stdItem = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Group_No")	
	protected String groupNumber = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Subgroup_No")	
	protected String subgroupNumber = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Buyer_Code")	
	protected String buyerCode = "";
	
	@Length(max=9)
	@NotNull
	@Column(name="Assembly_Pt_DUNS")	
	protected String assPointDUNS = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Source_Insp_Region")	
	protected String sourceInpectReg = "";
	
	@NotNull
	@Column(name="Shipment_Time")	
	protected int shipTime = 0;
	
	@Length(max=1)
	@NotNull
	@Column(name="Del_Ship_Ind")	
	protected String delShipInd = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")	
	protected String status = "";
	
	@NotNull
	@Column(name="Min_Units")	
	protected int minUnits = 0;
	
	@NotNull
	@Column(name="Contr_Unit_Price")	
	protected double contrUnitPrice = 0.0000;
	
	@NotNull
	@Column(name="Current_Unit_Price")	
	protected double currUnitPrice = 0.0000;
	
	@NotNull
	@Column(name="Date_Initiated")	
	protected Timestamp initDate;
	
	@Column(name="Date_Cancelled")	
	protected Timestamp cancelDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")	
	protected String userUpdated = "";
	
	@Column(name="Ship_Days")	
	protected int shipDays = 0;
	
	@Length(max=10)
	@Column(name="Model")	
	protected String model = "";

	@Length(max=30)
	@Column(name="Description")	
	protected String description = "";
	
	@Length(max=1)
	@Column(name="Allow_Ordering")	
	protected String allowOrder = "";
	
	@Column(name="Expiration_Date")	
	protected Timestamp expirDate;
	
	@Column(name="Open_Date")	
	protected Timestamp openDate;
	
	@Column(name="Closeout_Date")	
	protected Timestamp closeoutDate;
	
	@Length(max=1)
	@Column(name="Active_Line")	
	protected String activeLine = "N";
	
	@Column(name="Est_Qty_GSA")	
	protected int estQuantGSA = 0;
	
	@Column(name="Est_Qty_Fleet")	
	protected int estQuantFleet = 0;
	
	@Column(name="ASE_Unit_Price")	
	protected double aseUnitPrice = 0.00;
	
	@Length(max=20)
	@NotNull
	@Column(name="Origin_City")	
	protected String originCity = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Origin_State")	
	protected String originState = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="Origin_Country")	
	protected String originCountry = "";
	
	@Column(name="Dest_Unit_Charge")	
	protected double destUnitCharge = 0.00;
	
	@Column(name="MSRP_Unit_Price")	
	protected double msrpUnitPrice = 0.00;
	
	@Column(name="INV_Unit_Price")	
	protected double invUnitPrice = 0.00;
	
	@Length(max=3)
	@NotNull
	@Column(name="MPG_B")	
	protected String mpgB = "";
	
	@Length(max=3)
	@NotNull
	@Column(name="MPG_C")	
	protected String mpgC = "";
	
	@Length(max=3)
	@NotNull
	@Column(name="MPG_H")	
	protected String mpgH = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="GreenHouse_Score")	
	protected String greenhouseScore = "";
	
	@Length(max=1)
	@Column(name="Flg_1122")	
	protected String flag1122 = "N";
	
	@Length(max=4)
	@NotNull
	@Column(name="ModelYYYY")	
	protected String modelYYYY = "";
	
	@Length(max=4)
	@NotNull
	@Column(name="Grams_Per_Mile")	
	protected String gramsPerMile = "";
	
	@NotNull
	@Column(name="Orig_My_Price")	
	protected double origMyPrice = 0.0000;
	
	@Length(max=10)
	@NotNull
	@Column(name="Orig_Model")	
	protected String origModel = "";
	
	@Length(max=4)
	@NotNull
	@Column(name="Orig_ModelYYYY")	
	protected String origModelYYYY = "";
	
	@Length(max=4)
	@NotNull
	@Column(name="State50")	
	protected String state50 = "";
	
	
	@Transient
	protected String stdItemDescription ="";
	
	@Transient
	protected String contrFullName ="";
	
	@Transient
	protected String manufacturerName ="";
	
	@Transient
	protected String modelDescripton="";
	
	@Transient
	protected String fedValueNext="";

	@Transient
	protected String modelCode="";


	@Transient
	protected String contractFYAward="";

	@Transient 
	protected String contractSc ="";
	
	@Transient 
	protected String afvFlag ="";
	
	@Transient 
	protected String fileNamePicture ="";

	@Transient 
	protected int currentRow = 0;  // use for lowest price in price comparison
	@Transient 
	protected int recordCount = 0; // use for lowest price in price comparison
	
	@Transient 
	protected String fairOpportunity ="";
    
	@Transient 
	protected Double totalUnitPrice =0.0;   // unit selling price  including collision effect in pricing.
    
	@Transient 
	protected int vehicleQty =0;  // vehicle qty order
    

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSch_Line() {
		return sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		this.sch_Line = sch_Line;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getSubgroupNumber() {
		return subgroupNumber;
	}

	public void setSubgroupNumber(String subgroupNumber) {
		this.subgroupNumber = subgroupNumber;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getAssPointDUNS() {
		return assPointDUNS;
	}

	public void setAssPointDUNS(String assPointDUNS) {
		this.assPointDUNS = assPointDUNS;
	}

	public String getSourceInpectReg() {
		return sourceInpectReg;
	}

	public void setSourceInpectReg(String sourceInpectReg) {
		this.sourceInpectReg = sourceInpectReg;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMinUnits() {
		return minUnits;
	}

	public void setMinUnits(int minUnits) {
		this.minUnits = minUnits;
	}

	public double getContrUnitPrice() {
		return contrUnitPrice;
	}

	public void setContrUnitPrice(double contrUnitPrice) {
		this.contrUnitPrice = contrUnitPrice;
	}

	public double getCurrUnitPrice() {
		return currUnitPrice;
	}

	public void setCurrUnitPrice(double currUnitPrice) {
		this.currUnitPrice = currUnitPrice;
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

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public int getShipDays() {
		return shipDays;
	}

	public void setShipDays(int shipDays) {
		this.shipDays = shipDays;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAllowOrder() {
		return allowOrder;
	}

	public void setAllowOrder(String allowOrder) {
		this.allowOrder = allowOrder;
	}

	public Timestamp getExpirDate() {
		return expirDate;
	}

	public void setExpirDate(Timestamp expirDate) {
		this.expirDate = expirDate;
	}

	public Timestamp getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Timestamp openDate) {
		this.openDate = openDate;
	}

	public Timestamp getCloseoutDate() {
		return closeoutDate;
	}

	public void setCloseoutDate(Timestamp closeoutDate) {
		this.closeoutDate = closeoutDate;
	}

	public String getActiveLine() {
		return activeLine;
	}

	public void setActiveLine(String activeLine) {
		this.activeLine = activeLine;
	}

	public int getEstQuantGSA() {
		return estQuantGSA;
	}

	public void setEstQuantGSA(int estQuantGSA) {
		this.estQuantGSA = estQuantGSA;
	}

	public int getEstQuantFleet() {
		return estQuantFleet;
	}

	public void setEstQuantFleet(int estQuantFleet) {
		this.estQuantFleet = estQuantFleet;
	}

	public double getAseUnitPrice() {
		return aseUnitPrice;
	}

	public void setAseUnitPrice(double aseUnitPrice) {
		this.aseUnitPrice = aseUnitPrice;
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

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public double getDestUnitCharge() {
		return destUnitCharge;
	}

	public void setDestUnitCharge(double destUnitCharge) {
		this.destUnitCharge = destUnitCharge;
	}

	public double getMsrpUnitPrice() {
		return msrpUnitPrice;
	}

	public void setMsrpUnitPrice(double msrpUnitPrice) {
		this.msrpUnitPrice = msrpUnitPrice;
	}

	public double getInvUnitPrice() {
		return invUnitPrice;
	}

	public void setInvUnitPrice(double invUnitPrice) {
		this.invUnitPrice = invUnitPrice;
	}

	public String getMpgB() {
		return mpgB;
	}

	public void setMpgB(String mpgB) {
		this.mpgB = mpgB;
	}

	public String getMpgC() {
		return mpgC;
	}

	public void setMpgC(String mpgC) {
		this.mpgC = mpgC;
	}

	public String getMpgH() {
		return mpgH;
	}

	public void setMpgH(String mpgH) {
		this.mpgH = mpgH;
	}

	public String getGreenhouseScore() {
		return greenhouseScore;
	}

	public void setGreenhouseScore(String greenhouseScore) {
		this.greenhouseScore = greenhouseScore;
	}

	public String getFlag1122() {
		return flag1122;
	}

	public void setFlag1122(String flag1122) {
		this.flag1122 = flag1122;
	}

	public String getModelYYYY() {
		return modelYYYY;
	}

	public void setModelYYYY(String modelYYYY) {
		this.modelYYYY = modelYYYY;
	}

	public String getGramsPerMile() {
		return gramsPerMile;
	}

	public void setGramsPerMile(String gramsPerMile) {
		this.gramsPerMile = gramsPerMile;
	}

	public double getOrigMyPrice() {
		return origMyPrice;
	}

	public void setOrigMyPrice(double origMyPrice) {
		this.origMyPrice = origMyPrice;
	}

	public String getOrigModel() {
		return origModel;
	}

	public void setOrigModel(String origModel) {
		this.origModel = origModel;
	}

	public String getOrigModelYYYY() {
		return origModelYYYY;
	}

	public void setOrigModelYYYY(String origModelYYYY) {
		this.origModelYYYY = origModelYYYY;
	}

	public String getStdItemDescription() {
		return stdItemDescription;
	}

	public void setStdItemDescription(String stdItemDescription) {
		this.stdItemDescription = stdItemDescription;
	}

	public String getContrFullName() {
		return contrFullName;
	}

	public void setContrFullName(String contrFullName) {
		this.contrFullName = contrFullName;
	}

	
	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getModelDescripton() {
		return modelDescripton;
	}

	public void setModelDescripton(String modelDescripton) {
		this.modelDescripton = modelDescripton;
	}

	public String getFedValueNext() {
		return fedValueNext;
	}

	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getContractFYAward() {
		return contractFYAward;
	}

	public void setContractFYAward(String contractFYAward) {
		this.contractFYAward = contractFYAward;
	}

	public String getContractSc() {
		return contractSc;
	}

	public void setContractSc(String contractSc) {
		this.contractSc = contractSc;
	}

	public String getState50() {
		return state50;
	}

	public void setState50(String state50) {
		this.state50 = state50;
	}

	public String getAfvFlag() {
		return afvFlag;
	}

	public void setAfvFlag(String afvFlag) {
		this.afvFlag = afvFlag;
	}

	public String getFileNamePicture() {
		return fileNamePicture;
	}

	public void setFileNamePicture(String fileNamePicture) {
		this.fileNamePicture = fileNamePicture;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public String getFairOpportunity() {
		return fairOpportunity;
	}

	public void setFairOpportunity(String fairOpportunity) {
		this.fairOpportunity = fairOpportunity;
	}

	public Double getTotalUnitPrice() {
		return totalUnitPrice;
	}

	public void setTotalUnitPrice(Double totalUnitPrice) {
		this.totalUnitPrice = totalUnitPrice;
	}

	public int getVehicleQty() {
		return vehicleQty;
	}

	public void setVehicleQty(int vehicleQty) {
		this.vehicleQty = vehicleQty;
	}
	
//   
	
}
