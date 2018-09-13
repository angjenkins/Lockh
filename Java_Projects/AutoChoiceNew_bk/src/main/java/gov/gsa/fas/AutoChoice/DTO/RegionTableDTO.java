package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table (name="region_table")
@Component
public class RegionTableDTO {
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Region Code cannot be empty")
	protected String region_Code = "";
	
	@Length(max=50)
	@NotNull
	@Column(name="Region_Name")
	protected String regionName = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Valid_Flag")
	protected String validFlag = "Y";
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Date_Updated")
	protected Timestamp updateddate;
	
	@Transient
	protected Integer regionInt = 0;

	public String getRegion_Code() {
		return region_Code;
	}

	public void setRegion_Code(String region_Code) {
		this.region_Code = region_Code;
		if(region_Code.length() > 0){
			this.regionInt = Integer.parseInt(region_Code);
		}
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Timestamp updateddate) {
		this.updateddate = updateddate;
	}

	public Integer getRegionInt() {
		return regionInt;
	}

	public void setRegionInt(Integer regionInt) {
		this.regionInt = regionInt;
	}

}
