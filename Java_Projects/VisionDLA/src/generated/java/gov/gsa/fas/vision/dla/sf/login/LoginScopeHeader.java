
package gov.gsa.fas.vision.dla.sf.login;

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
 *         &lt;element name="organizationId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="portalId" type="{urn:partner.soap.sforce.com}ID" minOccurs="0"/>
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
    "organizationId",
    "portalId"
})
@XmlRootElement(name = "LoginScopeHeader")
public class LoginScopeHeader {

    @XmlElement(required = true)
    protected ID organizationId;
    protected ID portalId;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setOrganizationId(ID value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the portalId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getPortalId() {
        return portalId;
    }

    /**
     * Sets the value of the portalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setPortalId(ID value) {
        this.portalId = value;
    }

}
