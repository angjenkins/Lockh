
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscrepancyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitCode" type="{http://fas.gsa.gov/Global/v1.0}string2"/>
 *         &lt;element name="adjustedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DiscrepancyItem", propOrder = {
    "niin",
    "unitCode",
    "adjustedQuantity",
    "requisitionNumber",
    "requisitionSuffix"
})
public class DiscrepancyItem {

    @XmlElement(required = true)
    protected String niin;
    @XmlElement(required = true)
    protected String unitCode;
    protected int adjustedQuantity;
    @XmlElement(required = true)
    protected String requisitionNumber;
    @XmlElement(required = true, nillable = true)
    protected String requisitionSuffix;

    /**
     * Gets the value of the niin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiin() {
        return niin;
    }

    /**
     * Sets the value of the niin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiin(String value) {
        this.niin = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the adjustedQuantity property.
     * 
     */
    public int getAdjustedQuantity() {
        return adjustedQuantity;
    }

    /**
     * Sets the value of the adjustedQuantity property.
     * 
     */
    public void setAdjustedQuantity(int value) {
        this.adjustedQuantity = value;
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
