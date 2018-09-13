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
import org.springframework.stereotype.Component;

@Component
@Entity
@IdClass(RequisitionsFSRCompositePK.class)
@Table (name="requisitions_fsr")
public class RequisitionsFSRDTO {
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNo = "";
	
	@Id
	@NotNull
	@NotEmpty(message="FSR key cannot be empty")
	protected int fSR_Key = 0;
	
	@Length(max=800)
	@NotNull
	@Column(name="Remarks")
	protected String remarks = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public int getfSR_Key() {
		return fSR_Key;
	}

	public void setfSR_Key(int fSR_Key) {
		this.fSR_Key = fSR_Key;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	

}
