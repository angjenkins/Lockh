package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;



@Entity
@Table (name="user_group_access")
@IdClass(UserGroupAccessCompositePk.class)

public class UserGroupAccessDTO {
	@Id
	@Length(max=2)
	@NotNull
	@Column(name="Agency_Code")
	protected String agency_Code= "";
	@Id
	@Length(max=2)
	@NotNull
	@Column(name="Bureau_Code")
	protected String bureau_Code = "";
	@Id
	@Length(max=5)
	@Column(name="Group_Code")
	protected String group_Code;
	
	@Id
	@Length(max=20)
	@Column(name="User_ID")
	protected String user_Id;
	
	@Length(max=1)
	@Column(name="Privilege")
	protected String privilege;
	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated;
	
	@Length(max=15)
	@Column(name="User_Last_Updated")
	protected String userLastUpdated;

	
	public String getAgency_Code() {
		return agency_Code;
	}

	public void setAgency_Code(String agency_Code) {
		this.agency_Code = agency_Code;
	}

	public String getBureau_Code() {
		return bureau_Code;
	}

	public void setBureau_Code(String bureau_Code) {
		this.bureau_Code = bureau_Code;
	}

	public String getGroup_Code() {
		return group_Code;
	}

	public void setGroup_Code(String group_Code) {
		this.group_Code = group_Code;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserLastUpdated() {
		return userLastUpdated;
	}

	public void setUserLastUpdated(String userLastUpdated) {
		this.userLastUpdated = userLastUpdated;
	}

	
	
	
}
