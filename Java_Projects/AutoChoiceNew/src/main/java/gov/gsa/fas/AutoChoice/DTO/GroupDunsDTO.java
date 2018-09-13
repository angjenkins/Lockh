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

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import java.sql.Timestamp;
/**
 * @author Arnel Macatula
 *
 */


@Entity
@Table (name="Group_DUNS")
@IdClass(GroupDunsCompositePk.class)
public class GroupDunsDTO {
	
	@Id
	@NotEmpty(message="Group_DUNS  cannot be empty")
	@NotNull
	//@Column(name="Group_DUNS")
	protected int group_DUNS = 0;

	@Id
	@NotEmpty(message="GROUP_DUNS_BASE cannot be empty")
	@NotNull
	//@Column(name="GROUP_DUNS_BASE")
	protected int GROUP_DUNS_BASE = 0;

	
	@NotEmpty(message="Manufacturer_Name  cannot be empty")
	@NotNull
	@Length(max=30)
	@Column(name="Manufacturer_Name")
	protected String manufacturerName = "";
	
	
	@Column(name="Date_Updated")
	protected Timestamp dateUpdated = null;
	
	
	@Column(name="User_Updated")
	protected String userUpdated = "";

	@Column(name="Date_Created")
	protected Timestamp dateCreated = null;

	
	@NotEmpty(message="Sol_No_3  cannot be empty")
	@NotNull
	@Length(max=2)
	@Column(name="UserID")
	protected String userID = "";

	@Column(name="Password")
	protected String password = "";

	@Column(name="Email")
	protected String email = "";

	@Column(name="Telphone")
	protected String telphone = "";

	@Column(name="DateLastVisited")
	protected Timestamp dateLastVisited = null;

	
	@Column(name="Flag_AutoStd")
	protected String flagAutoStd = "";

	@Column(name="Flag_AutoBid")
	protected String flagAutoBid= "";

	@Column(name="DateReOpenAutoS")
	protected Timestamp dateReOpenAutoS = null;


	@Column(name="GROUP_TYPE")
	protected String groupType = "";

	public int getGROUP_DUNS_BASE() {
		return GROUP_DUNS_BASE;
	}


	public void setGROUP_DUNS_BASE(int gROUP_DUNS_BASE) {
		GROUP_DUNS_BASE = gROUP_DUNS_BASE;
	}


	public String getManufacturerName() {
		return manufacturerName;
	}


	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
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


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelphone() {
		return telphone;
	}


	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}


	public Timestamp getDateLastVisited() {
		return dateLastVisited;
	}


	public void setDateLastVisited(Timestamp dateLastVisited) {
		this.dateLastVisited = dateLastVisited;
	}


	public String getFlagAutoStd() {
		return flagAutoStd;
	}


	public void setFlagAutoStd(String flagAutoStd) {
		this.flagAutoStd = flagAutoStd;
	}


	public String getFlagAutoBid() {
		return flagAutoBid;
	}


	public void setFlagAutoBid(String flagAutoBid) {
		this.flagAutoBid = flagAutoBid;
	}


	public Timestamp getDateReOpenAutoS() {
		return dateReOpenAutoS;
	}


	public void setDateReOpenAutoS(Timestamp dateReOpenAutoS) {
		this.dateReOpenAutoS = dateReOpenAutoS;
	}


	public String getGroupType() {
		return groupType;
	}


	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}


	public int getGroup_DUNS() {
		return group_DUNS;
	}


	public void setGroup_DUNS(int group_DUNS) {
		this.group_DUNS = group_DUNS;
	}
	
	
		
}

