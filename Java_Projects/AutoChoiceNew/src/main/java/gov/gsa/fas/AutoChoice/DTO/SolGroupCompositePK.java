package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class SolGroupCompositePK  implements Serializable{
	protected String sol_No_1;
	protected String sol_No_2;
	protected String sol_No_3;
	protected String Group_No;
	
	public SolGroupCompositePK(){
		
	}
	
	public SolGroupCompositePK(String sol_No_1, String sol_No_2,String sol_No_3,String Group_No){
		this.sol_No_1 = sol_No_1;
		this.sol_No_2 = sol_No_2;
		this.sol_No_3 = sol_No_3;
		this.Group_No = Group_No;
	}
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof SolGroupCompositePK) && 
                 ((SolGroupCompositePK) o).getSol_No_1().equals(this.sol_No_1) &&
                 ((SolGroupCompositePK) o).getSol_No_2().equals(this.sol_No_2) &&
                 ((SolGroupCompositePK) o).getSol_No_3().equals(this.sol_No_3) &&
                 ((SolGroupCompositePK) o).getGroup_No().equals(this.Group_No));
    }
	@Override
    public int hashCode() { 
        return sol_No_1.hashCode() + sol_No_2.hashCode() + sol_No_3.hashCode() + Group_No.hashCode(); 
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

	public String getGroup_No() {
		return Group_No;
	}

	public void setGroup_No(String group_No) {
		Group_No = group_No;
	}
}
