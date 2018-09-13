package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@IdClass(OptionFileCartCompositePK.class)
@Table (name="option_file_cart")
@Component
public class OptionFileCartDTO {
	
	@Id
	@NotNull
	protected int caseNo;
	
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
	protected String flag;  //validQty  flag
	
	@Column(name="Qty")
	protected int qty;
	
	@Transient
	protected String validQty = "";

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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getValidQty() {
		return validQty;
	}

	public void setValidQty(String validQty) {
		this.validQty = validQty;
	}

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}


}
