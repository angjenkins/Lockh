package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
@Entity
@Table (name="user_audit_trail")
@IdClass(UserAuditTrailCompositePK.class)

public class UserAuditTrailDTO {
	@Id
	@NotNull
	@Column(name="CaseNo")
	protected long caseNo= 0;
	
	@Id
	@Length(max=20)
	@NotNull
	protected String user_Id = "";
	
	@Id
	@Column(name="Date_Modified")
	protected Timestamp date_Modified;
	
	@Length(max=80)
	@Column(name="Remark")
	protected String remark;
	
	

	public long getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(long caseNo) {
		this.caseNo = caseNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public Timestamp getDate_Modified() {
		return date_Modified;
	}

	public void setDate_Modified(Timestamp date_Modified) {
		this.date_Modified = date_Modified;
	}
	
	
	
}
