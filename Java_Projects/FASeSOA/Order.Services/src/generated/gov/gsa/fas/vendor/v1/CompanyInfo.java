
package gov.gsa.fas.vendor.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.global.v1.Address;


/**
 * <p>Java class for CompanyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="division" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="address" type="{http://fas.gsa.gov/Global/v1.0}Address"/>
 *         &lt;element name="phone" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="fax" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="email" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="webSite" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="contacts" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="tin" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="businessSize" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *         &lt;element name="status" type="{http://fas.gsa.gov/Global/v1.0}string1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfo", propOrder = {
    "name",
    "division",
    "address",
    "phone",
    "fax",
    "email",
    "webSite",
    "contacts",
    "tin",
    "businessSize",
    "status"
})
public class CompanyInfo {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String division;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String webSite;
    @XmlElement(required = true)
    protected String contacts;
    @XmlElement(required = true)
    protected String tin;
    @XmlElement(required = true)
    protected String businessSize;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacts(String value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the businessSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSize() {
        return businessSize;
    }

    /**
     * Sets the value of the businessSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSize(String value) {
        this.businessSize = value;
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
