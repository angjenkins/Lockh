/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;


import java.io.Serializable;
/**
 * @author Arnel Macatula
 *
 */


public class BidLineOptNewCompositePK  implements Serializable {
	

	protected String Sol_No_1 = "";
	protected String Sol_No_2 = "";
	protected String Sol_No_3 = "";
	protected String Contr_DUNS = "";
	protected String Contract = "";
	protected String Sch_Line = "";
	protected String Option_Code = "";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Contr_DUNS == null) ? 0 : Contr_DUNS.hashCode());
		result = prime * result
				+ ((Contract == null) ? 0 : Contract.hashCode());
		result = prime * result
				+ ((Option_Code == null) ? 0 : Option_Code.hashCode());
		result = prime * result
				+ ((Sch_Line == null) ? 0 : Sch_Line.hashCode());
		result = prime * result
				+ ((Sol_No_1 == null) ? 0 : Sol_No_1.hashCode());
		result = prime * result
				+ ((Sol_No_2 == null) ? 0 : Sol_No_2.hashCode());
		result = prime * result
				+ ((Sol_No_3 == null) ? 0 : Sol_No_3.hashCode());
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
		BidLineOptNewCompositePK other = (BidLineOptNewCompositePK) obj;
		if (Contr_DUNS == null) {
			if (other.Contr_DUNS != null)
				return false;
		} else if (!Contr_DUNS.equals(other.Contr_DUNS))
			return false;
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
		if (Sol_No_1 == null) {
			if (other.Sol_No_1 != null)
				return false;
		} else if (!Sol_No_1.equals(other.Sol_No_1))
			return false;
		if (Sol_No_2 == null) {
			if (other.Sol_No_2 != null)
				return false;
		} else if (!Sol_No_2.equals(other.Sol_No_2))
			return false;
		if (Sol_No_3 == null) {
			if (other.Sol_No_3 != null)
				return false;
		} else if (!Sol_No_3.equals(other.Sol_No_3))
			return false;
		return true;
	}
	
	
}

