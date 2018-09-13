
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarrierTrackingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierTrackingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freightOnBoardCode" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="shipmentPoNumber" type="{http://fas.gsa.gov/Global/v1.0}string10" minOccurs="0"/>
 *         &lt;element name="govtBillOfLadingNumber" type="{http://fas.gsa.gov/Global/v1.0}string11" minOccurs="0"/>
 *         &lt;element name="inlaneGovtBillOfLadingNumber" type="{http://fas.gsa.gov/Global/v1.0}string11" minOccurs="0"/>
 *         &lt;element name="manifestNumber" type="{http://fas.gsa.gov/Global/v1.0}string8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierTrackingDetails", propOrder = {
    "freightOnBoardCode",
    "shipmentPoNumber",
    "govtBillOfLadingNumber",
    "inlaneGovtBillOfLadingNumber",
    "manifestNumber"
})
public class CarrierTrackingDetails {

    protected String freightOnBoardCode;
    protected String shipmentPoNumber;
    protected String govtBillOfLadingNumber;
    protected String inlaneGovtBillOfLadingNumber;
    protected String manifestNumber;

    /**
     * Gets the value of the freightOnBoardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightOnBoardCode() {
        return freightOnBoardCode;
    }

    /**
     * Sets the value of the freightOnBoardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightOnBoardCode(String value) {
        this.freightOnBoardCode = value;
    }

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
     * Gets the value of the inlaneGovtBillOfLadingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlaneGovtBillOfLadingNumber() {
        return inlaneGovtBillOfLadingNumber;
    }

    /**
     * Sets the value of the inlaneGovtBillOfLadingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlaneGovtBillOfLadingNumber(String value) {
        this.inlaneGovtBillOfLadingNumber = value;
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

}
