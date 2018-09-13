/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
/**
 * @author Arnel Macatula
 *
 */


@Entity
@Table (name="bid_line_new")
@IdClass(BidLineNewCompositePK.class)
public class BidLineNewDTO {
	@Id 
	@NotEmpty(message="Sol_No_1  cannot be empty")
	@NotNull
	@Length(max=2)
	//@Column(name="Sol_No_1")
	protected String sol_No_1 = "";
	
	@Id
	@NotEmpty(message="Sol_No_2  cannot be empty")
	@NotNull
	@Length(max=6)
	//@Column(name="Sol_No_2")
	protected String sol_No_2 = "";

	@NotEmpty(message="Sol_No_3  cannot be empty")
	@NotNull
	@Length(max=2)
	//@Column(name="Sol_No_3")
	@Id
	protected String sol_No_3 = "";
	
	@Id
	@NotEmpty(message="Contr_DUNS cannot be empty")
	@NotNull
	@Column(name="Contr_DUNS")
	protected String Contr_DUNS = "";
  
	@Id
	@NotEmpty(message="Contract cannot be empty")
	@NotNull
	@Column(name="Contract")
	protected String Contract = "";

	@Id
	@NotEmpty(message="Schedule Line cannot be empty")
	@NotNull
	@Column(name="Sch_Line")
	protected String Sch_Line = "";
	
	
	@Column(name="Std_Item")
	protected String stdItem = "";
	
	@Column(name="Model")
	protected String model = "";

	@Column(name="Dt_Bid")
	protected Timestamp DtBid = null;

	@Column(name="Group_No")
	protected String groupNo = "";
	
	@Column(name="Group_Status")
	protected String groupStatus = "";

	@Column(name="Line_Status")
	protected String lineStatus = "";
	
	@Column(name="Contr_Unit_Price")
	protected Double contrUnitPrice = 0.00;
	
	@Column(name="Orig_Unit_Price")
	protected Double origUnitPrice = 0.00;
	
	@Column(name="BF_Unit_Price")
	protected Double BF_Unit_Price = 0.00;
	
	@Column(name="INV_Unit_Price")
	protected Double invUnitPrice = 0.00;
	
	@Column(name="Other_Price")
	protected Double otherPrice = 0.00;

	@Column(name="Extended_Total_Price")
	protected Double extendedTotalPrice = 0.00;
	
	
	@Column(name="Assembly_Pt_DUNS")
	protected String assemblyPtDUNS = "";

	@Column(name="Origin_City")
	protected String originCity = "";

	@Column(name="Origin_State")
	protected String originState = "";
	
	@Column(name="Origin_Country")
	protected String originCountry = "";
	
	
	@Column(name="Inspect_City")
	protected String inspectCity = "";

	@Column(name="Inspect_State")
	protected String inspectState = "";
	
	@Column(name="Inspect_Country")
	protected String inspectCountry = "";

	@Column(name="Source_Insp_Region")
	protected String sourceInspRegion = "";         //	  `Source_Insp_Region` char(1) NOT NULL DEFAULT '',

	@Column(name="Port_City")
	protected String portCity = "";                 //    `Port_City` varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '',

	@Column(name="Port_State")
	protected String portState = "";                //     `Port_State` char(2) NOT NULL DEFAULT '',

	@Column(name="Shipment_Time")                     
	protected String  shipmentTime ="";             //     `Shipment_Time` char(3) NOT NULL DEFAULT '', 

	@Column(name="Dest_Unit_Charge")                     
	protected Double destUnitCharge = 0.0;

	@Column(name="FOB")                     
	protected String  FOB = "";
	
	@Column(name="BADF")                     
	protected String  badf = "";
	
	@Column(name="Comment1")                     
	protected String  comment1 = "";
	
	@Column(name="Comment2")                     
	protected String  comment2 = "";
	
	@Column(name="Comment3")                     
	protected String  comment3 = "";
	@Column(name="Date_Initiated")                     
	protected Timestamp  dateInitiated ;              

	@Column(name="Date_Updated")                     
	protected Timestamp  dateUpdated ;              

	@Column(name="User_Updated")                     
	protected String  userUpdated = "";

	@Column(name="Status")                     
	protected String  status = "";
	
	@Column(name="Batch_No")                     
	protected Double  batchNo = 0.0;
	
	@Column(name="ASE_Unit_Price")                     
	protected Double  aseUnitPrice = 0.0;
	
	@Column(name="Est_Qty_GSA")                     
	protected Integer  estQtyGSA = 0;
	
	@Column(name="Est_Qty_Fleet")                     
	protected Integer  estQtyFleet = 0;
	
	@Column(name="MSRP_Unit_Price")                     
	protected Double  msrpUnitPrice = 0.0;
	
	@Column(name="MPG_B")                     
	protected String  mpgB = "";

	@Column(name="MPG_C")                     
	protected String  mpgC = "";

	@Column(name="MPG_H")                     
	protected String  mpgH = "";

	@Column(name="GreenHouse_Score")                     
	protected String  greenHouseScore = "";

	@Column(name="Flg_1122")                     
	protected String  flg1122 = "";
	
	@Column(name="ModelYYYY")                     
	protected String  modelYYYY = "";

	@Column(name="Grams_Per_Mile")                     
	protected String  gramsPerMile = "";
	
	
	@Column(name="State50")                     
	protected String  state50 = "";
	
		
	@Transient
	protected String result ="";
	
	public String getSol_No_1() {
		return sol_No_1;
	}

	public void setSol_No_1(String sol_No_1) {
		this.sol_No_1 = sol_No_1;
	}

	public String getSol_No_2() {
		return sol_No_2;
	}

	public void setSol_No_2(String sol_No_2) {
		this.sol_No_2 = sol_No_2;
	}

	public String getSol_No_3() {
		return sol_No_3;
	}

	public void setSol_No_3(String sol_No_3) {
		this.sol_No_3 = sol_No_3;
	}

	
	
	

	public String getContr_DUNS() {
		return Contr_DUNS;
	}

	public void setContr_DUNS(String contr_DUNS) {
		Contr_DUNS = contr_DUNS;
	}

	public String getContract() {
		return Contract;
	}

	public void setContract(String contract) {
		Contract = contract;
	}

	public String getSch_Line() {
		return Sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Timestamp getDtBid() {
		return DtBid;
	}

	public void setDtBid(Timestamp dtBid) {
		DtBid = dtBid;
	}

	public String getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public String getLineStatus() {
		return lineStatus;
	}

	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}

	public Double getContrUnitPrice() {
		return contrUnitPrice;
	}

	public void setContrUnitPrice(Double contrUnitPrice) {
		this.contrUnitPrice = contrUnitPrice;
	}

	public Double getOrigUnitPrice() {
		return origUnitPrice;
	}

	public void setOrigUnitPrice(Double origUnitPrice) {
		this.origUnitPrice = origUnitPrice;
	}

	public Double getBF_Unit_Price() {
		return BF_Unit_Price;
	}

	public void setBF_Unit_Price(Double bF_Unit_Price) {
		BF_Unit_Price = bF_Unit_Price;
	}

	public Double getInvUnitPrice() {
		return invUnitPrice;
	}

	public void setInvUnitPrice(Double invUnitPrice) {
		this.invUnitPrice = invUnitPrice;
	}

	public Double getOtherPrice() {
		return otherPrice;
	}

	public void setOtherPrice(Double otherPrice) {
		this.otherPrice = otherPrice;
	}

	public Double getExtendedTotalPrice() {
		return extendedTotalPrice;
	}

	public void setExtendedTotalPrice(Double extendedTotalPrice) {
		this.extendedTotalPrice = extendedTotalPrice;
	}

	public String getAssemblyPtDUNS() {
		return assemblyPtDUNS;
	}

	public void setAssemblyPtDUNS(String assemblyPtDUNS) {
		this.assemblyPtDUNS = assemblyPtDUNS;
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

	public String getInspectCity() {
		return inspectCity;
	}

	public void setInspectCity(String inspectCity) {
		this.inspectCity = inspectCity;
	}

	public String getInspectState() {
		return inspectState;
	}

	public void setInspectState(String inspectState) {
		this.inspectState = inspectState;
	}

	public String getInspectCountry() {
		return inspectCountry;
	}

	public void setInspectCountry(String inspectCountry) {
		this.inspectCountry = inspectCountry;
	}

	public String getSourceInspRegion() {
		return sourceInspRegion;
	}

	public void setSourceInspRegion(String sourceInspRegion) {
		this.sourceInspRegion = sourceInspRegion;
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

	public String getShipmentTime() {
		return shipmentTime;
	}

	public void setShipmentTime(String shipmentTime) {
		this.shipmentTime = shipmentTime;
	}

	public Double getDestUnitCharge() {
		return destUnitCharge;
	}

	public void setDestUnitCharge(Double destUnitCharge) {
		this.destUnitCharge = destUnitCharge;
	}

	public String getFOB() {
		return FOB;
	}

	public void setFOB(String fOB) {
		FOB = fOB;
	}

	public String getBadf() {
		return badf;
	}

	public void setBadf(String badf) {
		this.badf = badf;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public Timestamp getDateInitiated() {
		return dateInitiated;
	}

	public void setDateInitiated(Timestamp dateInitiated) {
		this.dateInitiated = dateInitiated;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(Double batchNo) {
		this.batchNo = batchNo;
	}

	public Double getAseUnitPrice() {
		return aseUnitPrice;
	}

	public void setAseUnitPrice(Double aseUnitPrice) {
		this.aseUnitPrice = aseUnitPrice;
	}

	public Integer getEstQtyGSA() {
		return estQtyGSA;
	}

	public void setEstQtyGSA(Integer estQtyGSA) {
		this.estQtyGSA = estQtyGSA;
	}

	public Integer getEstQtyFleet() {
		return estQtyFleet;
	}

	public void setEstQtyFleet(Integer estQtyFleet) {
		this.estQtyFleet = estQtyFleet;
	}

	public Double getMsrpUnitPrice() {
		return msrpUnitPrice;
	}

	public void setMsrpUnitPrice(Double msrpUnitPrice) {
		this.msrpUnitPrice = msrpUnitPrice;
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

	public String getGreenHouseScore() {
		return greenHouseScore;
	}

	public void setGreenHouseScore(String greenHouseScore) {
		this.greenHouseScore = greenHouseScore;
	}

	public String getFlg1122() {
		return flg1122;
	}

	public void setFlg1122(String flg1122) {
		this.flg1122 = flg1122;
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getState50() {
		return state50;
	}

	public void setState50(String state50) {
		this.state50 = state50;
	}
	
	

}

