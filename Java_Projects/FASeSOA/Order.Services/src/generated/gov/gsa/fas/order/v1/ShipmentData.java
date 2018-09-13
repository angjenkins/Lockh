
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipmentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipmentPoNumber" type="{http://fas.gsa.gov/Global/v1.0}string10" minOccurs="0"/>
 *         &lt;element name="manifestNumber" type="{http://fas.gsa.gov/Global/v1.0}string8" minOccurs="0"/>
 *         &lt;element name="actualShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="transportation" type="{http://fas.gsa.gov/Order/v1.0}Transportation" minOccurs="0"/>
 *         &lt;element name="govtBillOfLadingNumber" type="{http://fas.gsa.gov/Global/v1.0}string8" minOccurs="0"/>
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentData", propOrder = {
    "shipmentPoNumber",
    "manifestNumber",
    "actualShipDate",
    "transportation",
    "govtBillOfLadingNumber",
    "trackingNumber",
    "carrierName"
})
public class ShipmentData {

    protected String shipmentPoNumber;
    protected String manifestNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualShipDate;
    protected Transportation transportation;
    protected String govtBillOfLadingNumber;
    protected String trackingNumber;
    protected String carrierName;

    /**
     * Gets the value of the shipmentPoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentPoNumber() {
        return shipmentPoNumber;
    }

    /**
     * Sets the value of the shipmentPoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentPoNumber(String value) {
        this.shipmentPoNumber = value;
    }

    /**
     * Gets the value of the manifestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestNumber() {
        return manifestNumber;
    }

    /**
     * Sets the value of the manifestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestNumber(String value) {
        this.manifestNumber = value;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link Transportation }
     *     
     */
    public Transportation getTransportation() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transportation }
     *     
     */
    public void setTransportation(Transportation value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the govtBillOfLadingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovtBillOfLadingNumber() {
        return govtBillOfLadingNumber;
    }

    /**
     * Sets the value of the govtBillOfLadingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovtBillOfLadingNumber(String value) {
        this.govtBillOfLadingNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

}
