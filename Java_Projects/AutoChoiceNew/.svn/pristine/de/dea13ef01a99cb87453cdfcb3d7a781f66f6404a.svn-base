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
@IdClass(ContrLineOptionCompositePK.class)
@Table (name="contr_line_option")
public class ContrLineOptionDTO {
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String Contract = "";
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	protected String Sch_Line = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option Code cannot be empty")
	protected String Option_Code = "";
	
	@NotNull
	@Column(name="Contr_Unit_Price")
	protected Double contrUnitPrice = 0.0000;
	
	@NotNull
	@Column(name="Current_Unit_Price")
	protected Double currUnitPrice = 0.0000;
	
	@NotNull
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "0";
	
	@Length(max=12)
	@Column(name="OEM_Option_Code")
	protected String oemOptionCode = "";
	
	@Length(max=40)
	@Column(name="OEM_Option_Name")
	protected String oemOptionName = "";
	
	@Length(max=7)
	@Column(name="Upgrade_Sch_line")
	protected String upgradeSchLine = "";
	
	@Column(name="Option_MSRP_Price")
	protected Double optionMSRPPrice = 0.00;
	
	@Column(name="Option_Invoice_Price")
	protected Double optionInvPrice = 0.00;
	
	@Length(max=3)
	@Column(name="OEM_Option_Type")
	protected String oemOptionType = "N";
	
	@Length(max=160)
	@Column(name="OEM_Exclude1")
	protected String oemExclude1 = "";
	
	@Length(max=160)
	@Column(name="OEM_Exclude2")
	protected String oemExclude2 = "";
	
	@Length(max=160)
	@Column(name="OEM_Include1")
	protected String oemInclude1 = "";
	
	@Length(max=160)
	@Column(name="OEM_Include2")
	protected String oemInclude2 = "";
	
	@Length(max=60)
	@Column(name="Other_Specs")
	protected String otherSpecs = "";
	
	@Column(name="Add_Ship_Days")
	protected int addShipDays = 0;
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_B")
	protected String mpgB = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_C")
	protected String mpgC = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_H")
	protected String mpgH = "";
	
	@NotNull
	@Length(max=2)
	@Column(name="GreenHouse_Score")
	protected String greenhouseScore = "";
	
	@NotNull
	@Length(max=4)
	@Column(name="Grams_Per_Mile")
	protected String gramsPerMile = "";
	
	@NotNull
	@Column(name="Orig_My_Price")
	protected double origMyPrice = 0.0000;
	
	
	@Transient
	String optionCategoryCode = "";

	@Transient
	String validQty = "";
    
	@Transient
	String description ="";
	
	@Transient
	String mpgFlag ="";
	
	

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

	public Double getContrUnitPrice() {
		return contrUnitPrice;
	}

	public void setContrUnitPrice(Double contrUnitPrice) {
		this.contrUnitPrice = contrUnitPrice;
	}

	public Double getCurrUnitPrice() {
		return currUnitPrice;
	}

	public void setCurrUnitPrice(Double currUnitPrice) {
		this.currUnitPrice = currUnitPrice;
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

	public String getOemOptionCode() {
		return oemOptionCode;
	}

	public void setOemOptionCode(String oemOptionCode) {
		this.oemOptionCode = oemOptionCode;
	}

	public String getOemOptionName() {
		return oemOptionName;
	}

	public void setOemOptionName(String oemOptionName) {
		this.oemOptionName = oemOptionName;
	}

	public String getUpgradeSchLine() {
		return upgradeSchLine;
	}

	public void setUpgradeSchLine(String upgradeSchLine) {
		this.upgradeSchLine = upgradeSchLine;
	}

	public Double getOptionMSRPPrice() {
		return optionMSRPPrice;
	}

	public void setOptionMSRPPrice(Double optionMSRPPrice) {
		this.optionMSRPPrice = optionMSRPPrice;
	}

	public Double getOptionInvPrice() {
		return optionInvPrice;
	}

	public void setOptionInvPrice(Double optionInvPrice) {
		this.optionInvPrice = optionInvPrice;
	}

	public String getOemOptionType() {
		return oemOptionType;
	}

	public void setOemOptionType(String oemOptionType) {
		this.oemOptionType = oemOptionType;
	}

	public String getOemExclude1() {
		return oemExclude1;
	}

	public void setOemExclude1(String oemExclude1) {
		this.oemExclude1 = oemExclude1;
	}

	public String getOemExclude2() {
		return oemExclude2;
	}

	public void setOemExclude2(String oemExclude2) {
		this.oemExclude2 = oemExclude2;
	}

	public String getOemInclude1() {
		return oemInclude1;
	}

	public void setOemInclude1(String oemInclude1) {
		this.oemInclude1 = oemInclude1;
	}

	public String getOemInclude2() {
		return oemInclude2;
	}

	public void setOemInclude2(String oemInclude2) {
		this.oemInclude2 = oemInclude2;
	}

	public String getOtherSpecs() {
		return otherSpecs;
	}

	public void setOtherSpecs(String otherSpecs) {
		this.otherSpecs = otherSpecs;
	}

	public int getAddShipDays() {
		return addShipDays;
	}

	public void setAddShipDays(int addShipDays) {
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

	public String getGreenhouseScore() {
		return greenhouseScore;
	}

	public void setGreenhouseScore(String greenhouseScore) {
		this.greenhouseScore = greenhouseScore;
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

	public String getOptionCategoryCode() {
		return optionCategoryCode;
	}

	public void setOptionCategoryCode(String optionCategoryCode) {
		this.optionCategoryCode = optionCategoryCode;
	}

	public String getValidQty() {
		return validQty;
	}

	public void setValidQty(String validQty) {
		this.validQty = validQty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMpgFlag() {
		return mpgFlag;
	}

	public void setMpgFlag(String mpgFlag) {
		this.mpgFlag = mpgFlag;
	}
	

	
	
}
