
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CscPORequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CscPORequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ggsSessionNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="manufacturePartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CscPORequest", propOrder = {
    "ggsSessionNumber",
    "manufacturePartNumber",
    "prefix"
})
public class CscPORequest {

    protected long ggsSessionNumber;
    @XmlElement(required = true)
    protected String manufacturePartNumber;
    @XmlElement(required = true)
    protected String prefix;

    /**
     * Gets the value of the ggsSessionNumber property.
     * 
     */
    public long getGgsSessionNumber() {
        return ggsSessionNumber;
    }

    /**
     * Sets the value of the ggsSessionNumber property.
     * 
     */
    public void setGgsSessionNumber(long value) {
        this.ggsSessionNumber = value;
    }

    /**
     * Gets the value of the manufacturePartNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturePartNumber() {
        return manufacturePartNumber;
    }

    /**
     * Sets the value of the manufacturePartNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturePartNumber(String value) {
        this.manufacturePartNumber = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

}
