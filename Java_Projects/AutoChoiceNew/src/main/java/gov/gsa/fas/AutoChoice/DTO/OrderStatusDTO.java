package gov.gsa.fas.AutoChoice.DTO;

import java.sql.Timestamp;

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
@IdClass(OrderStatusCompositePK.class)
@Table (name="order_status")
@Component
public class OrderStatusDTO {

	
	@Id
	@NotNull
	@NotEmpty(message="Vehicle Order Number cannot be empty")
	@Length(max=8)
	protected String veh_Order_No;
	
	@Id
	@NotNull
	@NotEmpty(message="Case number cannot be empty")
	@Length(max=6)
	protected String caseNo;
	
	@Id
	@NotNull
	@NotEmpty(message="VIN cannot be empty")
	@Length(max=17)
	protected String VIN;
	
	@NotNull
	@Length(max=5)
	@Column(name="Contract")
	protected String contract = "";
	
	@NotNull
	@Length(max=2)
	@Column(name="Status")
	protected String status = "";
	
	@NotNull
	@Length(max=35)
	@Column(name="Name")
	protected String name = "";
	
	@NotNull
	@Length(max=35)
	@Column(name="Address")
	protected String address = "";
	
	@NotNull
	@Length(max=30)
	@Column(name="City")
	protected String city = "";
	
	@NotNull
	@Length(max=2)
	@Column(name="State")
	protected String state = "";
	
	@NotNull
	@Length(max=5)
	@Column(name="Zip")
	protected String zip = "";
	
	@NotNull
	@Length(max=4)
	@Column(name="Sfx")
	protected String zipSuffix = "";
	
	@Column(name="Status_Date")
	protected Timestamp statusDate=null;
	
	@Column(name="Date_Updated")
	protected Timestamp updatedDate;
	
	@Column(name="Orig_Status_Date")
	protected Timestamp origStatusDate;
	
	@Length(max=35)
	@Column(name="Contact_Name")
	protected String contactName;

	@Length(max=21)
	@Column(name="Contact_Telno")
	protected String contactTelNumber;
	
	@Column(name="Shipment_Date")
	protected Timestamp shipmentDate;
	
	@Column(name="Delivery_Date")
	protected Timestamp deliveryDate=null;
	
	@Column(name="Date_Ag_Received")
	protected Timestamp agReceivedDate;
	
	@Column(name="Date_Ag_Updated")
	protected Timestamp agUpdateDate;
	
	@NotNull
	@Length(max=20)
	@Column(name="User_Ag_Updated")
	protected String agUpdateUser = "";
	
	@NotNull
	@Length(max=6)
	@Column(name="Weight_Rating")
	protected String weightRating = "";
	
	@NotNull
	@Length(max=6)
	@Column(name="Fuel_Type")
	protected String fuelType = "";
	
	@NotNull
	@Length(max=4)
	@Column(name="GPM")
	protected String gpm = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_B")
	protected String mpgB = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_C")
	protected String mpgC = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="MPG_H")
	protected String mpgH = "";
	
	@NotNull
	@Length(max=4)
	@Column(name="Flex_GPM")
	protected String flexGPM = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="Flex_Fuel_MPG_B")
	protected String flexFuelMPGB = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="Flex_Fuel_MPG_C")
	protected String flexFuelMPGC = "";
	
	@NotNull
	@Length(max=3)
	@Column(name="Flex_Fuel_MPG_H")
	protected String flexFuelMPGH = "";
	
	@NotNull
	@Length(max=60)
	@Column(name="Veh_Color")
	protected String vehColor = "";
	
	@NotNull
	@Length(max=60)
	@Column(name="Veh_Trim")
	protected String vehTrim = "";

	@Transient
	protected String  stdItem = "";
	
	@Transient
	protected String  model = "";
	
	@Transient
	protected String  bureauCode = "";
		
	@Transient
	protected String  agencyCode = "";
	
	
	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZipSuffix() {
		return zipSuffix;
	}

	public void setZipSuffix(String zipSuffix) {
		this.zipSuffix = zipSuffix;
	}

	public Timestamp getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Timestamp statusDate) {
		this.statusDate = statusDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Timestamp getOrigStatusDate() {
		return origStatusDate;
	}

	public void setOrigStatusDate(Timestamp origStatusDate) {
		this.origStatusDate = origStatusDate;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTelNumber() {
		return contactTelNumber;
	}

	public void setContactTelNumber(String contactTelNumber) {
		this.contactTelNumber = contactTelNumber;
	}

	public Timestamp getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Timestamp shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Timestamp getAgReceivedDate() {
		return agReceivedDate;
	}

	public void setAgReceivedDate(Timestamp agReceivedDate) {
		this.agReceivedDate = agReceivedDate;
	}

	public Timestamp getAgUpdateDate() {
		return agUpdateDate;
	}

	public void setAgUpdateDate(Timestamp agUpdateDate) {
		this.agUpdateDate = agUpdateDate;
	}

	public String getAgUpdateUser() {
		return agUpdateUser;
	}

	public void setAgUpdateUser(String agUpdateUser) {
		this.agUpdateUser = agUpdateUser;
	}

	public String getWeightRating() {
		return weightRating;
	}

	public void setWeightRating(String weightRating) {
		this.weightRating = weightRating;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getGpm() {
		return gpm;
	}

	public void setGpm(String gpm) {
		this.gpm = gpm;
	}

	public String getMpgB() {
		return mpgB;
	}

	public void setMpgB(String mpgB) {
		this.mpgB = mpgB;
	}

	public String getMpgC() {
		return mpgC;
	}

	public void setMpgC(String mpgC) {
		this.mpgC = mpgC;
	}

	public String getMpgH() {
		return mpgH;
	}

	public void setMpgH(String mpgH) {
		this.mpgH = mpgH;
	}

	public String getFlexGPM() {
		return flexGPM;
	}

	public void setFlexGPM(String flexGPM) {
		this.flexGPM = flexGPM;
	}

	public String getFlexFuelMPGB() {
		return flexFuelMPGB;
	}

	public void setFlexFuelMPGB(String flexFuelMPGB) {
		this.flexFuelMPGB = flexFuelMPGB;
	}

	public String getFlexFuelMPGC() {
		return flexFuelMPGC;
	}

	public void setFlexFuelMPGC(String flexFuelMPGC) {
		this.flexFuelMPGC = flexFuelMPGC;
	}

	public String getFlexFuelMPGH() {
		return flexFuelMPGH;
	}

	public void setFlexFuelMPGH(String flexFuelMPGH) {
		this.flexFuelMPGH = flexFuelMPGH;
	}

	public String getVehColor() {
		return vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getVehTrim() {
		return vehTrim;
	}

	public void setVehTrim(String vehTrim) {
		this.vehTrim = vehTrim;
	}

	public String getStdItem() {
		return stdItem;
	}

	public void setStdItem(String stdItem) {
		this.stdItem = stdItem;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBureauCode() {
		return bureauCode;
	}

	public void setBureauCode(String bureauCode) {
		this.bureauCode = bureauCode;
	}

	public String getVeh_Order_No() {
		return veh_Order_No;
	}

	public void setVeh_Order_No(String veh_Order_No) {
		this.veh_Order_No = veh_Order_No;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}


	
}
