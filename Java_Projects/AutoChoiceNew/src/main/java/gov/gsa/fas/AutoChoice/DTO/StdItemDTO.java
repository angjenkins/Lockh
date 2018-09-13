package gov.gsa.fas.AutoChoice.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table (name="std_items")
@Component
public class StdItemDTO {
	
	@Id
	@NotEmpty
	@NotNull
	@Length(max=4)
	@Column(name="Std_Item")
	protected String stdItem = "";
	
	@NotNull
	@Length(max=5)
	@Column(name="Fed_Std_Code")
	protected String fedStdCode = "";
	
	@NotNull
	@Length(max=2)
	@Column(name="Veh_Type")
	protected String vehType = "";
	
	@NotNull
	@Length(max=60)
	@Column(name="Description")
	protected String description = "";
	
	@NotNull
	@Length(max=1)
	@Column(name="Status")
	protected String status = "";
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Updated")
	protected String userUpdated = "";
	
	@Length(max=1)
	@Column(name="Section")
	protected String section = "";
	
	@Length(max=1)
	@Column(name="MPG_Flag")
	protected String mpgFlag = "";
	
	@Length(max=60)
	@Column(name="Desc1")
	protected String desc1 = "";
	
	@Length(max=60)
	@Column(name="Desc2")
	protected String desc2 = "";
	
	@Length(max=60)
	@Column(name="Desc3")
	protected String desc3 = "";
	
	@Length(max=60)
	@Column(name="Desc4")
	protected String desc4 = "";
	
	@Length(max=60)
	@Column(name="Desc5")
	protected String desc5 = "";
	
	@Column(name="Last_UPrice")
	protected double lastUnitPrice;

	@Length(max=6)
	@Column(name="Last_Case")
	protected String lastCase = "";
	
	@Column(name="Last_Date")
	protected Timestamp lastDate;
	
	@Length(max=4)
	@Column(name="Std_Item_Base")
	protected String stdItemBase = "";
	
	@Length(max=4)
	@Column(name="Std_Item_Base_Next")
	protected String stdItemBaseNext = "";
	
	
	@Transient
	protected String solNo1 = "";
	@Transient
	protected String solNo2 = "";
	@Transient
	protected String solNo3 = "";
	@Transient
	protected String schLine = "";
	@Transient
	protected String contrDUNS = "";
	@Transient
	protected String contract = "";
	@Transient
	protected String contrFullName = "";
	@Transient
	protected String model = "";
	@Transient
	protected String modelYYYY = "";
	@Transient	
	protected Integer groupDUNS;
 
	@Transient
	protected String proprietary="";
	
	@Transient
	private String bidStatus="";
	@Transient
	private String bidStatusDesc="";
	
	@Transient
	private String stdItemDesc="";
	
	@Transient
	private String vehDescription="";
	

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getFedStdCode() {
		return fedStdCode;
	}

	public void setFedStdCode(String fedStdCode) {
		this.fedStdCode = fedStdCode;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getMpgFlag() {
		return mpgFlag;
	}

	public void setMpgFlag(String mpgFlag) {
		this.mpgFlag = mpgFlag;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}

	public String getDesc3() {
		return desc3;
	}

	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}

	public String getDesc4() {
		return desc4;
	}

	public void setDesc4(String desc4) {
		this.desc4 = desc4;
	}

	public String getDesc5() {
		return desc5;
	}

	public void setDesc5(String desc5) {
		this.desc5 = desc5;
	}

	public double getLastUnitPrice() {
		return lastUnitPrice;
	}

	public void setLastUnitPrice(double lastUnitPrice) {
		this.lastUnitPrice = lastUnitPrice;
	}

	public String getLastCase() {
		return lastCase;
	}

	public void setLastCase(String lastCase) {
		this.lastCase = lastCase;
	}

	public Timestamp getLastDate() {
		return lastDate;
	}

	public void setLastDate(Timestamp lastDate) {
		this.lastDate = lastDate;
	}

	public String getStdItemBase() {
		return stdItemBase;
	}

	public void setStdItemBase(String stdItemBase) {
		this.stdItemBase = stdItemBase;
	}

	public String getStdItemBaseNext() {
		return stdItemBaseNext;
	}

	public void setStdItemBaseNext(String stdItemBaseNext) {
		this.stdItemBaseNext = stdItemBaseNext;
	}

	public String getSolNo1() {
		return solNo1;
	}

	public void setSolNo1(String solNo1) {
		this.solNo1 = solNo1;
	}

	public String getSolNo2() {
		return solNo2;
	}

	public void setSolNo2(String solNo2) {
		this.solNo2 = solNo2;
	}

	public String getSolNo3() {
		return solNo3;
	}

	public void setSolNo3(String solNo3) {
		this.solNo3 = solNo3;
	}

	public String getSchLine() {
		return schLine;
	}

	public void setSchLine(String schLine) {
		this.schLine = schLine;
	}

	public String getContrDUNS() {
		return contrDUNS;
	}

	public void setContrDUNS(String contrDUNS) {
		this.contrDUNS = contrDUNS;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getContrFullName() {
		return contrFullName;
	}

	public void setContrFullName(String contrFullName) {
		this.contrFullName = contrFullName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}



	public Integer getGroupDUNS() {
		return groupDUNS;
	}

	public void setGroupDUNS(Integer groupDUNS) {
		this.groupDUNS = groupDUNS;
	}

	public String getModelYYYY() {
		return modelYYYY;
	}

	public void setModelYYYY(String modelYYYY) {
		this.modelYYYY = modelYYYY;
	}

	public String getProprietary() {
		return proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}

	public String getBidStatus() {
		return bidStatus;
	}

	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}

	public String getBidStatusDesc() {
		return bidStatusDesc;
	}

	public void setBidStatusDesc(String bidStatusDesc) {
		this.bidStatusDesc = bidStatusDesc;
	}

	public String getStdItemDesc() {
		return stdItemDesc;
	}

	public void setStdItemDesc(String stdItemDesc) {
		this.stdItemDesc = stdItemDesc;
	}

	public String getVehDescription() {
		return vehDescription;
	}

	public void setVehDescription(String vehDescription) {
		this.vehDescription = vehDescription;
	}

	
	
	
	
	
	
}
