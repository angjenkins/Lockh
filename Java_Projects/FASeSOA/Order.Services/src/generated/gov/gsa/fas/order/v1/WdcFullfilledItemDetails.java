
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WdcFullfilledItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcFullfilledItemDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fas.gsa.gov/Order/v1.0}WdcItemDetails">
 *       &lt;sequence>
 *         &lt;element name="administrativeContractingOffice" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="shippedQuantity" type="{http://fas.gsa.gov/Order/v1.0}ItemQuantity" minOccurs="0"/>
 *         &lt;element name="quantityCut" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="unitWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shipmentInfo" type="{http://fas.gsa.gov/Order/v1.0}ShipmentInfo" minOccurs="0"/>
 *         &lt;element name="dunsNumber" type="{http://fas.gsa.gov/Global/v1.0}string10" minOccurs="0"/>
 *         &lt;element name="variance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status" type="{http://fas.gsa.gov/Global/v1.0}string2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcFullfilledItemDetails", propOrder = {
    "administrativeContractingOffice",
    "shippedQuantity",
    "quantityCut",
    "estimatedShipDate",
    "unitWeight",
    "shipmentInfo",
    "dunsNumber",
    "variance",
    "billedDate",
    "status"
})
public class WdcFullfilledItemDetails
    extends WdcItemDetails
{

    protected String administrativeContractingOffice;
    protected ItemQuantity shippedQuantity;
    protected Double quantityCut;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estimatedShipDate;
    protected Double unitWeight;
    protected ShipmentInfo shipmentInfo;
    protected String dunsNumber;
    protected String variance;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billedDate;
    protected String status;

    /**
     * Gets the value of the administrativeContractingOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeContractingOffice() {
        return administrativeContractingOffice;
    }

    /**
     * Sets the value of the administrativeContractingOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeContractingOffice(String value) {
        this.administrativeContractingOffice = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemQuantity }
     *     
     */
    public ItemQuantity getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQuantity }
     *     
     */
    public void setShippedQuantity(ItemQuantity value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the quantityCut property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCut() {
        return quantityCut;
    }

    /**
     * Sets the value of the quantityCut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCut(Double value) {
        this.quantityCut = value;
    }

    /**
     * Gets the value of the estimatedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedShipDate() {
        return estimatedShipDate;
    }

    /**
     * Sets the value of the estimatedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedShipDate(XMLGregorianCalendar value) {
        this.estimatedShipDate = value;
    }

    /**
     * Gets the value of the unitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets the value of the unitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitWeight(Double value) {
        this.unitWeight = value;
    }

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInfo }
     *     
     */
    public ShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInfo }
     *     
     */
    public void setShipmentInfo(ShipmentInfo value) {
        this.shipmentInfo = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunsNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunsNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariance(String value) {
        this.variance = value;
    }

    /**
     * Gets the value of the billedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBilledDate() {
        return billedDate;
    }

    /**
     * Sets the value of the billedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBilledDate(XMLGregorianCalendar value) {
        this.billedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
