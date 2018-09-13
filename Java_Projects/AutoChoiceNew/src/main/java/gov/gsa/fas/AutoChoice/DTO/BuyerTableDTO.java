package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="buyer_table")
public class BuyerTableDTO {

	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Buyer code cannot be empty")
	@Column(name="Buyer_Code")
	protected String buyerCode = "";
	
	@Length(max=15)
	@NotNull
	@Column(name="First_Name")
	protected String firstName = "";
	
	@Length(max=15)
	@NotNull
	@Column(name="Last_Name")
	protected String lastName = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Section")
	protected String section = "";
	
	@Length(max=3)
	@NotNull
	@Column(name="Warrent_No")
	protected String warrantNumber = "";
	
	@Length(max=12)
	@NotNull
	@Column(name="Phone")
	protected String phone = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Valid_Flag")
	protected String validFlag = "Y";
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@Column(name="Valid_Sol")
	protected String validSol = "";
	
	@Length(max=1)
	@Column(name="Flag_Div")
	protected String flagDiv = "";
	
	@Length(max=60)
	@Column(name="Email")
	protected String email = "";

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getWarrantNumber() {
		return warrantNumber;
	}

	public void setWarrantNumber(String warrantNumber) {
		this.warrantNumber = warrantNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getValidSol() {
		return validSol;
	}

	public void setValidSol(String validSol) {
		this.validSol = validSol;
	}

	public String getFlagDiv() {
		return flagDiv;
	}

	public void setFlagDiv(String flagDiv) {
		this.flagDiv = flagDiv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
