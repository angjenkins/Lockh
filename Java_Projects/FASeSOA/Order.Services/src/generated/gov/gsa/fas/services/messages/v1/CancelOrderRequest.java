
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.order.v1.OrderItem;


/**
 * <p>Java class for CancelOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderItem" type="{http://fas.gsa.gov/Order/v1.0}OrderItem"/>
 *         &lt;element name="supplementAddrAAC" type="{http://fas.gsa.gov/Global/v1.0}string6"/>
 *         &lt;element name="distributionCode" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *         &lt;element name="projectCode" type="{http://fas.gsa.gov/Global/v1.0}string3"/>
 *         &lt;element name="priorityCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOrderRequest", propOrder = {
    "orderItem",
    "supplementAddrAAC",
    "distributionCode",
    "projectCode",
    "priorityCode"
})
public class CancelOrderRequest {

    @XmlElement(required = true)
    protected OrderItem orderItem;
    @XmlElement(required = true, nillable = true)
    protected String supplementAddrAAC;
    @XmlElement(required = true, nillable = true)
    protected String distributionCode;
    @XmlElement(required = true, nillable = true)
    protected String projectCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer priorityCode;

    /**
     * Gets the value of the orderItem property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItem }
     *     
     */
    public OrderItem getOrderItem() {
        return orderItem;
    }

    /**
     * Sets the value of the orderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItem }
     *     
     */
    public void setOrderItem(OrderItem value) {
        this.orderItem = value;
    }

    /**
     * Gets the value of the supplementAddrAAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementAddrAAC() {
        return supplementAddrAAC;
    }

    /**
     * Sets the value of the supplementAddrAAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementAddrAAC(String value) {
        this.supplementAddrAAC = value;
    }

    /**
     * Gets the value of the distributionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCode() {
        return distributionCode;
    }

    /**
     * Sets the value of the distributionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCode(String value) {
        this.distributionCode = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriorityCode(Integer value) {
        this.priorityCode = value;
    }

}
