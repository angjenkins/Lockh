
package gov.gsa.fas.discrepancyoutcome.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processAttachmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processAttachmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visionDlaKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="webSDRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachment" type="{http://fas.gsa.gov/DiscrepancyOutcome/v1.0}Attachment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processAttachmentRequest", propOrder = {
    "visionDlaKey",
    "webSDRNumber",
    "attachment"
})
public class ProcessAttachmentRequest {

    protected long visionDlaKey;
    @XmlElement(required = true)
    protected String webSDRNumber;
    @XmlElement(required = true)
    protected Attachment attachment;

    /**
     * Gets the value of the visionDlaKey property.
     * 
     */
    public long getVisionDlaKey() {
        return visionDlaKey;
    }

    /**
     * Sets the value of the visionDlaKey property.
     * 
     */
    public void setVisionDlaKey(long value) {
        this.visionDlaKey = value;
    }

    /**
     * Gets the value of the webSDRNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSDRNumber() {
        return webSDRNumber;
    }

    /**
     * Sets the value of the webSDRNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSDRNumber(String value) {
        this.webSDRNumber = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

}
