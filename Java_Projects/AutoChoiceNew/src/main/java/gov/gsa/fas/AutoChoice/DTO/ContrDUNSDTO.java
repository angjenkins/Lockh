package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;


@Entity
@Table (name="contrduns")
//@IdClass(ContrDUNSCompositePK.class)
public class ContrDUNSDTO {
	
	/**
	 * 
	 */
	@Id
	@Length(max=9)
	@NotNull
	@NotEmpty(message="Contr_DUNS cannot be empty")
	@Column(name="Contr_DUNS")
	protected String contrDUNS = "";
	
	@Length(max=35)
	//@NotNull
	@Column(name="Contr_Full_Name")
	protected String contrFullName = "";
	
	@Length(max=20)
	//@NotNull
	@Column(name="Contr_Abbrv_Name")
	protected String contrAbbrvName = "";
	
	@Length(max=35)
	//@NotNull
	@Column(name="Contr_Add_Line1")
	protected String contrAddLine1 = "";
	
	@Length(max=35)
	@Column(name="Contr_Add_Line2")
	protected String contrAddLine2;
	
	@Length(max=35)
	@Column(name="Contr_Add_Line3")
	protected String contrAddLine3;
	
	@Length(max=35)
	@Column(name="Contr_Add_Line4")
	protected String contrAddLine4;
	
	@Length(max=20)
	@Column(name="Contr_Add_City")
	protected String contrAddCity;
	
	@Length(max=15)
	@Column(name="Contr_Add_Country")
	protected String contrAddCountry;
	
	@Length(max=2)
	@Column(name="Contr_Add_State")
	protected String contrAddState;
	
	@Length(max=5)
	@Column(name="Contr_Add_Zip")
	protected String contrAddZip;
	
	@Length(max=4)
	@Column(name="Contr_Add_Zip_Sfx")
	protected String contrAddZipSfx;
	
	@Length(max=35)
	@Column(name="Contr_Rem_Line1")
	protected String contrRemLine1;
	
	@Length(max=35)
	@Column(name="Contr_Rem_Line2")
	protected String contrRemLine2;

	@Length(max=35)
	@Column(name="Contr_Rem_Line3")
	protected String contrRemLine3;
	
	@Length(max=35)
	@Column(name="Contr_Rem_Line4")
	protected String contrRemLine4;
	
	@Length(max=20)
	@Column(name="Contr_Rem_City")
	protected String contrRemCity;
	
	@Length(max=15)
	@Column(name="Contr_Rem_Country")
	protected String contrRemCountry;
	
	@Length(max=2)
	@Column(name="Contr_Rem_State")
	protected String contrRemState;
	
	@Length(max=5)
	@Column(name="Contr_Rem_Zip")
	protected String contrRemZip;
	
	@Length(max=4)
	@Column(name="Contr_Rem_Zip_Sfx")
	protected String contrRemZipSfx;
	
	@Length(max=5)
	@Column(name="Contr_FIPS_Place")
	protected String contrFIPSPlace;
	
	@Length(max=1)
	@Column(name="Contr_Size")
	protected String contrSize;
	
	@Length(max=2)
	@Column(name="Contr_City_Code")
	protected String contrCityCode;
	
	@Length(max=1)
	@Column(name="Status")
	protected String status;
	
	@Length(max=9)
	@Column(name="TIN_Number")
	protected String tinNumber;
	
	@NotNull
	@Length(max=1)
	@Column(name="Fax_Flag")
	protected String faxFlag = "";
	
	@Length(max=25)
	@Column(name="Fax_Number")
	protected String faxNumber;
	
	@Length(max=25)
	@Column(name="Fax_Contact")
	protected String faxContact;
	
	@NotNull
	@Length(max=1)
	@Column(name="EDI_Flag")
	protected String ediFlag = "";
	
	@NotNull
	@Column(name="Date_Init")
	protected Timestamp initDate;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Column(name="Date_Last_Updated")
	protected Timestamp lastUpdatedDate;
	
	@Length(max=1)
	@Column(name="EDI_860")
	protected String edi860;
	
	@Length(max=1)
	@Column(name="White_Form")
	protected String whiteForm;
	
	@Length(max=9)
	@Column(name="CEC")
	protected String cec = "";
	
	//@NotNull
	@Column(name="Group_DUNS")
	protected Integer groupDUNS = 0;

	
	
	public String getContrFullName() {
		return contrFullName;
	}

	public void setContrFullName(String contrFullName) {
		this.contrFullName = contrFullName;
	}

	public String getContrAbbrvName() {
		return contrAbbrvName;
	}

	public void setContrAbbrvName(String contrAbbrvName) {
		this.contrAbbrvName = contrAbbrvName;
	}

	public String getContrAddLine1() {
		return contrAddLine1;
	}

	public void setContrAddLine1(String contrAddLine1) {
		this.contrAddLine1 = contrAddLine1;
	}

	public String getContrAddLine2() {
		return contrAddLine2;
	}

	public void setContrAddLine2(String contrAddLine2) {
		this.contrAddLine2 = contrAddLine2;
	}

	public String getContrAddLine3() {
		return contrAddLine3;
	}

	public void setContrAddLine3(String contrAddLine3) {
		this.contrAddLine3 = contrAddLine3;
	}

	public String getContrAddLine4() {
		return contrAddLine4;
	}

	public void setContrAddLine4(String contrAddLine4) {
		this.contrAddLine4 = contrAddLine4;
	}

	public String getContrAddCity() {
		return contrAddCity;
	}

	public void setContrAddCity(String contrAddCity) {
		this.contrAddCity = contrAddCity;
	}

	public String getContrAddCountry() {
		return contrAddCountry;
	}

	public void setContrAddCountry(String contrAddCountry) {
		this.contrAddCountry = contrAddCountry;
	}

	public String getContrAddState() {
		return contrAddState;
	}

	public void setContrAddState(String contrAddState) {
		this.contrAddState = contrAddState;
	}

	public String getContrAddZip() {
		return contrAddZip;
	}

	public void setContrAddZip(String contrAddZip) {
		this.contrAddZip = contrAddZip;
	}

	public String getContrAddZipSfx() {
		return contrAddZipSfx;
	}

	public void setContrAddZipSfx(String contrAddZipSfx) {
		this.contrAddZipSfx = contrAddZipSfx;
	}

	public String getContrRemLine1() {
		return contrRemLine1;
	}

	public void setContrRemLine1(String contrRemLine1) {
		this.contrRemLine1 = contrRemLine1;
	}

	public String getContrRemLine2() {
		return contrRemLine2;
	}

	public void setContrRemLine2(String contrRemLine2) {
		this.contrRemLine2 = contrRemLine2;
	}

	public String getContrRemLine3() {
		return contrRemLine3;
	}

	public void setContrRemLine3(String contrRemLine3) {
		this.contrRemLine3 = contrRemLine3;
	}

	public String getContrRemLine4() {
		return contrRemLine4;
	}

	public void setContrRemLine4(String contrRemLine4) {
		this.contrRemLine4 = contrRemLine4;
	}

	public String getContrRemCity() {
		return contrRemCity;
	}

	public void setContrRemCity(String contrRemCity) {
		this.contrRemCity = contrRemCity;
	}

	public String getContrRemCountry() {
		return contrRemCountry;
	}

	public void setContrRemCountry(String contrRemCountry) {
		this.contrRemCountry = contrRemCountry;
	}

	public String getContrRemState() {
		return contrRemState;
	}

	public void setContrRemState(String contrRemState) {
		this.contrRemState = contrRemState;
	}

	public String getContrRemZip() {
		return contrRemZip;
	}

	public void setContrRemZip(String contrRemZip) {
		this.contrRemZip = contrRemZip;
	}

	public String getContrRemZipSfx() {
		return contrRemZipSfx;
	}

	public void setContrRemZipSfx(String contrRemZipSfx) {
		this.contrRemZipSfx = contrRemZipSfx;
	}

	public String getContrFIPSPlace() {
		return contrFIPSPlace;
	}

	public void setContrFIPSPlace(String contrFIPSPlace) {
		this.contrFIPSPlace = contrFIPSPlace;
	}

	public String getContrSize() {
		return contrSize;
	}

	public void setContrSize(String contrSize) {
		this.contrSize = contrSize;
	}

	public String getContrCityCode() {
		return contrCityCode;
	}

	public void setContrCityCode(String contrCityCode) {
		this.contrCityCode = contrCityCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public String getFaxFlag() {
		return faxFlag;
	}

	public void setFaxFlag(String faxFlag) {
		this.faxFlag = faxFlag;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getFaxContact() {
		return faxContact;
	}

	public void setFaxContact(String faxContact) {
		this.faxContact = faxContact;
	}

	public String getEdiFlag() {
		return ediFlag;
	}

	public void setEdiFlag(String ediFlag) {
		this.ediFlag = ediFlag;
	}

	public Timestamp getInitDate() {
		return initDate;
	}

	public void setInitDate(Timestamp initDate) {
		this.initDate = initDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getEdi860() {
		return edi860;
	}

	public void setEdi860(String edi860) {
		this.edi860 = edi860;
	}

	public String getWhiteForm() {
		return whiteForm;
	}

	public void setWhiteForm(String whiteForm) {
		this.whiteForm = whiteForm;
	}

	public String getCec() {
		return cec;
	}

	public void setCec(String cec) {
		this.cec = cec;
	}


	public Integer getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(Integer groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public String getContrDUNS() {
		return contrDUNS;
	}

	public void setContrDUNS(String contrDUNS) {
		this.contrDUNS = contrDUNS;
	}

		
 
	
	
}
