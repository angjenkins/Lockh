package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="section_table")
public class SectionTableDTO {
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Section cannot be empty")
	@Column(name="Section")
	protected String section = "";
	
	@Length(max=30)
	@NotNull
	@Column(name="Sec_Name")
	protected String sectionName = "";
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated;
	
	@Column(name="Date_Upte")
	protected Timestamp updatedDate;
	
	@Length(max=1)
	@Column(name="Division")
	protected String division;
	
	@Length(max=2)
	@Column(name="Buyer_Code")
	protected String buyerCode;
	
	@Length(max=1)
	@Column(name="Sec_Code")
	protected String sectionCode;
	
	@Length(max=20)
	@NotNull
	@Column(name="User_Certifier")
	protected String userCertifier = "";
	
	@NotNull
	@Length(max=20)
	@Column(name="Certify_By")
	protected String certifyBy;
	
	@Column(name="Certify_Dt")
	protected Timestamp certifyDate;
	
	@Length(max=20)
	@NotNull
	@Column(name="Prv_Certify_By")
	protected String prevCertifyBy = "";
	
	@Column(name="Prv_Certify_Dt")
	protected Timestamp prevCertifyDate;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public String getUserCertifier() {
		return userCertifier;
	}

	public void setUserCertifier(String userCertifier) {
		this.userCertifier = userCertifier;
	}

	public String getCertifyBy() {
		return certifyBy;
	}

	public void setCertifyBy(String certifyBy) {
		this.certifyBy = certifyBy;
	}

	public Timestamp getCertifyDate() {
		return certifyDate;
	}

	public void setCertifyDate(Timestamp certifyDate) {
		this.certifyDate = certifyDate;
	}

	public String getPrevCertifyBy() {
		return prevCertifyBy;
	}

	public void setPrevCertifyBy(String prevCertifyBy) {
		this.prevCertifyBy = prevCertifyBy;
	}

	public Timestamp getPrevCertifyDate() {
		return prevCertifyDate;
	}

	public void setPrevCertifyDate(Timestamp prevCertifyDate) {
		this.prevCertifyDate = prevCertifyDate;
	}

}
