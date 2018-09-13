
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://fas.gsa.gov/Order/v1.0}ExportType"/>
 *         &lt;element name="exportPackingFacility" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="pointOfEmbarkation" type="{http://fas.gsa.gov/Global/v1.0}string3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportInfo", propOrder = {
    "type",
    "exportPackingFacility",
    "pointOfEmbarkation"
})
public class ExportInfo {

    @XmlElement(required = true)
    protected ExportType type;
    protected String exportPackingFacility;
    protected String pointOfEmbarkation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExportType }
     *     
     */
    public ExportType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportType }
     *     
     */
    public void setType(ExportType value) {
        this.type = value;
    }

    /**
     * Gets the value of the exportPackingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportPackingFacility() {
        return exportPackingFacility;
    }

    /**
     * Sets the value of the exportPackingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportPackingFacility(String value) {
        this.exportPackingFacility = value;
    }

    /**
     * Gets the value of the pointOfEmbarkation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfEmbarkation() {
        return pointOfEmbarkation;
    }

    /**
     * Sets the value of the pointOfEmbarkation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfEmbarkation(String value) {
        this.pointOfEmbarkation = value;
    }

}
