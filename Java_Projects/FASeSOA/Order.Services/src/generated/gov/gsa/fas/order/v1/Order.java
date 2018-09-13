
package gov.gsa.fas.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.gsa.fas.global.v1.Address;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://fas.gsa.gov/Order/v1.0}OrderOrigin"/>
 *         &lt;element name="orderNumber" type="{http://fas.gsa.gov/Order/v1.0}OrderNumber"/>
 *         &lt;element name="gecoOrderNumber" type="{http://fas.gsa.gov/Order/v1.0}GecoOrderNumber" minOccurs="0"/>
 *         &lt;element name="ggsSessionNumber" type="{http://fas.gsa.gov/Order/v1.0}GgsSessionNumber" minOccurs="0"/>
 *         &lt;element name="aac" type="{http://fas.gsa.gov/Order/v1.0}ActivityAddressCode"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="store" type="{http://fas.gsa.gov/Order/v1.0}Store" minOccurs="0"/>
 *         &lt;element name="liid" type="{http://fas.gsa.gov/Order/v1.0}liid" minOccurs="0"/>
 *         &lt;element name="orderAddress" type="{http://fas.gsa.gov/Global/v1.0}Address" minOccurs="0"/>
 *         &lt;element name="lineItemList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lineItem" type="{http://fas.gsa.gov/Order/v1.0}LineItem" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "type",
    "orderNumber",
    "gecoOrderNumber",
    "ggsSessionNumber",
    "aac",
    "orderDate",
    "store",
    "liid",
    "orderAddress",
    "lineItemList"
})
public class Order {

    @XmlElement(required = true)
    protected OrderOrigin type;
    @XmlElement(required = true)
    protected OrderNumber orderNumber;
    protected String gecoOrderNumber;
    protected String ggsSessionNumber;
    @XmlElement(required = true)
    protected ActivityAddressCode aac;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    protected Store store;
    protected Liid liid;
    protected Address orderAddress;
    @XmlElement(required = true)
    protected Order.LineItemList lineItemList;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOrigin }
     *     
     */
    public OrderOrigin getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOrigin }
     *     
     */
    public void setType(OrderOrigin value) {
        this.type = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link OrderNumber }
     *     
     */
    public OrderNumber getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderNumber }
     *     
     */
    public void setOrderNumber(OrderNumber value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the gecoOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGecoOrderNumber() {
        return gecoOrderNumber;
    }

    /**
     * Sets the value of the gecoOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGecoOrderNumber(String value) {
        this.gecoOrderNumber = value;
    }

    /**
     * Gets the value of the ggsSessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGgsSessionNumber() {
        return ggsSessionNumber;
    }

    /**
     * Sets the value of the ggsSessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGgsSessionNumber(String value) {
        this.ggsSessionNumber = value;
    }

    /**
     * Gets the value of the aac property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAddressCode }
     *     
     */
    public ActivityAddressCode getAac() {
        return aac;
    }

    /**
     * Sets the value of the aac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAddressCode }
     *     
     */
    public void setAac(ActivityAddressCode value) {
        this.aac = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link Store }
     *     
     */
    public Store getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link Store }
     *     
     */
    public void setStore(Store value) {
        this.store = value;
    }

    /**
     * Gets the value of the liid property.
     * 
     * @return
     *     possible object is
     *     {@link Liid }
     *     
     */
    public Liid getLiid() {
        return liid;
    }

    /**
     * Sets the value of the liid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liid }
     *     
     */
    public void setLiid(Liid value) {
        this.liid = value;
    }

    /**
     * Gets the value of the orderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOrderAddress() {
        return orderAddress;
    }

    /**
     * Sets the value of the orderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOrderAddress(Address value) {
        this.orderAddress = value;
    }

    /**
     * Gets the value of the lineItemList property.
     * 
     * @return
     *     possible object is
     *     {@link Order.LineItemList }
     *     
     */
    public Order.LineItemList getLineItemList() {
        return lineItemList;
    }

    /**
     * Sets the value of the lineItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.LineItemList }
     *     
     */
    public void setLineItemList(Order.LineItemList value) {
        this.lineItemList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lineItem" type="{http://fas.gsa.gov/Order/v1.0}LineItem" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lineItem"
    })
    public static class LineItemList {

        @XmlElement(required = true)
        protected List<LineItem> lineItem;

        /**
         * Gets the value of the lineItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineItem }
         * 
         * 
         */
        public List<LineItem> getLineItem() {
            if (lineItem == null) {
                lineItem = new ArrayList<LineItem>();
            }
            return this.lineItem;
        }

    }

}
