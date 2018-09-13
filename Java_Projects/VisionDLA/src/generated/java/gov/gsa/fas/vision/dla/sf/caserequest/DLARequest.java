
package gov.gsa.fas.vision.dla.sf.caserequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLARequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DLARequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentNameList" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}AttachmentNameList" minOccurs="0"/>
 *         &lt;element name="AttachmentReceivedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactDetail" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}ContactInformation" minOccurs="0"/>
 *         &lt;element name="DiscrepancyList" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}DiscrepancyItemList" minOccurs="0"/>
 *         &lt;element name="DiscrepancyQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumberSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoDWebSDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDocumentNumberValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDocumentSuffixValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSubmitterDoDAACValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityShipped" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarksComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDRType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmitterDetail" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}SubmitterInformation" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionPurposeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VisionDLAKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WrongItemInfo" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}WrongItemInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLARequest", propOrder = {
    "actionCode",
    "attachmentNameList",
    "attachmentReceivedTime",
    "contactDetail",
    "discrepancyList",
    "discrepancyQuantity",
    "documentNumber",
    "documentNumberSuffix",
    "documentType",
    "doDWebSDR",
    "hasAttachment",
    "isDocumentNumberValid",
    "isDocumentSuffixValid",
    "isSubmitterDoDAACValid",
    "nomenclature",
    "nsn",
    "quantityReceived",
    "quantityShipped",
    "remarksComments",
    "sdrType",
    "submitterDetail",
    "totalCost",
    "transactionPurposeCode",
    "unitOfIssue",
    "unitPrice",
    "visionDLAKey",
    "wrongItemInfo"
})
public class DLARequest {

    @XmlElement(name = "ActionCode", nillable = true)
    protected String actionCode;
    @XmlElement(name = "AttachmentNameList", nillable = true)
    protected AttachmentNameList attachmentNameList;
    @XmlElement(name = "AttachmentReceivedTime", nillable = true)
    protected String attachmentReceivedTime;
    @XmlElement(name = "ContactDetail", nillable = true)
    protected ContactInformation contactDetail;
    @XmlElement(name = "DiscrepancyList", nillable = true)
    protected DiscrepancyItemList discrepancyList;
    @XmlElement(name = "DiscrepancyQuantity", nillable = true)
    protected String discrepancyQuantity;
    @XmlElement(name = "DocumentNumber", nillable = true)
    protected String documentNumber;
    @XmlElement(name = "DocumentNumberSuffix", nillable = true)
    protected String documentNumberSuffix;
    @XmlElement(name = "DocumentType", nillable = true)
    protected String documentType;
    @XmlElement(name = "DoDWebSDR", nillable = true)
    protected String doDWebSDR;
    @XmlElement(name = "HasAttachment", nillable = true)
    protected Boolean hasAttachment;
    @XmlElement(name = "IsDocumentNumberValid", nillable = true)
    protected Boolean isDocumentNumberValid;
    @XmlElement(name = "IsDocumentSuffixValid", nillable = true)
    protected Boolean isDocumentSuffixValid;
    @XmlElement(name = "IsSubmitterDoDAACValid", nillable = true)
    protected Boolean isSubmitterDoDAACValid;
    @XmlElement(name = "Nomenclature", nillable = true)
    protected String nomenclature;
    @XmlElement(name = "NSN", nillable = true)
    protected String nsn;
    @XmlElement(name = "QuantityReceived", nillable = true)
    protected String quantityReceived;
    @XmlElement(name = "QuantityShipped", nillable = true)
    protected String quantityShipped;
    @XmlElement(name = "RemarksComments", nillable = true)
    protected String remarksComments;
    @XmlElement(name = "SDRType", nillable = true)
    protected String sdrType;
    @XmlElement(name = "SubmitterDetail", nillable = true)
    protected SubmitterInformation submitterDetail;
    @XmlElement(name = "TotalCost", nillable = true)
    protected String totalCost;
    @XmlElement(name = "TransactionPurposeCode", nillable = true)
    protected String transactionPurposeCode;
    @XmlElement(name = "UnitOfIssue", nillable = true)
    protected String unitOfIssue;
    @XmlElement(name = "UnitPrice", nillable = true)
    protected String unitPrice;
    @XmlElement(name = "VisionDLAKey", nillable = true)
    protected String visionDLAKey;
    @XmlElement(name = "WrongItemInfo", nillable = true)
    protected WrongItemInformation wrongItemInfo;

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
     * Gets the value of the attachmentNameList property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentNameList }
     *     
     */
    public AttachmentNameList getAttachmentNameList() {
        return attachmentNameList;
    }

    /**
     * Sets the value of the attachmentNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentNameList }
     *     
     */
    public void setAttachmentNameList(AttachmentNameList value) {
        this.attachmentNameList = value;
    }

    /**
     * Gets the value of the attachmentReceivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentReceivedTime() {
        return attachmentReceivedTime;
    }

    /**
     * Sets the value of the attachmentReceivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentReceivedTime(String value) {
        this.attachmentReceivedTime = value;
    }

    /**
     * Gets the value of the contactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactDetail() {
        return contactDetail;
    }

    /**
     * Sets the value of the contactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactDetail(ContactInformation value) {
        this.contactDetail = value;
    }

    /**
     * Gets the value of the discrepancyList property.
     * 
     * @return
     *     possible object is
     *     {@link DiscrepancyItemList }
     *     
     */
    public DiscrepancyItemList getDiscrepancyList() {
        return discrepancyList;
    }

    /**
     * Sets the value of the discrepancyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscrepancyItemList }
     *     
     */
    public void setDiscrepancyList(DiscrepancyItemList value) {
        this.discrepancyList = value;
    }

    /**
     * Gets the value of the discrepancyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscrepancyQuantity() {
        return discrepancyQuantity;
    }

    /**
     * Sets the value of the discrepancyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscrepancyQuantity(String value) {
        this.discrepancyQuantity = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumberSuffix() {
        return documentNumberSuffix;
    }

    /**
     * Sets the value of the documentNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumberSuffix(String value) {
        this.documentNumberSuffix = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
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
     * Gets the value of the hasAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachment() {
        return hasAttachment;
    }

    /**
     * Sets the value of the hasAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachment(Boolean value) {
        this.hasAttachment = value;
    }

    /**
     * Gets the value of the isDocumentNumberValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentNumberValid() {
        return isDocumentNumberValid;
    }

    /**
     * Sets the value of the isDocumentNumberValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentNumberValid(Boolean value) {
        this.isDocumentNumberValid = value;
    }

    /**
     * Gets the value of the isDocumentSuffixValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentSuffixValid() {
        return isDocumentSuffixValid;
    }

    /**
     * Sets the value of the isDocumentSuffixValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentSuffixValid(Boolean value) {
        this.isDocumentSuffixValid = value;
    }

    /**
     * Gets the value of the isSubmitterDoDAACValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubmitterDoDAACValid() {
        return isSubmitterDoDAACValid;
    }

    /**
     * Sets the value of the isSubmitterDoDAACValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubmitterDoDAACValid(Boolean value) {
        this.isSubmitterDoDAACValid = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclature(String value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the nsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSN() {
        return nsn;
    }

    /**
     * Sets the value of the nsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSN(String value) {
        this.nsn = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityReceived(String value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the quantityShipped property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * Sets the value of the quantityShipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityShipped(String value) {
        this.quantityShipped = value;
    }

    /**
     * Gets the value of the remarksComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksComments() {
        return remarksComments;
    }

    /**
     * Sets the value of the remarksComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksComments(String value) {
        this.remarksComments = value;
    }

    /**
     * Gets the value of the sdrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDRType() {
        return sdrType;
    }

    /**
     * Sets the value of the sdrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDRType(String value) {
        this.sdrType = value;
    }

    /**
     * Gets the value of the submitterDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitterInformation }
     *     
     */
    public SubmitterInformation getSubmitterDetail() {
        return submitterDetail;
    }

    /**
     * Sets the value of the submitterDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitterInformation }
     *     
     */
    public void setSubmitterDetail(SubmitterInformation value) {
        this.submitterDetail = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCost(String value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the transactionPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPurposeCode() {
        return transactionPurposeCode;
    }

    /**
     * Sets the value of the transactionPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPurposeCode(String value) {
        this.transactionPurposeCode = value;
    }

    /**
     * Gets the value of the unitOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfIssue() {
        return unitOfIssue;
    }

    /**
     * Sets the value of the unitOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfIssue(String value) {
        this.unitOfIssue = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
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
     * Gets the value of the wrongItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WrongItemInformation }
     *     
     */
    public WrongItemInformation getWrongItemInfo() {
        return wrongItemInfo;
    }

    /**
     * Sets the value of the wrongItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrongItemInformation }
     *     
     */
    public void setWrongItemInfo(WrongItemInformation value) {
        this.wrongItemInfo = value;
    }

}
