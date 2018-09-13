package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;


public class OptionTableValueCompositePK implements Serializable{

	protected String option_Code = "";

   	protected Integer sequence;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((option_Code == null) ? 0 : option_Code.hashCode());
		result = prime * result
				+ ((sequence == null) ? 0 : sequence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionTableValueCompositePK other = (OptionTableValueCompositePK) obj;
		if (option_Code == null) {
			if (other.option_Code != null)
				return false;
		} else if (!option_Code.equals(other.option_Code))
			return false;
		if (sequence == null) {
			if (other.sequence != null)
				return false;
		} else if (!sequence.equals(other.sequence))
			return false;
		return true;
	}

	
  	
}

