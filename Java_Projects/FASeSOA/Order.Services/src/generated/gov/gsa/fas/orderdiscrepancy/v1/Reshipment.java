
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reshipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reshipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="docIdentifierExtension" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="routingIdentifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediaStatus" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="discrepancyItem" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}DiscrepancyItem"/>
 *         &lt;element name="supplementAddrAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="orderCodes" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}WdcOrderCodes"/>
 *         &lt;element name="requiredDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transportDispositionCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reshipment", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "docIdentifierExtension",
    "routingIdentifierCode",
    "mediaStatus",
    "discrepancyItem",
    "supplementAddrAAC",
    "orderCodes",
    "requiredDeliveryDate",
    "adviceCode",
    "transportDispositionCode",
    "createdUserCode"
})
public class Reshipment {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected String docIdentifierExtension;
    @XmlElement(required = true)
    protected String routingIdentifierCode;
    @XmlElement(required = true)
    protected String mediaStatus;
    @XmlElement(required = true)
    protected DiscrepancyItem discrepancyItem;
    @XmlElement(required = true, nillable = true)
    protected String supplementAddrAAC;
    @XmlElement(required = true)
    protected WdcOrderCodes orderCodes;
    @XmlElement(required = true)
    protected String requiredDeliveryDate;
    @XmlElement(required = true)
    protected String adviceCode;
    @XmlElement(required = true)
    protected String transportDispositionCode;
    @XmlElement(required = true)
    protected String createdUserCode;

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
     * Gets the value of the docIdentifierExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdentifierExtension() {
        return docIdentifierExtension;
    }

    /**
     * Sets the value of the docIdentifierExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdentifierExtension(String value) {
        this.docIdentifierExtension = value;
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
     * Gets the value of the mediaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaStatus() {
        return mediaStatus;
    }

    /**
     * Sets the value of the mediaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaStatus(String value) {
        this.mediaStatus = value;
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
     * Gets the value of the orderCodes property.
     * 
     * @return
     *     possible object is
     *     {@link WdcOrderCodes }
     *     
     */
    public WdcOrderCodes getOrderCodes() {
        return orderCodes;
    }

    /**
     * Sets the value of the orderCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdcOrderCodes }
     *     
     */
    public void setOrderCodes(WdcOrderCodes value) {
        this.orderCodes = value;
    }

    /**
     * Gets the value of the requiredDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    /**
     * Sets the value of the requiredDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDeliveryDate(String value) {
        this.requiredDeliveryDate = value;
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

    /**
     * Gets the value of the transportDispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportDispositionCode() {
        return transportDispositionCode;
    }

    /**
     * Sets the value of the transportDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportDispositionCode(String value) {
        this.transportDispositionCode = value;
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

}
