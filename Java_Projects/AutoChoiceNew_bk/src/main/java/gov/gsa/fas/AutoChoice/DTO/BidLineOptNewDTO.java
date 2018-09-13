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
@Table (name="bid_line_opt_new")
@IdClass(BidLineOptNewCompositePK.class)
public class BidLineOptNewDTO {
	@Id
	@NotEmpty(message="Sol_No_1  cannot be empty")
	@NotNull
	@Length(max=2)
	@Column(name="Sol_No_1")
	protected String Sol_No_1 = "";
	@Id
	@NotEmpty(message="Sol_No_2  cannot be empty")
	@NotNull
	@Length(max=6)
	@Column(name="Sol_No_2")
	protected String Sol_No_2 = "";
	@Id
	@NotEmpty(message="Sol_No_3  cannot be empty")
	@NotNull
	@Length(max=2)
	@Column(name="Sol_No_3")
	protected String Sol_No_3 = "";

	@Id
	@NotEmpty(message="Contr_DUNS  cannot be empty")
	@NotNull
	@Column(name="Contr_DUNS")
	protected String Contr_DUNS = "";

	@Id
	@NotEmpty(message="Contract cannot be empty")
	@NotNull
	@Column(name="Contract")
	protected String Contract = "";

	@Id
	@NotEmpty(message="Sch_Line  cannot be empty")
	@NotNull
	@Column(name="Sch_Line")
	protected String Sch_Line = "";
	
	
	@Column(name="Option_Code")
	protected String Option_Code = "";
	
	
	@Column(name="Fed_Value_Next")
	protected String fedValueNext = "";
	
	@Column(name="Contr_Unit_Price")
	protected Double contrUnitPrice = 0.0;
	
	
	@Column(name="Unit_Price")
	protected Double unitPrice = 0.0;
	
	@Column(name="INV_Unit_Price")
	protected Double invUnitPrice = 0.0;
	
	@Column(name="Previous_Price")
	protected Double previousPrice = 0.0;
	
	@Column(name="OEM_Flag_Std")
	protected String oemFlagStd = "";
	
	@Column(name="Upgrade_Sch_line")
	protected String upgradeSchLine = "";
	
	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated = null;
	
	
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Status")
	protected String status = "";


	@Column(name="Other_Specs")
	protected String otherSpecs = "";

	
	@Column(name="Add_Ship_Days")
	protected Integer addShipDays = 0;

	@Column(name="MPG_B")
	protected String mpgB = "";

	@Column(name="MPG_C")
	protected String mpgC = "";

	@Column(name="MPG_H")
	protected String mpgH = "";

	
	@Column(name="GreenHouse_Score")
	protected String greenHouseScore = "";

	@Column(name="Grams_Per_Mile")
	protected String gramsPerMile = "";

	
	
	@Transient
	protected String  model = "";
	@Transient
	protected String  bidLineNewStatus = "";
	
	
	@Transient
	protected String  optionDesc = "";
	

	
//	
	public String getFedValueNext() {
		return fedValueNext;
	}
	public String getSol_No_1() {
		return Sol_No_1;
	}
	public void setSol_No_1(String sol_No_1) {
		Sol_No_1 = sol_No_1;
	}
	public String getSol_No_2() {
		return Sol_No_2;
	}
	public void setSol_No_2(String sol_No_2) {
		Sol_No_2 = sol_No_2;
	}
	public String getSol_No_3() {
		return Sol_No_3;
	}
	public void setSol_No_3(String sol_No_3) {
		Sol_No_3 = sol_No_3;
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
	public String getOption_Code() {
		return Option_Code;
	}
	public void setOption_Code(String option_Code) {
		Option_Code = option_Code;
	}
	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}
	public Double getContrUnitPrice() {
		return contrUnitPrice;
	}
	public void setContrUnitPrice(Double contrUnitPrice) {
		this.contrUnitPrice = contrUnitPrice;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getInvUnitPrice() {
		return invUnitPrice;
	}
	public void setInvUnitPrice(Double invUnitPrice) {
		this.invUnitPrice = invUnitPrice;
	}
	public Double getPreviousPrice() {
		return previousPrice;
	}
	public void setPreviousPrice(Double previousPrice) {
		this.previousPrice = previousPrice;
	}
	public String getOemFlagStd() {
		return oemFlagStd;
	}
	public void setOemFlagStd(String oemFlagStd) {
		this.oemFlagStd = oemFlagStd;
	}
	public String getUpgradeSchLine() {
		return upgradeSchLine;
	}
	public void setUpgradeSchLine(String upgradeSchLine) {
		this.upgradeSchLine = upgradeSchLine;
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
	public String getOtherSpecs() {
		return otherSpecs;
	}
	public void setOtherSpecs(String otherSpecs) {
		this.otherSpecs = otherSpecs;
	}
	public Integer getAddShipDays() {
		return addShipDays;
	}
	public void setAddShipDays(Integer addShipDays) {
		this.addShipDays = addShipDays;
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
	public String getGramsPerMile() {
		return gramsPerMile;
	}
	public void setGramsPerMile(String gramsPerMile) {
		this.gramsPerMile = gramsPerMile;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBidLineNewStatus() {
		return bidLineNewStatus;
	}
	public void setBidLineNewStatus(String bidLineNewStatus) {
		this.bidLineNewStatus = bidLineNewStatus;
	}
	public String getOptionDesc() {
		return optionDesc;
	}
	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}
	 
	
		
}

