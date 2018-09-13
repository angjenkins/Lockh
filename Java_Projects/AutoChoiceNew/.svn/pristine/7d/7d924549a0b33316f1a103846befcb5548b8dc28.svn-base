package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class OptionFileCartCompositePK implements Serializable{
	protected int caseNo;
	protected String option_Code;
	
	public OptionFileCartCompositePK(){
		
	}
	
	public OptionFileCartCompositePK(int caseNo, String option_Code){
		this.caseNo = caseNo;
		this.option_Code = option_Code;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionFileCartCompositePK other = (OptionFileCartCompositePK) obj;
		if (caseNo != other.caseNo)
			return false;
		if (option_Code == null) {
			if (other.option_Code != null)
				return false;
		} else if (!option_Code.equals(other.option_Code))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caseNo;
		result = prime * result
				+ ((option_Code == null) ? 0 : option_Code.hashCode());
		return result;
	}

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}
}
