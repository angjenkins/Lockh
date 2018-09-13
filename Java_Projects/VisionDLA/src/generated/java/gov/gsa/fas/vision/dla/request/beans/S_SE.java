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
 * To indicate the end of the transaction set and provide the count of the transmitted segments (including the beginning (ST) and ending (SE) segments)
 * 
 * <p>Java class for S_SE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_SE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Number_of_Included_Segments" type="{}E_96"/>
 *         &lt;element name="E_Transaction_Set_Control_Number" type="{}E_329"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="SE" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Transaction Set Trailer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_SE", propOrder = {
    "eNumberOfIncludedSegments",
    "eTransactionSetControlNumber"
})
public class S_SE {

    @XmlElement(name = "E_Number_of_Included_Segments", required = true)
    protected E_96 eNumberOfIncludedSegments;
    @XmlElement(name = "E_Transaction_Set_Control_Number", required = true)
    protected E_329 eTransactionSetControlNumber;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Number_Of_Included_Segments property.
     * 
     * @return
     *     possible object is
     *     {@link E_96 }
     *     
     */
    public E_96 getE_Number_Of_Included_Segments() {
        return eNumberOfIncludedSegments;
    }

    /**
     * Sets the value of the e_Number_Of_Included_Segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_96 }
     *     
     */
    public void setE_Number_Of_Included_Segments(E_96 value) {
        this.eNumberOfIncludedSegments = value;
    }

    /**
     * Gets the value of the e_Transaction_Set_Control_Number property.
     * 
     * @return
     *     possible object is
     *     {@link E_329 }
     *     
     */
    public E_329 getE_Transaction_Set_Control_Number() {
        return eTransactionSetControlNumber;
    }

    /**
     * Sets the value of the e_Transaction_Set_Control_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_329 }
     *     
     */
    public void setE_Transaction_Set_Control_Number(E_329 value) {
        this.eTransactionSetControlNumber = value;
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
            return "SE";
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
            return "Transaction Set Trailer";
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