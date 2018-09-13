package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


@Entity
@Table (name="vendor_report")
//@IdClass(VendorReportCompositePK.class)

public class VendorReportDTO {

	@Id
	@Column(name="ID")
	protected int id = 0;

	
	
	@Length(max=10)
	@NotNull
	@Column(name="Group_DUNS")
	protected int group_DUNS = 0;
	
	
	@Length(max=9)
	@Column(name="Contr_DUNS")
	protected String contr_DUNS="";
	
	
	@Length(max=45)
	@Column(name="Report_Name")
	protected String report_Name="";
		
	
	@Length(max=20)
	@Column(name="User_ID")
	protected String userId ="";

	@Length(max=1)
	@Column(name="Privilege")
	protected String privilege ="";

	
	
	
	@Length(max=500)
	@Column(name="Field_Names")
	protected String fieldNames ="";
	

	@Length(max=45)
	@Column(name="User_Updated")
	protected String userUpdated="";
	
	
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated;

	@Column(name="Date_Created")
	protected Timestamp Date_Created;

	@Transient 
    protected String editFlag = "";
	
	@Transient 
    protected String delFlag = "";

	
	public int getGroup_DUNS() {
		return group_DUNS;
	}

	public void setGroup_DUNS(int group_DUNS) {
		this.group_DUNS = group_DUNS;
	}

	public String getContr_DUNS() {
		return contr_DUNS;
	}

	public void setContr_DUNS(String contr_DUNS) {
		this.contr_DUNS = contr_DUNS;
	}

	public String getReport_Name() {
		return report_Name;
	}

	public void setReport_Name(String report_Name) {
		this.report_Name = report_Name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Timestamp getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Timestamp dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public Timestamp getDate_Created() {
		return Date_Created;
	}

	public void setDate_Created(Timestamp date_Created) {
		Date_Created = date_Created;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 
	
	
}
