package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@IdClass(StdItemVerbiageCompositePK.class)
@Table (name="std_itm_verbage")
public class StdItemVerbiageDTO {
	
	@Id
	@Column(name="Std_Item")
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Standard Item cannot be empty")
	protected String Std_Item= "";
	
	@Id
	@Column(name="Flag_Current")
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Current Flag cannot be empty")
	protected String Flag_Current = "";   // retain the column name since this will be part of the @idclass
	
	@Id
	@Column(name="Line_Number")
	@NotNull
	@NotEmpty(message="Line Number cannot be empty")
	protected BigInteger Line_Number;
	
	@Length(max=80)
	@NotNull
	@NotEmpty(message="Description cannot be empty")
	@Column(name="Description")
	protected String description = "";
	
	@Length(max=20)
	@NotNull
	@NotEmpty(message="User Updated cannot be empty")
	@Column(name="User_Updated")
	protected String userUpdated = "";
		
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated;


	
	
//	

	public String getDescription() {
		return description;
	}

	public String getStd_Item() {
		return Std_Item;
	}

	public void setStd_Item(String std_Item) {
		Std_Item = std_Item;
	}

	public String getFlag_Current() {
		return Flag_Current;
	}

	public void setFlag_Current(String flag_Current) {
		Flag_Current = flag_Current;
	}

	public BigInteger getLine_Number() {
		return Line_Number;
	}

	public void setLine_Number(BigInteger line_Number) {
		Line_Number = line_Number;
	}

	public void setDescription(String description) {
		this.description = description;
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
