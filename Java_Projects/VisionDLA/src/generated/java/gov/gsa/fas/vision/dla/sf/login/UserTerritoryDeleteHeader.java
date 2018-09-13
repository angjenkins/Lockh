
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
 *         &lt;element name="transferToUserId" type="{urn:partner.soap.sforce.com}ID"/>
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
    "transferToUserId"
})
@XmlRootElement(name = "UserTerritoryDeleteHeader")
public class UserTerritoryDeleteHeader {

    @XmlElement(required = true, nillable = true)
    protected ID transferToUserId;

    /**
     * Gets the value of the transferToUserId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getTransferToUserId() {
        return transferToUserId;
    }

    /**
     * Sets the value of the transferToUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setTransferToUserId(ID value) {
        this.transferToUserId = value;
    }

}
