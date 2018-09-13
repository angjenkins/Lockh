package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;


//import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * @author ArnelPMacatula
 *
 */
@Entity
@IdClass(StdItemOptionCompositePK.class)
@Table (name="std_itm_options")
public class StdItemOptionDTO {
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Standard Item cannot be empty")
	//@Column(name="Std_Item")
	protected String std_Item = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option Code cannot be empty")
	//@Column(name="Option_Code")
	protected String option_Code = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Flag_Std")
	protected String flagStd = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=80)
	@Column(name="Fed_Value_Current")
	protected String fedValueCurrent = "";
	
	@Length(max=1)
	@Column(name="Fed_Flag_Current")
	protected String fedFlagCurrent = "";
	
	@Length(max=80)
	@Column(name="Fed_Value_Next")
	protected String fedValueNext = "";
	
	@Length(max=1)
	@Column(name="Fed_Flag_Next")
	protected String fedFlagNext = "";
	
	@Column(name="date_updated")
	protected Timestamp dateUpdated;
	
	@Length(max=1)
	@Column(name="Flag_Std_Next")
	protected String flagStdNext = "";

	 
	
	@Transient
	protected Integer optionsCategorySequence;
	@Transient
	protected String optionsCategoryCode = "";
	@Transient
	protected String optionsCategoryName = "";
	@Transient
	protected String optionsCategorySelectionType = "";
	
	@Transient
	protected Integer optionsTableSequence;
	@Transient
	protected String optionsTableDescription = "";
	@Transient
	protected String optionsTableBodyTruckNext = "";
	@Transient
	protected String optionsTableFlgAddTextNext = "";
	@Transient
	protected String optionsTableMpgFlagNext = "";
	@Transient
	protected String oemFlagStd = "";
	@Transient
	protected String oemFedValueNext= "";
	@Transient
	protected String oemFedValueCurrent= "";
	@Transient
	protected String oemOptStatus= "";
	@Transient
	protected String oemOtherSpecs= "";
	@Transient
	protected Double oemContrUnitPrice= 0.00;
	@Transient
	protected Double oemInvUnitPrice= 0.00;
	@Transient
	protected Double oemUnitPrice= 0.00;
	@Transient
	protected Double oemPreviousPrice= 0.00;
	@Transient	
	protected Integer oemAddShipDays = 0;
	@Transient
	protected String oemMpgB = "";
	@Transient
	protected String oemMpgC = "";
	@Transient
	protected String oemMpgH = "";
	@Transient
	protected String oemGramsPerMile = "";
	@Transient
	protected String oemHdrStatus = "";

	@Transient
	protected String  editFlag = "";
	
	@Transient
	protected String  oldOemFlagStd = "";
	
	@Transient
	protected String oldOemFedValueNext= "";
	
	@Transient
	protected String oldOemOtherSpecs= "";
	
	@Transient
	protected Double oldOemUnitPrice= 0.0;
	
	@Transient
	protected Integer oldOemAddShipDays = 0;
	@Transient
	protected String  oldOemMpgB = "";
	@Transient
	protected String oldOemMpgC = "";
	@Transient
	protected String oldOemMpgH = "";
	@Transient
	protected String oldOemGramsPerMile = "";
	
	@Transient
	protected Integer requisitionsOptionQty = 0;
	
	@Transient
	protected String optionsTableValidQty = "";
	
	
	
	public String getFlagStd() {
		return flagStd;
	}

	public void setFlagStd(String flagStd) {
		this.flagStd = flagStd;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getFedValueCurrent() {
		return fedValueCurrent;
	}

	public void setFedValueCurrent(String fedValueCurrent) {
		this.fedValueCurrent = fedValueCurrent;
	}

	public String getFedFlagCurrent() {
		return fedFlagCurrent;
	}

	public void setFedFlagCurrent(String fedFlagCurrent) {
		this.fedFlagCurrent = fedFlagCurrent;
	}

	public String getFedValueNext() {
		return fedValueNext;
	}

	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}

	public String getFedFlagNext() {
		return fedFlagNext;
	}

	public void setFedFlagNext(String fedFlagNext) {
		this.fedFlagNext = fedFlagNext;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getFlagStdNext() {
		return flagStdNext;
	}

	public void setFlagStdNext(String flagStdNext) {
		this.flagStdNext = flagStdNext;
	}


	public String getOptionsCategoryCode() {
		return optionsCategoryCode;
	}

	public void setOptionsCategoryCode(String optionsCategoryCode) {
		this.optionsCategoryCode = optionsCategoryCode;
	}

	public String getOptionsCategoryName() {
		return optionsCategoryName;
	}

	public void setOptionsCategoryName(String optionsCategoryName) {
		this.optionsCategoryName = optionsCategoryName;
	}

	
	
	public Integer getOptionsCategorySequence() {
		return optionsCategorySequence;
	}

	public void setOptionsCategorySequence(Integer optionsCategorySequence) {
		this.optionsCategorySequence = optionsCategorySequence;
	}

	public Integer getOptionsTableSequence() {
		return optionsTableSequence;
	}

	public void setOptionsTableSequence(Integer optionsTableSequence) {
		this.optionsTableSequence = optionsTableSequence;
	}

	public String getOptionsTableDescription() {
		return optionsTableDescription;
	}

	public void setOptionsTableDescription(String optionsTableDescription) {
		this.optionsTableDescription = optionsTableDescription;
	}

	public String getOptionsTableBodyTruckNext() {
		return optionsTableBodyTruckNext;
	}

	public void setOptionsTableBodyTruckNext(String optionsTableBodyTruckNext) {
		this.optionsTableBodyTruckNext = optionsTableBodyTruckNext;
	}

	public String getOemFlagStd() {
		return oemFlagStd;
	}

	public void setOemFlagStd(String oemFlagStd) {
		this.oemFlagStd = oemFlagStd;
	}

	
	public String getOptionsTableFlgAddTextNext() {
		return optionsTableFlgAddTextNext;
	}

	public void setOptionsTableFlgAddTextNext(String optionsTableFlgAddTextNext) {
		this.optionsTableFlgAddTextNext = optionsTableFlgAddTextNext;
	}

	public String getOptionsTableMpgFlagNext() {
		return optionsTableMpgFlagNext;
	}

	public void setOptionsTableMpgFlagNext(String optionsTableMpgFlagNext) {
		this.optionsTableMpgFlagNext = optionsTableMpgFlagNext;
	}

	public String getOemFedValueNext() {
		return oemFedValueNext;
	}

	public void setOemFedValueNext(String oemFedValueNext) {
		this.oemFedValueNext = oemFedValueNext;
	}

	public String getOemOptStatus() {
		return oemOptStatus;
	}

	public void setOemOptStatus(String oemOptStatus) {
		this.oemOptStatus = oemOptStatus;
	}

	public String getOemOtherSpecs() {
		return oemOtherSpecs;
	}

	public void setOemOtherSpecs(String oemOtherSpecs) {
		this.oemOtherSpecs = oemOtherSpecs;
	}

	public Double getOemContrUnitPrice() {
		return oemContrUnitPrice;
	}

	public void setOemContrUnitPrice(Double oemContrUnitPrice) {
		this.oemContrUnitPrice = oemContrUnitPrice;
	}

	public Double getOemInvUnitPrice() {
		return oemInvUnitPrice;
	}

	public void setOemInvUnitPrice(Double oemInvUnitPrice) {
		this.oemInvUnitPrice = oemInvUnitPrice;
	}

	public Double getOemPreviousPrice() {
		return oemPreviousPrice;
	}

	public void setOemPreviousPrice(Double oemPreviousPrice) {
		this.oemPreviousPrice = oemPreviousPrice;
	}

	public Integer getOemAddShipDays() {
		return oemAddShipDays;
	}

	public void setOemAddShipDays(Integer oemAddShipDays) {
		this.oemAddShipDays = oemAddShipDays;
	}

	public String getOemMpgB() {
		return oemMpgB;
	}

	public void setOemMpgB(String oemMpgB) {
		this.oemMpgB = oemMpgB;
	}

	public String getOemMpgC() {
		return oemMpgC;
	}

	public void setOemMpgC(String oemMpgC) {
		this.oemMpgC = oemMpgC;
	}

	public String getOemMpgH() {
		return oemMpgH;
	}

	public void setOemMpgH(String oemMpgH) {
		this.oemMpgH = oemMpgH;
	}

	public String getOemGramsPerMile() {
		return oemGramsPerMile;
	}

	public void setOemGramsPerMile(String oemGramsPerMile) {
		this.oemGramsPerMile = oemGramsPerMile;
	}

	public String getOemHdrStatus() {
		return oemHdrStatus;
	}

	public void setOemHdrStatus(String oemHdrStatus) {
		this.oemHdrStatus = oemHdrStatus;
	}

	public Double getOemUnitPrice() {
		return oemUnitPrice;
	}

	public void setOemUnitPrice(Double oemUnitPrice) {
		this.oemUnitPrice = oemUnitPrice;
	}



	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getOldOemFlagStd() {
		return oldOemFlagStd;
	}

	public void setOldOemFlagStd(String oldOemFlagStd) {
		this.oldOemFlagStd = oldOemFlagStd;
	}

	public String getOldOemFedValueNext() {
		return oldOemFedValueNext;
	}

	public void setOldOemFedValueNext(String oldOemFedValueNext) {
		this.oldOemFedValueNext = oldOemFedValueNext;
	}

	public String getOldOemOtherSpecs() {
		return oldOemOtherSpecs;
	}

	public void setOldOemOtherSpecs(String oldOemOtherSpecs) {
		this.oldOemOtherSpecs = oldOemOtherSpecs;
	}

	public Double getOldOemUnitPrice() {
		return oldOemUnitPrice;
	}

	public void setOldOemUnitPrice(Double oldOemUnitPrice) {
		this.oldOemUnitPrice = oldOemUnitPrice;
	}

	public Integer getOldOemAddShipDays() {
		return oldOemAddShipDays;
	}

	public void setOldOemAddShipDays(Integer oldOemAddShipDays) {
		this.oldOemAddShipDays = oldOemAddShipDays;
	}

	public String getOldOemMpgB() {
		return oldOemMpgB;
	}

	public void setOldOemMpgB(String oldOemMpgB) {
		this.oldOemMpgB = oldOemMpgB;
	}

	public String getOldOemMpgC() {
		return oldOemMpgC;
	}

	public void setOldOemMpgC(String oldOemMpgC) {
		this.oldOemMpgC = oldOemMpgC;
	}

	public String getOldOemMpgH() {
		return oldOemMpgH;
	}

	public void setOldOemMpgH(String oldOemMpgH) {
		this.oldOemMpgH = oldOemMpgH;
	}

	public String getOldOemGramsPerMile() {
		return oldOemGramsPerMile;
	}

	public void setOldOemGramsPerMile(String oldOemGramsPerMile) {
		this.oldOemGramsPerMile = oldOemGramsPerMile;
	}

	public String getOemFedValueCurrent() {
		return oemFedValueCurrent;
	}

	public void setOemFedValueCurrent(String oemFedValueCurrent) {
		this.oemFedValueCurrent = oemFedValueCurrent;
	}

	public String getStd_Item() {
		return std_Item;
	}

	public void setStd_Item(String std_Item) {
		this.std_Item = std_Item;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}

	public String getOptionsCategorySelectionType() {
		return optionsCategorySelectionType;
	}

	public void setOptionsCategorySelectionType(String optionsCategorySelectionType) {
		this.optionsCategorySelectionType = optionsCategorySelectionType;
	}

	public Integer getRequisitionsOptionQty() {
		return requisitionsOptionQty;
	}

	public void setRequisitionsOptionQty(Integer requisitionsOptionQty) {
		this.requisitionsOptionQty = requisitionsOptionQty;
	}

	public String getOptionsTableValidQty() {
		return optionsTableValidQty;
	}

	public void setOptionsTableValidQty(String optionsTableValidQty) {
		this.optionsTableValidQty = optionsTableValidQty;
	}
    
    
	
	
}
