package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table (name="fileupload")
public class FileUploadDTO {
	
	@Id
	@NotNull
	@Column(name="PK_FileUpload")
	protected int fileUploadPK;

	@NotNull
	@Column(name="CaseNo")
	protected int caseNumber;
	
	@Length(max=6)
	@Column(name="CaseNo_Real")
	protected String caseNumberReal;
	
	@NotNull
	@Length(max=5)
	@Column(name="Contract")
	protected String contract = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="Mod")
	protected String mod = "";
	
	@Length(max=20)
	@Column(name="Agency_Order_No")
	protected String agencyOrderNo;
	
	@Length(max=6)
	@Column(name="Line_Item")
	protected String lineItem;
	
	@NotNull
	@Column(name="File_Sequence")
	protected int fileSequence = 1;
	
	@NotNull
	@Length(max=45)
	@Column(name="File_Name")
	protected String fileName;
	
	@NotNull
	@Column(name="Date_Loaded")
	protected Timestamp loadedDate;
	
	@Column(name="Date_Transfer")
	protected Timestamp transferDate;
	
	@Column(name="Date_SFTP")
	protected Timestamp sftpDate;
	
	@NotNull
	@Length(max=1)
	@Column(name="MIPR_Flag")
	protected String miprFlag = "N";
	
	@NotNull
	@Length(max=1)
	@Column(name="Type_Flag")
	protected String typeFlag = "";
	
	@Column(name="File_Size")
	protected int fileSize;
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";

	public int getFileUploadPK() {
		return fileUploadPK;
	}

	public void setFileUploadPK(int fileUploadPK) {
		this.fileUploadPK = fileUploadPK;
	}

	public int getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCaseNumberReal() {
		return caseNumberReal;
	}

	public void setCaseNumberReal(String caseNumberReal) {
		this.caseNumberReal = caseNumberReal;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getAgencyOrderNo() {
		return agencyOrderNo;
	}

	public void setAgencyOrderNo(String agencyOrderNo) {
		this.agencyOrderNo = agencyOrderNo;
	}

	public String getLineItem() {
		return lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	public int getFileSequence() {
		return fileSequence;
	}

	public void setFileSequence(int fileSequence) {
		this.fileSequence = fileSequence;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getLoadedDate() {
		return loadedDate;
	}

	public void setLoadedDate(Timestamp loadedDate) {
		this.loadedDate = loadedDate;
	}

	public Timestamp getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Timestamp transferDate) {
		this.transferDate = transferDate;
	}

	public Timestamp getSftpDate() {
		return sftpDate;
	}

	public void setSftpDate(Timestamp sftpDate) {
		this.sftpDate = sftpDate;
	}

	public String getMiprFlag() {
		return miprFlag;
	}

	public void setMiprFlag(String miprFlag) {
		this.miprFlag = miprFlag;
	}

	public String getTypeFlag() {
		return typeFlag;
	}

	public void setTypeFlag(String typeFlag) {
		this.typeFlag = typeFlag;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}
	
}
