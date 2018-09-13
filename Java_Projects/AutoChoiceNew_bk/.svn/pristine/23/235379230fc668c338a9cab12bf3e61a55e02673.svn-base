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
@IdClass(EngReqLogCompositePK.class)
@Table (name="eng_req_log")
public class EngReqLogDTO {
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Buyer Code cannot be empty")
	protected String buyer_Code = "";
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNo = "";
	
	@Id
	@NotNull
	protected Timestamp date_Open;
	
	@Column(name="Date_Closed")
	protected Timestamp closedDate;
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "";
	
	@Length(max=2)
	@Column(name="Reassigned_To")
	protected String reassignedTo;
	
	@Length(max=2)
	@Column(name="Reassigned_From")
	protected String reassignedFrom;
	
	@Length(max=1)
	@Column(name="Progress_Code")
	protected String progressCode;
	
	@NotNull
	@Length(max=2)
	@Column(name="Disposition_Code")
	protected String dispositionCode = "";
	
	@NotNull
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";

	@Column(name="Target_Dt")
	protected Timestamp targetDate;
	
	@Column(name="Start_Hold")
	protected Timestamp startHold;
	
	@Column(name="End_Hold")
	protected Timestamp endHold;

	public String getBuyer_Code() {
		return buyer_Code;
	}

	public void setBuyer_Code(String buyer_Code) {
		this.buyer_Code = buyer_Code;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Timestamp getDate_Open() {
		return date_Open;
	}

	public void setDate_Open(Timestamp date_Open) {
		this.date_Open = date_Open;
	}

	public Timestamp getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Timestamp closedDate) {
		this.closedDate = closedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReassignedTo() {
		return reassignedTo;
	}

	public void setReassignedTo(String reassignedTo) {
		this.reassignedTo = reassignedTo;
	}

	public String getReassignedFrom() {
		return reassignedFrom;
	}

	public void setReassignedFrom(String reassignedFrom) {
		this.reassignedFrom = reassignedFrom;
	}

	public String getProgressCode() {
		return progressCode;
	}

	public void setProgressCode(String progressCode) {
		this.progressCode = progressCode;
	}

	public String getDispositionCode() {
		return dispositionCode;
	}

	public void setDispositionCode(String dispositionCode) {
		this.dispositionCode = dispositionCode;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Timestamp targetDate) {
		this.targetDate = targetDate;
	}

	public Timestamp getStartHold() {
		return startHold;
	}

	public void setStartHold(Timestamp startHold) {
		this.startHold = startHold;
	}

	public Timestamp getEndHold() {
		return endHold;
	}

	public void setEndHold(Timestamp endHold) {
		this.endHold = endHold;
	}
}
