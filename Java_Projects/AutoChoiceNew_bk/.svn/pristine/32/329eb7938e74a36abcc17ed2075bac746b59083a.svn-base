package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;


@Entity
@Table (name="user_account")
@Component
public class UserAccountDTO {
	@Id
	@Length(max=20)
	@NotNull
	@NotEmpty(message="UserID cannot be empty")
	@Column(name="User_ID")
	protected String userID = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="Password")
	protected String password = "";
	
	@Length(max=20)
	@NotNull
	@NotEmpty(message="Please enter \"First Name\".")
	@Column(name="FirstName")
	protected String firstName = "";
	
	@Length(max=20)
	@NotNull
	@NotEmpty(message="Please enter \"Last Name\".")
	@Column(name="LastName")
	protected String lastName = "";
	
	@Length(max=3)
	@Column(name="MiddleName")
	protected String middleName;
	
	@Length(max=2)
	@NotNull
	@Column(name="Agency_Code")
	protected String agencyCode = "";
	
	@Length(max=2)
	@NotNull
	@Column(name="Bureau_Code")
	protected String bureauCode = "";
	
	@Length(max=6)
	@Column(name="CAF_No")
	protected String cafNo;
	
	@Length(max=15)
	@NotNull
	@NotEmpty(message="Please enter \"Telephone No\".")
	@Column(name="Telephone")
	protected String telephone = "";
	
	@Length(max=10)
	@Column(name="Fax")
	protected String fax;
	
	@Length(max=60)
	@Column(name="Street")
	protected String street;
	
	@Length(max=20)
	@NotEmpty(message="Please enter \"City\".")
	@Column(name="City")
	protected String city;
	
	@Length(max=2)
	@NotEmpty(message="Please select \"State\".")
	@Column(name="State")
	protected String state;
	
	@Length(max=10)
	@NotEmpty(message="Please enter \"Country\".")
	@Column(name="Country")
	protected String country;
	
	@Column(name="ZipCode")
	protected int zipCode;
	
	@Length(max=20)
	@Column(name="Created_By")
	protected String createdBy;
	
	@Column(name="Date_Created")
	protected Timestamp createdDate;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@Length(max=20)
	@Column(name="Modified_By")
	protected String modifiedBy;
	
	@Length(max=1)
	@Column(name="Privilege")
	protected String privilege;
	
	@Length(max=50)
	@Column(name="Email")
	protected String email;
	
	@Column(name="DateLastVisited")
	protected Timestamp lastVisitedDate;
	
	@Length(max=5)
	@Column(name="Telephone_Ext")
	protected String telephoneExt;
	
	@Length(max=35)
	@Column(name="Address_1")
	protected String address1;
	
	@Length(max=35)
	@Column(name="Address_2")
	protected String address2;
	
	@Length(max=35)
	@Column(name="Address_3")
	protected String address3;
	
	@Length(max=15)
	@Column(name="OtherTelephone")
	protected String otherTelephone;
	
	@Length(max=120)
	@Column(name="Bureau_Code_List")
	protected String bureauCodeList;
	
	@Length(max=40)
	@Column(name="Job_Title")
	protected String jobTitle;
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "A";
	
	@Column(name="Password_Counter")
	protected Integer passwordCounter;
	
	@Column(name="DatePasswordExpire") 
	protected Timestamp datePasswordExpire;
	
	@Column(name="DateLastVisited",insertable = false, updatable = false)
	protected Timestamp dateLastVisited;
	
	@Column(name="Password_Question")
	protected String passwordQuestion;
	
	@Column(name="Password_Answer")
	protected String passwordAnswer;
	 
	@Column(name="Password_Last") 
	protected String passwordLast;
	
	@Column(name="Date_Suspended")
	protected Timestamp dateSuspended;
	
	@Column(name="DatePasswordChanged")
	protected Timestamp datePasswordChanged;
	

	@Transient
	protected String decentralized ="";
	
	@Transient
	protected String multiRecordFileFlag ="";
	
	@Transient
	protected String proprietary = "";
	
	
	@Transient
	protected String flg1122 = "";
	

	@Transient
	protected String newPassword1;
	
	@Transient
	protected String newPassword2;
	
	@Transient
	protected String oldPassword;
	
	@Transient
	protected String fsrFlag ="";
	
	@Transient
	private List<StatesDTO> stateList = null;
	
	@Transient
	private String telPhNo1 = "";
	
	@Transient
	private String telPhNo2 = null;
	
	@Transient
	private String telPhNo3 = null;
	
	public String getTelPhNo1() {
		return telPhNo1;
	}

	public void setTelPhNo1(String telPhNo1) {
		this.telPhNo1 = telPhNo1;
	}

	public String getTelPhNo2() {
		return telPhNo2;
	}

	public void setTelPhNo2(String telPhNo2) {
		this.telPhNo2 = telPhNo2;
	}

	public String getTelPhNo3() {
		return telPhNo3;
	}

	public void setTelPhNo3(String telPhNo3) {
		this.telPhNo3 = telPhNo3;
	}

	public List<StatesDTO> getStateList() {
		return stateList;
	}

	public void setStateList(List<StatesDTO> stateList) {
		this.stateList = stateList;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getBureauCode() {
		return bureauCode;
	}

	public void setBureauCode(String bureauCode) {
		this.bureauCode = bureauCode;
	}

	public String getCafNo() {
		return cafNo;
	}

	public void setCafNo(String cafNo) {
		this.cafNo = cafNo;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getLastVisitedDate() {
		return lastVisitedDate;
	}

	public void setLastVisitedDate(Timestamp lastVisitedDate) {
		this.lastVisitedDate = lastVisitedDate;
	}

	public String getTelephoneExt() {
		return telephoneExt;
	}

	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getOtherTelephone() {
		return otherTelephone;
	}

	public void setOtherTelephone(String otherTelephone) {
		this.otherTelephone = otherTelephone;
	}

	public String getBureauCodeList() {
		return bureauCodeList;
	}

	public void setBureauCodeList(String bureauCodeList) {
		this.bureauCodeList = bureauCodeList;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPasswordCounter() {
		return passwordCounter;
	}

	public void setPasswordCounter(Integer passwordCounter) {
		this.passwordCounter = passwordCounter;
	}

	public String getDecentralized() {
		return decentralized;
	}

	public void setDecentralized(String decentralized) {
		this.decentralized = decentralized;
	}

	public String getMultiRecordFileFlag() {
		return multiRecordFileFlag;
	}

	public void setMultiRecordFileFlag(String multiRecordFileFlag) {
		this.multiRecordFileFlag = multiRecordFileFlag;
	}

	public String getProprietary() {
		return proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}

	public String getFlg1122() {
		return flg1122;
	}

	public void setFlg1122(String flg1122) {
		this.flg1122 = flg1122;
	}

	public Timestamp getDatePasswordExpire() {
		return datePasswordExpire;
	}

	public void setDatePasswordExpire(Timestamp datePasswordExpire) {
		this.datePasswordExpire = datePasswordExpire;
	}

	public Timestamp getDateLastVisited() {
		return dateLastVisited;
	}

	public void setDateLastVisited(Timestamp dateLastVisited) {
		this.dateLastVisited = dateLastVisited;
	}

	public String getPasswordQuestion() {
		return passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	public String getPasswordAnswer() {
		return passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	public String getPasswordLast() {
		return passwordLast;
	}

	public void setPasswordLast(String passwordLast) {
		this.passwordLast = passwordLast;
	}

	public Timestamp getDateSuspended() {
		return dateSuspended;
	}

	public void setDateSuspended(Timestamp dateSuspended) {
		this.dateSuspended = dateSuspended;
	}

	public String getNewPassword1() {
		return newPassword1;
	}

	public void setNewPassword1(String newPassword1) {
		this.newPassword1 = newPassword1;
	}

	public String getNewPassword2() {
		return newPassword2;
	}

	public void setNewPassword2(String newPassword2) {
		this.newPassword2 = newPassword2;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}


	public String getFsrFlag() {
		return fsrFlag;
	}

	public void setFsrFlag(String fsrFlag) {
		this.fsrFlag = fsrFlag;
	}

	
	

	
	public Timestamp getDatePasswordChanged() {
		return datePasswordChanged;
	}

	public void setDatePasswordChanged(Timestamp datePasswordChanged) {
		this.datePasswordChanged = datePasswordChanged;
	}
}
