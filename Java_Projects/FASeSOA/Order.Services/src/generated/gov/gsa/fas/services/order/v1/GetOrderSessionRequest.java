
package gov.gsa.fas.services.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="orderSessionIdentifier" type="{http://fas.gsa.gov/OrderSession/v1.0}OrderSessionIdentifier"/>
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
    "orderSessionIdentifier"
})
@XmlRootElement(name = "GetOrderSessionRequest")
public class GetOrderSessionRequest {

    @XmlElement(required = true)
    protected String orderSessionIdentifier;

    /**
     * Gets the value of the orderSessionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSessionIdentifier() {
        return orderSessionIdentifier;
    }

    /**
     * Sets the value of the orderSessionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSessionIdentifier(String value) {
        this.orderSessionIdentifier = value;
    }

}
