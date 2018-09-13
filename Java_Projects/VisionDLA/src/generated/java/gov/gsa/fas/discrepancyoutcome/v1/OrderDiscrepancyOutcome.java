
package gov.gsa.fas.discrepancyoutcome.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDiscrepancyOutcome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDiscrepancyOutcome">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visionDlaKey" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="webSDRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionSetPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjustedQuantity" type="{http://fas.gsa.gov/DiscrepancyOutcome/v1.0}AdjustedQuantity" minOccurs="0"/>
 *         &lt;element name="discrepancyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dispositionCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachmentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDiscrepancyOutcome", propOrder = {
    "visionDlaKey",
    "webSDRNumber",
    "transactionSetPurposeCode",
    "adjustedQuantity",
    "discrepancyCode",
    "dispositionCode",
    "actionCode",
    "comments",
    "attachmentCount",
    "status",
    "attachmentName"
})
public class OrderDiscrepancyOutcome {

    protected long visionDlaKey;
    @XmlElement(required = true)
    protected String webSDRNumber;
    protected String transactionSetPurposeCode;
    protected AdjustedQuantity adjustedQuantity;
    protected List<String> discrepancyCode;
    protected List<String> dispositionCode;
    protected String actionCode;
    @XmlElement(required = true)
    protected String comments;
    protected int attachmentCount;
    @XmlElement(required = true)
    protected String status;
    protected List<String> attachmentName;

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
     * Gets the value of the transactionSetPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSetPurposeCode() {
        return transactionSetPurposeCode;
    }

    /**
     * Sets the value of the transactionSetPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSetPurposeCode(String value) {
        this.transactionSetPurposeCode = value;
    }

    /**
     * Gets the value of the adjustedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedQuantity }
     *     
     */
    public AdjustedQuantity getAdjustedQuantity() {
        return adjustedQuantity;
    }

    /**
     * Sets the value of the adjustedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedQuantity }
     *     
     */
    public void setAdjustedQuantity(AdjustedQuantity value) {
        this.adjustedQuantity = value;
    }

    /**
     * Gets the value of the discrepancyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiscrepancyCode() {
        if (discrepancyCode == null) {
            discrepancyCode = new ArrayList<String>();
        }
        return this.discrepancyCode;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDispositionCode() {
        if (dispositionCode == null) {
            dispositionCode = new ArrayList<String>();
        }
        return this.dispositionCode;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the attachmentCount property.
     * 
     */
    public int getAttachmentCount() {
        return attachmentCount;
    }

    /**
     * Sets the value of the attachmentCount property.
     * 
     */
    public void setAttachmentCount(int value) {
        this.attachmentCount = value;
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
     * Gets the value of the attachmentName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachmentName() {
        if (attachmentName == null) {
            attachmentName = new ArrayList<String>();
        }
        return this.attachmentName;
    }

}
