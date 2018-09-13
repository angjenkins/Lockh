package gov.gsa.fas.AutoChoice.DTO;

import java.math.BigInteger;
import java.io.Serializable;

import java.io.Serializable;

public class StdItemVerbiageCompositePK  implements Serializable{
	protected String Std_Item;
	protected String Flag_Current;
	protected BigInteger Line_Number;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Flag_Current == null) ? 0 : Flag_Current.hashCode());
		result = prime * result
				+ ((Line_Number == null) ? 0 : Line_Number.hashCode());
		result = prime * result
				+ ((Std_Item == null) ? 0 : Std_Item.hashCode());
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
		StdItemVerbiageCompositePK other = (StdItemVerbiageCompositePK) obj;
		if (Flag_Current == null) {
			if (other.Flag_Current != null)
				return false;
		} else if (!Flag_Current.equals(other.Flag_Current))
			return false;
		if (Line_Number == null) {
			if (other.Line_Number != null)
				return false;
		} else if (!Line_Number.equals(other.Line_Number))
			return false;
		if (Std_Item == null) {
			if (other.Std_Item != null)
				return false;
		} else if (!Std_Item.equals(other.Std_Item))
			return false;
		return true;
	}
	
	

}
