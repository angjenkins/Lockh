package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

public class ModelColorBidCompositePK implements Serializable {
	protected String model = "";
	protected String std_Item = "";
	protected String color_Code = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((color_Code == null) ? 0 : color_Code.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((std_Item == null) ? 0 : std_Item.hashCode());
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
		ModelColorBidCompositePK other = (ModelColorBidCompositePK) obj;
		if (color_Code == null) {
			if (other.color_Code != null)
				return false;
		} else if (!color_Code.equals(other.color_Code))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (std_Item == null) {
			if (other.std_Item != null)
				return false;
		} else if (!std_Item.equals(other.std_Item))
			return false;
		return true;
	}
	
	
}
