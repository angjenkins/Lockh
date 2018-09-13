package gov.gsa.fas.AutoChoice.DTO;


import gov.gsa.fas.AutoChoice.beans.OtherfeaturesValueBean;

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
import org.springframework.stereotype.Component;

@Entity
@IdClass(ContrLineOptCheckCompositePK.class)
@Table (name="contr_line_option_checker")

@Component
public class ContrLineOptCheckDTO {
	
	
	@Id
	@Length(max=5)
	@NotNull
	@NotEmpty(message="Contract cannot be empty")
	protected String contract = "";
	
	@Id
	@Length(max=7)
	@NotNull
	@NotEmpty(message="Schedule line cannot be empty")
	
	protected String sch_Line = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option Code cannot be empty")
	
	protected String option_Code = "";
	
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Checker Type cannot be empty")
	
	protected String checker_Type = "";
	
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Checker Type cannot be empty")
	
	protected int sequence = 0;
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option Checked cannot be empty")
	protected String option_Checked = "";
	

	@NotNull
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "";

	
	
//	public boolean equals( Object obj )
//	{
//		boolean flag = false;
//		ContrLineOptCheckDTO other = ( ContrLineOptCheckDTO )obj;
//		if( other.sch_Line.equals(sch_Line) && (other.contract.equals(contract)))
//			flag = true;
//		return flag;
//	}
//	
//	public int hashCode() { return (sch_Line.hashCode() + contract.hashCode()); }
//	
//	
//	
    @Transient
	protected String caseNo    = "";
    @Transient
    protected String optOrigin     = "";  
    @Transient
    protected double unitPrice     = 0;
    @Transient
    protected String validQty      = "";  
    @Transient
    protected int    quantity       = 0;
    @Transient
    protected String message        = "";
    @Transient
    protected String oemptionType= "";
    @Transient
    protected String action         = "";
    @Transient
    protected int rowno          = 0 ;   
    @Transient
    protected String optSource      = "";
	@Transient
    protected String description ="";
	@Transient
    protected Integer addShipDays = 0;
	
	@Transient
	protected String mpgC = "";
	@Transient
	protected String mpgB= "";
	@Transient
	protected String mpgH= "";
	@Transient
	protected String mpgFlag= "";
	
	@Transient
	protected String gramsPerMile= "";

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSch_Line() {
		return sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		this.sch_Line = sch_Line;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}

	public String getChecker_Type() {
		return checker_Type;
	}

	public void setChecker_Type(String checker_Type) {
		this.checker_Type = checker_Type;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getOption_Checked() {
		return option_Checked;
	}

	public void setOption_Checked(String option_Checked) {
		this.option_Checked = option_Checked;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getOptOrigin() {
		return optOrigin;
	}

	public void setOptOrigin(String optOrigin) {
		this.optOrigin = optOrigin;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getValidQty() {
		return validQty;
	}

	public void setValidQty(String validQty) {
		this.validQty = validQty;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOemptionType() {
		return oemptionType;
	}

	public void setOemptionType(String oemptionType) {
		this.oemptionType = oemptionType;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getRowno() {
		return rowno;
	}

	public void setRowno(int rowno) {
		this.rowno = rowno;
	}

	public String getOptSource() {
		return optSource;
	}

	public void setOptSource(String optSource) {
		this.optSource = optSource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAddShipDays() {
		return addShipDays;
	}

	public void setAddShipDays(Integer addShipDays) {
		this.addShipDays = addShipDays;
	}

	public String getMpgC() {
		return mpgC;
	}

	public void setMpgC(String mpgC) {
		this.mpgC = mpgC;
	}

	public String getMpgB() {
		return mpgB;
	}

	public void setMpgB(String mpgB) {
		this.mpgB = mpgB;
	}

	public String getMpgH() {
		return mpgH;
	}

	public void setMpgH(String mpgH) {
		this.mpgH = mpgH;
	}

	public String getMpgFlag() {
		return mpgFlag;
	}

	public void setMpgFlag(String mpgFlag) {
		this.mpgFlag = mpgFlag;
	}

	public String getGramsPerMile() {
		return gramsPerMile;
	}

	public void setGramsPerMile(String gramsPerMile) {
		this.gramsPerMile = gramsPerMile;
	}
	
	
	


}




