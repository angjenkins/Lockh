package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrDeviationCompositePK implements Serializable{
	private String contract;
	private String sch_Line;
	private String dev_Flag;
	private double line_Number;
	
	public ContrDeviationCompositePK(){
		
	}
	
	public ContrDeviationCompositePK(String contract, String sch_Line, String dev_Flag, double line_Number){
		this.contract = contract;
		this.dev_Flag = dev_Flag;
		this.line_Number = line_Number;
		this.sch_Line = sch_Line;
	}

	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ContrDeviationCompositePK) && 
                 ((ContrDeviationCompositePK) o).getContract().equals(this.contract) &&
                 ((ContrDeviationCompositePK) o).getSch_Line().equals(this.sch_Line) && 
                 ((ContrDeviationCompositePK) o).getDev_Flag().equals(this.dev_Flag) &&
                 ((ContrDeviationCompositePK) o).getLine_Number() == this.line_Number);
    }
	@Override
    public int hashCode() { 
        return contract.hashCode() + dev_Flag.hashCode() + sch_Line.hashCode() + Double.valueOf(line_Number).hashCode(); 
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

	public double getLine_Number() {
		return line_Number;
	}

	public void setLine_Number(double line_Number) {
		this.line_Number = line_Number;
	}
	
}
