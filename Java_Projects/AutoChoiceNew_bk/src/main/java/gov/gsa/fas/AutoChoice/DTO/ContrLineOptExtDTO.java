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
@IdClass(ContrLineOptExtCompositePK.class)
@Table (name="contr_line_option_ext")
public class ContrLineOptExtDTO {
	
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String Contract = "";
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule Line cannot be empty")
	protected String Sch_Line = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option Code cannot be empty")
	protected String Option_Code = "";
	
	@Length(max=80)
	@NotNull
	@Column(name="Fed_Value_Next")
	protected String fedValueNext = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="OEM_Flag_Std")
	protected String oemFlagStd = "";
	
	@NotNull
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@Column(name="Status")
	protected String status = "";


	public String getContract() {
		return Contract;
	}

	public void setContract(String contract) {
		Contract = contract;
	}

	public String getSch_Line() {
		return Sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}

	public String getOption_Code() {
		return Option_Code;
	}

	public void setOption_Code(String option_Code) {
		Option_Code = option_Code;
	}

	public String getFedValueNext() {
		return fedValueNext;
	}

	public void setFedValueNext(String fedValueNext) {
		this.fedValueNext = fedValueNext;
	}

	public String getOemFlagStd() {
		return oemFlagStd;
	}

	public void setOemFlagStd(String oemFlagStd) {
		this.oemFlagStd = oemFlagStd;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
