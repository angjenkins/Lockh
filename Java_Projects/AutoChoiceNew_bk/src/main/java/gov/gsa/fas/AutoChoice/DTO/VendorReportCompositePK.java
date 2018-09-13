package gov.gsa.fas.AutoChoice.DTO;
import java.io.Serializable;


public class VendorReportCompositePK implements Serializable{

	
	protected int group_DUNS = 0;
	protected String contr_DUNS="";
	protected String report_Name="";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contr_DUNS == null) ? 0 : contr_DUNS.hashCode());
		result = prime * result + group_DUNS;
		result = prime * result
				+ ((report_Name == null) ? 0 : report_Name.hashCode());
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
		VendorReportCompositePK other = (VendorReportCompositePK) obj;
		if (contr_DUNS == null) {
			if (other.contr_DUNS != null)
				return false;
		} else if (!contr_DUNS.equals(other.contr_DUNS))
			return false;
		if (group_DUNS != other.group_DUNS)
			return false;
		if (report_Name == null) {
			if (other.report_Name != null)
				return false;
		} else if (!report_Name.equals(other.report_Name))
			return false;
		return true;
	}
	
}
