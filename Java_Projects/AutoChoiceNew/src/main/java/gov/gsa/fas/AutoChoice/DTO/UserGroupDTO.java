package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
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


@Component
@Entity
@Table (name="user_group")
@IdClass(UserGroupCompositePK.class)
public class UserGroupDTO implements Serializable{
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
	
	@Length(max=60)
	@Column(name="Description")
	protected String description;
	
	
	@Length(max=15)
	@Column(name="Created_By")
	protected String createdBy;
	
	@Column(name="Date_Created")
	protected Timestamp dateCreated;
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated;

	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
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
	
}
