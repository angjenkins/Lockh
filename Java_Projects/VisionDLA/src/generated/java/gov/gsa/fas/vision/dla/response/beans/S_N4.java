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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the geographic place of the named party
 * 
 * <p>Java class for S_N4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_N4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_City_Name" type="{}E_19" minOccurs="0"/>
 *         &lt;element name="E_State_or_Province_Code" type="{}E_156" minOccurs="0"/>
 *         &lt;element name="E_Postal_Code" type="{}E_116" minOccurs="0"/>
 *         &lt;element name="E_Country_Code" type="{}E_26" minOccurs="0"/>
 *         &lt;element name="E_Location_Qualifier" type="{}E_309" minOccurs="0"/>
 *         &lt;element name="E_Location_Identifier" type="{}E_310" minOccurs="0"/>
 *         &lt;element name="E_Country_Subdivision_Code" type="{}E_1715" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="N4" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Geographic Location" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_N4", propOrder = {
    "eCityName",
    "eStateOrProvinceCode",
    "ePostalCode",
    "eCountryCode",
    "eLocationQualifier",
    "eLocationIdentifier",
    "eCountrySubdivisionCode"
})
public class S_N4 {

    @XmlElementRef(name = "E_City_Name", type = JAXBElement.class)
    protected JAXBElement<E_19> eCityName;
    @XmlElementRef(name = "E_State_or_Province_Code", type = JAXBElement.class)
    protected JAXBElement<E_156> eStateOrProvinceCode;
    @XmlElementRef(name = "E_Postal_Code", type = JAXBElement.class)
    protected JAXBElement<E_116> ePostalCode;
    @XmlElementRef(name = "E_Country_Code", type = JAXBElement.class)
    protected JAXBElement<E_26> eCountryCode;
    @XmlElementRef(name = "E_Location_Qualifier", type = JAXBElement.class)
    protected JAXBElement<E_309> eLocationQualifier;
    @XmlElementRef(name = "E_Location_Identifier", type = JAXBElement.class)
    protected JAXBElement<E_310> eLocationIdentifier;
    @XmlElementRef(name = "E_Country_Subdivision_Code", type = JAXBElement.class)
    protected JAXBElement<E_1715> eCountrySubdivisionCode;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_City_Name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_19 }{@code >}
     *     
     */
    public JAXBElement<E_19> getE_City_Name() {
        return eCityName;
    }

    /**
     * Sets the value of the e_City_Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_19 }{@code >}
     *     
     */
    public void setE_City_Name(JAXBElement<E_19> value) {
        this.eCityName = ((JAXBElement<E_19> ) value);
    }

    /**
     * Gets the value of the e_State_Or_Province_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_156 }{@code >}
     *     
     */
    public JAXBElement<E_156> getE_State_Or_Province_Code() {
        return eStateOrProvinceCode;
    }

    /**
     * Sets the value of the e_State_Or_Province_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_156 }{@code >}
     *     
     */
    public void setE_State_Or_Province_Code(JAXBElement<E_156> value) {
        this.eStateOrProvinceCode = ((JAXBElement<E_156> ) value);
    }

    /**
     * Gets the value of the e_Postal_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_116 }{@code >}
     *     
     */
    public JAXBElement<E_116> getE_Postal_Code() {
        return ePostalCode;
    }

    /**
     * Sets the value of the e_Postal_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_116 }{@code >}
     *     
     */
    public void setE_Postal_Code(JAXBElement<E_116> value) {
        this.ePostalCode = ((JAXBElement<E_116> ) value);
    }

    /**
     * Gets the value of the e_Country_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_26 }{@code >}
     *     
     */
    public JAXBElement<E_26> getE_Country_Code() {
        return eCountryCode;
    }

    /**
     * Sets the value of the e_Country_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_26 }{@code >}
     *     
     */
    public void setE_Country_Code(JAXBElement<E_26> value) {
        this.eCountryCode = ((JAXBElement<E_26> ) value);
    }

    /**
     * Gets the value of the e_Location_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_309 }{@code >}
     *     
     */
    public JAXBElement<E_309> getE_Location_Qualifier() {
        return eLocationQualifier;
    }

    /**
     * Sets the value of the e_Location_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_309 }{@code >}
     *     
     */
    public void setE_Location_Qualifier(JAXBElement<E_309> value) {
        this.eLocationQualifier = ((JAXBElement<E_309> ) value);
    }

    /**
     * Gets the value of the e_Location_Identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_310 }{@code >}
     *     
     */
    public JAXBElement<E_310> getE_Location_Identifier() {
        return eLocationIdentifier;
    }

    /**
     * Sets the value of the e_Location_Identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_310 }{@code >}
     *     
     */
    public void setE_Location_Identifier(JAXBElement<E_310> value) {
        this.eLocationIdentifier = ((JAXBElement<E_310> ) value);
    }

    /**
     * Gets the value of the e_Country_Subdivision_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1715 }{@code >}
     *     
     */
    public JAXBElement<E_1715> getE_Country_Subdivision_Code() {
        return eCountrySubdivisionCode;
    }

    /**
     * Sets the value of the e_Country_Subdivision_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1715 }{@code >}
     *     
     */
    public void setE_Country_Subdivision_Code(JAXBElement<E_1715> value) {
        this.eCountrySubdivisionCode = ((JAXBElement<E_1715> ) value);
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
            return "N4";
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
            return "Geographic Location";
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
