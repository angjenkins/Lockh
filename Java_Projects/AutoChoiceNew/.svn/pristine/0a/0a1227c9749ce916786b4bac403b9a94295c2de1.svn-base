package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class SolicitationCompositePK implements Serializable{
	protected String sol_No_1;
	protected String sol_No_2;
	protected String sol_No_3;
	
	public SolicitationCompositePK(){
		
	}
	
	public SolicitationCompositePK(String sol_No_1, String sol_No_2,String sol_No_3){
		this.sol_No_1 = sol_No_1;
		this.sol_No_2 = sol_No_2;
		this.sol_No_3 = sol_No_3;
	}
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof SolicitationCompositePK) && 
                 ((SolicitationCompositePK) o).getSol_No_1().equals(this.sol_No_1) &&
                 ((SolicitationCompositePK) o).getSol_No_2().equals(this.sol_No_2) &&
                 ((SolicitationCompositePK) o).getSol_No_3().equals(this.sol_No_3) );
    }
	@Override
    public int hashCode() { 
        return sol_No_1.hashCode() + sol_No_2.hashCode() + sol_No_3.hashCode(); 
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
}
