//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the organization controlling the content of the accounting citation, and the purpose associated with the accounting citation
 * 
 * <p>Java class for L_FA1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L_FA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_Type_of_Financial_Accounting_Data" type="{}S_FA1"/>
 *         &lt;element name="S_Accounting_Data" type="{}S_FA2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="FA1" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Type of Financial Accounting Data" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L_FA1", propOrder = {
    "sTypeOfFinancialAccountingData",
    "sAccountingData"
})
public class L_FA1 {

    @XmlElement(name = "S_Type_of_Financial_Accounting_Data", required = true)
    protected S_FA1 sTypeOfFinancialAccountingData;
    @XmlElement(name = "S_Accounting_Data", required = true)
    protected List<S_FA2> sAccountingData;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the s_Type_Of_Financial_Accounting_Data property.
     * 
     * @return
     *     possible object is
     *     {@link S_FA1 }
     *     
     */
    public S_FA1 getS_Type_Of_Financial_Accounting_Data() {
        return sTypeOfFinancialAccountingData;
    }

    /**
     * Sets the value of the s_Type_Of_Financial_Accounting_Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_FA1 }
     *     
     */
    public void setS_Type_Of_Financial_Accounting_Data(S_FA1 value) {
        this.sTypeOfFinancialAccountingData = value;
    }

    /**
     * Gets the value of the sAccountingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sAccountingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Accounting_Data().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_FA2 }
     * 
     * 
     */
    public List<S_FA2> getS_Accounting_Data() {
        if (sAccountingData == null) {
            sAccountingData = new ArrayList<S_FA2>();
        }
        return this.sAccountingData;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Loop";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        if (id == null) {
            return "FA1";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Type of Financial Accounting Data";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
