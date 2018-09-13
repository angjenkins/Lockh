
package gov.gsa.fas.pricing.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NIINItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NIINItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="niin7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NIINItem", propOrder = {
    "clazz",
    "nato",
    "niin7",
    "suffix"
})
public class NIINItem {

    @XmlElement(name = "class")
    protected int clazz;
    @XmlElement(required = true)
    protected String nato;
    @XmlElement(required = true)
    protected String niin7;
    @XmlElement(required = true)
    protected String suffix;

    /**
     * Gets the value of the clazz property.
     * 
     */
    public int getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     */
    public void setClazz(int value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the nato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNato() {
        return nato;
    }

    /**
     * Sets the value of the nato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNato(String value) {
        this.nato = value;
    }

    /**
     * Gets the value of the niin7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiin7() {
        return niin7;
    }

    /**
     * Sets the value of the niin7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiin7(String value) {
        this.niin7 = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
