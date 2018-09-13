
package gov.gsa.fas.vision.dla.sf.login;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadConvertResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadConvertResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="contactId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="errors" type="{urn:partner.soap.sforce.com}Error" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="leadId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="opportunityId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadConvertResult", propOrder = {
    "accountId",
    "contactId",
    "errors",
    "leadId",
    "opportunityId",
    "success"
})
public class LeadConvertResult {

    @XmlElement(required = true, nillable = true)
    protected ID accountId;
    @XmlElement(required = true, nillable = true)
    protected ID contactId;
    protected List<Error> errors;
    @XmlElement(required = true, nillable = true)
    protected ID leadId;
    @XmlElement(required = true, nillable = true)
    protected ID opportunityId;
    protected boolean success;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setAccountId(ID value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setContactId(ID value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Error }
     * 
     * 
     */
    public List<Error> getErrors() {
        if (errors == null) {
            errors = new ArrayList<Error>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the leadId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setLeadId(ID value) {
        this.leadId = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setOpportunityId(ID value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
