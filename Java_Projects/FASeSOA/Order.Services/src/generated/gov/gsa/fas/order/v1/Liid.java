
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for liid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="liid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="liidId" type="{http://fas.gsa.gov/Global/v1.0}string4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "liid", propOrder = {
    "liidId"
})
public class Liid {

    @XmlElement(required = true)
    protected String liidId;

    /**
     * Gets the value of the liidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiidId() {
        return liidId;
    }

    /**
     * Sets the value of the liidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiidId(String value) {
        this.liidId = value;
    }

}
