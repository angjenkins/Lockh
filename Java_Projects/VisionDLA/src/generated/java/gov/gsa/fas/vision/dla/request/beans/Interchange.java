//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:10:47 AM EST 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Interchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interchange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InterchangeControlVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeReceiverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeReceiverQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeSenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeSenderQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Standard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElementDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeAckRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeAuthorizationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeAuthorizationInfoQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeComponentElementSep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeControlStandard_RepeatingSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeSecurityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeSecurityInfoQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeTrailerControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterchangeUsageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseCharacter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RepeatingSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubelementDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{}Group" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{}Transaction" minOccurs="0"/>
 *         &lt;element name="TPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interchange", propOrder = {

})
public class Interchange {

    @XmlElement(name = "InterchangeControlVersion")
    protected String interchangeControlVersion;
    @XmlElement(name = "InterchangeReceiverID")
    protected String interchangeReceiverID;
    @XmlElement(name = "InterchangeReceiverQual")
    protected String interchangeReceiverQual;
    @XmlElement(name = "InterchangeSenderID")
    protected String interchangeSenderID;
    @XmlElement(name = "InterchangeSenderQual")
    protected String interchangeSenderQual;
    @XmlElement(name = "Standard")
    protected String standard;
    @XmlElement(name = "DecimalSeparator")
    protected String decimalSeparator;
    @XmlElement(name = "ElementDelimiter")
    protected String elementDelimiter;
    @XmlElement(name = "InterchangeAckRequested")
    protected String interchangeAckRequested;
    @XmlElement(name = "InterchangeAuthorizationInfo")
    protected String interchangeAuthorizationInfo;
    @XmlElement(name = "InterchangeAuthorizationInfoQual")
    protected String interchangeAuthorizationInfoQual;
    @XmlElement(name = "InterchangeChildCount")
    protected String interchangeChildCount;
    @XmlElement(name = "InterchangeComponentElementSep")
    protected String interchangeComponentElementSep;
    @XmlElement(name = "InterchangeControlNumber")
    protected String interchangeControlNumber;
    @XmlElement(name = "InterchangeControlStandard_RepeatingSeparator")
    protected String interchangeControlStandardRepeatingSeparator;
    @XmlElement(name = "InterchangeDate")
    protected String interchangeDate;
    @XmlElement(name = "InterchangeSecurityInfo")
    protected String interchangeSecurityInfo;
    @XmlElement(name = "InterchangeSecurityInfoQual")
    protected String interchangeSecurityInfoQual;
    @XmlElement(name = "InterchangeTime")
    protected String interchangeTime;
    @XmlElement(name = "InterchangeTrailerControlNumber")
    protected String interchangeTrailerControlNumber;
    @XmlElement(name = "InterchangeUsageIndicator")
    protected String interchangeUsageIndicator;
    @XmlElement(name = "ReleaseCharacter")
    protected String releaseCharacter;
    @XmlElement(name = "RepeatingSeparator")
    protected String repeatingSeparator;
    @XmlElement(name = "SegmentDelimiter")
    protected String segmentDelimiter;
    @XmlElement(name = "SubelementDelimiter")
    protected String subelementDelimiter;
    @XmlElement(name = "Group")
    protected Group group;
    @XmlElement(name = "Transaction")
    protected Transaction transaction;
    @XmlElement(name = "TPName")
    protected String tpName;

    /**
     * Gets the value of the interchangeControlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeControlVersion() {
        return interchangeControlVersion;
    }

    /**
     * Sets the value of the interchangeControlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeControlVersion(String value) {
        this.interchangeControlVersion = value;
    }

    /**
     * Gets the value of the interchangeReceiverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeReceiverID() {
        return interchangeReceiverID;
    }

    /**
     * Sets the value of the interchangeReceiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeReceiverID(String value) {
        this.interchangeReceiverID = value;
    }

    /**
     * Gets the value of the interchangeReceiverQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeReceiverQual() {
        return interchangeReceiverQual;
    }

    /**
     * Sets the value of the interchangeReceiverQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeReceiverQual(String value) {
        this.interchangeReceiverQual = value;
    }

    /**
     * Gets the value of the interchangeSenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeSenderID() {
        return interchangeSenderID;
    }

    /**
     * Sets the value of the interchangeSenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeSenderID(String value) {
        this.interchangeSenderID = value;
    }

    /**
     * Gets the value of the interchangeSenderQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeSenderQual() {
        return interchangeSenderQual;
    }

    /**
     * Sets the value of the interchangeSenderQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeSenderQual(String value) {
        this.interchangeSenderQual = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Gets the value of the decimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Sets the value of the decimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSeparator(String value) {
        this.decimalSeparator = value;
    }

    /**
     * Gets the value of the elementDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementDelimiter() {
        return elementDelimiter;
    }

    /**
     * Sets the value of the elementDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementDelimiter(String value) {
        this.elementDelimiter = value;
    }

    /**
     * Gets the value of the interchangeAckRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeAckRequested() {
        return interchangeAckRequested;
    }

    /**
     * Sets the value of the interchangeAckRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeAckRequested(String value) {
        this.interchangeAckRequested = value;
    }

    /**
     * Gets the value of the interchangeAuthorizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeAuthorizationInfo() {
        return interchangeAuthorizationInfo;
    }

    /**
     * Sets the value of the interchangeAuthorizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeAuthorizationInfo(String value) {
        this.interchangeAuthorizationInfo = value;
    }

    /**
     * Gets the value of the interchangeAuthorizationInfoQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeAuthorizationInfoQual() {
        return interchangeAuthorizationInfoQual;
    }

    /**
     * Sets the value of the interchangeAuthorizationInfoQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeAuthorizationInfoQual(String value) {
        this.interchangeAuthorizationInfoQual = value;
    }

    /**
     * Gets the value of the interchangeChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeChildCount() {
        return interchangeChildCount;
    }

    /**
     * Sets the value of the interchangeChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeChildCount(String value) {
        this.interchangeChildCount = value;
    }

    /**
     * Gets the value of the interchangeComponentElementSep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeComponentElementSep() {
        return interchangeComponentElementSep;
    }

    /**
     * Sets the value of the interchangeComponentElementSep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeComponentElementSep(String value) {
        this.interchangeComponentElementSep = value;
    }

    /**
     * Gets the value of the interchangeControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeControlNumber() {
        return interchangeControlNumber;
    }

    /**
     * Sets the value of the interchangeControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeControlNumber(String value) {
        this.interchangeControlNumber = value;
    }

    /**
     * Gets the value of the interchangeControlStandard_RepeatingSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeControlStandard_RepeatingSeparator() {
        return interchangeControlStandardRepeatingSeparator;
    }

    /**
     * Sets the value of the interchangeControlStandard_RepeatingSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeControlStandard_RepeatingSeparator(String value) {
        this.interchangeControlStandardRepeatingSeparator = value;
    }

    /**
     * Gets the value of the interchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeDate() {
        return interchangeDate;
    }

    /**
     * Sets the value of the interchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeDate(String value) {
        this.interchangeDate = value;
    }

    /**
     * Gets the value of the interchangeSecurityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeSecurityInfo() {
        return interchangeSecurityInfo;
    }

    /**
     * Sets the value of the interchangeSecurityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeSecurityInfo(String value) {
        this.interchangeSecurityInfo = value;
    }

    /**
     * Gets the value of the interchangeSecurityInfoQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeSecurityInfoQual() {
        return interchangeSecurityInfoQual;
    }

    /**
     * Sets the value of the interchangeSecurityInfoQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeSecurityInfoQual(String value) {
        this.interchangeSecurityInfoQual = value;
    }

    /**
     * Gets the value of the interchangeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeTime() {
        return interchangeTime;
    }

    /**
     * Sets the value of the interchangeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeTime(String value) {
        this.interchangeTime = value;
    }

    /**
     * Gets the value of the interchangeTrailerControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeTrailerControlNumber() {
        return interchangeTrailerControlNumber;
    }

    /**
     * Sets the value of the interchangeTrailerControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeTrailerControlNumber(String value) {
        this.interchangeTrailerControlNumber = value;
    }

    /**
     * Gets the value of the interchangeUsageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeUsageIndicator() {
        return interchangeUsageIndicator;
    }

    /**
     * Sets the value of the interchangeUsageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeUsageIndicator(String value) {
        this.interchangeUsageIndicator = value;
    }

    /**
     * Gets the value of the releaseCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseCharacter() {
        return releaseCharacter;
    }

    /**
     * Sets the value of the releaseCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseCharacter(String value) {
        this.releaseCharacter = value;
    }

    /**
     * Gets the value of the repeatingSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatingSeparator() {
        return repeatingSeparator;
    }

    /**
     * Sets the value of the repeatingSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatingSeparator(String value) {
        this.repeatingSeparator = value;
    }

    /**
     * Gets the value of the segmentDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentDelimiter() {
        return segmentDelimiter;
    }

    /**
     * Sets the value of the segmentDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentDelimiter(String value) {
        this.segmentDelimiter = value;
    }

    /**
     * Gets the value of the subelementDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubelementDelimiter() {
        return subelementDelimiter;
    }

    /**
     * Sets the value of the subelementDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubelementDelimiter(String value) {
        this.subelementDelimiter = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPName(String value) {
        this.tpName = value;
    }

}