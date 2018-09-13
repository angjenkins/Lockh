
package gov.gsa.fas.vision.dla.sf.login;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformQuickActionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformQuickActionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parentId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="quickActionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="records" type="{urn:sobject.partner.soap.sforce.com}sObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformQuickActionRequest", propOrder = {
    "parentId",
    "quickActionName",
    "records"
})
public class PerformQuickActionRequest {

    @XmlElement(required = true, nillable = true)
    protected ID parentId;
    @XmlElement(required = true)
    protected String quickActionName;
    @XmlElement(nillable = true)
    protected List<SObject> records;

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setParentId(ID value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the quickActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickActionName() {
        return quickActionName;
    }

    /**
     * Sets the value of the quickActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickActionName(String value) {
        this.quickActionName = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the records property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SObject }
     * 
     * 
     */
    public List<SObject> getRecords() {
        if (records == null) {
            records = new ArrayList<SObject>();
        }
        return this.records;
    }

}
