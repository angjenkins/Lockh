package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class RequisitionsCartColorCompPK implements Serializable{
	protected int caseNo;
	protected String color_Code;
	
	public RequisitionsCartColorCompPK(){
		
	}
	
	public RequisitionsCartColorCompPK(int caseNo, String color_Code){
		this.caseNo = caseNo;
		this.color_Code = color_Code;
	}
	@Override
	public boolean equals(Object o) { 
        return ((o instanceof RequisitionsCartColorCompPK) && 
                 ((RequisitionsCartColorCompPK) o).getCaseNo() == this.caseNo) &&
                 ((RequisitionsCartColorCompPK) o).getColor_Code().equals(this.color_Code);
    }
	@Override
    public int hashCode() { 
        return caseNo + color_Code.hashCode(); 
    }

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getColor_Code() {
		return color_Code;
	}

	public void setColor_Code(String color_Code) {
		this.color_Code = color_Code;
	}
}
