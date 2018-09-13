
package gov.gsa.fas.vision.dla.sf.caserequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLAResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DLAResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FailedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FailedList" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}FailedList" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VisionDLAKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WSDRStagingId" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLAResponse", propOrder = {
    "failedCount",
    "failedList",
    "status",
    "successCount",
    "visionDLAKey",
    "wsdrStagingId"
})
public class DLAResponse {

    @XmlElement(name = "FailedCount", nillable = true)
    protected Integer failedCount;
    @XmlElement(name = "FailedList", nillable = true)
    protected FailedList failedList;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SuccessCount", nillable = true)
    protected Integer successCount;
    @XmlElement(name = "VisionDLAKey", nillable = true)
    protected String visionDLAKey;
    @XmlElement(name = "WSDRStagingId", nillable = true)
    protected ID wsdrStagingId;

    /**
     * Gets the value of the failedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    /**
     * Sets the value of the failedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedCount(Integer value) {
        this.failedCount = value;
    }

    /**
     * Gets the value of the failedList property.
     * 
     * @return
     *     possible object is
     *     {@link FailedList }
     *     
     */
    public FailedList getFailedList() {
        return failedList;
    }

    /**
     * Sets the value of the failedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedList }
     *     
     */
    public void setFailedList(FailedList value) {
        this.failedList = value;
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

    /**
     * Gets the value of the successCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessCount(Integer value) {
        this.successCount = value;
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

    /**
     * Gets the value of the wsdrStagingId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getWSDRStagingId() {
        return wsdrStagingId;
    }

    /**
     * Sets the value of the wsdrStagingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setWSDRStagingId(ID value) {
        this.wsdrStagingId = value;
    }

}
