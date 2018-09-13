/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

/**
 * @author Arnel Macatula
 *
 */
@Entity
@Table (name="states_zip")
@IdClass(StatesZipCompositePK.class)
@Component
public class StatesZipDTO {
	
	@Id
	@Length(max=2)
	@NotNull
	protected String state = "";
	
	@Id
	@Length(max=5)
	@NotNull
	protected String zip = "";
	@Id
	@Length(max=30)
	@NotNull
	protected String city_Name = "";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp dateLastUpdated;
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	public Timestamp getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Timestamp dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getCity_Name() {
		return city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	
}