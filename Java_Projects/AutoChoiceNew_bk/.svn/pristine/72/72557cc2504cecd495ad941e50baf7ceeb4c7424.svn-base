package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class OptionFileCompositePK implements Serializable{
	protected String caseNo;
	protected String option_Code;
	
	public OptionFileCompositePK(){
		
	}
	
	public OptionFileCompositePK(String caseNo, String option_Code){
		this.caseNo = caseNo;
		this.option_Code = option_Code;
	}

	@Override
	public boolean equals(Object o) { 
        return ((o instanceof OptionFileCompositePK) && 
                 ((OptionFileCompositePK) o).getCaseNo().equals(this.caseNo) &&
                 ((OptionFileCompositePK) o).getOption_Code().equals(this.option_Code));
    }
	@Override
    public int hashCode() { 
        return caseNo.hashCode() + option_Code.hashCode(); 
    }

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}
}
