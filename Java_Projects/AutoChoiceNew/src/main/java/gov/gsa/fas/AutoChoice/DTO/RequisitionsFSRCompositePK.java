package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class RequisitionsFSRCompositePK implements Serializable{
	protected String caseNo;
	protected int fSR_Key;
	
	public RequisitionsFSRCompositePK(){
		
	}
	
	public RequisitionsFSRCompositePK(String caseNo, int fSR_Key){
		this.caseNo = caseNo;
		this.fSR_Key = fSR_Key;
	}
	
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof RequisitionsFSRCompositePK) && 
                 ((RequisitionsFSRCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((RequisitionsFSRCompositePK) o).getfSR_Key() == this.fSR_Key);
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + fSR_Key; 
    }

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public int getfSR_Key() {
		return fSR_Key;
	}

	public void setfSR_Key(int fSR_Key) {
		this.fSR_Key = fSR_Key;
	}
}
