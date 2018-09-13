/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;





/**
 * @author Arnel Macatula
 *
 */
import java.io.Serializable;


public class BidLinePictureCompositePK implements Serializable{
	protected String Sol_No_1 = "";
	protected String Sol_No_2 = "";
	protected String Sol_No_3 = "";
	protected String Contract = "";
	protected String Sch_Line = "";
	protected int Sequence = 0;
	protected int FY = 0;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Contract == null) ? 0 : Contract.hashCode());
		result = prime * result + FY;
		result = prime * result
				+ ((Sch_Line == null) ? 0 : Sch_Line.hashCode());
		result = prime * result + Sequence;
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
		BidLinePictureCompositePK other = (BidLinePictureCompositePK) obj;
		if (Contract == null) {
			if (other.Contract != null)
				return false;
		} else if (!Contract.equals(other.Contract))
			return false;
		if (FY != other.FY)
			return false;
		if (Sch_Line == null) {
			if (other.Sch_Line != null)
				return false;
		} else if (!Sch_Line.equals(other.Sch_Line))
			return false;
		if (Sequence != other.Sequence)
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

