package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ModelCompositePK implements Serializable{
	protected String model = "";
	protected String stdItem = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((stdItem == null) ? 0 : stdItem.hashCode());
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
		ModelCompositePK other = (ModelCompositePK) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (stdItem == null) {
			if (other.stdItem != null)
				return false;
		} else if (!stdItem.equals(other.stdItem))
			return false;
		return true;
	}

}
