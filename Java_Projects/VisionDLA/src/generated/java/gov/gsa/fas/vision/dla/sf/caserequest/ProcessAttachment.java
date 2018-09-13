
package gov.gsa.fas.vision.dla.sf.caserequest;

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
 *         &lt;element name="AttachmentRequest" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}DLAAttachment"/>
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
    "attachmentRequest"
})
@XmlRootElement(name = "ProcessAttachment")
public class ProcessAttachment {

    @XmlElement(name = "AttachmentRequest", required = true, nillable = true)
    protected DLAAttachment attachmentRequest;

    /**
     * Gets the value of the attachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DLAAttachment }
     *     
     */
    public DLAAttachment getAttachmentRequest() {
        return attachmentRequest;
    }

    /**
     * Sets the value of the attachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DLAAttachment }
     *     
     */
    public void setAttachmentRequest(DLAAttachment value) {
        this.attachmentRequest = value;
    }

}
