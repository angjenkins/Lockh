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
 * To specify the action that is to be taken in response to a nonconformance condition
 * 
 * <p>Java class for L_NCA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L_NCA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_Nonconformance_Action" type="{}S_NCA"/>
 *         &lt;element name="S_Note_Special_Instruction" type="{}S_NTE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="S_Date_Time_Reference" type="{}S_DTM_1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="S_Reference_Identification" type="{}S_REF_2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Name" type="{}L_N1_2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Code_Source_Information" type="{}L_LM_2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="NCA" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Nonconformance Action" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L_NCA", propOrder = {
    "sNonconformanceAction",
    "sNoteSpecialInstruction",
    "sDateTimeReference",
    "sReferenceIdentification",
    "lName",
    "lCodeSourceInformation"
})
public class L_NCA {

    @XmlElement(name = "S_Nonconformance_Action", required = true)
    protected S_NCA sNonconformanceAction;
    @XmlElement(name = "S_Note_Special_Instruction", nillable = true)
    protected List<S_NTE> sNoteSpecialInstruction;
    @XmlElement(name = "S_Date_Time_Reference", nillable = true)
    protected List<S_DTM_1> sDateTimeReference;
    @XmlElement(name = "S_Reference_Identification", nillable = true)
    protected List<S_REF_2> sReferenceIdentification;
    @XmlElement(name = "L_Name", nillable = true)
    protected List<L_N1_2> lName;
    @XmlElement(name = "L_Code_Source_Information", nillable = true)
    protected List<L_LM_2> lCodeSourceInformation;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the s_Nonconformance_Action property.
     * 
     * @return
     *     possible object is
     *     {@link S_NCA }
     *     
     */
    public S_NCA getS_Nonconformance_Action() {
        return sNonconformanceAction;
    }

    /**
     * Sets the value of the s_Nonconformance_Action property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_NCA }
     *     
     */
    public void setS_Nonconformance_Action(S_NCA value) {
        this.sNonconformanceAction = value;
    }

    /**
     * Gets the value of the sNoteSpecialInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sNoteSpecialInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Note_Special_Instruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_NTE }
     * 
     * 
     */
    public List<S_NTE> getS_Note_Special_Instruction() {
        if (sNoteSpecialInstruction == null) {
            sNoteSpecialInstruction = new ArrayList<S_NTE>();
        }
        return this.sNoteSpecialInstruction;
    }

    /**
     * Gets the value of the sDateTimeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sDateTimeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Date_Time_Reference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_DTM_1 }
     * 
     * 
     */
    public List<S_DTM_1> getS_Date_Time_Reference() {
        if (sDateTimeReference == null) {
            sDateTimeReference = new ArrayList<S_DTM_1>();
        }
        return this.sDateTimeReference;
    }

    /**
     * Gets the value of the sReferenceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sReferenceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Reference_Identification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_REF_2 }
     * 
     * 
     */
    public List<S_REF_2> getS_Reference_Identification() {
        if (sReferenceIdentification == null) {
            sReferenceIdentification = new ArrayList<S_REF_2>();
        }
        return this.sReferenceIdentification;
    }

    /**
     * Gets the value of the lName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Name().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_N1_2 }
     * 
     * 
     */
    public List<L_N1_2> getL_Name() {
        if (lName == null) {
            lName = new ArrayList<L_N1_2>();
        }
        return this.lName;
    }

    /**
     * Gets the value of the lCodeSourceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lCodeSourceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Code_Source_Information().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_LM_2 }
     * 
     * 
     */
    public List<L_LM_2> getL_Code_Source_Information() {
        if (lCodeSourceInformation == null) {
            lCodeSourceInformation = new ArrayList<L_LM_2>();
        }
        return this.lCodeSourceInformation;
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
            return "NCA";
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
            return "Nonconformance Action";
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