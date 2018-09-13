
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaterialReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="discrepancyItem" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}DiscrepancyItem"/>
 *         &lt;element name="supplementAddrAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="signalCode" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="fundCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="routingIdentifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adjustedValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="liabilityCode" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialReturn", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "discrepancyItem",
    "supplementAddrAAC",
    "signalCode",
    "fundCode",
    "routingIdentifierCode",
    "adjustedValue",
    "createdUserCode",
    "liabilityCode"
})
public class MaterialReturn {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected DiscrepancyItem discrepancyItem;
    @XmlElement(required = true, nillable = true)
    protected String supplementAddrAAC;
    @XmlElement(required = true, nillable = true)
    protected String signalCode;
    @XmlElement(required = true, nillable = true)
    protected String fundCode;
    @XmlElement(required = true)
    protected String routingIdentifierCode;
    protected long adjustedValue;
    @XmlElement(required = true)
    protected String createdUserCode;
    @XmlElement(required = true)
    protected String liabilityCode;

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
     * Gets the value of the supplementAddrAAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementAddrAAC() {
        return supplementAddrAAC;
    }

    /**
     * Sets the value of the supplementAddrAAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementAddrAAC(String value) {
        this.supplementAddrAAC = value;
    }

    /**
     * Gets the value of the signalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalCode() {
        return signalCode;
    }

    /**
     * Sets the value of the signalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalCode(String value) {
        this.signalCode = value;
    }

    /**
     * Gets the value of the fundCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Sets the value of the fundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundCode(String value) {
        this.fundCode = value;
    }

    /**
     * Gets the value of the routingIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingIdentifierCode() {
        return routingIdentifierCode;
    }

    /**
     * Sets the value of the routingIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingIdentifierCode(String value) {
        this.routingIdentifierCode = value;
    }

    /**
     * Gets the value of the adjustedValue property.
     * 
     */
    public long getAdjustedValue() {
        return adjustedValue;
    }

    /**
     * Sets the value of the adjustedValue property.
     * 
     */
    public void setAdjustedValue(long value) {
        this.adjustedValue = value;
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
     * Gets the value of the liabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiabilityCode() {
        return liabilityCode;
    }

    /**
     * Sets the value of the liabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiabilityCode(String value) {
        this.liabilityCode = value;
    }

}
