package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

import java.sql.Timestamp;

@Entity
//@IdClass(ModelGroupdunsCompositePK.class)
@Table (name="Model_Groupduns")

public class ModelGroupdunsDTO {

  	@Id
	@NotEmpty(message="Model cannot be empty")
	@NotNull
	@Length(max=10)
	@Column(name="Model")				// `Model` char(10) NOT NULL,
  	protected String model = "";
  	
	@NotNull
	@Length(max=30)
	@Column(name="Description")			// `Description` char(30) NOT NULL DEFAULT '',
	protected String description = "";

 	@NotNull
	@Length(max=20)
	@Column(name="Created_By")			// `Created_By` char(20) NOT NULL DEFAULT '',
	protected String createdBy = "";

  	@Column(name="Date_Created")		// `Date_Created` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
	protected Timestamp dateCreated ;

	@NotEmpty
	@Column(name="Group_DUNS")			// `Group_DUNS` int(10) DEFAULT NULL,
	protected int groupDUNS = 0;

  	@NotEmpty(message="Fran_Code cannot be empty")
	@Length(max=10)
	@Column(name="Fran_Code")			// `Fran_Code` char(10) NOT NULL DEFAULT '',
	protected String franCode = "";

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public int getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(int groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public String getFranCode() {
		return franCode;
	}

	public void setFranCode(String franCode) {
		this.franCode = franCode;
	}

} 

