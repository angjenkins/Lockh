package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@IdClass(ModelColorCompositePK.class)
@Table (name="Model_Color")
@Component
public class ModelColorDTO {

  	@Id
	@NotEmpty(message="Model cannot be empty")
	@NotNull
	@Length(max=10)
	@Column(name="Model")				// `Model` char(10) NOT NULL,
  	protected String model = "";
  	
  	@Id
  	@NotEmpty(message="Std.Item cannot be empty")
	@NotNull
	@Length(max=4)
	@Column(name="Std_Item")			// `Std_Item` varchar(4) NOT NULL,
	protected String std_Item = "";

  	@Id
  	@NotEmpty(message="Color cannot be empty")
	@NotNull
	@Length(max=10)
	@Column(name="Color_Code")			// `Color_Code` char(10) NOT NULL DEFAULT '',
	protected String color_Code = "";

	@NotNull
	@Length(max=30)
	@Column(name="Description")			// `Description` char(30) NOT NULL DEFAULT '',
	protected String description = "";
	  	
 	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")		// `User_Updated` char(20) NOT NULL DEFAULT '',
	protected String userUpdated = "";
	  	
  	@Column(name="Date_Created")		// `Date_Created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
	protected Timestamp dateCreated ;
	  	
 	@NotNull
	@Length(max=10)
	@Column(name="Created_By")			// `Created_By` char(20) NOT NULL DEFAULT '',
	protected String createdBy = "";

	
 	@Transient
	protected String  editFlag = "";
	
 	@Transient
 	protected String copyFlag="";
 	@Transient
 	protected String delFlag="";
 	@Transient
 	protected String oldColorCode="";
 	@Transient
 	protected String oldDescription="";
 	
	@Transient
 	protected int quantity=0;
 	
 	
 	
 	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStd_Item() {
		return std_Item;
	}

	public void setStd_Item(String std_Item) {
		this.std_Item = std_Item;
	}

	public String getColor_Code() {
		return color_Code;
	}

	public void setColor_Code(String color_Code) {
		this.color_Code = color_Code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getCopyFlag() {
		return copyFlag;
	}

	public void setCopyFlag(String copyFlag) {
		this.copyFlag = copyFlag;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getOldColorCode() {
		return oldColorCode;
	}

	public void setOldColorCode(String oldColorCode) {
		this.oldColorCode = oldColorCode;
	}

	public String getOldDescription() {
		return oldDescription;
	}

	public void setOldDescription(String oldDescription) {
		this.oldDescription = oldDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
} 


