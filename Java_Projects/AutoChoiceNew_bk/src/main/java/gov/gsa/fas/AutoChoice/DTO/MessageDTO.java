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
@IdClass(MessageCompositePK.class)
@Table (name="message")
public class MessageDTO {
	
	@Id
	@Length(max=10)
	@NotNull
	@NotEmpty(message="Type cannot be empty")
	protected String type = "";
	
	@Id
	@Length(max=10)
	@NotNull
	@NotEmpty(message="Code cannot be empty")
	protected String Code = "";
	
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Flag current cannot be empty")
	protected String flag_Current = "";
	
	@Id
	@NotNull
	protected double line_Number = 0;
	
	@Length(max=80)
	@NotNull
	@Column(name="Description")
	protected String desc = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getFlag_Current() {
		return flag_Current;
	}

	public void setFlag_Current(String flag_Current) {
		this.flag_Current = flag_Current;
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

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
