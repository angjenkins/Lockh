package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;
	
public class AgBuTableCompositePK implements Serializable{
	protected String agency_Code;
	protected String bureau_Code;
	
	public AgBuTableCompositePK(){
	}
	
	public AgBuTableCompositePK(String agency_Code, String bureau_Code){
		this.agency_Code = agency_Code;
		this.bureau_Code = bureau_Code;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof AgBuTableCompositePK) && 
                 ((AgBuTableCompositePK) o).getAgency_Code().equals(this.agency_Code) &&
                 ((AgBuTableCompositePK) o).getBureau_Code().equals(this.bureau_Code));
    }
	@Override
    public int hashCode() { 
        return agency_Code.hashCode() + bureau_Code.hashCode(); 
    }

	public String getAgency_Code() {
		return agency_Code;
	}

	public void setAgency_Code(String agency_Code) {
		this.agency_Code = agency_Code;
	}

	public String getBureau_Code() {
		return bureau_Code;
	}

	public void setBureau_Code(String bureau_Code) {
		this.bureau_Code = bureau_Code;
	}
	
	
}
