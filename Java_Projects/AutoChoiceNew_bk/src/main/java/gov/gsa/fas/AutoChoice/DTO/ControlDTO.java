package gov.gsa.fas.AutoChoice.DTO;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="Control")
public class ControlDTO {
	
	@Id
	@NotNull
	@NotEmpty(message="User ID cannot be empty")
	@Size(min = 1, max = 20, message="Length should be between 1 and 20")
	@Column(name="UserId")
	protected String userId = "";
	
	@NotNull
	@Column(name="Pass")
	protected String pass = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Requisition should be 1")
	@Column(name="Requisition")
	protected String requisition = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="solicitation")
	protected String solicitation = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="Bids")
	protected String bids = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="Contract")
	protected String contract = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="OrderForms")
	protected String orderForms = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="MngmntRpt")
	protected String mgmtRpt = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="Admin	")
	protected String admin = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="Engineering")
	protected String engineering = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="Tables")
	protected String tables = "";
	
	@NotNull
	@Size(min = 1, max = 1, message="Length should be 1")
	@Column(name="GlobalChanges")
	protected String globalChanges = "";
	
	@Length(max=20)
	@Column(name="User_updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@Column(name="Privilege")
	protected String privilege = "";
	
	@Column(name="DatePasswordChanged")
	protected Timestamp datePasswordChanged = null;
	
	@Column(name="DatePasswordExpire")
	protected Timestamp datePasswordExpire = null;
	
	@Length(max=1)
	@Column(name="Renewal")
	protected String renewal = "";
	
	@Length(max=2)
	@Column(name="Buyer_Code")
	protected String buyerCode = "";
	
	@NotNull
	@Length(max=1)
	@Column(name="PWQUE")
	protected String pwque = "";
	
	@NotNull
	@Length(max=30)
	@Column(name="PWANS")
	protected String pwans = "";
	
	@Length(max=60)
	@Column(name="email")
	protected String email = "";

	@NotNull
	@Column(name="Password_Counter")
	protected int passwordCounter;
	
	@NotNull
	@Length(max=60)
	@Column(name="Password_Last")
	protected String passwordLast = "";
	
	@Column(name="DateLogonLast")
	protected Timestamp dateLogonLast = null;
	
	@NotNull
	@Length(max=1)
	@Column(name="Suspended")
	protected String suspended = "";
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Suspended")
	protected String userSuspended = "";
	
	@Column(name="Date_Suspended")
	protected Timestamp dateSuspended = null;
	
	@Length(max=1)
	@Column(name="QDR")
	protected String qdr = "";
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Created")
	protected String userCreated = "";
	
	@Column(name="Date_Created")
	protected Timestamp dateCreated = null;
	
	@NotNull
	@Length(max=20)
	@Column(name="Certify_By")
	protected String certifyBy = "";
	
	@Column(name="Certify_Dt")
	protected Timestamp certifyDate = null;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRequisition() {
		return requisition;
	}

	public void setRequisition(String requisition) {
		this.requisition = requisition;
	}

	public String getSolicitation() {
		return solicitation;
	}

	public void setSolicitation(String solicitation) {
		this.solicitation = solicitation;
	}

	public String getBids() {
		return bids;
	}

	public void setBids(String bids) {
		this.bids = bids;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getOrderForms() {
		return orderForms;
	}

	public void setOrderForms(String orderForms) {
		this.orderForms = orderForms;
	}

	public String getMgmtRpt() {
		return mgmtRpt;
	}

	public void setMgmtRpt(String mgmtRpt) {
		this.mgmtRpt = mgmtRpt;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getEngineering() {
		return engineering;
	}

	public void setEngineering(String engineering) {
		this.engineering = engineering;
	}

	public String getTables() {
		return tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
	}

	public String getGlobalChanges() {
		return globalChanges;
	}

	public void setGlobalChanges(String globalChanges) {
		this.globalChanges = globalChanges;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
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

	public String getRenewal() {
		return renewal;
	}

	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getPwque() {
		return pwque;
	}

	public void setPwque(String pwque) {
		this.pwque = pwque;
	}

	public String getPwans() {
		return pwans;
	}

	public void setPwans(String pwans) {
		this.pwans = pwans;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPasswordCounter() {
		return passwordCounter;
	}

	public void setPasswordCounter(int passwordCounter) {
		this.passwordCounter = passwordCounter;
	}

	public String getPasswordLast() {
		return passwordLast;
	}

	public void setPasswordLast(String passwordLast) {
		this.passwordLast = passwordLast;
	}

	public Timestamp getDateLogonLast() {
		return dateLogonLast;
	}

	public void setDateLogonLast(Timestamp dateLogonLast) {
		this.dateLogonLast = dateLogonLast;
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

	public String getQdr() {
		return qdr;
	}

	public void setQdr(String qdr) {
		this.qdr = qdr;
	}

	public String getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getCertifyBy() {
		return certifyBy;
	}

	public void setCertifyBy(String certifyBy) {
		this.certifyBy = certifyBy;
	}

	public Timestamp getCertifyDate() {
		return certifyDate;
	}

	public void setCertifyDate(Timestamp certifyDate) {
		this.certifyDate = certifyDate;
	}
}
