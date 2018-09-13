
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labelTxt" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="description" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *       &lt;/sequence>
 *       &lt;attribute name="oid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {
    "labelTxt",
    "description"
})
public class Label {

    @XmlElement(required = true)
    protected String labelTxt;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlAttribute(required = true)
    protected long oid;

    /**
     * Gets the value of the labelTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelTxt() {
        return labelTxt;
    }

    /**
     * Sets the value of the labelTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelTxt(String value) {
        this.labelTxt = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     */
    public long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     */
    public void setOid(long value) {
        this.oid = value;
    }

}
