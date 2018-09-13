
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZSA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZSA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="discrepancyItem" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}DiscrepancyItem"/>
 *         &lt;element name="costPrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sellPrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="actionCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="adviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZSA", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "discrepancyItem",
    "costPrice",
    "sellPrice",
    "createdUserCode",
    "actionCode",
    "adviceCode"
})
public class ZSA {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected DiscrepancyItem discrepancyItem;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long costPrice;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long sellPrice;
    @XmlElement(required = true)
    protected String createdUserCode;
    @XmlElement(required = true)
    protected String actionCode;
    @XmlElement(required = true)
    protected String adviceCode;

    /**
     * Gets the value of the discrepancyKey property.
     * 
     */
    public long getDiscrepancyKey() {
        return discrepancyKey;
    }

    /**
     * Sets the value of the discrepancyKey property.
     * 
     */
    public void setDiscrepancyKey(long value) {
        this.discrepancyKey = value;
    }

    /**
     * Gets the value of the resubmitFlag property.
     * 
     */
    public short getResubmitFlag() {
        return resubmitFlag;
    }

    /**
     * Sets the value of the resubmitFlag property.
     * 
     */
    public void setResubmitFlag(short value) {
        this.resubmitFlag = value;
    }

    /**
     * Gets the value of the discrepancyItem property.
     * 
     * @return
     *     possible object is
     *     {@link DiscrepancyItem }
     *     
     */
    public DiscrepancyItem getDiscrepancyItem() {
        return discrepancyItem;
    }

    /**
     * Sets the value of the discrepancyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscrepancyItem }
     *     
     */
    public void setDiscrepancyItem(DiscrepancyItem value) {
        this.discrepancyItem = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostPrice(Long value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the sellPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSellPrice() {
        return sellPrice;
    }

    /**
     * Sets the value of the sellPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSellPrice(Long value) {
        this.sellPrice = value;
    }

    /**
     * Gets the value of the createdUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserCode() {
        return createdUserCode;
    }

    /**
     * Sets the value of the createdUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserCode(String value) {
        this.createdUserCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the adviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviceCode() {
        return adviceCode;
    }

    /**
     * Sets the value of the adviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviceCode(String value) {
        this.adviceCode = value;
    }

}
