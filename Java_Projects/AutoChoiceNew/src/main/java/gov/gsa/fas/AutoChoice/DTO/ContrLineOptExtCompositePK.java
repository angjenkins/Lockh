package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ContrLineOptExtCompositePK implements Serializable{
	
	protected String Contract;
	protected String Sch_Line;
	protected String Option_Code;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Contract == null) ? 0 : Contract.hashCode());
		result = prime * result
				+ ((Option_Code == null) ? 0 : Option_Code.hashCode());
		result = prime * result
				+ ((Sch_Line == null) ? 0 : Sch_Line.hashCode());
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
		ContrLineOptExtCompositePK other = (ContrLineOptExtCompositePK) obj;
		if (Contract == null) {
			if (other.Contract != null)
				return false;
		} else if (!Contract.equals(other.Contract))
			return false;
		if (Option_Code == null) {
			if (other.Option_Code != null)
				return false;
		} else if (!Option_Code.equals(other.Option_Code))
			return false;
		if (Sch_Line == null) {
			if (other.Sch_Line != null)
				return false;
		} else if (!Sch_Line.equals(other.Sch_Line))
			return false;
		return true;
	}
	
}
