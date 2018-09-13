
package gov.gsa.fas.ordercomplaint.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Complaint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Complaint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://fas.gsa.gov/OrderComplaint/v1.0}Item"/>
 *         &lt;element name="complaintDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="originator" type="{http://fas.gsa.gov/OrderComplaint/v1.0}Originator"/>
 *         &lt;element name="poc" type="{http://fas.gsa.gov/OrderComplaint/v1.0}PointOfContact"/>
 *         &lt;element name="requisitionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationType" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="notificationDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantityRejected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="natureOfComplaint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationCenter" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="ncscContact" type="{http://fas.gsa.gov/OrderComplaint/v1.0}NCSCContact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Complaint", propOrder = {
    "item",
    "complaintDate",
    "receivedDate",
    "originator",
    "poc",
    "requisitionNumber",
    "notificationType",
    "notificationDescription",
    "purchaseOrderNumber",
    "contractNumber",
    "quantityReceived",
    "quantityRejected",
    "natureOfComplaint",
    "operationCenter",
    "ncscContact"
})
public class Complaint {

    @XmlElement(required = true)
    protected Item item;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar complaintDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receivedDate;
    @XmlElement(required = true)
    protected Originator originator;
    @XmlElement(required = true)
    protected PointOfContact poc;
    @XmlElement(required = true)
    protected String requisitionNumber;
    @XmlElement(required = true)
    protected String notificationType;
    @XmlElement(required = true)
    protected String notificationDescription;
    @XmlElement(required = true)
    protected String purchaseOrderNumber;
    @XmlElement(required = true)
    protected String contractNumber;
    @XmlElement(required = true)
    protected String quantityReceived;
    @XmlElement(required = true)
    protected String quantityRejected;
    @XmlElement(required = true)
    protected String natureOfComplaint;
    @XmlElement(required = true)
    protected String operationCenter;
    @XmlElement(required = true)
    protected NCSCContact ncscContact;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }

    /**
     * Gets the value of the complaintDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getComplaintDate() {
        return complaintDate;
    }

    /**
     * Sets the value of the complaintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setComplaintDate(XMLGregorianCalendar value) {
        this.complaintDate = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link Originator }
     *     
     */
    public Originator getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Originator }
     *     
     */
    public void setOriginator(Originator value) {
        this.originator = value;
    }

    /**
     * Gets the value of the poc property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfContact }
     *     
     */
    public PointOfContact getPoc() {
        return poc;
    }

    /**
     * Sets the value of the poc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfContact }
     *     
     */
    public void setPoc(PointOfContact value) {
        this.poc = value;
    }

    /**
     * Gets the value of the requisitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    /**
     * Sets the value of the requisitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionNumber(String value) {
        this.requisitionNumber = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the notificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDescription() {
        return notificationDescription;
    }

    /**
     * Sets the value of the notificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDescription(String value) {
        this.notificationDescription = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityReceived(String value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the quantityRejected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityRejected() {
        return quantityRejected;
    }

    /**
     * Sets the value of the quantityRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityRejected(String value) {
        this.quantityRejected = value;
    }

    /**
     * Gets the value of the natureOfComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfComplaint() {
        return natureOfComplaint;
    }

    /**
     * Sets the value of the natureOfComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfComplaint(String value) {
        this.natureOfComplaint = value;
    }

    /**
     * Gets the value of the operationCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCenter() {
        return operationCenter;
    }

    /**
     * Sets the value of the operationCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCenter(String value) {
        this.operationCenter = value;
    }

    /**
     * Gets the value of the ncscContact property.
     * 
     * @return
     *     possible object is
     *     {@link NCSCContact }
     *     
     */
    public NCSCContact getNcscContact() {
        return ncscContact;
    }

    /**
     * Sets the value of the ncscContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCSCContact }
     *     
     */
    public void setNcscContact(NCSCContact value) {
        this.ncscContact = value;
    }

}
