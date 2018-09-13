
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencyBureauCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyDetails", propOrder = {
    "agencyBureauCode",
    "stateCode",
    "cityCode"
})
public class AgencyDetails {

    @XmlElement(required = true)
    protected String agencyBureauCode;
    @XmlElement(required = true)
    protected String stateCode;
    @XmlElement(required = true)
    protected String cityCode;

    /**
     * Gets the value of the agencyBureauCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyBureauCode() {
        return agencyBureauCode;
    }

    /**
     * Sets the value of the agencyBureauCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyBureauCode(String value) {
        this.agencyBureauCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

}
