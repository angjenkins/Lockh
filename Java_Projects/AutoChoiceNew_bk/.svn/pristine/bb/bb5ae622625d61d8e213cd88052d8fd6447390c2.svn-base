package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table (name="user_agbu_report")
public class UserAgBuReportDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	@NotEmpty(message="ID cannot be empty")
	@Column(name="ID")
	protected int id;
	
	@Length(max=2)
	@NotNull
	@Column(name="Agency_Code")
	protected String agencyCode;
	
	@Length(max=2)
	@NotNull
	@Column(name="Bureau_Code")
	protected String bureauCode;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_ID")
	protected String userID;
	
	@Length(max=45)
	@NotNull
	@Column(name="Report_Name")
	protected String reportNumber;
	
	@Length(max=1)
	@NotNull
	@Column(name="Report_Type")
	protected String reportType;
	
	@Length(max=1)
	@NotNull
	@Column(name="Privilege")
	protected String privilege = "P";
	
	@Length(max=500)
	@NotNull
	@Column(name="Field_Names")
	protected String fieldNames;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;
	
	@NotNull
	@Column(name="Date_Created")
	protected Timestamp createDate;
	
	@Transient 
    protected String editFlag = "";
	
	@Transient 
    protected String delFlag = "";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(String reportNumber) {
		this.reportNumber = reportNumber;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getFieldNames() {
		return fieldNames;
	}

	public void setFieldNames(String fieldNames) {
		this.fieldNames = fieldNames;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
	
	
}
