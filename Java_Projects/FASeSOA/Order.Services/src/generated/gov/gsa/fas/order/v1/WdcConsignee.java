
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WdcConsignee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcConsignee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aac" type="{http://fas.gsa.gov/Order/v1.0}ActivityAddressCode" minOccurs="0"/>
 *         &lt;element name="zone" type="{http://fas.gsa.gov/Global/v1.0}string5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcConsignee", propOrder = {
    "aac",
    "zone"
})
public class WdcConsignee {

    protected ActivityAddressCode aac;
    protected String zone;

    /**
     * Gets the value of the aac property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAddressCode }
     *     
     */
    public ActivityAddressCode getAac() {
        return aac;
    }

    /**
     * Sets the value of the aac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAddressCode }
     *     
     */
    public void setAac(ActivityAddressCode value) {
        this.aac = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

}
