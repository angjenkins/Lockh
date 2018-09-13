
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.ordercomplaint.v1.Complaint;


/**
 * <p>Java class for ModifyComplaint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyComplaint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complaintKey" type="{http://fas.gsa.gov/Global/v1.0}positiveIntRequired10"/>
 *         &lt;element name="complaint" type="{http://fas.gsa.gov/OrderComplaint/v1.0}Complaint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyComplaint", propOrder = {
    "complaintKey",
    "complaint"
})
public class ModifyComplaint {

    protected long complaintKey;
    @XmlElement(required = true)
    protected Complaint complaint;

    /**
     * Gets the value of the complaintKey property.
     * 
     */
    public long getComplaintKey() {
        return complaintKey;
    }

    /**
     * Sets the value of the complaintKey property.
     * 
     */
    public void setComplaintKey(long value) {
        this.complaintKey = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link Complaint }
     *     
     */
    public Complaint getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Complaint }
     *     
     */
    public void setComplaint(Complaint value) {
        this.complaint = value;
    }

}
