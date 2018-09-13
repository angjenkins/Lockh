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
import org.springframework.stereotype.Component;

@Entity
@IdClass(RequisitionsCartColorCompPK.class)
@Table (name="requisitions_cart_color")
@Component
public class RequisitionsCartColorDTO {
	
	@Id
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected int caseNo;
	
	@Id
	@Length(max=10)
	@NotNull
	@NotEmpty(message="Color Code cannot be empty")
	protected String color_Code = "";
	
	@NotNull
	@Column(name="Quantity")
	protected double quantity = 0;
	
	@Length(max=12)
	@NotNull
	@Column(name="Created_By")
	protected String createdBy = "user";
	
	@Column(name="Date_Created")
	protected Timestamp createdDate;

	public int getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}


	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getColor_Code() {
		return color_Code;
	}

	public void setColor_Code(String color_Code) {
		this.color_Code = color_Code;
	}

}
