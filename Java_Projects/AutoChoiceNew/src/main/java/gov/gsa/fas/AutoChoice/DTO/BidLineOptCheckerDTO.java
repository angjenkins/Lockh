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
@Table (name="bid_line_opt_checker")
@IdClass(BidLineOptCheckerCompositePK.class)
public class BidLineOptCheckerDTO {
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
	//@Column(name="sol_No_2")
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
	@NotEmpty(message="Option Code cannot be empty")
	@NotNull
	@Length(max=4)
	//@Column(name="Option_Code")
	protected String option_Code = "";
	
	@Id
	@NotEmpty(message="Checker_Type cannot be empty")
	@NotNull
	//@Column(name="Checker_Type")
	protected String checker_Type = "";

	@Id
	@NotEmpty(message="Sequence cannot be empty")
	@NotNull
	//@Column(name="Sequence")
	protected int sequence = 0;
	
	@Id
	@NotEmpty(message="Option_Checked cannot be empty")
	@NotNull
	//@Column(name="Option_Checked")
	protected String option_Checked = "";
	
	@Id
	@NotEmpty(message="User_Updated cannot be empty")
	@NotNull
	//@Column(name="User_Updated")
	protected String user_Updated = "";
	
	@Column(name="status")
	@Length(max=1)
	protected String status = "";
	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated = null;

    @Transient
    protected Long maxSeqNo =(long) 0;
    
    
	


	public int getSequence() {
		return sequence;
	}



	public void setSequence(int sequence) {
		this.sequence = sequence;
	}


	public Timestamp getDateUpdated() {
		return dateUpdated;
	}



	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}



	public Long getMaxSeqNo() {
		return maxSeqNo;
	}



	public void setMaxSeqNo(Long maxSeqNo) {
		this.maxSeqNo = maxSeqNo;
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



	public String getOption_Checked() {
		return option_Checked;
	}



	public void setOption_Checked(String option_Checked) {
		this.option_Checked = option_Checked;
	}



	public String getUser_Updated() {
		return user_Updated;
	}



	public void setUser_Updated(String user_Updated) {
		this.user_Updated = user_Updated;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	
	
//	

	
	
}

