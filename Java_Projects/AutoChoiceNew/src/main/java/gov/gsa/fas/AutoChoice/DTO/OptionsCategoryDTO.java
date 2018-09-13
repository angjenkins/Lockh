package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Entity
@Table (name="options_category")
@Component
//@IdClass(OptionTableValueCompositePK.class)

public class OptionsCategoryDTO {

  	@Id
	@NotEmpty(message="Category cannot be empty")
	@NotNull
	@Length(max=10)
	@Column(name="Category_Code")					// `Category_Code` char(10) NOT NULL,
	protected String categoryCode = "";

	@NotEmpty(message="Category Name cannot be empty")
	@NotNull
	@Length(max=30)
	@Column(name="Category_Name")					// `Category_Name` char(30) NOT NULL DEFAULT '',
	protected String categoryName = "";

	@Column(name="Date_Created")					// `Date_Created` datetime DEFAULT NULL,
	protected Timestamp dateCreated;

	@NotEmpty(message="Created_By")
	@NotNull
	@Length(max=15)
	@Column(name="Created_By")						// `Created_By` char(15) NOT NULL DEFAULT '',
	protected String createdBy = "";

	@Column(name="Date_Last_Updated")				// `Date_Last_Updated` datetime DEFAULT NULL,
	protected Timestamp dateLastUpdated;

	@NotEmpty(message="User_Updated")
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")					// `User_Updated` char(20) NOT NULL,
	protected String userUpdated;

	@NotEmpty(message="Selection_Type cannot be empty")
	@NotNull
	@Length(max=1)
	@Column(name="Selection_Type")					// `Selection_Type` char(1) NOT NULL DEFAULT 'M',
	protected String selectionType;

	@Column(name="Sequence")						// `Sequence` decimal(5,0) DEFAULT NULL,
	protected Integer sequence;

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public String getSelectionType() {
		return selectionType;
	}

	public void setSelectionType(String selectionType) {
		this.selectionType = selectionType;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	
	
}

