
package gov.gsa.fas.pricing.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NIINItemPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NIINItemPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niinItem" type="{http://fas.gsa.gov/Pricing/v1.0}NIINItem"/>
 *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sellPrice" type="{http://fas.gsa.gov/Global/v1.0}positivePriceType"/>
 *         &lt;element name="costPrice" type="{http://fas.gsa.gov/Global/v1.0}positivePriceType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitOfIssue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitWeight" type="{http://fas.gsa.gov/Global/v1.0}positiveNumType_3"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="standardPack" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shelfLife" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subNiin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NIINItemPrice", propOrder = {
    "niinItem",
    "store",
    "sellPrice",
    "costPrice",
    "description",
    "unitOfIssue",
    "unitWeight",
    "quantityOnHand",
    "standardPack",
    "shelfLife",
    "subNiin"
})
public class NIINItemPrice {

    @XmlElement(required = true)
    protected NIINItem niinItem;
    @XmlElement(required = true)
    protected String store;
    @XmlElement(required = true)
    protected String sellPrice;
    @XmlElement(required = true)
    protected String costPrice;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String unitOfIssue;
    @XmlElement(required = true)
    protected String unitWeight;
    protected double quantityOnHand;
    protected int standardPack;
    @XmlElement(required = true)
    protected String shelfLife;
    @XmlElement(required = true)
    protected String subNiin;

    /**
     * Gets the value of the niinItem property.
     * 
     * @return
     *     possible object is
     *     {@link NIINItem }
     *     
     */
    public NIINItem getNiinItem() {
        return niinItem;
    }

    /**
     * Sets the value of the niinItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NIINItem }
     *     
     */
    public void setNiinItem(NIINItem value) {
        this.niinItem = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
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
     * Gets the value of the unitOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfIssue() {
        return unitOfIssue;
    }

    /**
     * Sets the value of the unitOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfIssue(String value) {
        this.unitOfIssue = value;
    }

    /**
     * Gets the value of the unitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets the value of the unitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitWeight(String value) {
        this.unitWeight = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     */
    public double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     */
    public void setQuantityOnHand(double value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the standardPack property.
     * 
     */
    public int getStandardPack() {
        return standardPack;
    }

    /**
     * Sets the value of the standardPack property.
     * 
     */
    public void setStandardPack(int value) {
        this.standardPack = value;
    }

    /**
     * Gets the value of the shelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * Sets the value of the shelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelfLife(String value) {
        this.shelfLife = value;
    }

    /**
     * Gets the value of the subNiin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNiin() {
        return subNiin;
    }

    /**
     * Sets the value of the subNiin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNiin(String value) {
        this.subNiin = value;
    }

}
