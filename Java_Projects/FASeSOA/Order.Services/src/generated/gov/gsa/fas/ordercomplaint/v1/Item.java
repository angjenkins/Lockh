
package gov.gsa.fas.ordercomplaint.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsn" type="{http://fas.gsa.gov/Global/v1.0}string15"/>
 *         &lt;element name="name" type="{http://fas.gsa.gov/Global/v1.0}string35"/>
 *         &lt;element name="category" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "nsn",
    "name",
    "category"
})
public class Item {

    @XmlElement(required = true)
    protected String nsn;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String category;

    /**
     * Gets the value of the nsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsn() {
        return nsn;
    }

    /**
     * Sets the value of the nsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsn(String value) {
        this.nsn = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
