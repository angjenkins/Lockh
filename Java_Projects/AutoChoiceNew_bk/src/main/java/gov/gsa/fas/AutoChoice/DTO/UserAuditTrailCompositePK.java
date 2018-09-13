package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import java.io.Serializable;

public class UserAuditTrailCompositePK implements Serializable{
	
	protected long caseNo= 0;
	protected String user_Id = "";
	protected Timestamp date_Modified;
	
	public UserAuditTrailCompositePK(){
		
	}
	
	public UserAuditTrailCompositePK(long caseNo, String user_Id, Timestamp date_Modified){
		this.caseNo = caseNo;
		this.user_Id = user_Id;
		this.date_Modified = date_Modified;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (caseNo ^ (caseNo >>> 32));
		result = prime * result
				+ ((date_Modified == null) ? 0 : date_Modified.hashCode());
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
		UserAuditTrailCompositePK other = (UserAuditTrailCompositePK) obj;
		if (caseNo != other.caseNo)
			return false;
		if (date_Modified == null) {
			if (other.date_Modified != null)
				return false;
		} else if (!date_Modified.equals(other.date_Modified))
			return false;
		if (user_Id == null) {
			if (other.user_Id != null)
				return false;
		} else if (!user_Id.equals(other.user_Id))
			return false;
		return true;
	}
	
	
	
}
