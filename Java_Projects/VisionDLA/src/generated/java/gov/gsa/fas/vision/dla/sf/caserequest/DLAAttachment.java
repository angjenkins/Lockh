
package gov.gsa.fas.vision.dla.sf.caserequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLAAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DLAAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentList" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}AttachmentItemList" minOccurs="0"/>
 *         &lt;element name="DoDWebSDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisionDLAKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLAAttachment", propOrder = {
    "attachmentList",
    "doDWebSDR",
    "visionDLAKey"
})
public class DLAAttachment {

    @XmlElement(name = "AttachmentList", nillable = true)
    protected AttachmentItemList attachmentList;
    @XmlElement(name = "DoDWebSDR", nillable = true)
    protected String doDWebSDR;
    @XmlElement(name = "VisionDLAKey", nillable = true)
    protected String visionDLAKey;

    /**
     * Gets the value of the attachmentList property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentItemList }
     *     
     */
    public AttachmentItemList getAttachmentList() {
        return attachmentList;
    }

    /**
     * Sets the value of the attachmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentItemList }
     *     
     */
    public void setAttachmentList(AttachmentItemList value) {
        this.attachmentList = value;
    }

    /**
     * Gets the value of the doDWebSDR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoDWebSDR() {
        return doDWebSDR;
    }

    /**
     * Sets the value of the doDWebSDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoDWebSDR(String value) {
        this.doDWebSDR = value;
    }

    /**
     * Gets the value of the visionDLAKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisionDLAKey() {
        return visionDLAKey;
    }

    /**
     * Sets the value of the visionDLAKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisionDLAKey(String value) {
        this.visionDLAKey = value;
    }

}
