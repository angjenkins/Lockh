package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@IdClass(OptionFileCompositePK.class)
@Table (name="option_file")
public class OptionFileDTO {
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNo = "";
	
	@Id
	@Length(max=4)
	@NotNull
	@NotEmpty(message="Option code cannot be empty")
	protected String option_Code = "";
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated;
	
	@Length(max=1)
	@Column(name="Flag")
	protected String flag="Y";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdateDate;
	
	@Column(name="Qty")
	protected int qty = 1;
	
	@Column(name="UPrice")
	protected double uPrice = 0.00;

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getOption_Code() {
		return option_Code;
	}

	public void setOption_Code(String option_Code) {
		this.option_Code = option_Code;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getuPrice() {
		return uPrice;
	}

	public void setuPrice(double uPrice) {
		this.uPrice = uPrice;
	}
}
