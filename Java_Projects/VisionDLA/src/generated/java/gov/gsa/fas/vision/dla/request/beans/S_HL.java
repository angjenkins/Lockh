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
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for S_HL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_HL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Hierarchical_ID_Number" type="{}E_628"/>
 *         &lt;element name="E_Hierarchical_Parent_ID_Number" type="{}E_734" minOccurs="0"/>
 *         &lt;element name="E_Hierarchical_Level_Code" type="{}E_735"/>
 *         &lt;element name="E_Hierarchical_Child_Code" type="{}E_736" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="HL" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Hierarchical Level" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_HL", propOrder = {
    "eHierarchicalIDNumber",
    "eHierarchicalParentIDNumber",
    "eHierarchicalLevelCode",
    "eHierarchicalChildCode"
})
public class S_HL {

    @XmlElement(name = "E_Hierarchical_ID_Number", required = true)
    protected E_628 eHierarchicalIDNumber;
    @XmlElementRef(name = "E_Hierarchical_Parent_ID_Number", type = JAXBElement.class)
    protected JAXBElement<E_734> eHierarchicalParentIDNumber;
    @XmlElement(name = "E_Hierarchical_Level_Code", required = true)
    protected E_735 eHierarchicalLevelCode;
    @XmlElementRef(name = "E_Hierarchical_Child_Code", type = JAXBElement.class)
    protected JAXBElement<E_736> eHierarchicalChildCode;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Hierarchical_ID_Number property.
     * 
     * @return
     *     possible object is
     *     {@link E_628 }
     *     
     */
    public E_628 getE_Hierarchical_ID_Number() {
        return eHierarchicalIDNumber;
    }

    /**
     * Sets the value of the e_Hierarchical_ID_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_628 }
     *     
     */
    public void setE_Hierarchical_ID_Number(E_628 value) {
        this.eHierarchicalIDNumber = value;
    }

    /**
     * Gets the value of the e_Hierarchical_Parent_ID_Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_734 }{@code >}
     *     
     */
    public JAXBElement<E_734> getE_Hierarchical_Parent_ID_Number() {
        return eHierarchicalParentIDNumber;
    }

    /**
     * Sets the value of the e_Hierarchical_Parent_ID_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_734 }{@code >}
     *     
     */
    public void setE_Hierarchical_Parent_ID_Number(JAXBElement<E_734> value) {
        this.eHierarchicalParentIDNumber = ((JAXBElement<E_734> ) value);
    }

    /**
     * Gets the value of the e_Hierarchical_Level_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_735 }
     *     
     */
    public E_735 getE_Hierarchical_Level_Code() {
        return eHierarchicalLevelCode;
    }

    /**
     * Sets the value of the e_Hierarchical_Level_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_735 }
     *     
     */
    public void setE_Hierarchical_Level_Code(E_735 value) {
        this.eHierarchicalLevelCode = value;
    }

    /**
     * Gets the value of the e_Hierarchical_Child_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_736 }{@code >}
     *     
     */
    public JAXBElement<E_736> getE_Hierarchical_Child_Code() {
        return eHierarchicalChildCode;
    }

    /**
     * Sets the value of the e_Hierarchical_Child_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_736 }{@code >}
     *     
     */
    public void setE_Hierarchical_Child_Code(JAXBElement<E_736> value) {
        this.eHierarchicalChildCode = ((JAXBElement<E_736> ) value);
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
            return "HL";
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
            return "Hierarchical Level";
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