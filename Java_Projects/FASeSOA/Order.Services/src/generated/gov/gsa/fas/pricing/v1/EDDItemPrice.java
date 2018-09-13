
package gov.gsa.fas.pricing.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDDItemPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDDItemPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eddItem" type="{http://fas.gsa.gov/Pricing/v1.0}EDDItem"/>
 *         &lt;element name="sellPrice" type="{http://fas.gsa.gov/Global/v1.0}positivePriceType"/>
 *         &lt;element name="costPrice" type="{http://fas.gsa.gov/Global/v1.0}positivePriceType"/>
 *         &lt;element name="minQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDDItemPrice", propOrder = {
    "eddItem",
    "sellPrice",
    "costPrice",
    "minQuantity",
    "zoneNumber"
})
public class EDDItemPrice {

    @XmlElement(required = true)
    protected EDDItem eddItem;
    @XmlElement(required = true, nillable = true)
    protected String sellPrice;
    @XmlElement(required = true, nillable = true)
    protected String costPrice;
    protected int minQuantity;
    protected int zoneNumber;

    /**
     * Gets the value of the eddItem property.
     * 
     * @return
     *     possible object is
     *     {@link EDDItem }
     *     
     */
    public EDDItem getEddItem() {
        return eddItem;
    }

    /**
     * Sets the value of the eddItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDDItem }
     *     
     */
    public void setEddItem(EDDItem value) {
        this.eddItem = value;
    }

    /**
     * Gets the value of the sellPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellPrice() {
        return sellPrice;
    }

    /**
     * Sets the value of the sellPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellPrice(String value) {
        this.sellPrice = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostPrice(String value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the minQuantity property.
     * 
     */
    public int getMinQuantity() {
        return minQuantity;
    }

    /**
     * Sets the value of the minQuantity property.
     * 
     */
    public void setMinQuantity(int value) {
        this.minQuantity = value;
    }

    /**
     * Gets the value of the zoneNumber property.
     * 
     */
    public int getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     * 
     */
    public void setZoneNumber(int value) {
        this.zoneNumber = value;
    }

}
