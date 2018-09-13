
package gov.gsa.fas.ordersession.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionNumber" type="{http://fas.gsa.gov/OrderSession/v1.0}OrderSessionIdentifier"/>
 *         &lt;element name="lineItemList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lineItemListing" type="{http://fas.gsa.gov/OrderSession/v1.0}LineItemListing" maxOccurs="unbounded"/>
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
@XmlType(name = "OrderSession", propOrder = {
    "sessionNumber",
    "lineItemList"
})
public class OrderSession {

    @XmlElement(required = true)
    protected String sessionNumber;
    @XmlElement(required = true)
    protected OrderSession.LineItemList lineItemList;

    /**
     * Gets the value of the sessionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionNumber() {
        return sessionNumber;
    }

    /**
     * Sets the value of the sessionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionNumber(String value) {
        this.sessionNumber = value;
    }

    /**
     * Gets the value of the lineItemList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSession.LineItemList }
     *     
     */
    public OrderSession.LineItemList getLineItemList() {
        return lineItemList;
    }

    /**
     * Sets the value of the lineItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSession.LineItemList }
     *     
     */
    public void setLineItemList(OrderSession.LineItemList value) {
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
     *         &lt;element name="lineItemListing" type="{http://fas.gsa.gov/OrderSession/v1.0}LineItemListing" maxOccurs="unbounded"/>
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
        "lineItemListing"
    })
    public static class LineItemList {

        @XmlElement(required = true)
        protected List<LineItemListing> lineItemListing;

        /**
         * Gets the value of the lineItemListing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineItemListing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineItemListing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineItemListing }
         * 
         * 
         */
        public List<LineItemListing> getLineItemListing() {
            if (lineItemListing == null) {
                lineItemListing = new ArrayList<LineItemListing>();
            }
            return this.lineItemListing;
        }

    }

}
