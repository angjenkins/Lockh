
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Store complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Store">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storeNumber" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="locationCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="locationDescription" type="{http://fas.gsa.gov/Global/v1.0}string30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Store", propOrder = {
    "storeNumber",
    "locationCode",
    "locationDescription"
})
public class Store {

    @XmlElement(required = true)
    protected String storeNumber;
    @XmlElement(required = true)
    protected String locationCode;
    @XmlElement(required = true)
    protected String locationDescription;

    /**
     * Gets the value of the storeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNumber() {
        return storeNumber;
    }

    /**
     * Sets the value of the storeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNumber(String value) {
        this.storeNumber = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

}
