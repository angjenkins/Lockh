package gov.gsa.fas.AutoChoice.DTO;


import java.io.Serializable;

public class UserGroupAccessCompositePk implements Serializable{
	
	protected String agency_Code= "";
	protected String bureau_Code = "";
	protected String group_Code;
	protected String user_Id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agency_Code == null) ? 0 : agency_Code.hashCode());
		result = prime * result
				+ ((bureau_Code == null) ? 0 : bureau_Code.hashCode());
		result = prime * result
				+ ((group_Code == null) ? 0 : group_Code.hashCode());
		result = prime * result + ((user_Id == null) ? 0 : user_Id.hashCode());
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
		UserGroupAccessCompositePk other = (UserGroupAccessCompositePk) obj;
		if (agency_Code == null) {
			if (other.agency_Code != null)
				return false;
		} else if (!agency_Code.equals(other.agency_Code))
			return false;
		if (bureau_Code == null) {
			if (other.bureau_Code != null)
				return false;
		} else if (!bureau_Code.equals(other.bureau_Code))
			return false;
		if (group_Code == null) {
			if (other.group_Code != null)
				return false;
		} else if (!group_Code.equals(other.group_Code))
			return false;
		if (user_Id == null) {
			if (other.user_Id != null)
				return false;
		} else if (!user_Id.equals(other.user_Id))
			return false;
		return true;
	}
}
