
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CscItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CscItemDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="store" type="{http://fas.gsa.gov/Order/v1.0}Store" minOccurs="0"/>
 *         &lt;element name="eddRequisitionNumber" type="{http://fas.gsa.gov/Order/v1.0}EddRequisitionNumber" minOccurs="0"/>
 *         &lt;element name="sellPrice" type="{http://fas.gsa.gov/Global/v1.0}priceType"/>
 *         &lt;element name="costPrice" type="{http://fas.gsa.gov/Global/v1.0}priceType"/>
 *         &lt;element name="backOrder" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shipment" type="{http://fas.gsa.gov/Order/v1.0}ShipmentData"/>
 *         &lt;element name="tcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptDateOrdered" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receiptDateReceived" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="salePickup" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appropNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CscItemDetails", propOrder = {
    "store",
    "eddRequisitionNumber",
    "sellPrice",
    "costPrice",
    "backOrder",
    "description",
    "shipment",
    "tcn",
    "unitWeight",
    "receiptDateOrdered",
    "receiptDateReceived",
    "salePickup",
    "projectCode",
    "priorityCode",
    "appropNumber",
    "depot"
})
public class CscItemDetails {

    protected Store store;
    protected EddRequisitionNumber eddRequisitionNumber;
    @XmlElement(required = true)
    protected String sellPrice;
    @XmlElement(required = true)
    protected String costPrice;
    protected String backOrder;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected ShipmentData shipment;
    protected String tcn;
    protected Double unitWeight;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDateOrdered;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDateReceived;
    protected String salePickup;
    protected String projectCode;
    protected String priorityCode;
    protected String appropNumber;
    protected String depot;

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link Store }
     *     
     */
    public Store getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link Store }
     *     
     */
    public void setStore(Store value) {
        this.store = value;
    }

    /**
     * Gets the value of the eddRequisitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EddRequisitionNumber }
     *     
     */
    public EddRequisitionNumber getEddRequisitionNumber() {
        return eddRequisitionNumber;
    }

    /**
     * Sets the value of the eddRequisitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EddRequisitionNumber }
     *     
     */
    public void setEddRequisitionNumber(EddRequisitionNumber value) {
        this.eddRequisitionNumber = value;
    }

    /**
     * Gets the value of the sellPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellPrice() {
        return sellPrice;
    }

    /**
     * Sets the value of the sellPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellPrice(String value) {
        this.sellPrice = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostPrice(String value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the backOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackOrder() {
        return backOrder;
    }

    /**
     * Sets the value of the backOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackOrder(String value) {
        this.backOrder = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentData }
     *     
     */
    public ShipmentData getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentData }
     *     
     */
    public void setShipment(ShipmentData value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the tcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcn() {
        return tcn;
    }

    /**
     * Sets the value of the tcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcn(String value) {
        this.tcn = value;
    }

    /**
     * Gets the value of the unitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets the value of the unitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitWeight(Double value) {
        this.unitWeight = value;
    }

    /**
     * Gets the value of the receiptDateOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDateOrdered() {
        return receiptDateOrdered;
    }

    /**
     * Sets the value of the receiptDateOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDateOrdered(XMLGregorianCalendar value) {
        this.receiptDateOrdered = value;
    }

    /**
     * Gets the value of the receiptDateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDateReceived() {
        return receiptDateReceived;
    }

    /**
     * Sets the value of the receiptDateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDateReceived(XMLGregorianCalendar value) {
        this.receiptDateReceived = value;
    }

    /**
     * Gets the value of the salePickup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalePickup() {
        return salePickup;
    }

    /**
     * Sets the value of the salePickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalePickup(String value) {
        this.salePickup = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the appropNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppropNumber() {
        return appropNumber;
    }

    /**
     * Sets the value of the appropNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppropNumber(String value) {
        this.appropNumber = value;
    }

    /**
     * Gets the value of the depot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepot() {
        return depot;
    }

    /**
     * Sets the value of the depot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepot(String value) {
        this.depot = value;
    }

}
