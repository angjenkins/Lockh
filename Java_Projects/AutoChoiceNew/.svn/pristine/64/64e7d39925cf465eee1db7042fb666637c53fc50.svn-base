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
import org.springframework.stereotype.Component;

/**
 * @author Arnel Macatula
 *
 */


/**
 * @author ArnelPMacatula
 *
 */
@Entity
@Table (name="groupduns_dealer_loc")
@IdClass(GroupDunsDealerLocCompositePK.class)
@Component

public class GroupDunsDealerLocDTO {

	@Id
	@NotEmpty(message="Group_DUNS  cannot be empty")
	@NotNull
	protected int group_DUNS = 0;
	@Id
	@NotEmpty(message="Dealer_Code  cannot be empty")
	@NotNull
	protected String dealer_Code = "";
	
	@Column(name="Dealer_Name")
	protected String dealerName = "";

	@Column(name="Street")
	protected String street = "";
	
	@Column(name="City")
	protected String city = "";

	@Column(name="State")
	protected String state = "";
	
	@Column(name="Country")
	protected String country = "";

	@Column(name="ZipCode")
	protected String zipCode = "";

	@Column(name="Telephone")
	protected String telephone = "";
	
	@Column(name="Zone")
	protected String zone = "";
	
	@Column(name="FaxNo")
	protected String faxNo = "";

	public int getGroup_DUNS() {
		return group_DUNS;
	}

	public void setGroup_DUNS(int group_DUNS) {
		this.group_DUNS = group_DUNS;
	}

	public String getDealer_Code() {
		return dealer_Code;
	}

	public void setDealer_Code(String dealer_Code) {
		this.dealer_Code = dealer_Code;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
		
}

