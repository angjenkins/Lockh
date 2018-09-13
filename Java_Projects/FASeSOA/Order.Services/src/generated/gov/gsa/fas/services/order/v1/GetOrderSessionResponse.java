
package gov.gsa.fas.services.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.ordersession.v1.OrderSession;


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
 *         &lt;element name="OrderSession" type="{http://fas.gsa.gov/OrderSession/v1.0}OrderSession" minOccurs="0"/>
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
    "orderSession"
})
@XmlRootElement(name = "GetOrderSessionResponse")
public class GetOrderSessionResponse {

    @XmlElement(name = "OrderSession")
    protected OrderSession orderSession;

    /**
     * Gets the value of the orderSession property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSession }
     *     
     */
    public OrderSession getOrderSession() {
        return orderSession;
    }

    /**
     * Sets the value of the orderSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSession }
     *     
     */
    public void setOrderSession(OrderSession value) {
        this.orderSession = value;
    }

}
