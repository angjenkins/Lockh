//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:10:47 AM EST 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To transmit standard code list identification information
 * 
 * <p>Java class for S_LM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_LM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Agency_Qualifier_Code" type="{}E_559"/>
 *         &lt;element name="E_Source_Subqualifier" type="{}E_822" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
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
@XmlType(name = "S_LM", propOrder = {
    "eAgencyQualifierCode",
    "eSourceSubqualifier"
})
public class S_LM {

    @XmlElement(name = "E_Agency_Qualifier_Code", required = true)
    protected E_559 eAgencyQualifierCode;
    @XmlElementRef(name = "E_Source_Subqualifier", type = JAXBElement.class)
    protected JAXBElement<E_822> eSourceSubqualifier;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Agency_Qualifier_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_559 }
     *     
     */
    public E_559 getE_Agency_Qualifier_Code() {
        return eAgencyQualifierCode;
    }

    /**
     * Sets the value of the e_Agency_Qualifier_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_559 }
     *     
     */
    public void setE_Agency_Qualifier_Code(E_559 value) {
        this.eAgencyQualifierCode = value;
    }

    /**
     * Gets the value of the e_Source_Subqualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_822 }{@code >}
     *     
     */
    public JAXBElement<E_822> getE_Source_Subqualifier() {
        return eSourceSubqualifier;
    }

    /**
     * Sets the value of the e_Source_Subqualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_822 }{@code >}
     *     
     */
    public void setE_Source_Subqualifier(JAXBElement<E_822> value) {
        this.eSourceSubqualifier = ((JAXBElement<E_822> ) value);
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
