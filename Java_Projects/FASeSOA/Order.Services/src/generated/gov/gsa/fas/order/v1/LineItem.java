
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumber" type="{http://fas.gsa.gov/Order/v1.0}ItemNumber"/>
 *         &lt;element name="quantity" type="{http://fas.gsa.gov/Order/v1.0}ItemQuantity"/>
 *         &lt;element name="cscItemDetails" type="{http://fas.gsa.gov/Order/v1.0}CscItemDetails" minOccurs="0"/>
 *         &lt;element name="wdcOrderedItemDetails" type="{http://fas.gsa.gov/Order/v1.0}WdcOrderedItemDetails" minOccurs="0"/>
 *         &lt;element name="wdcFulfilledItemDetails" type="{http://fas.gsa.gov/Order/v1.0}WdcFullfilledItemDetails" minOccurs="0"/>
 *         &lt;element name="wdcProcessStages" type="{http://fas.gsa.gov/Order/v1.0}WdcProcessStageList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "itemNumber",
    "quantity",
    "cscItemDetails",
    "wdcOrderedItemDetails",
    "wdcFulfilledItemDetails",
    "wdcProcessStages"
})
public class LineItem {

    @XmlElement(required = true)
    protected ItemNumber itemNumber;
    @XmlElement(required = true)
    protected ItemQuantity quantity;
    protected CscItemDetails cscItemDetails;
    protected WdcOrderedItemDetails wdcOrderedItemDetails;
    protected WdcFullfilledItemDetails wdcFulfilledItemDetails;
    protected WdcProcessStageList wdcProcessStages;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumber }
     *     
     */
    public ItemNumber getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumber }
     *     
     */
    public void setItemNumber(ItemNumber value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemQuantity }
     *     
     */
    public ItemQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQuantity }
     *     
     */
    public void setQuantity(ItemQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the cscItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CscItemDetails }
     *     
     */
    public CscItemDetails getCscItemDetails() {
        return cscItemDetails;
    }

    /**
     * Sets the value of the cscItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CscItemDetails }
     *     
     */
    public void setCscItemDetails(CscItemDetails value) {
        this.cscItemDetails = value;
    }

    /**
     * Gets the value of the wdcOrderedItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WdcOrderedItemDetails }
     *     
     */
    public WdcOrderedItemDetails getWdcOrderedItemDetails() {
        return wdcOrderedItemDetails;
    }

    /**
     * Sets the value of the wdcOrderedItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdcOrderedItemDetails }
     *     
     */
    public void setWdcOrderedItemDetails(WdcOrderedItemDetails value) {
        this.wdcOrderedItemDetails = value;
    }

    /**
     * Gets the value of the wdcFulfilledItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WdcFullfilledItemDetails }
     *     
     */
    public WdcFullfilledItemDetails getWdcFulfilledItemDetails() {
        return wdcFulfilledItemDetails;
    }

    /**
     * Sets the value of the wdcFulfilledItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdcFullfilledItemDetails }
     *     
     */
    public void setWdcFulfilledItemDetails(WdcFullfilledItemDetails value) {
        this.wdcFulfilledItemDetails = value;
    }

    /**
     * Gets the value of the wdcProcessStages property.
     * 
     * @return
     *     possible object is
     *     {@link WdcProcessStageList }
     *     
     */
    public WdcProcessStageList getWdcProcessStages() {
        return wdcProcessStages;
    }

    /**
     * Sets the value of the wdcProcessStages property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdcProcessStageList }
     *     
     */
    public void setWdcProcessStages(WdcProcessStageList value) {
        this.wdcProcessStages = value;
    }

}
