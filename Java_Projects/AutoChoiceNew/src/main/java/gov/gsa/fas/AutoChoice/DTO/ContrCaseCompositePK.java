package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrCaseCompositePK implements Serializable{
	
	private String contract = "";
	private String caseNo = "";
	private String mod = "";
	
	public ContrCaseCompositePK(){
		
	}
	
	public ContrCaseCompositePK(String contract, String caseNo, String mod){
		this.contract = contract;
		this.caseNo = caseNo;
		this.mod = mod;		
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ContrCaseCompositePK) && 
                 ((ContrCaseCompositePK) o).getContract().equals(this.contract) &&
                 ((ContrCaseCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((ContrCaseCompositePK) o).getMod().equals(this.mod) );
    }
	@Override
    public int hashCode() { 
        return contract.hashCode() + caseNo.hashCode() + mod.hashCode(); 
    }

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

}
