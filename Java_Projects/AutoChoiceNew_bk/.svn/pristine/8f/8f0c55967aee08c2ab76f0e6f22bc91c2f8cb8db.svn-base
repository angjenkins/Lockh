/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import java.math.BigInteger;
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

/**
 * @author Arnel Macatula
 *
 */

@Entity
@Table (name="std_itm_fed")
@IdClass(StdItmFedCompositePK.class)
public class StdItmFedDTO {
	@Id
	@NotEmpty
	@NotNull	
	//@Column(name="Group_DUNS")
	protected int group_DUNS = 0;
	@Id
	@NotEmpty
	@NotNull
	@Length(max=4)
	//@Column(name="Std_Item")
	protected String std_Item = "";
	@Id
	@NotEmpty
	@NotNull
	@Length(max=4)
	//@Column(name="Option_Code")
	protected String option_Code = "";
	@Id
	@NotEmpty
	@NotNull
	@Length(max=10)
	@Column(name="Model")
	protected String model = "";
	
	@Length(max=80)
	@Column(name="Fed_Value_Current")
	protected String fedValueCurrent = "";
	
	@Length(max=80)
	@Column(name="Fed_Value_Next")
	protected String fedValueNext = "";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated = null;

	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	//@Type(type="emptyCharacter")
	@Column(name="OEM_Flag_Std_Current", nullable=true)
	protected String oemFlagStdCurrent;
	
	//@Type(type="gov.gsa.fas.AutoChoice.util.EmptyCharacterType")
	@Column(name="OEM_Flag_Std_Next", nullable=true)
	protected String oemFlagStdNext;
	
	//@Type(type="gov.gsa.fas.AutoChoice.util.EmptyCharacterType")
	@Column(name="Status", nullable=true)
	protected String status;
	
	@Column(name="Other_Specs")
	protected String otherSpecs = "";
	
	@Transient
	protected String isParentOption = "";
	
	@Transient
	protected long numOfRow;
	
	@Transient
	protected Timestamp subDateLastUpdated = null;


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFedValueCurrent() {
		return fedValueCurrent;
	}

	public void setFedValueCurrent(String fedValueCurrent) {
		this.fedValueCurrent = fedValueCurrent;
	}

	public String getFedValueNext() {
		return fedValueNext;
	}

	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}

	public Timestamp getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Timestamp dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getOemFlagStdCurrent() {
		return oemFlagStdCurrent;
	}

	public void setOemFlagStdCurrent(String oemFlagStdCurrent) {
		this.oemFlagStdCurrent = oemFlagStdCurrent;
	}

	public String getOemFlagStdNext() {
		return oemFlagStdNext;
	}

	public void setOemFlagStdNext(String oemFlagStdNext) {
		this.oemFlagStdNext = oemFlagStdNext;
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

	public String getIsParentOption() {
		return isParentOption;
	}

	public void setIsParentOption(String isParentOption) {
		this.isParentOption = isParentOption;
	}

	public Timestamp getSubDateLastUpdated() {
		return subDateLastUpdated;
	}

	public void setSubDateLastUpdated(Timestamp subDateLastUpdated) {
		this.subDateLastUpdated = subDateLastUpdated;
	}

	public int getGroup_DUNS() {
		return group_DUNS;
	}

	public void setGroup_DUNS(int group_DUNS) {
		this.group_DUNS = group_DUNS;
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

	public long getNumOfRow() {
		return numOfRow;
	}

	public void setNumOfRow(long numOfRow) {
		this.numOfRow = numOfRow;
	}
	
	
	
	
		
}