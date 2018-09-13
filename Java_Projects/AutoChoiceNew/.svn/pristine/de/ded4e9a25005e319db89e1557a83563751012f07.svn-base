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
@IdClass(ContrDeviationCompositePK.class)
@Table (name="contr_deviation")
public class ContrDeviationDTO {
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	protected String sch_Line = "";
	
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Dev flag cannot be empty")
	protected String dev_Flag = "";
	
	@Id
	@NotNull
	protected double line_Number;
	
	@Length(max=80)
	@NotNull
	@Column(name="Description")
	protected String desc = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSch_Line() {
		return sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		this.sch_Line = sch_Line;
	}

	public String getDev_Flag() {
		return dev_Flag;
	}

	public void setDev_Flag(String dev_Flag) {
		this.dev_Flag = dev_Flag;
	}

	public double getLine_Number() {
		return line_Number;
	}

	public void setLine_Number(double line_Number) {
		this.line_Number = line_Number;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
	
	
}
