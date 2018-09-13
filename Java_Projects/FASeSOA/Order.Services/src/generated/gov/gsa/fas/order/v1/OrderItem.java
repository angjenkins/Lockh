
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requisitionNumber" type="{http://fas.gsa.gov/Global/v1.0}string14"/>
 *         &lt;element name="requisitionSuffix" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItem", propOrder = {
    "nsn",
    "unitCode",
    "quantity",
    "requisitionNumber",
    "requisitionSuffix"
})
public class OrderItem {

    @XmlElement(required = true)
    protected String nsn;
    @XmlElement(required = true)
    protected String unitCode;
    protected int quantity;
    @XmlElement(required = true)
    protected String requisitionNumber;
    @XmlElement(required = true, nillable = true)
    protected String requisitionSuffix;

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
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the requisitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    /**
     * Sets the value of the requisitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionNumber(String value) {
        this.requisitionNumber = value;
    }

    /**
     * Gets the value of the requisitionSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionSuffix() {
        return requisitionSuffix;
    }

    /**
     * Sets the value of the requisitionSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionSuffix(String value) {
        this.requisitionSuffix = value;
    }

}
