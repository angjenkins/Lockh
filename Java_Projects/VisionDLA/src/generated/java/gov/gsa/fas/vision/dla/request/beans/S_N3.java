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
 * To specify the location of the named party
 * 
 * <p>Java class for S_N3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_N3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Address_Information" type="{}E_166"/>
 *         &lt;element name="E_Address_Information_1" type="{}E_166_1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="N3" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Address Information" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_N3", propOrder = {
    "eAddressInformation",
    "eAddressInformation1"
})
public class S_N3 {

    @XmlElement(name = "E_Address_Information", required = true)
    protected E_166 eAddressInformation;
    @XmlElementRef(name = "E_Address_Information_1", type = JAXBElement.class)
    protected JAXBElement<E_166_1> eAddressInformation1;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Address_Information property.
     * 
     * @return
     *     possible object is
     *     {@link E_166 }
     *     
     */
    public E_166 getE_Address_Information() {
        return eAddressInformation;
    }

    /**
     * Sets the value of the e_Address_Information property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_166 }
     *     
     */
    public void setE_Address_Information(E_166 value) {
        this.eAddressInformation = value;
    }

    /**
     * Gets the value of the e_Address_Information_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_166_1 }{@code >}
     *     
     */
    public JAXBElement<E_166_1> getE_Address_Information_1() {
        return eAddressInformation1;
    }

    /**
     * Sets the value of the e_Address_Information_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_166_1 }{@code >}
     *     
     */
    public void setE_Address_Information_1(JAXBElement<E_166_1> value) {
        this.eAddressInformation1 = ((JAXBElement<E_166_1> ) value);
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
            return "N3";
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
            return "Address Information";
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
