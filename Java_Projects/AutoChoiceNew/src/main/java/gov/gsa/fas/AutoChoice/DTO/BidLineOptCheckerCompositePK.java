/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

/**
 * @author Arnel Macatula
 *
 */

import java.io.Serializable;

import javax.persistence.Column;

public class BidLineOptCheckerCompositePK implements Serializable{
	
	protected String sol_No_1 = "";
	protected String sol_No_2 = "";
	protected String sol_No_3 = "";
	protected String contr_DUNS = "";
	protected String contract = "";
	protected String sch_Line = "";
	protected String option_Code = "";
	protected String checker_Type = "";
	protected int  sequence = 0;
	protected String option_Checked = "";
	protected String user_Updated ="";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contr_DUNS == null) ? 0 : contr_DUNS.hashCode());
		result = prime * result
				+ ((contract == null) ? 0 : contract.hashCode());
		result = prime * result
				+ ((sch_Line == null) ? 0 : sch_Line.hashCode());
		result = prime * result
				+ ((sol_No_1 == null) ? 0 : sol_No_1.hashCode());
		result = prime * result
				+ ((sol_No_2 == null) ? 0 : sol_No_2.hashCode());
		result = prime * result
				+ ((sol_No_3 == null) ? 0 : sol_No_3.hashCode());
		result = prime * result
				+ ((checker_Type == null) ? 0 : checker_Type.hashCode());
		result = prime * result
				+ ((option_Checked == null) ? 0 : option_Checked.hashCode());
		result = prime * result
				+ ((option_Code == null) ? 0 : option_Code.hashCode());
		result = prime * result + sequence;
		result = prime * result
				+ ((user_Updated == null) ? 0 : user_Updated.hashCode());
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
		BidLineOptCheckerCompositePK other = (BidLineOptCheckerCompositePK) obj;
		if (contr_DUNS == null) {
			if (other.contr_DUNS != null)
				return false;
		} else if (!contr_DUNS.equals(other.contr_DUNS))
			return false;
		if (contract == null) {
			if (other.contract != null)
				return false;
		} else if (!contract.equals(other.contract))
			return false;
		if (sch_Line == null) {
			if (other.sch_Line != null)
				return false;
		} else if (!sch_Line.equals(other.sch_Line))
			return false;
		if (sol_No_1 == null) {
			if (other.sol_No_1 != null)
				return false;
		} else if (!sol_No_1.equals(other.sol_No_1))
			return false;
		if (sol_No_2 == null) {
			if (other.sol_No_2 != null)
				return false;
		} else if (!sol_No_2.equals(other.sol_No_2))
			return false;
		if (sol_No_3 == null) {
			if (other.sol_No_3 != null)
				return false;
		} else if (!sol_No_3.equals(other.sol_No_3))
			return false;
		if (checker_Type == null) {
			if (other.checker_Type != null)
				return false;
		} else if (!checker_Type.equals(other.checker_Type))
			return false;
		if (option_Checked == null) {
			if (other.option_Checked != null)
				return false;
		} else if (!option_Checked.equals(other.option_Checked))
			return false;
		if (option_Code == null) {
			if (other.option_Code != null)
				return false;
		} else if (!option_Code.equals(other.option_Code))
			return false;
		if (sequence != other.sequence)
			return false;
		if (user_Updated == null) {
			if (other.user_Updated != null)
				return false;
		} else if (!user_Updated.equals(other.user_Updated))
			return false;
		return true;
	}
	
	
		
	
	
}