package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="batch_control")
public class BatchControlDTO {

	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Type cannot be empty")
	@Column(name="type")
	protected String type = "";

	@Length(max=20)
	@NotNull
	@Column(name="Description")
	protected String description = "";

	@NotNull
	@Column(name="Last_Process")
	protected Timestamp lastProcess;
	
	@Length(max=1)
	@NotNull
	@Column(name="Flag_Completed")
	protected String flagCompleted = "";
	
	@NotNull
	@Column(name="OrderNo")
	protected int orderNumber = 0;
	
	@Length(max=1)
	@Column(name="Frequence")
	protected String frequency = "";
	
	@Length(max=2)
	@Column(name="Prev_Type")
	protected String prevType = "";
	
	@Length(max=6)
	@Column(name="CaseNo")
	protected String caseNumber = "";
	
	@NotNull
	@Column(name="Dt_From")
	protected Timestamp dateFrom;
	
	@NotNull
	@Column(name="Dt_To")
	protected Timestamp dateTo;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Privilege")
	protected String privilege = "";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getLastProcess() {
		return lastProcess;
	}

	public void setLastProcess(Timestamp lastProcess) {
		this.lastProcess = lastProcess;
	}

	public String getFlagCompleted() {
		return flagCompleted;
	}

	public void setFlagCompleted(String flagCompleted) {
		this.flagCompleted = flagCompleted;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getPrevType() {
		return prevType;
	}

	public void setPrevType(String prevType) {
		this.prevType = prevType;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public Timestamp getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Timestamp dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Timestamp getDateTo() {
		return dateTo;
	}

	public void setDateTo(Timestamp dateTo) {
		this.dateTo = dateTo;
	}

	public Timestamp getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Timestamp dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
}
