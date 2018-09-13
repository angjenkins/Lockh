
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subtab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryType" type="{http://fas.gsa.gov/Global/v1.0}DocType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileName",
    "tab",
    "subtab",
    "categoryName",
    "categoryVersion",
    "categoryType",
    "id",
    "submitDate",
    "lastUpdate",
    "mimeType",
    "fileDesc"
})
public class Document {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String tab;
    @XmlElement(required = true)
    protected String subtab;
    @XmlElement(required = true)
    protected String categoryName;
    @XmlElement(required = true)
    protected String categoryVersion;
    @XmlElement(required = true)
    protected DocType categoryType;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submitDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true)
    protected String mimeType;
    @XmlElement(required = true)
    protected String fileDesc;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the tab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTab() {
        return tab;
    }

    /**
     * Sets the value of the tab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTab(String value) {
        this.tab = value;
    }

    /**
     * Gets the value of the subtab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtab() {
        return subtab;
    }

    /**
     * Sets the value of the subtab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtab(String value) {
        this.subtab = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link DocType }
     *     
     */
    public DocType getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocType }
     *     
     */
    public void setCategoryType(DocType value) {
        this.categoryType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the fileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * Sets the value of the fileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDesc(String value) {
        this.fileDesc = value;
    }

}
