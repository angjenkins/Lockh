
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZLA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZLA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="routingIdentifierCode" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *         &lt;element name="discrepancyItem" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}DiscrepancyItem"/>
 *         &lt;element name="supplementAddrAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="orderCodes" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}WdcOrderCodes"/>
 *         &lt;element name="sellPrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="docIdentifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="costPrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="agencyDetails" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}AgencyDetails"/>
 *         &lt;element name="consigneeAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="exportDomesticCode" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
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
@XmlType(name = "ZLA", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "routingIdentifierCode",
    "discrepancyItem",
    "supplementAddrAAC",
    "orderCodes",
    "sellPrice",
    "docIdentifierCode",
    "shippedDate",
    "costPrice",
    "agencyDetails",
    "consigneeAAC",
    "poNumber",
    "actionCode",
    "exportDomesticCode",
    "createdUserCode",
    "adviceCode"
})
public class ZLA {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected String routingIdentifierCode;
    @XmlElement(required = true)
    protected DiscrepancyItem discrepancyItem;
    @XmlElement(required = true, nillable = true)
    protected String supplementAddrAAC;
    @XmlElement(required = true)
    protected WdcOrderCodes orderCodes;
    protected long sellPrice;
    @XmlElement(required = true)
    protected String docIdentifierCode;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippedDate;
    protected long costPrice;
    @XmlElement(required = true)
    protected AgencyDetails agencyDetails;
    @XmlElement(required = true, nillable = true)
    protected String consigneeAAC;
    @XmlElement(required = true)
    protected String poNumber;
    @XmlElement(required = true)
    protected String actionCode;
    @XmlElement(required = true, nillable = true)
    protected String exportDomesticCode;
    @XmlElement(required = true)
    protected String createdUserCode;
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
     * Gets the value of the sellPrice property.
     * 
     */
    public long getSellPrice() {
        return sellPrice;
    }

    /**
     * Sets the value of the sellPrice property.
     * 
     */
    public void setSellPrice(long value) {
        this.sellPrice = value;
    }

    /**
     * Gets the value of the docIdentifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdentifierCode() {
        return docIdentifierCode;
    }

    /**
     * Sets the value of the docIdentifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdentifierCode(String value) {
        this.docIdentifierCode = value;
    }

    /**
     * Gets the value of the shippedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippedDate() {
        return shippedDate;
    }

    /**
     * Sets the value of the shippedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippedDate(XMLGregorianCalendar value) {
        this.shippedDate = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     */
    public long getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     */
    public void setCostPrice(long value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the agencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyDetails }
     *     
     */
    public AgencyDetails getAgencyDetails() {
        return agencyDetails;
    }

    /**
     * Sets the value of the agencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyDetails }
     *     
     */
    public void setAgencyDetails(AgencyDetails value) {
        this.agencyDetails = value;
    }

    /**
     * Gets the value of the consigneeAAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsigneeAAC() {
        return consigneeAAC;
    }

    /**
     * Sets the value of the consigneeAAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsigneeAAC(String value) {
        this.consigneeAAC = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
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
     * Gets the value of the exportDomesticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDomesticCode() {
        return exportDomesticCode;
    }

    /**
     * Sets the value of the exportDomesticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDomesticCode(String value) {
        this.exportDomesticCode = value;
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
