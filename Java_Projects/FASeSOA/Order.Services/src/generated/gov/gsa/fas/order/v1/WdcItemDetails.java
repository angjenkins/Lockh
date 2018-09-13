
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WdcItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcItemDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsn" type="{http://fas.gsa.gov/Global/v1.0}string15" minOccurs="0"/>
 *         &lt;element name="orderPrice" type="{http://fas.gsa.gov/Global/v1.0}priceType" minOccurs="0"/>
 *         &lt;element name="costPrice" type="{http://fas.gsa.gov/Global/v1.0}priceType" minOccurs="0"/>
 *         &lt;element name="routingIdentitierCode" type="{http://fas.gsa.gov/Global/v1.0}string3" minOccurs="0"/>
 *         &lt;element name="transactionDispositionCode" type="{http://fas.gsa.gov/Global/v1.0}string2" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://fas.gsa.gov/Order/v1.0}ItemQuantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcItemDetails", propOrder = {
    "nsn",
    "orderPrice",
    "costPrice",
    "routingIdentitierCode",
    "transactionDispositionCode",
    "quantity"
})
public abstract class WdcItemDetails {

    protected String nsn;
    protected String orderPrice;
    protected String costPrice;
    protected String routingIdentitierCode;
    protected String transactionDispositionCode;
    protected ItemQuantity quantity;

    /**
     * Gets the value of the nsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNsn() {
        return nsn;
    }

    /**
     * Sets the value of the nsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNsn(String value) {
        this.nsn = value;
    }

    /**
     * Gets the value of the orderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderPrice() {
        return orderPrice;
    }

    /**
     * Sets the value of the orderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderPrice(String value) {
        this.orderPrice = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostPrice(String value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the routingIdentitierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingIdentitierCode() {
        return routingIdentitierCode;
    }

    /**
     * Sets the value of the routingIdentitierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingIdentitierCode(String value) {
        this.routingIdentitierCode = value;
    }

    /**
     * Gets the value of the transactionDispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDispositionCode() {
        return transactionDispositionCode;
    }

    /**
     * Sets the value of the transactionDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDispositionCode(String value) {
        this.transactionDispositionCode = value;
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

}
