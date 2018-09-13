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

import java.sql.Timestamp;

@Entity
@IdClass(ModelCompositePK.class)
@Table (name="Model")

public class ModelDTO {

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
	protected String stdItem = "";
	  	
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
	  	
 	@NotNull
	@Length(max=150)
	@Column(name="URL")					// `URL` char(150)
	protected String url = "";
 	
 	@NotNull
	@Length(max=1)
	@Column(name="Flag_Next_Year")					// `// `Flag_Next_Year` char(1) 
	protected String flagNextYear = "";

 	@Transient
 	protected String Sch_Line = "";
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFlagNextYear() {
		return flagNextYear;
	}

	public void setFlagNextYear(String flagNextYear) {
		this.flagNextYear = flagNextYear;
	}

	public String getSch_Line() {
		return Sch_Line;
	}

	public void setSch_Line(String sch_Line) {
		Sch_Line = sch_Line;
	}
} 

