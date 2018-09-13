
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addrTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addrTypeName" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="addrTypeDesc" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="addrTypeStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addrTypeId",
    "addrTypeName",
    "addrTypeDesc",
    "addrTypeStatus"
})
public class AddressType {

    protected int addrTypeId;
    @XmlElement(required = true)
    protected String addrTypeName;
    @XmlElement(required = true)
    protected String addrTypeDesc;
    protected int addrTypeStatus;
    @XmlAttribute
    protected Long oid;

    /**
     * Gets the value of the addrTypeId property.
     * 
     */
    public int getAddrTypeId() {
        return addrTypeId;
    }

    /**
     * Sets the value of the addrTypeId property.
     * 
     */
    public void setAddrTypeId(int value) {
        this.addrTypeId = value;
    }

    /**
     * Gets the value of the addrTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrTypeName() {
        return addrTypeName;
    }

    /**
     * Sets the value of the addrTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrTypeName(String value) {
        this.addrTypeName = value;
    }

    /**
     * Gets the value of the addrTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrTypeDesc() {
        return addrTypeDesc;
    }

    /**
     * Sets the value of the addrTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrTypeDesc(String value) {
        this.addrTypeDesc = value;
    }

    /**
     * Gets the value of the addrTypeStatus property.
     * 
     */
    public int getAddrTypeStatus() {
        return addrTypeStatus;
    }

    /**
     * Sets the value of the addrTypeStatus property.
     * 
     */
    public void setAddrTypeStatus(int value) {
        this.addrTypeStatus = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getOid() {
        if (oid == null) {
            return  0L;
        } else {
            return oid;
        }
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOid(Long value) {
        this.oid = value;
    }

}
