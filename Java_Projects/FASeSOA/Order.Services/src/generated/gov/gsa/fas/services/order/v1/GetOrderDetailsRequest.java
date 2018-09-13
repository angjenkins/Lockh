
package gov.gsa.fas.services.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.order.v1.OrderNumber;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="orderNumber" type="{http://fas.gsa.gov/Order/v1.0}OrderNumber"/>
 *         &lt;element name="gecoNumber" type="{http://fas.gsa.gov/Order/v1.0}GecoOrderNumber"/>
 *         &lt;element name="ggsSessionNumber" type="{http://fas.gsa.gov/Order/v1.0}GgsSessionNumber"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderNumber",
    "gecoNumber",
    "ggsSessionNumber"
})
@XmlRootElement(name = "GetOrderDetailsRequest")
public class GetOrderDetailsRequest {

    protected OrderNumber orderNumber;
    protected String gecoNumber;
    protected String ggsSessionNumber;

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
     * Gets the value of the gecoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGecoNumber() {
        return gecoNumber;
    }

    /**
     * Sets the value of the gecoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGecoNumber(String value) {
        this.gecoNumber = value;
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

}
