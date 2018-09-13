/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;


/**
 * @author Arnel Macatula
 *
 */

import java.io.Serializable;
public class GroupDunsBaseCompositePk implements Serializable{
	
	protected int Group_DUNS = 0;
	protected int GROUP_DUNS_BASE = 0;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + GROUP_DUNS_BASE;
		result = prime * result + Group_DUNS;
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
		GroupDunsBaseCompositePk other = (GroupDunsBaseCompositePk) obj;
		if (GROUP_DUNS_BASE != other.GROUP_DUNS_BASE)
			return false;
		if (Group_DUNS != other.Group_DUNS)
			return false;
		return true;
	}

		
}

