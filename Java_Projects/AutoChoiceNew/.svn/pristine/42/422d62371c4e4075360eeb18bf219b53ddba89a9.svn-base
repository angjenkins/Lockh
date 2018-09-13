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

@Entity
@IdClass(ControlLogCompositePK.class)
@Table (name="control_log")
public class ControlLogDTO {
	@Id
	@Length(max=6)
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	protected String caseNo = "";
	
	@Id
	@NotNull
	protected Timestamp Date_Init;
	
	@Id
	@Length(max=1)
	@NotNull
	@NotEmpty(message="Type proc cannot be empty")
	protected String type_Proc = "";
	
	@Length(max=5)
	@NotNull
	@Column(name="Contract")
	protected String contract = "";
	
	@Length(max=3)
	@NotNull
	@Column(name="Mod")
	protected String mod = "";
	
	@Length(max=12)
	@NotNull
	@Column(name="UserId")
	protected String userId = "";
	
	@Column(name="XferOut_Dt")
	protected Timestamp xferOutDate;
	
	@Column(name="FSS19_Dt")
	protected Timestamp fss19Date;
	
	@Length(max=1)
	@NotNull
	@Column(name="Vendor_Flag")
	protected String vendorFlag = "";
	
	@Column(name="Vendor_Dt")
	protected Timestamp vendorDate;
	
	@Length(max=1)
	@NotNull
	@Column(name="contrduns_edi_850")
	protected String contrDUNSEDI850;
	
	@Length(max=1)
	@NotNull
	@Column(name="contrduns_edi_860")
	protected String contrDUNSEDI860;
	
	@Length(max=1)
	@NotNull
	@Column(name="contrduns_fax")
	protected String contrDUNSFax;
	
	@Length(max=1)
	@NotNull
	@Column(name="Pope_Flag")
	protected String popeFlag;
	
	@NotNull
	@Column(name="Pope_Batch")
	protected int popeBatch;
	
	@Column(name="Evening_Dt")
	protected Timestamp eveningDate;
	
	@Length(max=1)
	@NotNull
	@Column(name="Status")
	protected String status = "";

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Timestamp getDate_Init() {
		return Date_Init;
	}

	public void setDate_Init(Timestamp date_Init) {
		Date_Init = date_Init;
	}

	public String getType_Proc() {
		return type_Proc;
	}

	public void setType_Proc(String type_Proc) {
		this.type_Proc = type_Proc;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getXferOutDate() {
		return xferOutDate;
	}

	public void setXferOutDate(Timestamp xferOutDate) {
		this.xferOutDate = xferOutDate;
	}

	public Timestamp getFss19Date() {
		return fss19Date;
	}

	public void setFss19Date(Timestamp fss19Date) {
		this.fss19Date = fss19Date;
	}

	public String getVendorFlag() {
		return vendorFlag;
	}

	public void setVendorFlag(String vendorFlag) {
		this.vendorFlag = vendorFlag;
	}

	public Timestamp getVendorDate() {
		return vendorDate;
	}

	public void setVendorDate(Timestamp vendorDate) {
		this.vendorDate = vendorDate;
	}

	public String getContrDUNSEDI850() {
		return contrDUNSEDI850;
	}

	public void setContrDUNSEDI850(String contrDUNSEDI850) {
		this.contrDUNSEDI850 = contrDUNSEDI850;
	}

	public String getContrDUNSEDI860() {
		return contrDUNSEDI860;
	}

	public void setContrDUNSEDI860(String contrDUNSEDI860) {
		this.contrDUNSEDI860 = contrDUNSEDI860;
	}

	public String getContrDUNSFax() {
		return contrDUNSFax;
	}

	public void setContrDUNSFax(String contrDUNSFax) {
		this.contrDUNSFax = contrDUNSFax;
	}

	public String getPopeFlag() {
		return popeFlag;
	}

	public void setPopeFlag(String popeFlag) {
		this.popeFlag = popeFlag;
	}

	public int getPopeBatch() {
		return popeBatch;
	}

	public void setPopeBatch(int popeBatch) {
		this.popeBatch = popeBatch;
	}

	public Timestamp getEveningDate() {
		return eveningDate;
	}

	public void setEveningDate(Timestamp eveningDate) {
		this.eveningDate = eveningDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
