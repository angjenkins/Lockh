//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:11:00 AM EST 
//


package gov.gsa.fas.vision.dla.response.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify one or more reference numbers or identification numbers as specified by the Reference Qualifier
 * 
 * <p>Java class for C_C040 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_C040">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Reference_Identification_Qualifier" type="{}E_128_1"/>
 *         &lt;element name="E_Reference_Identification" type="{}E_127"/>
 *         &lt;element name="E_Reference_Identification_Qualifier_1" type="{}E_128_2" minOccurs="0"/>
 *         &lt;element name="E_Reference_Identification_1" type="{}E_127_1" minOccurs="0"/>
 *         &lt;element name="E_Reference_Identification_Qualifier_2" type="{}E_128_2" minOccurs="0"/>
 *         &lt;element name="E_Reference_Identification_2" type="{}E_127_1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C040" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Reference Identifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_C040", propOrder = {
    "eReferenceIdentificationQualifier",
    "eReferenceIdentification",
    "eReferenceIdentificationQualifier1",
    "eReferenceIdentification1",
    "eReferenceIdentificationQualifier2",
    "eReferenceIdentification2"
})
public class C_C040 {

    @XmlElement(name = "E_Reference_Identification_Qualifier", required = true)
    protected E_128_1 eReferenceIdentificationQualifier;
    @XmlElement(name = "E_Reference_Identification", required = true)
    protected E_127 eReferenceIdentification;
    @XmlElementRef(name = "E_Reference_Identification_Qualifier_1", type = JAXBElement.class)
    protected JAXBElement<E_128_2> eReferenceIdentificationQualifier1;
    @XmlElementRef(name = "E_Reference_Identification_1", type = JAXBElement.class)
    protected JAXBElement<E_127_1> eReferenceIdentification1;
    @XmlElementRef(name = "E_Reference_Identification_Qualifier_2", type = JAXBElement.class)
    protected JAXBElement<E_128_2> eReferenceIdentificationQualifier2;
    @XmlElementRef(name = "E_Reference_Identification_2", type = JAXBElement.class)
    protected JAXBElement<E_127_1> eReferenceIdentification2;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link E_128_1 }
     *     
     */
    public E_128_1 getE_Reference_Identification_Qualifier() {
        return eReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_128_1 }
     *     
     */
    public void setE_Reference_Identification_Qualifier(E_128_1 value) {
        this.eReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the e_Reference_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link E_127 }
     *     
     */
    public E_127 getE_Reference_Identification() {
        return eReferenceIdentification;
    }

    /**
     * Sets the value of the e_Reference_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_127 }
     *     
     */
    public void setE_Reference_Identification(E_127 value) {
        this.eReferenceIdentification = value;
    }

    /**
     * Gets the value of the e_Reference_Identification_Qualifier_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_128_2 }{@code >}
     *     
     */
    public JAXBElement<E_128_2> getE_Reference_Identification_Qualifier_1() {
        return eReferenceIdentificationQualifier1;
    }

    /**
     * Sets the value of the e_Reference_Identification_Qualifier_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_128_2 }{@code >}
     *     
     */
    public void setE_Reference_Identification_Qualifier_1(JAXBElement<E_128_2> value) {
        this.eReferenceIdentificationQualifier1 = ((JAXBElement<E_128_2> ) value);
    }

    /**
     * Gets the value of the e_Reference_Identification_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_127_1 }{@code >}
     *     
     */
    public JAXBElement<E_127_1> getE_Reference_Identification_1() {
        return eReferenceIdentification1;
    }

    /**
     * Sets the value of the e_Reference_Identification_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_127_1 }{@code >}
     *     
     */
    public void setE_Reference_Identification_1(JAXBElement<E_127_1> value) {
        this.eReferenceIdentification1 = ((JAXBElement<E_127_1> ) value);
    }

    /**
     * Gets the value of the e_Reference_Identification_Qualifier_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_128_2 }{@code >}
     *     
     */
    public JAXBElement<E_128_2> getE_Reference_Identification_Qualifier_2() {
        return eReferenceIdentificationQualifier2;
    }

    /**
     * Sets the value of the e_Reference_Identification_Qualifier_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_128_2 }{@code >}
     *     
     */
    public void setE_Reference_Identification_Qualifier_2(JAXBElement<E_128_2> value) {
        this.eReferenceIdentificationQualifier2 = ((JAXBElement<E_128_2> ) value);
    }

    /**
     * Gets the value of the e_Reference_Identification_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_127_1 }{@code >}
     *     
     */
    public JAXBElement<E_127_1> getE_Reference_Identification_2() {
        return eReferenceIdentification2;
    }

    /**
     * Sets the value of the e_Reference_Identification_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_127_1 }{@code >}
     *     
     */
    public void setE_Reference_Identification_2(JAXBElement<E_127_1> value) {
        this.eReferenceIdentification2 = ((JAXBElement<E_127_1> ) value);
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
            return "Composite";
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
            return "C040";
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
            return "Reference Identifier";
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
