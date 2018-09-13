
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WdcOrderCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcOrderCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signalCode" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *         &lt;element name="fundCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="projectCode" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *         &lt;element name="priorityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distributionCode" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcOrderCodes", propOrder = {
    "signalCode",
    "fundCode",
    "projectCode",
    "priorityCode",
    "distributionCode"
})
public class WdcOrderCodes {

    @XmlElement(required = true, nillable = true)
    protected String signalCode;
    @XmlElement(required = true, nillable = true)
    protected String fundCode;
    @XmlElement(required = true, nillable = true)
    protected String projectCode;
    @XmlElement(required = true, nillable = true)
    protected String priorityCode;
    @XmlElement(required = true, nillable = true)
    protected String distributionCode;

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
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the distributionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCode() {
        return distributionCode;
    }

    /**
     * Sets the value of the distributionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCode(String value) {
        this.distributionCode = value;
    }

}
