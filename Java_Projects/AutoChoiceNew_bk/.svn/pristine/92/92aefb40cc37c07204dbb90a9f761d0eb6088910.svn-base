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
@IdClass(SolicitationCompositePK.class)
@Table (name="solicitation")
public class SolicitationDTO {
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Sol no.1 cannot be empty")
	protected String sol_No_1 = "";
	
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Sol no.2 cannot be empty")
	protected String sol_No_2 = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Sol no.3 cannot be empty")
	protected String sol_No_3 = "";
	
	@Column(name="Date_Initiated")
	protected Timestamp initDate;
	
	@Column(name="Date_Issue")
	protected Timestamp issueDate;
	
	@Column(name="Date_Open_Close")
	protected Timestamp openCloseDate;
	
	@Column(name="Date_Canceled")
	protected Timestamp cancelDate;
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=2)
	@Column(name="Line_Award_Group")
	protected String lineAwardGroup;	

	
	@Length(max=1)
	@Column(name="Std_Item_On_Line")
	protected String stdItemOnline;
	
	@Length(max=1)
	@Column(name="Status")
	protected String status = "Y";
	
	@Length(max=1)
	@Column(name="Sub_Group_Flag")
	protected String subgroupFlag;
	
	@Length(max=7)
	@Column(name="Sch_Line_Wk")
	protected String schLineWk;
	
	@Length(max=1)
	@Column(name="Flag_Wk")
	protected String wkFlag;
	
	@Length(max=20)
	@NotNull
	@Column(name="Sol_No")
	protected String solNo = "";
	
	@Length(max=1)
	@Column(name="Proprietary")
	protected String proprietary = "N";
	
	@Length(max=240)
	@Column(name="Comment")
	protected String comment = "";
	
	@Length(max=1)
	@Column(name="Proc_Method")
	protected String procMethod = "";
	
	@Length(max=1)
	@Column(name="SOL_LN_OR_GRP")
	protected String solLnOrGrp = "L";
	
	@Length(max=1)
	@Column(name="SOL_OFFER_SRC")
	protected String solOfferSrc = "V";
	
	@Length(max=1)
	@Column(name="Open_AutoBid")
	protected String openAutoBid = "N";

	public String getSol_No_1() {
		return sol_No_1;
	}

	public void setSol_No_1(String sol_No_1) {
		this.sol_No_1 = sol_No_1;
	}

	public String getSol_No_2() {
		return sol_No_2;
	}

	public void setSol_No_2(String sol_No_2) {
		this.sol_No_2 = sol_No_2;
	}

	public String getSol_No_3() {
		return sol_No_3;
	}

	public void setSol_No_3(String sol_No_3) {
		this.sol_No_3 = sol_No_3;
	}

	public Timestamp getInitDate() {
		return initDate;
	}

	public void setInitDate(Timestamp initDate) {
		this.initDate = initDate;
	}

	public Timestamp getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public Timestamp getOpenCloseDate() {
		return openCloseDate;
	}

	public void setOpenCloseDate(Timestamp openCloseDate) {
		this.openCloseDate = openCloseDate;
	}

	public Timestamp getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Timestamp cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getLineAwardGroup() {
		return lineAwardGroup;
	}

	public void setLineAwardGroup(String lineAwardGroup) {
		this.lineAwardGroup = lineAwardGroup;
	}

	public String getStdItemOnline() {
		return stdItemOnline;
	}

	public void setStdItemOnline(String stdItemOnline) {
		this.stdItemOnline = stdItemOnline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubgroupFlag() {
		return subgroupFlag;
	}

	public void setSubgroupFlag(String subgroupFlag) {
		this.subgroupFlag = subgroupFlag;
	}

	public String getSchLineWk() {
		return schLineWk;
	}

	public void setSchLineWk(String schLineWk) {
		this.schLineWk = schLineWk;
	}

	public String getWkFlag() {
		return wkFlag;
	}

	public void setWkFlag(String wkFlag) {
		this.wkFlag = wkFlag;
	}

	public String getSolNo() {
		return solNo;
	}

	public void setSolNo(String solNo) {
		this.solNo = solNo;
	}

	public String getProprietary() {
		return proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getProcMethod() {
		return procMethod;
	}

	public void setProcMethod(String procMethod) {
		this.procMethod = procMethod;
	}

	public String getSolLnOrGrp() {
		return solLnOrGrp;
	}

	public void setSolLnOrGrp(String solLnOrGrp) {
		this.solLnOrGrp = solLnOrGrp;
	}

	public String getSolOfferSrc() {
		return solOfferSrc;
	}

	public void setSolOfferSrc(String solOfferSrc) {
		this.solOfferSrc = solOfferSrc;
	}

	public String getOpenAutoBid() {
		return openAutoBid;
	}

	public void setOpenAutoBid(String openAutoBid) {
		this.openAutoBid = openAutoBid;
	}
	
	

}
