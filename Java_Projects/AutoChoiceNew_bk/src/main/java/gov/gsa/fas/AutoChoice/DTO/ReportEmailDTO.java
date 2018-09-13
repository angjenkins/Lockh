package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@IdClass(ReportEmailCompositePK.class)
@Table (name="report_email")
@Component
public class ReportEmailDTO {

	@Id
	@Length(max=10)
	@NotNull
	@NotEmpty(message="Report code cannot be empty")
	protected String report_Code = "";
	
	@Id
	@Length(max=20)
	@NotNull
	protected String selection_Code = "";
	
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String type_Delivery = "T";
	
	@Id
	@NotNull
	protected double sequence = 1;
	
	@Length(max=20)
	@NotNull
	@Column(name="FirstName")
	protected String firstName = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="LastName")
	protected String lastName = "";
	
	@Length(max=3)
	@Column(name="MiddleName")
	protected String middleName = "";
	
	@Length(max=15)
	@NotNull
	@Column(name="Telephone")
	protected String telephone = "";
	
	@Length(max=5)
	@Column(name="Telephone_Ext")
	protected String telephoneExt = "";
	
	@Length(max=15)
	@Column(name="Fax")
	protected String fax = "";
	
	@Column(name="Date_Initiated")
	protected Timestamp initDate;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=50)
	@NotNull
	@Column(name="Email")
	protected String email = "";

	public String getReport_Code() {
		return report_Code;
	}

	public void setReport_Code(String report_Code) {
		this.report_Code = report_Code;
	}

	public String getSelection_Code() {
		return selection_Code;
	}

	public void setSelection_Code(String selection_Code) {
		this.selection_Code = selection_Code;
	}

	public String getType_Delivery() {
		return type_Delivery;
	}

	public void setType_Delivery(String type_Delivery) {
		this.type_Delivery = type_Delivery;
	}

	public double getSequence() {
		return sequence;
	}

	public void setSequence(double sequence) {
		this.sequence = sequence;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephoneExt() {
		return telephoneExt;
	}

	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
