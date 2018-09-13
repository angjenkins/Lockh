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
@IdClass(SolLineOptionCompositePK.class)
@Table (name="sol_line_options")
public class SolLineOptionDTO {
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
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	protected String sch_Line = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option code cannot be empty")
	protected String option_Code = "";
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=4)
	@Column(name="opt_desc")
	protected String optDesc = "";

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

	public String getSch_Line() {
		return sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		this.sch_Line = sch_Line;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
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

	public String getOptDesc() {
		return optDesc;
	}

	public void setOptDesc(String optDesc) {
		this.optDesc = optDesc;
	}
	
	
}
