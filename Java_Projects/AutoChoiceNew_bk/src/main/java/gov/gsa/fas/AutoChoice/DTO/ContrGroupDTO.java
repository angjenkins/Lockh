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

@Entity
@IdClass(ContrGroupCompositePK.class)
@Table (name="contr_group")
public class ContrGroupDTO {
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Group number cannot be empty")
	protected String group_No = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Subgroup number cannot be empty")
	protected String subgroup_No = "";
	
	@NotNull
	@Column(name="Min_Units")
	protected int minUnits = 0;
	
	@NotNull
	@Column(name="Max_Units")
	protected int maxUnits = 0;
	
	@NotNull
	@Column(name="Units_Issued")
	protected int unitsIssued = 0;
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getGroup_No() {
		return group_No;
	}

	public void setGroup_No(String group_No) {
		this.group_No = group_No;
	}

	public String getSubgroup_No() {
		return subgroup_No;
	}

	public void setSubgroup_No(String subgroup_No) {
		this.subgroup_No = subgroup_No;
	}

	public int getMinUnits() {
		return minUnits;
	}

	public void setMinUnits(int minUnits) {
		this.minUnits = minUnits;
	}

	public int getMaxUnits() {
		return maxUnits;
	}

	public void setMaxUnits(int maxUnits) {
		this.maxUnits = maxUnits;
	}

	public int getUnitsIssued() {
		return unitsIssued;
	}

	public void setUnitsIssued(int unitsIssued) {
		this.unitsIssued = unitsIssued;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}
}
