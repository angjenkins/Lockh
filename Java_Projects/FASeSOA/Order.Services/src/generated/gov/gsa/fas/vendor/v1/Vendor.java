
package gov.gsa.fas.vendor.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vendor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorKey" type="{http://fas.gsa.gov/Vendor/v1.0}VendorKey"/>
 *         &lt;element name="vendorPOC" type="{http://fas.gsa.gov/Vendor/v1.0}VendorPOC"/>
 *         &lt;element name="vendorInfo" type="{http://fas.gsa.gov/Vendor/v1.0}CompanyInfo" minOccurs="0"/>
 *         &lt;element name="authorizedNegotiators" type="{http://fas.gsa.gov/Vendor/v1.0}AuthorizedNegotiator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedContractValue" type="{http://fas.gsa.gov/Global/v1.0}string255" minOccurs="0"/>
 *         &lt;element name="contractPeriod" type="{http://fas.gsa.gov/Global/v1.0}string255" minOccurs="0"/>
 *         &lt;element name="typeOfContract" type="{http://fas.gsa.gov/Global/v1.0}string255"/>
 *       &lt;/sequence>
 *       &lt;attribute name="oid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vendor", propOrder = {
    "vendorKey",
    "vendorPOC",
    "vendorInfo",
    "authorizedNegotiators",
    "estimatedContractValue",
    "contractPeriod",
    "typeOfContract"
})
public class Vendor {

    @XmlElement(required = true)
    protected VendorKey vendorKey;
    @XmlElement(required = true)
    protected VendorPOC vendorPOC;
    protected CompanyInfo vendorInfo;
    protected List<AuthorizedNegotiator> authorizedNegotiators;
    protected String estimatedContractValue;
    protected String contractPeriod;
    @XmlElement(required = true)
    protected String typeOfContract;
    @XmlAttribute(required = true)
    protected long oid;

    /**
     * Gets the value of the vendorKey property.
     * 
     * @return
     *     possible object is
     *     {@link VendorKey }
     *     
     */
    public VendorKey getVendorKey() {
        return vendorKey;
    }

    /**
     * Sets the value of the vendorKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorKey }
     *     
     */
    public void setVendorKey(VendorKey value) {
        this.vendorKey = value;
    }

    /**
     * Gets the value of the vendorPOC property.
     * 
     * @return
     *     possible object is
     *     {@link VendorPOC }
     *     
     */
    public VendorPOC getVendorPOC() {
        return vendorPOC;
    }

    /**
     * Sets the value of the vendorPOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorPOC }
     *     
     */
    public void setVendorPOC(VendorPOC value) {
        this.vendorPOC = value;
    }

    /**
     * Gets the value of the vendorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfo }
     *     
     */
    public CompanyInfo getVendorInfo() {
        return vendorInfo;
    }

    /**
     * Sets the value of the vendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfo }
     *     
     */
    public void setVendorInfo(CompanyInfo value) {
        this.vendorInfo = value;
    }

    /**
     * Gets the value of the authorizedNegotiators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedNegotiators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedNegotiators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizedNegotiator }
     * 
     * 
     */
    public List<AuthorizedNegotiator> getAuthorizedNegotiators() {
        if (authorizedNegotiators == null) {
            authorizedNegotiators = new ArrayList<AuthorizedNegotiator>();
        }
        return this.authorizedNegotiators;
    }

    /**
     * Gets the value of the estimatedContractValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedContractValue() {
        return estimatedContractValue;
    }

    /**
     * Sets the value of the estimatedContractValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedContractValue(String value) {
        this.estimatedContractValue = value;
    }

    /**
     * Gets the value of the contractPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPeriod() {
        return contractPeriod;
    }

    /**
     * Sets the value of the contractPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPeriod(String value) {
        this.contractPeriod = value;
    }

    /**
     * Gets the value of the typeOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfContract() {
        return typeOfContract;
    }

    /**
     * Sets the value of the typeOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfContract(String value) {
        this.typeOfContract = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     */
    public long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     */
    public void setOid(long value) {
        this.oid = value;
    }

}
