package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class SolLineOptionCompositePK implements Serializable{
	protected String sol_No_1;
	protected String sol_No_2;
	protected String sol_No_3;
	protected String sch_Line;
	protected String option_Code;
	
	public SolLineOptionCompositePK(){
		
	}
	
	public SolLineOptionCompositePK(String sol_No_1, String sol_No_2,String sol_No_3,String sch_Line, String option_Code){
		this.sol_No_1 = sol_No_1;
		this.sol_No_2 = sol_No_2;
		this.sol_No_3 = sol_No_3;
		this.sch_Line = sch_Line;
		this.sch_Line = option_Code;
	}
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof SolLineOptionCompositePK) && 
                 ((SolLineOptionCompositePK) o).getSol_No_1().equals(this.sol_No_1) &&
                 ((SolLineOptionCompositePK) o).getSol_No_2().equals(this.sol_No_2) &&
                 ((SolLineOptionCompositePK) o).getSol_No_3().equals(this.sol_No_3) &&
                 ((SolLineOptionCompositePK) o).getSch_Line().equals(this.sch_Line) &&
                 ((SolLineOptionCompositePK) o).getOption_Code().equals(this.option_Code));
    }
	@Override
    public int hashCode() { 
        return sol_No_1.hashCode() + sol_No_2.hashCode() + sol_No_3.hashCode() + sch_Line.hashCode() + option_Code.hashCode(); 
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


}
