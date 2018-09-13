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

/**
 * @author Arnel Macatula
 *
 */


/**
 * @author ArnelPMacatula
 *
 */
@Entity
@Table (name="groupduns_dealer_fran")
@IdClass(GroupDunsDealerFranCompositePK.class)


public class GroupDunsDealerFranDTO {

	@Id
	@NotEmpty(message="Group_DUNS  cannot be empty")
	@NotNull
	@Column(name="Group_DUNS")
	protected int groupDUNS = 0;
	@NotEmpty(message="Dealer_Code  cannot be empty")
	@NotNull
	@Column(name="Dealer_Code")
	protected String dealerCode = "";

	@NotNull
	@NotEmpty(message="Fran_Code  cannot be empty")
	@Column(name="Fran_Code")
	protected String franCode = "";

	public int getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(int groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public String getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public String getFranCode() {
		return franCode;
	}

	public void setFranCode(String franCode) {
		this.franCode = franCode;
	}


}

