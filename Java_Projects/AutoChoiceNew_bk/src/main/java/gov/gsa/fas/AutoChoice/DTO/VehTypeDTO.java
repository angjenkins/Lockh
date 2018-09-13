/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

/**
 * @author Arnel Macatula
 *
 */


@Entity
@Table (name="veh_type")
@Component
public class VehTypeDTO {
	@Id
	@NotNull
	@Length(max=2)
	@Column(name="Veh_Type")
	protected String vehType = "";
	@Column(name="Description")
	protected String description = "";
	@Column(name="Status")
	protected String status = "";
	@Column(name="Division")
	protected String division = "";
	@Column(name="Open_for_Internet")
	protected String openForInternet = "";
	@Column(name="GROUP_VEH_TYPE")
	protected String groupVehType = "";
	
	@Column(name="GROUP_DESCRIPTION")
	protected String groupDescription = "";
	@Column(name="Dealer_Flg")
	protected String dealerFlg = "";
	public String getVehType() {
		return vehType;
	}
	public void setVehType(String vehType) {
		this.vehType = vehType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getOpenForInternet() {
		return openForInternet;
	}
	public void setOpenForInternet(String openForInternet) {
		this.openForInternet = openForInternet;
	}
	public String getGroupVehType() {
		return groupVehType;
	}
	public void setGroupVehType(String groupVehType) {
		this.groupVehType = groupVehType;
	}
	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	public String getDealerFlg() {
		return dealerFlg;
	}
	public void setDealerFlg(String dealerFlg) {
		this.dealerFlg = dealerFlg;
	}
	
	

	
}