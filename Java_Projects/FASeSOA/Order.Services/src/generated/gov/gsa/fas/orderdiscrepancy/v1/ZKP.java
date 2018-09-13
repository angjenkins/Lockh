
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZKP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZKP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discrepancyKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resubmitFlag" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="createdUserCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
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
@XmlType(name = "ZKP", propOrder = {
    "discrepancyKey",
    "resubmitFlag",
    "createdUserCode",
    "requisitionNumber",
    "requisitionSuffix"
})
public class ZKP {

    protected long discrepancyKey;
    protected short resubmitFlag;
    @XmlElement(required = true)
    protected String createdUserCode;
    @XmlElement(required = true)
    protected String requisitionNumber;
    @XmlElement(required = true, nillable = true)
    protected String requisitionSuffix;

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
