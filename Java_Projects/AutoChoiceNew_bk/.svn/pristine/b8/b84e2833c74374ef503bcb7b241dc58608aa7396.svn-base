package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrLineCompositePK implements Serializable{
	private String contract;
	private String sch_Line;
	
	public ContrLineCompositePK(){
		
	}
	
	public ContrLineCompositePK(String contract,String sch_Line){
		this.contract = contract;
		this.sch_Line = sch_Line;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ContrLineCompositePK) && 
                 ((ContrLineCompositePK) o).getContract().equals(this.contract) &&
                 ((ContrLineCompositePK) o).getSch_Line().equals(this.sch_Line));
    }
	@Override
    public int hashCode() { 
        return contract.hashCode() + sch_Line.hashCode(); 
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
	
	
}
