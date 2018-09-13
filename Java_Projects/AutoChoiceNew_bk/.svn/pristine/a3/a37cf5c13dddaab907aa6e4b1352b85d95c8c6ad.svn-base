package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrModCompositePK implements Serializable{
	
	protected String contract;
	protected String mod;
	
	public ContrModCompositePK(){
		
	}
	
	public ContrModCompositePK(String contract, String mod){
		this.contract = contract;
		this.mod = mod;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ContrModCompositePK) && 
                 ((ContrModCompositePK) o).getContract().equals(this.contract) &&
                 ((ContrModCompositePK) o).getMod().equals(this.mod));
    }
	@Override
    public int hashCode() { 
        return contract.hashCode() + mod.hashCode(); 
    }

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

}
