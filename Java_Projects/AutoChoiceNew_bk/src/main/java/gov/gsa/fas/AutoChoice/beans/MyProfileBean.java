package gov.gsa.fas.AutoChoice.beans;

import java.util.logging.Logger;

import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class MyProfileBean {
	
	Logger logger = Logger.getLogger(MyProfileBean.class.toString());

	private String userName = "";
	
	private String password = "";
	
	private String changePwd = "";
	
	private String confirmPwd = "";
	
	private String oldPassword = "";
	
	private String firstName = "";
	
	private String lastName = "";
	
	private String middleIntial = "";
	
	private String email = "";
	
	private String jobTitle = "";
	
	private String telPhNo = "";
	
	private String otherTelPhNo = "";
	
	private String address1 = "";

	private String address2 = "";
	
	private String address3 = "";
	
	private String city = "";
	
	private String state = "";
	
	private String country = "";
	
	private String zipCode = "";
	
	private String result = "";
	
	private String telPhNo1 = "";
	
	private String telPhNo2 = "";
	
	private String telPhNo3 = "";
	
	@Autowired
	private UserAccountDTO userAccountDTO = null; 
	
	private CommonBean commonBean = null;
	
	private String profileResult = "";
	
	private boolean myprofileRedirect = false;
	

	public boolean isMyprofileRedirect() {
		return myprofileRedirect;
	}

	public void setMyprofileRedirect(boolean myprofileRedirect) {
		this.myprofileRedirect = myprofileRedirect;
	}

	public String getProfileResult() {
		return profileResult;
	}

	public void setProfileResult(String profileResult) {
		this.profileResult = profileResult;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
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

	public CommonBean getCommonBean() {
		return commonBean;
	}

	public void setCommonBean(CommonBean commonBean) {
		this.commonBean = commonBean;
	}

	public UserAccountDTO getUserAccountDTO() {
		return userAccountDTO;
	}

	public void setUserAccountDTO(UserAccountDTO userAccountDTO) {
		this.userAccountDTO = userAccountDTO;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getChangePwd() {
		return changePwd;
	}

	public void setChangePwd(String changePwd) {
		this.changePwd = changePwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
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

	public String getMiddleIntial() {
		return middleIntial;
	}

	public void setMiddleIntial(String middleIntial) {
		this.middleIntial = middleIntial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getTelPhNo() {
		return telPhNo;
	}

	public void setTelPhNo(String telPhNo) {
		this.telPhNo = telPhNo;
	}

	public String getOtherTelPhNo() {
		return otherTelPhNo;
	}

	public void setOtherTelPhNo(String otherTelPhNo) {
		this.otherTelPhNo = otherTelPhNo;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
