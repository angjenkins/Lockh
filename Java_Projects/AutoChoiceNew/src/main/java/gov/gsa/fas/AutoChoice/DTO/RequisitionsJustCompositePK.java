package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class RequisitionsJustCompositePK implements Serializable{
	protected int caseNo;
	protected String caseNo_Real;
	
	public 	RequisitionsJustCompositePK(){
		
	}
	
	public 	RequisitionsJustCompositePK(int caseNo, String caseNo_Real){
		this.caseNo = caseNo;
		this.caseNo_Real = caseNo_Real;
	}

	@Override
	public boolean equals(Object o) { 
        return ((o instanceof RequisitionsJustCompositePK) && 
                 ((RequisitionsJustCompositePK) o).getCaseNo() == this.caseNo) &&
                 ((RequisitionsJustCompositePK) o).getCaseNo_Real().equals(this.caseNo_Real);
    }
	@Override
    public int hashCode() { 
        return caseNo + caseNo_Real.hashCode(); 
    }

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseNo_Real() {
		return caseNo_Real;
	}

	public void setCaseNo_Real(String caseNo_Real) {
		this.caseNo_Real = caseNo_Real;
	}
}
