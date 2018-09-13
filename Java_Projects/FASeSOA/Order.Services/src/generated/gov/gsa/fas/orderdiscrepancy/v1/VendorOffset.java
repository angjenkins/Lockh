
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorOffset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offsetAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="acoName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="problemType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorOffset", propOrder = {
    "discrepancyKey",
    "poNumber",
    "contractNumber",
    "offsetAmount",
    "createdUserCode",
    "acoName",
    "problemType"
})
public class VendorOffset {

    protected long discrepancyKey;
    @XmlElement(required = true)
    protected String poNumber;
    @XmlElement(required = true)
    protected String contractNumber;
    protected long offsetAmount;
    @XmlElement(required = true)
    protected String createdUserCode;
    @XmlElement(required = true)
    protected String acoName;
    @XmlElement(required = true)
    protected String problemType;

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
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the offsetAmount property.
     * 
     */
    public long getOffsetAmount() {
        return offsetAmount;
    }

    /**
     * Sets the value of the offsetAmount property.
     * 
     */
    public void setOffsetAmount(long value) {
        this.offsetAmount = value;
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
     * Gets the value of the acoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcoName() {
        return acoName;
    }

    /**
     * Sets the value of the acoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcoName(String value) {
        this.acoName = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemType(String value) {
        this.problemType = value;
    }

}
