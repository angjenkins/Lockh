package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ModelGroupdunsCompositePK implements Serializable{
	protected String model = "";
	protected int groupDUNS = 0;
	protected String franCode = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((franCode == null) ? 0 : franCode.hashCode());
		result = prime * result + groupDUNS;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		ModelGroupdunsCompositePK other = (ModelGroupdunsCompositePK) obj;
		if (franCode == null) {
			if (other.franCode != null)
				return false;
		} else if (!franCode.equals(other.franCode))
			return false;
		if (groupDUNS != other.groupDUNS)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
