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
@IdClass(SolGroupCompositePK.class)
@Table (name="sol_group")
public class SolGroupDTO {
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Sol no.1 cannot be empty")
	protected String sol_No_1 = "";
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Sol no.2 cannot be empty")
	protected String sol_No_2 = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Sol no.3 cannot be empty")
	protected String sol_No_3 = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Group number cannot be empty")
	protected String group_No = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "Y";
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated;

	public String getSol_No_1() {
		return sol_No_1;
	}

	public void setSol_No_1(String sol_No_1) {
		this.sol_No_1 = sol_No_1;
	}

	public String getSol_No_2() {
		return sol_No_2;
	}

	public void setSol_No_2(String sol_No_2) {
		this.sol_No_2 = sol_No_2;
	}

	public String getSol_No_3() {
		return sol_No_3;
	}

	public void setSol_No_3(String sol_No_3) {
		this.sol_No_3 = sol_No_3;
	}

	public String getGroup_No() {
		return group_No;
	}

	public void setGroup_No(String group_No) {
		this.group_No = group_No;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

}
