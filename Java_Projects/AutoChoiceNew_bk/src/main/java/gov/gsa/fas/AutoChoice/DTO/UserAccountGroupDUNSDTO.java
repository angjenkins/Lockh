package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
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

@Entity
@Table (name="user_account_group_duns")
public class UserAccountGroupDUNSDTO implements Serializable {
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
	@Column(name="FirstName")
	protected String firstName = "";
//	
	@Length(max=20)
	@NotNull
	@Column(name="LastName")
	protected String lastName = "";
	
	@Length(max=3)
	@Column(name="MiddleName")
	protected String middleName;
	
	@Length(max=15)
	@NotNull
	@Column(name="Telephone")
	protected String telephone = "";
	
	@Length(max=10)
	@Column(name="Fax")
	protected String fax;
	
	@Length(max=60)
	@Column(name="Street")
	protected String street;
	
	@Length(max=20)
	@Column(name="City")
	protected String city;
	
	@Length(max=2)
	@Column(name="State")
	protected String state;
	
	@Length(max=10)
	@Column(name="Country")
	protected String country;
	
	@Column(name="ZipCode")
	protected int zipCode;
	
	@Length(max=20)
	@Column(name="Created_By")
	protected String createdBy = "user";
	
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
	
	@Column(name="Group_DUNS")
	protected Integer groupDUNS;
	
	@Column(name="Password_Counter")
	protected Integer passwordCounter;
		
	@Column(name="DateLastVisited")
	protected Timestamp dateLastVisited;
	
	@Column(name="DatePasswordChanged")
	protected Timestamp datePasswordChanged;
	
	@Column(name="DatePasswordExpire") 
	protected Timestamp datePasswordExpire;
	
	@Column(name="Password_Question")
	protected String passwordQuestion;
	
	@Column(name="Password_Answer")
	protected String passwordAnswer;
	 
	@Column(name="Password_Last") 
	protected String passwordLast;
	
	@Column(name="Suspended")
	protected String suspended;
	
	@Column(name="User_Suspended")
	protected String userSuspended;
	
	@Column(name="Date_Suspended")
	protected Timestamp dateSuspended;
	
	@Column(name="Certify_By")
	protected String certifyBy;
	
	@Column(name="Certify_Dt")
	protected Timestamp certifyDt;
		
	@Transient
	protected List<GroupDunsBaseDTO> userGroupDUNSBaseList;
	
	@Transient
	protected long  groupDunsBaseCount = 0;
	
	@Transient
	protected String newPassword1;
	
	@Transient
	protected String newPassword2;
	
	@Transient
	protected String oldPassword;
	
	

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

	public Integer getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(Integer groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public List<GroupDunsBaseDTO> getUserGroupDUNSBaseList() {
		return userGroupDUNSBaseList;
	}

	public void setUserGroupDUNSBaseList(
			List<GroupDunsBaseDTO> userGroupDUNSBaseList) {
		this.userGroupDUNSBaseList = userGroupDUNSBaseList;
	}

	public long getGroupDunsBaseCount() {
		return groupDunsBaseCount;
	}

	public void setGroupDunsBaseCount(long groupDunsBaseCount) {
		this.groupDunsBaseCount = groupDunsBaseCount;
	}

	public Integer getPasswordCounter() {
		return passwordCounter;
	}

	public void setPasswordCounter(Integer passwordCounter) {
		this.passwordCounter = passwordCounter;
	}

	public Timestamp getDateLastVisited() {
		return dateLastVisited;
	}

	public void setDateLastVisited(Timestamp dateLastVisited) {
		this.dateLastVisited = dateLastVisited;
	}

	public Timestamp getDatePasswordChanged() {
		return datePasswordChanged;
	}

	public void setDatePasswordChanged(Timestamp datePasswordChanged) {
		this.datePasswordChanged = datePasswordChanged;
	}

	public Timestamp getDatePasswordExpire() {
		return datePasswordExpire;
	}

	public void setDatePasswordExpire(Timestamp datePasswordExpire) {
		this.datePasswordExpire = datePasswordExpire;
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

	public String getSuspended() {
		return suspended;
	}

	public void setSuspended(String suspended) {
		this.suspended = suspended;
	}

	public String getUserSuspended() {
		return userSuspended;
	}

	public void setUserSuspended(String userSuspended) {
		this.userSuspended = userSuspended;
	}

	public Timestamp getDateSuspended() {
		return dateSuspended;
	}

	public void setDateSuspended(Timestamp dateSuspended) {
		this.dateSuspended = dateSuspended;
	}

	public String getCertifyBy() {
		return certifyBy;
	}

	public void setCertifyBy(String certifyBy) {
		this.certifyBy = certifyBy;
	}

	public Timestamp getCertifyDt() {
		return certifyDt;
	}

	public void setCertifyDt(Timestamp certifyDt) {
		this.certifyDt = certifyDt;
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

	
	
	

	
}

