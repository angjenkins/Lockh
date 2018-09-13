
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Finance305 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Finance305">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="discrepancyItem" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}DiscrepancyItem"/>
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rtgId" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *         &lt;element name="comCtrCd" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="supplementAddrAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="orderCodes" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}WdcOrderCodes"/>
 *         &lt;element name="extSellValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sellPrice" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="agencyDetails" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}AgencyDetails"/>
 *         &lt;element name="exportDomesticCode" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="actionCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="manifestPONumber" type="{http://fas.gsa.gov/Global/v1.0}string8"/>
 *         &lt;element name="fasPONumber" type="{http://fas.gsa.gov/Global/v1.0}string10"/>
 *         &lt;element name="boac" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="region" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
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
@XmlType(name = "Finance305", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "discrepancyItem",
    "recordId",
    "rtgId",
    "comCtrCd",
    "supplementAddrAAC",
    "orderCodes",
    "extSellValue",
    "sellPrice",
    "agencyDetails",
    "exportDomesticCode",
    "actionCode",
    "manifestPONumber",
    "fasPONumber",
    "boac",
    "region",
    "adviceCode"
})
public class Finance305 {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected DiscrepancyItem discrepancyItem;
    protected int recordId;
    @XmlElement(required = true)
    protected String rtgId;
    @XmlElement(required = true, nillable = true)
    protected String comCtrCd;
    @XmlElement(required = true, nillable = true)
    protected String supplementAddrAAC;
    @XmlElement(required = true)
    protected WdcOrderCodes orderCodes;
    protected long extSellValue;
    protected long sellPrice;
    @XmlElement(required = true)
    protected AgencyDetails agencyDetails;
    @XmlElement(required = true)
    protected String exportDomesticCode;
    @XmlElement(required = true)
    protected String actionCode;
    @XmlElement(required = true)
    protected String manifestPONumber;
    @XmlElement(required = true)
    protected String fasPONumber;
    @XmlElement(required = true)
    protected String boac;
    @XmlElement(required = true)
    protected String region;
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
     * Gets the value of the recordId property.
     * 
     */
    public int getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     */
    public void setRecordId(int value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the rtgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgId() {
        return rtgId;
    }

    /**
     * Sets the value of the rtgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgId(String value) {
        this.rtgId = value;
    }

    /**
     * Gets the value of the comCtrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCtrCd() {
        return comCtrCd;
    }

    /**
     * Sets the value of the comCtrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCtrCd(String value) {
        this.comCtrCd = value;
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
     * Gets the value of the extSellValue property.
     * 
     */
    public long getExtSellValue() {
        return extSellValue;
    }

    /**
     * Sets the value of the extSellValue property.
     * 
     */
    public void setExtSellValue(long value) {
        this.extSellValue = value;
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
     * Gets the value of the manifestPONumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestPONumber() {
        return manifestPONumber;
    }

    /**
     * Sets the value of the manifestPONumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestPONumber(String value) {
        this.manifestPONumber = value;
    }

    /**
     * Gets the value of the fasPONumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasPONumber() {
        return fasPONumber;
    }

    /**
     * Sets the value of the fasPONumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasPONumber(String value) {
        this.fasPONumber = value;
    }

    /**
     * Gets the value of the boac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoac() {
        return boac;
    }

    /**
     * Sets the value of the boac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoac(String value) {
        this.boac = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
