/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
/**
 * @author Arnel Macatula
 *
 */


@Entity
@Table (name="bid_line_dev_new")
@IdClass(BidLineDevNewCompositePK.class)
public class BidLineDevNewDTO {
	@Id
	@NotEmpty(message="Sol_No_1  cannot be empty")
	@NotNull
	@Length(max=2)
	//@Column(name="Sol_No_1")
	protected String sol_No_1 = "";
	@Id
	@NotEmpty(message="Sol_No_2  cannot be empty")
	@NotNull
	@Length(max=6)
	//@Column(name="Sol_No_2")
	protected String sol_No_2 = "";
	@Id
	@NotEmpty(message="Sol_No_3  cannot be empty")
	@NotNull
	@Length(max=2)
	//@Column(name="Sol_No_3")
	protected String sol_No_3 = "";

	@Id
	@NotEmpty(message="Contr_DUNS  cannot be empty")
	@NotNull
	//@Column(name="Contr_DUNS")
	protected String contr_DUNS = "";

	@Id
	@NotEmpty(message="Contract cannot be empty")
	@NotNull
	//@Column(name="Contract")
	protected String contract = "";

	@Id
	@NotEmpty(message="Sch_Line  cannot be empty")
	@NotNull
	//@Column(name="Sch_Line")
	protected String sch_Line = "";
	
	@Id
	@NotEmpty(message="Dev_Flag  cannot be empty")
	@NotNull
	//@Column(name="Dev_Flag")
	protected String dev_Flag = "";
	
	@Id
	@NotEmpty(message="Line_Number cannot be empty")
	@NotNull      
	//@Column(name="Line_Number")
	protected Integer line_Number= 0;
	
	@Column(name="Description")
	protected String description = "";
	
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated = null;

 	@Transient
	protected String  editFlag = "";
 	@Transient
 	protected String copyFlag="";
 	@Transient
 	protected String delFlag="";
 	@Transient
 	protected String insFlag="";
 	
 	@Transient
 	protected String action="";


 	@Transient
 	protected Integer originalLineNumber=0;
    
 	@Transient
    protected String result  ="";

 	
	
	

	public String getDescription() {
		return description;
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

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getCopyFlag() {
		return copyFlag;
	}

	public void setCopyFlag(String copyFlag) {
		this.copyFlag = copyFlag;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getInsFlag() {
		return insFlag;
	}

	public void setInsFlag(String insFlag) {
		this.insFlag = insFlag;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getOriginalLineNumber() {
		return originalLineNumber;
	}

	public void setOriginalLineNumber(Integer originalLineNumber) {
		this.originalLineNumber = originalLineNumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

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

	public String getContr_DUNS() {
		return contr_DUNS;
	}

	public void setContr_DUNS(String contr_DUNS) {
		this.contr_DUNS = contr_DUNS;
	}

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

	public String getDev_Flag() {
		return dev_Flag;
	}

	public void setDev_Flag(String dev_Flag) {
		this.dev_Flag = dev_Flag;
	}

	public Integer getLine_Number() {
		return line_Number;
	}

	public void setLine_Number(Integer line_Number) {
		this.line_Number = line_Number;
	}


   	
}

