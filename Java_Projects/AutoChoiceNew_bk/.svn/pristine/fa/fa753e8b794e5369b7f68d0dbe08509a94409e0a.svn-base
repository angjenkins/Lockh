package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrGroupCompositePK implements Serializable{
	
	private String contract;
	private String group_No;
	private String subgroup_No;
	
	public ContrGroupCompositePK(){
		
	}
	
	public ContrGroupCompositePK(String contract, String group_No, String subgroup_No){
		this.contract = contract;
		this.group_No = group_No;
		this.subgroup_No = subgroup_No;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof ContrGroupCompositePK) && 
                 ((ContrGroupCompositePK) o).getContract().equals(this.contract) &&
                 ((ContrGroupCompositePK) o).getGroup_No().equals(this.group_No) &&
                 ((ContrGroupCompositePK) o).getSubgroup_No().equals(this.subgroup_No));
    }
	@Override
    public int hashCode() { 
        return contract.hashCode() + group_No.hashCode() + subgroup_No.hashCode() ; 
    }

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getGroup_No() {
		return group_No;
	}

	public void setGroup_No(String group_No) {
		this.group_No = group_No;
	}

	public String getSubgroup_No() {
		return subgroup_No;
	}

	public void setSubgroup_No(String subgroup_No) {
		this.subgroup_No = subgroup_No;
	}

}
