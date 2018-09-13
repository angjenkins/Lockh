package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(OrderStatusArchiveCompPK.class)
@Table (name="order_status_archive")
public class OrderStatusArchiveDTO {
	@Id
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	@Length(max=6)
	protected String caseNo;
	
	@Id
	@NotNull
	@NotEmpty(message="Vehicle Order Number cannot be empty")
	@Length(max=8)
	protected String veh_Order_No;
	
	@Id
	@NotNull
	@NotEmpty(message="VIN cannot be empty")
	@Length(max=17)
	protected String VIN;
	
	@Id
	@NotNull
	@NotEmpty(message="Updated Date cannot be empty")
	protected Timestamp updatedDate;
	
	@NotNull
	@Column(name="Contract")
	@Length(max=5)
	protected String contract = "";
	
	@NotNull
	@Column(name="Old_Veh_Order_No")
	@Length(max=8)
	protected String oldOrderVehNo = "";
	
	@NotNull
	@Column(name="Old_VIN")
	@Length(max=17)
	protected String oldVIN = "";
	
	@NotNull
	@Column(name="Old_Status")
	@Length(max=2)
	protected String oldStatus = "";
	
	@Column(name="Old_Status_Date")
	protected Timestamp oldStatusDate;
	
	@Column(name="User_Updated")
	@Length(max=20)
	protected String userUpdated = "";
	
	@NotNull
	@Column(name="Reason_Code")
	@Length(max=2)
	protected String reasonCode = "";
	
	@Column(name="Comment")
	@Length(max=100)
	protected String comment = "";

	@Transient
	protected Timestamp oldDeliveryDate;

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getVeh_Order_No() {
		return veh_Order_No;
	}

	public void setVeh_Order_No(String veh_Order_No) {
		this.veh_Order_No = veh_Order_No;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getOldOrderVehNo() {
		return oldOrderVehNo;
	}

	public void setOldOrderVehNo(String oldOrderVehNo) {
		this.oldOrderVehNo = oldOrderVehNo;
	}

	public String getOldVIN() {
		return oldVIN;
	}

	public void setOldVIN(String oldVIN) {
		this.oldVIN = oldVIN;
	}

	public String getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}

	public Timestamp getOldStatusDate() {
		return oldStatusDate;
	}

	public void setOldStatusDate(Timestamp oldStatusDate) {
		this.oldStatusDate = oldStatusDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getOldDeliveryDate() {
		return oldDeliveryDate;
	}

	public void setOldDeliveryDate(Timestamp oldDeliveryDate) {
		this.oldDeliveryDate = oldDeliveryDate;
	}
	
	
}
