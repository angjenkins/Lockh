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
@IdClass(SolLineCompositePK.class)
@Table (name="sol_line")
public class SolLineDTO {
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
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	protected String sch_Line = "";
	
	@Length(max=4)
	@NotNull
	@Column(name="Std_Item")
	protected String stdItem = "";
	
	@Length(max=1)
	@Column(name="Award_Line")
	protected String awardLine;
	
	@Length(max=2)
	@Column(name="Group_No")
	protected String groupNumber;
	
	@Length(max=2)
	@Column(name="SubGroup_No")
	protected String subgroupNumber;
	
	@NotNull
	@Column(name="Qty_Sol_Cases")
	protected int qtySolCase = 0;
	
	@NotNull
	@Column(name="Additional_Qty")
	protected int addQty = 0;
	
	@Length(max=2)
	@Column(name="Buyer_Code")
	protected String buyerCode;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Status")
	protected int status = 0;
	
	@Length(max=120)
	@Column(name="Non_Std_Options")
	protected String nonStdOptions;
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Length(max=1)
	@Column(name="ship_ind")
	protected String shipInd = "";
	
	@Column(name="ship_days")
	protected int shipDays = 0;
	
	@Length(max=1)
	@Column(name="ship_status")
	protected String shipStatus = "";
	
	

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

	public String getSch_Line() {
		return sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		this.sch_Line = sch_Line;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getAwardLine() {
		return awardLine;
	}

	public void setAwardLine(String awardLine) {
		this.awardLine = awardLine;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getSubgroupNumber() {
		return subgroupNumber;
	}

	public void setSubgroupNumber(String subgroupNumber) {
		this.subgroupNumber = subgroupNumber;
	}

	public int getQtySolCase() {
		return qtySolCase;
	}

	public void setQtySolCase(int qtySolCase) {
		this.qtySolCase = qtySolCase;
	}

	public int getAddQty() {
		return addQty;
	}

	public void setAddQty(int addQty) {
		this.addQty = addQty;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNonStdOptions() {
		return nonStdOptions;
	}

	public void setNonStdOptions(String nonStdOptions) {
		this.nonStdOptions = nonStdOptions;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getShipInd() {
		return shipInd;
	}

	public void setShipInd(String shipInd) {
		this.shipInd = shipInd;
	}

	public int getShipDays() {
		return shipDays;
	}

	public void setShipDays(int shipDays) {
		this.shipDays = shipDays;
	}

	public String getShipStatus() {
		return shipStatus;
	}

	public void setShipStatus(String shipStatus) {
		this.shipStatus = shipStatus;
	}
	
	
}
