package gov.gsa.fas.AutoChoice.DTO;


import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;



@Entity
@Table (name="options_table")

public class OptionsTableDTO {

  	@Id
	@NotEmpty(message="Option Code cannot be empty")
	@NotNull
	@Length(max=4)
	@Column(name="Option_Code")			// `Option_Code` char(4) NOT NULL,
  	protected String optionCode = "";
  	
  	@NotEmpty(message="Description cannot be empty")
	@NotNull
	@Length(max=60)
	@Column(name="Description")			// `Description` varchar(60) NOT NULL DEFAULT '',
  	protected String description = "";

	@NotNull
	@Length(max=1)
	@Column(name="Mil_flag")			// `Mil_flag` char(1) DEFAULT 'N',
  	protected String milFlag = "";

	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")		// `User_Updated` char(20) DEFAULT NULL,
  	protected String userUpdated = "";
	
	@NotNull
	@Length(max=1)
	@Column(name="Valid_Flag")			// `Valid_Flag` char(1) DEFAULT 'Y',
  	protected String validFlag = "";
	
	
	@NotNull
	@Length(max=1)
	@Column(name="Valid_Qty")			// `Valid_Qty` char(1) DEFAULT 'N',
  	protected String validQty = "";

	@NotNull
	@Length(max=10)
	@Column(name="Category_Code")		// `Category_Code` char(10) DEFAULT NULL,
  	protected String categoryCode = "";

	@NotNull
	@Length(max=1)
	@Column(name="Proprietary")			// `Proprietary` char(1) DEFAULT 'N',
	protected String proprietary = "";

	@Column(name="Sequence")			// `Sequence` decimal(5,0) DEFAULT '0',
	protected Integer sequence;

	@NotNull
	@Length(max=1)
	@Column(name="Flag_BodyTruck")		// `Flag_BodyTruck` char(1) DEFAULT 'N',
	protected String flagBodyTruck = "";

	@NotNull
	@Length(max=1)
	@Column(name="BodyTruck_Next")		// `BodyTruck_Next` char(1) DEFAULT 'N',
	protected String bodyTruckNext = "";

	@NotNull
	@Length(max=1)
	@Column(name="Flg_AddText")			// 	`Flg_AddText` char(1) DEFAULT 'N' COMMENT 'Added production 2011/03/11',
	protected String flgAddText = "";

	@NotNull
	@Length(max=1)
	@Column(name="Flg_AddText_Next")	// 	`Flg_AddText_Next` char(1) DEFAULT 'N' COMMENT 'Added production 2011/03/11',
	protected String flgAddTextNext = "";

	@NotNull
	@Length(max=1)
	@Column(name="MPG_Flag")			// 	`MPG_Flag` char(1) DEFAULT 'N' COMMENT 'Added 2011/06/11',
	protected String mpgFlag = "";

	@NotNull
	@Length(max=1)
	@Column(name="MPG_Flag_Next")		// 	`MPG_Flag_Next` char(1) DEFAULT 'N' COMMENT 'Added 2011/06/11',
	protected String mpgFlagNext = "";

	public String getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMilFlag() {
		return milFlag;
	}

	public void setMilFlag(String milFlag) {
		this.milFlag = milFlag;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getValidQty() {
		return validQty;
	}

	public void setValidQty(String validQty) {
		this.validQty = validQty;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getProprietary() {
		return proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}


	
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getFlagBodyTruck() {
		return flagBodyTruck;
	}

	public void setFlagBodyTruck(String flagBodyTruck) {
		this.flagBodyTruck = flagBodyTruck;
	}

	public String getBodyTruckNext() {
		return bodyTruckNext;
	}

	public void setBodyTruckNext(String bodyTruckNext) {
		this.bodyTruckNext = bodyTruckNext;
	}

	public String getFlgAddText() {
		return flgAddText;
	}

	public void setFlgAddText(String flgAddText) {
		this.flgAddText = flgAddText;
	}

	public String getFlgAddTextNext() {
		return flgAddTextNext;
	}

	public void setFlgAddTextNext(String flgAddTextNext) {
		this.flgAddTextNext = flgAddTextNext;
	}

	public String getMpgFlag() {
		return mpgFlag;
	}

	public void setMpgFlag(String mpgFlag) {
		this.mpgFlag = mpgFlag;
	}

	public String getMpgFlagNext() {
		return mpgFlagNext;
	}

	public void setMpgFlagNext(String mpgFlagNext) {
		this.mpgFlagNext = mpgFlagNext;
	}

}

