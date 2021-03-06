//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:11:00 AM EST 
//


package gov.gsa.fas.vision.dla.response.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To transmit standard code list identification information
 * 
 * <p>Java class for L_LM_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L_LM_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_Code_Source_Information" type="{}S_LM"/>
 *         &lt;element name="S_Industry_Code" type="{}S_LQ_2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="LM" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Code Source Information" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L_LM_2", propOrder = {
    "sCodeSourceInformation",
    "sIndustryCode"
})
public class L_LM_2 {

    @XmlElement(name = "S_Code_Source_Information", required = true)
    protected S_LM sCodeSourceInformation;
    @XmlElement(name = "S_Industry_Code", required = true)
    protected List<S_LQ_2> sIndustryCode;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the s_Code_Source_Information property.
     * 
     * @return
     *     possible object is
     *     {@link S_LM }
     *     
     */
    public S_LM getS_Code_Source_Information() {
        return sCodeSourceInformation;
    }

    /**
     * Sets the value of the s_Code_Source_Information property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_LM }
     *     
     */
    public void setS_Code_Source_Information(S_LM value) {
        this.sCodeSourceInformation = value;
    }

    /**
     * Gets the value of the sIndustryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sIndustryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Industry_Code().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_LQ_2 }
     * 
     * 
     */
    public List<S_LQ_2> getS_Industry_Code() {
        if (sIndustryCode == null) {
            sIndustryCode = new ArrayList<S_LQ_2>();
        }
        return this.sIndustryCode;
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
            return "LM";
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
            return "Code Source Information";
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
