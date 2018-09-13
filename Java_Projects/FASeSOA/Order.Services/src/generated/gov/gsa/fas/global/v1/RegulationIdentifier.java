
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regulationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regulationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regulationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationIdentifier", propOrder = {
    "regulationNumber",
    "regulationType",
    "regulationSequenceNumber"
})
public class RegulationIdentifier {

    @XmlElement(required = true)
    protected String regulationNumber;
    @XmlElement(required = true)
    protected String regulationType;
    @XmlElement(required = true)
    protected String regulationSequenceNumber;

    /**
     * Gets the value of the regulationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationNumber() {
        return regulationNumber;
    }

    /**
     * Sets the value of the regulationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationNumber(String value) {
        this.regulationNumber = value;
    }

    /**
     * Gets the value of the regulationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationType() {
        return regulationType;
    }

    /**
     * Sets the value of the regulationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationType(String value) {
        this.regulationType = value;
    }

    /**
     * Gets the value of the regulationSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationSequenceNumber() {
        return regulationSequenceNumber;
    }

    /**
     * Sets the value of the regulationSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationSequenceNumber(String value) {
        this.regulationSequenceNumber = value;
    }

}
