//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:10:47 AM EST 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Code to transmit standard industry codes
 * 
 * <p>Java class for S_LQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_LQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Code_List_Qualifier_Code" type="{}E_1270"/>
 *         &lt;element name="E_Industry_Code" type="{}E_1271"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="LQ" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Industry Code" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_LQ", propOrder = {
    "eCodeListQualifierCode",
    "eIndustryCode"
})
public class S_LQ {

    @XmlElement(name = "E_Code_List_Qualifier_Code", required = true)
    protected E_1270 eCodeListQualifierCode;
    @XmlElement(name = "E_Industry_Code", required = true)
    protected E_1271 eIndustryCode;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Code_List_Qualifier_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_1270 }
     *     
     */
    public E_1270 getE_Code_List_Qualifier_Code() {
        return eCodeListQualifierCode;
    }

    /**
     * Sets the value of the e_Code_List_Qualifier_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_1270 }
     *     
     */
    public void setE_Code_List_Qualifier_Code(E_1270 value) {
        this.eCodeListQualifierCode = value;
    }

    /**
     * Gets the value of the e_Industry_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_1271 }
     *     
     */
    public E_1271 getE_Industry_Code() {
        return eIndustryCode;
    }

    /**
     * Sets the value of the e_Industry_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_1271 }
     *     
     */
    public void setE_Industry_Code(E_1271 value) {
        this.eIndustryCode = value;
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
            return "Segment";
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
            return "LQ";
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
            return "Industry Code";
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
