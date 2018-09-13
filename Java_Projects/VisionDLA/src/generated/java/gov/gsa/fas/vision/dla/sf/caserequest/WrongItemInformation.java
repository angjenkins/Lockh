
package gov.gsa.fas.vision.dla.sf.caserequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WrongItemInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrongItemInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WrongItemCAGECode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemNSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemQuantityReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrongItemInformation", propOrder = {
    "wrongItemCAGECode",
    "wrongItemDescription",
    "wrongItemManufacturerName",
    "wrongItemNSN",
    "wrongItemPartNumber",
    "wrongItemQuantityReceived",
    "wrongItemUI"
})
public class WrongItemInformation {

    @XmlElement(name = "WrongItemCAGECode", nillable = true)
    protected String wrongItemCAGECode;
    @XmlElement(name = "WrongItemDescription", nillable = true)
    protected String wrongItemDescription;
    @XmlElement(name = "WrongItemManufacturerName", nillable = true)
    protected String wrongItemManufacturerName;
    @XmlElement(name = "WrongItemNSN", nillable = true)
    protected String wrongItemNSN;
    @XmlElement(name = "WrongItemPartNumber", nillable = true)
    protected String wrongItemPartNumber;
    @XmlElement(name = "WrongItemQuantityReceived", nillable = true)
    protected String wrongItemQuantityReceived;
    @XmlElement(name = "WrongItemUI", nillable = true)
    protected String wrongItemUI;

    /**
     * Gets the value of the wrongItemCAGECode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemCAGECode() {
        return wrongItemCAGECode;
    }

    /**
     * Sets the value of the wrongItemCAGECode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemCAGECode(String value) {
        this.wrongItemCAGECode = value;
    }

    /**
     * Gets the value of the wrongItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemDescription() {
        return wrongItemDescription;
    }

    /**
     * Sets the value of the wrongItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemDescription(String value) {
        this.wrongItemDescription = value;
    }

    /**
     * Gets the value of the wrongItemManufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemManufacturerName() {
        return wrongItemManufacturerName;
    }

    /**
     * Sets the value of the wrongItemManufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemManufacturerName(String value) {
        this.wrongItemManufacturerName = value;
    }

    /**
     * Gets the value of the wrongItemNSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemNSN() {
        return wrongItemNSN;
    }

    /**
     * Sets the value of the wrongItemNSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemNSN(String value) {
        this.wrongItemNSN = value;
    }

    /**
     * Gets the value of the wrongItemPartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemPartNumber() {
        return wrongItemPartNumber;
    }

    /**
     * Sets the value of the wrongItemPartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemPartNumber(String value) {
        this.wrongItemPartNumber = value;
    }

    /**
     * Gets the value of the wrongItemQuantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemQuantityReceived() {
        return wrongItemQuantityReceived;
    }

    /**
     * Sets the value of the wrongItemQuantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemQuantityReceived(String value) {
        this.wrongItemQuantityReceived = value;
    }

    /**
     * Gets the value of the wrongItemUI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrongItemUI() {
        return wrongItemUI;
    }

    /**
     * Sets the value of the wrongItemUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrongItemUI(String value) {
        this.wrongItemUI = value;
    }

}
