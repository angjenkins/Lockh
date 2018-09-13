
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="transportation" type="{http://fas.gsa.gov/Order/v1.0}Transportation" minOccurs="0"/>
 *         &lt;element name="exportInfo" type="{http://fas.gsa.gov/Order/v1.0}ExportInfo" minOccurs="0"/>
 *         &lt;element name="carrierTrackingDetails" type="{http://fas.gsa.gov/Order/v1.0}CarrierTrackingDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentInfo", propOrder = {
    "actualShipDate",
    "transportation",
    "exportInfo",
    "carrierTrackingDetails"
})
public class ShipmentInfo {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualShipDate;
    protected Transportation transportation;
    protected ExportInfo exportInfo;
    protected CarrierTrackingDetails carrierTrackingDetails;

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link Transportation }
     *     
     */
    public Transportation getTransportation() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transportation }
     *     
     */
    public void setTransportation(Transportation value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the exportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExportInfo }
     *     
     */
    public ExportInfo getExportInfo() {
        return exportInfo;
    }

    /**
     * Sets the value of the exportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportInfo }
     *     
     */
    public void setExportInfo(ExportInfo value) {
        this.exportInfo = value;
    }

    /**
     * Gets the value of the carrierTrackingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierTrackingDetails }
     *     
     */
    public CarrierTrackingDetails getCarrierTrackingDetails() {
        return carrierTrackingDetails;
    }

    /**
     * Sets the value of the carrierTrackingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierTrackingDetails }
     *     
     */
    public void setCarrierTrackingDetails(CarrierTrackingDetails value) {
        this.carrierTrackingDetails = value;
    }

}
