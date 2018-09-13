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
@IdClass(AgBuTableCompositePK.class)
@Table (name="agbu_table")
@Component
public class AgBuTableDTO {
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Agency Code cannot be empty")
	@Column(name="Agency_Code")
	protected String agency_Code = "";
	
	@Id
	@Length(max=2)
	@NotNull
	@NotEmpty(message="Bureau Code cannot be empty")
	@Column(name="Bureau_Code")
	protected String bureau_Code = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="Agency")
	protected String agency = "";
	
	@Length(max=20)
	@NotNull
	@Column(name="Bureau")
	protected String bureau = "";
	
	@Length(max=1)
	@NotNull
	@Column(name="Electronic_Flag")
	protected String electronicFlag = "";
	
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@Column(name="Valid_Flag")
	protected String validFlag = "";
	
	@Length(max=1)
	@Column(name="Status_Flag")
	protected String statusFlag = "";
	
	@Length(max=1)
	@Column(name="Decentralized")
	protected String decentralized = "";
	
	@Length(max=1)
	@Column(name="Flg_Con")
	protected String flgCon = "";
	
	@Length(max=1)
	@Column(name="Flg_Req")
	protected String flgReq = "";
	
	@Length(max=1)
	@Column(name="MultiRecordFile_Flag")
	protected String multiRecordFileFlag = "";
	
	@Length(max=50)
	@Column(name="POC_Name")
	protected String pocName = "";
	
	@Length(max=15)
	@Column(name="POC_Telephone")
	protected String pocTelephone = "";
	
	@Length(max=15)
	@Column(name="POC_Fax")
	protected String pocFax = "";
	
	@Length(max=50)
	@Column(name="POC_email")
	protected String pocEmail = "";
	
	@Length(max=50)
	@Column(name="POC_Add_Line1")
	protected String pocAddLine1 = "";
	
	@Length(max=50)
	@Column(name="POC_Add_Line2")
	protected String pocAddLine2 = "";
	
	@Length(max=50)
	@Column(name="POC_Add_Line3")
	protected String pocAddLine3 = "";
	
	@Length(max=35)
	@Column(name="POC_City")
	protected String pocCity = "";
	
	@Length(max=2)
	@Column(name="POC_State")
	protected String pocState = "";
	
	@Length(max=5)
	@Column(name="POC_Zip")
	protected String pocZip = "";
	
	@Length(max=4)
	@Column(name="POC_Zip_Sfx")
	protected String pocZipSfx = "";
	
	@Length(max=25)
	@Column(name="POC_Country")
	protected String pocCountry = "";
	
	@Length(max=1)
	@Column(name="Proprietary")
	protected String proprietary = "";
	
	@Length(max=1)
	@Column(name="Flg_1122")
	protected String flg1122 = "";
	
	@Length(max=60)
	@Column(name="AGBU_OnBehalf")
	protected String agbuOnBehalf = "";
	
	@Length(max=1)
	@Column(name="DOD")
	protected String dod = "";

	@Transient
	protected String codeNameDisplay = "";
	
	@Transient 
	protected String combinedCode = ""; 

	

	public String getAgency_Code() {
		return agency_Code;
	}

	public void setAgency_Code(String agency_Code) {
		this.agency_Code = agency_Code;
	}

	public String getBureau_Code() {
		return bureau_Code;
	}

	public void setBureau_Code(String bureau_Code) {
		this.bureau_Code = bureau_Code;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

	public String getElectronicFlag() {
		return electronicFlag;
	}

	public void setElectronicFlag(String electronicFlag) {
		this.electronicFlag = electronicFlag;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

	public String getDecentralized() {
		return decentralized;
	}

	public void setDecentralized(String decentralized) {
		this.decentralized = decentralized;
	}

	public String getFlgCon() {
		return flgCon;
	}

	public void setFlgCon(String flgCon) {
		this.flgCon = flgCon;
	}

	public String getFlgReq() {
		return flgReq;
	}

	public void setFlgReq(String flgReq) {
		this.flgReq = flgReq;
	}

	public String getMultiRecordFileFlag() {
		return multiRecordFileFlag;
	}

	public void setMultiRecordFileFlag(String multiRecordFileFlag) {
		this.multiRecordFileFlag = multiRecordFileFlag;
	}

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public String getPocTelephone() {
		return pocTelephone;
	}

	public void setPocTelephone(String pocTelephone) {
		this.pocTelephone = pocTelephone;
	}

	public String getPocFax() {
		return pocFax;
	}

	public void setPocFax(String pocFax) {
		this.pocFax = pocFax;
	}

	public String getPocEmail() {
		return pocEmail;
	}

	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}

	public String getPocAddLine1() {
		return pocAddLine1;
	}

	public void setPocAddLine1(String pocAddLine1) {
		this.pocAddLine1 = pocAddLine1;
	}

	public String getPocAddLine2() {
		return pocAddLine2;
	}

	public void setPocAddLine2(String pocAddLine2) {
		this.pocAddLine2 = pocAddLine2;
	}

	public String getPocAddLine3() {
		return pocAddLine3;
	}

	public void setPocAddLine3(String pocAddLine3) {
		this.pocAddLine3 = pocAddLine3;
	}

	public String getPocCity() {
		return pocCity;
	}

	public void setPocCity(String pocCity) {
		this.pocCity = pocCity;
	}

	public String getPocState() {
		return pocState;
	}

	public void setPocState(String pocState) {
		this.pocState = pocState;
	}

	public String getPocZip() {
		return pocZip;
	}

	public void setPocZip(String pocZip) {
		this.pocZip = pocZip;
	}

	public String getPocZipSfx() {
		return pocZipSfx;
	}

	public void setPocZipSfx(String pocZipSfx) {
		this.pocZipSfx = pocZipSfx;
	}

	public String getPocCountry() {
		return pocCountry;
	}

	public void setPocCountry(String pocCountry) {
		this.pocCountry = pocCountry;
	}

	public String getProprietary() {
		return proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}

	public String getFlg1122() {
		return flg1122;
	}

	public void setFlg1122(String flg1122) {
		this.flg1122 = flg1122;
	}

	public String getAgbuOnBehalf() {
		return agbuOnBehalf;
	}

	public void setAgbuOnBehalf(String agbuOnBehalf) {
		this.agbuOnBehalf = agbuOnBehalf;
	}

	public String getCodeNameDisplay() {
		return codeNameDisplay;
	}

	public void setCodeNameDisplay(String codeNameDisplay) {
		this.codeNameDisplay = codeNameDisplay;
	}

	public String getCombinedCode() {
		return combinedCode;
	}

	public void setCombinedCode(String combinedCode) {
		this.combinedCode = combinedCode;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}
}
