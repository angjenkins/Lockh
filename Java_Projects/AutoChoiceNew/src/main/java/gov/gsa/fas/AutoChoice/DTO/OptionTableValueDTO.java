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
@IdClass(OptionTableValueCompositePK.class)
@Table (name="option_table_value")
public class OptionTableValueDTO {
  	@Id
	@NotEmpty
	@NotNull
	@Length(max=4)
	//@Column(name="Option_Code")					// `Option_Code` char(4) NOT NULL,
	protected String option_Code = "";

  	@Id
  	//@Column(name="Sequence")					// `Sequence` int(5) NOT NULL,
  	protected Integer sequence;

  	@NotNull
	@Length(max=30)
	@Column(name="Valid_Text")					// `Valid_Text` varchar(30) NOT NULL DEFAULT '',
	protected String validText = "";

	@NotNull
	@Length(max=1)
	@Column(name="Status")							// `Status` char(1) NOT NULL DEFAULT '',
	protected String validStatus = "";

	@Column(name="Date_Updated")						// `Date_Updated` datetime DEFAULT NULL
	protected Timestamp dateUpdated;

	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")				// `User_Updated` char(20) NOT NULL,
	protected String userUpdated = "";

	
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getValidText() {
		return validText;
	}

	public void setValidText(String validText) {
		this.validText = validText;
	}

	public String getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}




}