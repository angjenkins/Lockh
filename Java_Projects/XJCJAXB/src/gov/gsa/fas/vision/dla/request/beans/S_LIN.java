//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
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
 * To specify basic item identification data
 * 
 * <p>Java class for S_LIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_LIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Assigned_Identification" type="{}E_350" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier" type="{}E_235"/>
 *         &lt;element name="E_Product_Service_ID" type="{}E_234"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_1" type="{}E_235_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_1" type="{}E_234" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_2" type="{}E_235_2" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_2" type="{}E_234" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_3" type="{}E_235_2" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_3" type="{}E_234" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_4" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_4" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_5" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_5" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_6" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_6" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_7" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_7" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_8" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_8" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_9" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_9" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_10" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_10" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_11" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_11" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_12" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_12" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_13" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_13" type="{}E_234_1" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_Qualifier_14" type="{}E_235_3" minOccurs="0"/>
 *         &lt;element name="E_Product_Service_ID_14" type="{}E_234_1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="LIN" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Item Identification" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_LIN", propOrder = {
    "eAssignedIdentification",
    "eProductServiceIDQualifier",
    "eProductServiceID",
    "eProductServiceIDQualifier1",
    "eProductServiceID1",
    "eProductServiceIDQualifier2",
    "eProductServiceID2",
    "eProductServiceIDQualifier3",
    "eProductServiceID3",
    "eProductServiceIDQualifier4",
    "eProductServiceID4",
    "eProductServiceIDQualifier5",
    "eProductServiceID5",
    "eProductServiceIDQualifier6",
    "eProductServiceID6",
    "eProductServiceIDQualifier7",
    "eProductServiceID7",
    "eProductServiceIDQualifier8",
    "eProductServiceID8",
    "eProductServiceIDQualifier9",
    "eProductServiceID9",
    "eProductServiceIDQualifier10",
    "eProductServiceID10",
    "eProductServiceIDQualifier11",
    "eProductServiceID11",
    "eProductServiceIDQualifier12",
    "eProductServiceID12",
    "eProductServiceIDQualifier13",
    "eProductServiceID13",
    "eProductServiceIDQualifier14",
    "eProductServiceID14"
})
public class S_LIN {

    @XmlElementRef(name = "E_Assigned_Identification", type = JAXBElement.class)
    protected JAXBElement<E_350> eAssignedIdentification;
    @XmlElement(name = "E_Product_Service_ID_Qualifier", required = true)
    protected E_235 eProductServiceIDQualifier;
    @XmlElement(name = "E_Product_Service_ID", required = true)
    protected E_234 eProductServiceID;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_1", type = JAXBElement.class)
    protected JAXBElement<E_235_1> eProductServiceIDQualifier1;
    @XmlElementRef(name = "E_Product_Service_ID_1", type = JAXBElement.class)
    protected JAXBElement<E_234> eProductServiceID1;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_2", type = JAXBElement.class)
    protected JAXBElement<E_235_2> eProductServiceIDQualifier2;
    @XmlElementRef(name = "E_Product_Service_ID_2", type = JAXBElement.class)
    protected JAXBElement<E_234> eProductServiceID2;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_3", type = JAXBElement.class)
    protected JAXBElement<E_235_2> eProductServiceIDQualifier3;
    @XmlElementRef(name = "E_Product_Service_ID_3", type = JAXBElement.class)
    protected JAXBElement<E_234> eProductServiceID3;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_4", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier4;
    @XmlElementRef(name = "E_Product_Service_ID_4", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID4;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_5", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier5;
    @XmlElementRef(name = "E_Product_Service_ID_5", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID5;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_6", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier6;
    @XmlElementRef(name = "E_Product_Service_ID_6", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID6;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_7", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier7;
    @XmlElementRef(name = "E_Product_Service_ID_7", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID7;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_8", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier8;
    @XmlElementRef(name = "E_Product_Service_ID_8", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID8;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_9", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier9;
    @XmlElementRef(name = "E_Product_Service_ID_9", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID9;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_10", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier10;
    @XmlElementRef(name = "E_Product_Service_ID_10", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID10;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_11", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier11;
    @XmlElementRef(name = "E_Product_Service_ID_11", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID11;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_12", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier12;
    @XmlElementRef(name = "E_Product_Service_ID_12", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID12;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_13", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier13;
    @XmlElementRef(name = "E_Product_Service_ID_13", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID13;
    @XmlElementRef(name = "E_Product_Service_ID_Qualifier_14", type = JAXBElement.class)
    protected JAXBElement<E_235_3> eProductServiceIDQualifier14;
    @XmlElementRef(name = "E_Product_Service_ID_14", type = JAXBElement.class)
    protected JAXBElement<E_234_1> eProductServiceID14;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Assigned_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_350 }{@code >}
     *     
     */
    public JAXBElement<E_350> getE_Assigned_Identification() {
        return eAssignedIdentification;
    }

    /**
     * Sets the value of the e_Assigned_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_350 }{@code >}
     *     
     */
    public void setE_Assigned_Identification(JAXBElement<E_350> value) {
        this.eAssignedIdentification = ((JAXBElement<E_350> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link E_235 }
     *     
     */
    public E_235 getE_Product_Service_ID_Qualifier() {
        return eProductServiceIDQualifier;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_235 }
     *     
     */
    public void setE_Product_Service_ID_Qualifier(E_235 value) {
        this.eProductServiceIDQualifier = value;
    }

    /**
     * Gets the value of the e_Product_Service_ID property.
     * 
     * @return
     *     possible object is
     *     {@link E_234 }
     *     
     */
    public E_234 getE_Product_Service_ID() {
        return eProductServiceID;
    }

    /**
     * Sets the value of the e_Product_Service_ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_234 }
     *     
     */
    public void setE_Product_Service_ID(E_234 value) {
        this.eProductServiceID = value;
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_1 }{@code >}
     *     
     */
    public JAXBElement<E_235_1> getE_Product_Service_ID_Qualifier_1() {
        return eProductServiceIDQualifier1;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_1(JAXBElement<E_235_1> value) {
        this.eProductServiceIDQualifier1 = ((JAXBElement<E_235_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public JAXBElement<E_234> getE_Product_Service_ID_1() {
        return eProductServiceID1;
    }

    /**
     * Sets the value of the e_Product_Service_ID_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_1(JAXBElement<E_234> value) {
        this.eProductServiceID1 = ((JAXBElement<E_234> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_2 }{@code >}
     *     
     */
    public JAXBElement<E_235_2> getE_Product_Service_ID_Qualifier_2() {
        return eProductServiceIDQualifier2;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_2 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_2(JAXBElement<E_235_2> value) {
        this.eProductServiceIDQualifier2 = ((JAXBElement<E_235_2> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public JAXBElement<E_234> getE_Product_Service_ID_2() {
        return eProductServiceID2;
    }

    /**
     * Sets the value of the e_Product_Service_ID_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_2(JAXBElement<E_234> value) {
        this.eProductServiceID2 = ((JAXBElement<E_234> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_2 }{@code >}
     *     
     */
    public JAXBElement<E_235_2> getE_Product_Service_ID_Qualifier_3() {
        return eProductServiceIDQualifier3;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_2 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_3(JAXBElement<E_235_2> value) {
        this.eProductServiceIDQualifier3 = ((JAXBElement<E_235_2> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public JAXBElement<E_234> getE_Product_Service_ID_3() {
        return eProductServiceID3;
    }

    /**
     * Sets the value of the e_Product_Service_ID_3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_3(JAXBElement<E_234> value) {
        this.eProductServiceID3 = ((JAXBElement<E_234> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_4() {
        return eProductServiceIDQualifier4;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_4(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier4 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_4() {
        return eProductServiceID4;
    }

    /**
     * Sets the value of the e_Product_Service_ID_4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_4(JAXBElement<E_234_1> value) {
        this.eProductServiceID4 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_5() {
        return eProductServiceIDQualifier5;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_5(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier5 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_5() {
        return eProductServiceID5;
    }

    /**
     * Sets the value of the e_Product_Service_ID_5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_5(JAXBElement<E_234_1> value) {
        this.eProductServiceID5 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_6() {
        return eProductServiceIDQualifier6;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_6(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier6 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_6() {
        return eProductServiceID6;
    }

    /**
     * Sets the value of the e_Product_Service_ID_6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_6(JAXBElement<E_234_1> value) {
        this.eProductServiceID6 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_7() {
        return eProductServiceIDQualifier7;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_7(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier7 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_7() {
        return eProductServiceID7;
    }

    /**
     * Sets the value of the e_Product_Service_ID_7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_7(JAXBElement<E_234_1> value) {
        this.eProductServiceID7 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_8() {
        return eProductServiceIDQualifier8;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_8(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier8 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_8() {
        return eProductServiceID8;
    }

    /**
     * Sets the value of the e_Product_Service_ID_8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_8(JAXBElement<E_234_1> value) {
        this.eProductServiceID8 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_9() {
        return eProductServiceIDQualifier9;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_9(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier9 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_9() {
        return eProductServiceID9;
    }

    /**
     * Sets the value of the e_Product_Service_ID_9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_9(JAXBElement<E_234_1> value) {
        this.eProductServiceID9 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_10() {
        return eProductServiceIDQualifier10;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_10(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier10 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_10() {
        return eProductServiceID10;
    }

    /**
     * Sets the value of the e_Product_Service_ID_10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_10(JAXBElement<E_234_1> value) {
        this.eProductServiceID10 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_11() {
        return eProductServiceIDQualifier11;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_11(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier11 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_11() {
        return eProductServiceID11;
    }

    /**
     * Sets the value of the e_Product_Service_ID_11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_11(JAXBElement<E_234_1> value) {
        this.eProductServiceID11 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_12() {
        return eProductServiceIDQualifier12;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_12(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier12 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_12() {
        return eProductServiceID12;
    }

    /**
     * Sets the value of the e_Product_Service_ID_12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_12(JAXBElement<E_234_1> value) {
        this.eProductServiceID12 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_13() {
        return eProductServiceIDQualifier13;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_13(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier13 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_13() {
        return eProductServiceID13;
    }

    /**
     * Sets the value of the e_Product_Service_ID_13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_13(JAXBElement<E_234_1> value) {
        this.eProductServiceID13 = ((JAXBElement<E_234_1> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_Qualifier_14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public JAXBElement<E_235_3> getE_Product_Service_ID_Qualifier_14() {
        return eProductServiceIDQualifier14;
    }

    /**
     * Sets the value of the e_Product_Service_ID_Qualifier_14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_235_3 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_Qualifier_14(JAXBElement<E_235_3> value) {
        this.eProductServiceIDQualifier14 = ((JAXBElement<E_235_3> ) value);
    }

    /**
     * Gets the value of the e_Product_Service_ID_14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public JAXBElement<E_234_1> getE_Product_Service_ID_14() {
        return eProductServiceID14;
    }

    /**
     * Sets the value of the e_Product_Service_ID_14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_234_1 }{@code >}
     *     
     */
    public void setE_Product_Service_ID_14(JAXBElement<E_234_1> value) {
        this.eProductServiceID14 = ((JAXBElement<E_234_1> ) value);
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
            return "LIN";
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
            return "Item Identification";
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
