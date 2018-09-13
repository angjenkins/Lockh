/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
/**
 * @author Arnel Macatula
 *
 */


/**
 * @author ArnelPMacatula
 *
 */
@Entity
@Table (name="Group_DUNS_Base")
@IdClass(GroupDunsBaseCompositePk.class)
public class GroupDunsBaseDTO {

	@Id
	@NotEmpty(message="Group_DUNS  cannot be empty")
	@NotNull
	@Column(name="Group_DUNS")
	protected int Group_DUNS = 0;

	@Id
	@NotEmpty(message="GROUP_DUNS_BASE cannot be empty")
	@NotNull
	@Column(name="GROUP_DUNS_BASE")
	protected int GROUP_DUNS_BASE = 0;

	
	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated = null;
	
	
	@Column(name="User_Updated")
	protected String userUpdated = "";

	@Column(name="Date_Created")
	protected Timestamp dateCreated = null;

	

	public int getGroup_DUNS() {
		return Group_DUNS;
	}

	public void setGroup_DUNS(int group_DUNS) {
		Group_DUNS = group_DUNS;
	}

	public int getGROUP_DUNS_BASE() {
		return GROUP_DUNS_BASE;
	}

	public void setGROUP_DUNS_BASE(int gROUP_DUNS_BASE) {
		GROUP_DUNS_BASE = gROUP_DUNS_BASE;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	
	
}

