
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WdcProcessStage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcProcessStage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="julianDate" type="{http://fas.gsa.gov/Global/v1.0}string7"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcProcessStage", propOrder = {
    "code",
    "julianDate"
})
public class WdcProcessStage {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String julianDate;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the julianDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJulianDate() {
        return julianDate;
    }

    /**
     * Sets the value of the julianDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJulianDate(String value) {
        this.julianDate = value;
    }

}
