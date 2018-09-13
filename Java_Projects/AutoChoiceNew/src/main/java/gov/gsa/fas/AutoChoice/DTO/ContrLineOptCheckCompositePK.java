package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrLineOptCheckCompositePK implements Serializable{
	
	protected String contract;
	protected String sch_Line;
	protected String option_Code;
	protected String checker_Type;
	protected double sequence;
	protected String option_Checked;
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
	public double getSequence() {
		return sequence;
	}
	public void setSequence(double sequence) {
		this.sequence = sequence;
	}
	public String getOption_Checked() {
		return option_Checked;
	}
	public void setOption_Checked(String option_Checked) {
		this.option_Checked = option_Checked;
	}
}