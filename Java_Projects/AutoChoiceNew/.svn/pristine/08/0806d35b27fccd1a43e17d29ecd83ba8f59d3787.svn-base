/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Arnel Macatula
 *
 */

import java.io.Serializable;


public class StdItmFedDTOCompositePK implements Serializable{
	protected int group_DUNS = 0;
	protected String std_Item = "";
	protected String option_Code = "";
	protected String model = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + group_DUNS;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((option_Code == null) ? 0 : option_Code.hashCode());
		result = prime * result + ((std_Item == null) ? 0 : std_Item.hashCode());
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
		StdItmFedDTOCompositePK other = (StdItmFedDTOCompositePK) obj;
		if (group_DUNS != other.group_DUNS)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (option_Code == null) {
			if (other.option_Code != null)
				return false;
		} else if (!option_Code.equals(other.option_Code))
			return false;
		if (std_Item == null) {
			if (other.std_Item != null)
				return false;
		} else if (!std_Item.equals(other.std_Item))
			return false;
		return true;
	}
	

	
		
}