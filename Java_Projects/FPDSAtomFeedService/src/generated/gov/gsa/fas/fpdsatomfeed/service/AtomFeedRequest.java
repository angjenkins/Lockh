
package gov.gsa.fas.fpdsatomfeed.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtomFeedRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomFeedRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signedDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomFeedRequest", propOrder = {
    "signedDateStart",
    "signedDateEnd",
    "piid",
    "modificationNumber",
    "lastModDateStart",
    "lastModDateEnd",
    "start",
    "contractType"
})
public class AtomFeedRequest {

    protected String signedDateStart;
    protected String signedDateEnd;
    @XmlElement(name = "PIID")
    protected String piid;
    protected String modificationNumber;
    protected String lastModDateStart;
    protected String lastModDateEnd;
    protected long start;
    protected String contractType;

    /**
     * Gets the value of the signedDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedDateStart() {
        return signedDateStart;
    }

    /**
     * Sets the value of the signedDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedDateStart(String value) {
        this.signedDateStart = value;
    }

    /**
     * Gets the value of the signedDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedDateEnd() {
        return signedDateEnd;
    }

    /**
     * Sets the value of the signedDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedDateEnd(String value) {
        this.signedDateEnd = value;
    }

    /**
     * Gets the value of the piid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIID() {
        return piid;
    }

    /**
     * Sets the value of the piid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIID(String value) {
        this.piid = value;
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationNumber(String value) {
        this.modificationNumber = value;
    }

    /**
     * Gets the value of the lastModDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModDateStart() {
        return lastModDateStart;
    }

    /**
     * Sets the value of the lastModDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModDateStart(String value) {
        this.lastModDateStart = value;
    }

    /**
     * Gets the value of the lastModDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModDateEnd() {
        return lastModDateEnd;
    }

    /**
     * Sets the value of the lastModDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModDateEnd(String value) {
        this.lastModDateEnd = value;
    }

    /**
     * Gets the value of the start property.
     * 
     */
    public long getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     */
    public void setStart(long value) {
        this.start = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

}
