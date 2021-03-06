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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information about a contract
 * 
 * <p>Java class for S_CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_CS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Contract_Number" type="{}E_367" minOccurs="0"/>
 *         &lt;element name="E_Change_Order_Sequence_Number" type="{}E_327" minOccurs="0"/>
 *         &lt;element name="E_Release_Number" type="{}E_328" minOccurs="0"/>
 *         &lt;element name="E_Reference_Identification_Qualifier" type="{}E_128_4" minOccurs="0"/>
 *         &lt;element name="E_Reference_Identification" type="{}E_127" minOccurs="0"/>
 *         &lt;element name="E_Purchase_Order_Number" type="{}E_324" minOccurs="0"/>
 *         &lt;element name="E_Special_Services_Code" type="{}E_560" minOccurs="0"/>
 *         &lt;element name="E_F_O_B_Point_Code" type="{}E_433" minOccurs="0"/>
 *         &lt;element name="E_Percent" type="{}E_954" minOccurs="0"/>
 *         &lt;element name="E_Percent_1" type="{}E_954" minOccurs="0"/>
 *         &lt;element name="E_Monetary_Amount" type="{}E_782" minOccurs="0"/>
 *         &lt;element name="E_Terms_Type_Code" type="{}E_336" minOccurs="0"/>
 *         &lt;element name="E_Special_Services_Code_1" type="{}E_560" minOccurs="0"/>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code" type="{}E_355" minOccurs="0"/>
 *         &lt;element name="E_Unit_Price" type="{}E_212" minOccurs="0"/>
 *         &lt;element name="E_Terms_Type_Code_1" type="{}E_336" minOccurs="0"/>
 *         &lt;element name="E_Yes_No_Condition_or_Response_Code" type="{}E_1073" minOccurs="0"/>
 *         &lt;element name="E_Yes_No_Condition_or_Response_Code_1" type="{}E_1073" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="CS" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Contract Summary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_CS", propOrder = {
    "eContractNumber",
    "eChangeOrderSequenceNumber",
    "eReleaseNumber",
    "eReferenceIdentificationQualifier",
    "eReferenceIdentification",
    "ePurchaseOrderNumber",
    "eSpecialServicesCode",
    "eFOBPointCode",
    "ePercent",
    "ePercent1",
    "eMonetaryAmount",
    "eTermsTypeCode",
    "eSpecialServicesCode1",
    "eUnitOrBasisForMeasurementCode",
    "eUnitPrice",
    "eTermsTypeCode1",
    "eYesNoConditionOrResponseCode",
    "eYesNoConditionOrResponseCode1"
})
public class S_CS {

    @XmlElementRef(name = "E_Contract_Number", type = JAXBElement.class)
    protected JAXBElement<E_367> eContractNumber;
    @XmlElementRef(name = "E_Change_Order_Sequence_Number", type = JAXBElement.class)
    protected JAXBElement<E_327> eChangeOrderSequenceNumber;
    @XmlElementRef(name = "E_Release_Number", type = JAXBElement.class)
    protected JAXBElement<E_328> eReleaseNumber;
    @XmlElementRef(name = "E_Reference_Identification_Qualifier", type = JAXBElement.class)
    protected JAXBElement<E_128_4> eReferenceIdentificationQualifier;
    @XmlElementRef(name = "E_Reference_Identification", type = JAXBElement.class)
    protected JAXBElement<E_127> eReferenceIdentification;
    @XmlElementRef(name = "E_Purchase_Order_Number", type = JAXBElement.class)
    protected JAXBElement<E_324> ePurchaseOrderNumber;
    @XmlElementRef(name = "E_Special_Services_Code", type = JAXBElement.class)
    protected JAXBElement<E_560> eSpecialServicesCode;
    @XmlElementRef(name = "E_F_O_B_Point_Code", type = JAXBElement.class)
    protected JAXBElement<E_433> eFOBPointCode;
    @XmlElementRef(name = "E_Percent", type = JAXBElement.class)
    protected JAXBElement<E_954> ePercent;
    @XmlElementRef(name = "E_Percent_1", type = JAXBElement.class)
    protected JAXBElement<E_954> ePercent1;
    @XmlElementRef(name = "E_Monetary_Amount", type = JAXBElement.class)
    protected JAXBElement<E_782> eMonetaryAmount;
    @XmlElementRef(name = "E_Terms_Type_Code", type = JAXBElement.class)
    protected JAXBElement<E_336> eTermsTypeCode;
    @XmlElementRef(name = "E_Special_Services_Code_1", type = JAXBElement.class)
    protected JAXBElement<E_560> eSpecialServicesCode1;
    @XmlElementRef(name = "E_Unit_or_Basis_for_Measurement_Code", type = JAXBElement.class)
    protected JAXBElement<E_355> eUnitOrBasisForMeasurementCode;
    @XmlElementRef(name = "E_Unit_Price", type = JAXBElement.class)
    protected JAXBElement<E_212> eUnitPrice;
    @XmlElementRef(name = "E_Terms_Type_Code_1", type = JAXBElement.class)
    protected JAXBElement<E_336> eTermsTypeCode1;
    @XmlElementRef(name = "E_Yes_No_Condition_or_Response_Code", type = JAXBElement.class)
    protected JAXBElement<E_1073> eYesNoConditionOrResponseCode;
    @XmlElementRef(name = "E_Yes_No_Condition_or_Response_Code_1", type = JAXBElement.class)
    protected JAXBElement<E_1073> eYesNoConditionOrResponseCode1;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Contract_Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_367 }{@code >}
     *     
     */
    public JAXBElement<E_367> getE_Contract_Number() {
        return eContractNumber;
    }

    /**
     * Sets the value of the e_Contract_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_367 }{@code >}
     *     
     */
    public void setE_Contract_Number(JAXBElement<E_367> value) {
        this.eContractNumber = ((JAXBElement<E_367> ) value);
    }

    /**
     * Gets the value of the e_Change_Order_Sequence_Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_327 }{@code >}
     *     
     */
    public JAXBElement<E_327> getE_Change_Order_Sequence_Number() {
        return eChangeOrderSequenceNumber;
    }

    /**
     * Sets the value of the e_Change_Order_Sequence_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_327 }{@code >}
     *     
     */
    public void setE_Change_Order_Sequence_Number(JAXBElement<E_327> value) {
        this.eChangeOrderSequenceNumber = ((JAXBElement<E_327> ) value);
    }

    /**
     * Gets the value of the e_Release_Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_328 }{@code >}
     *     
     */
    public JAXBElement<E_328> getE_Release_Number() {
        return eReleaseNumber;
    }

    /**
     * Sets the value of the e_Release_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_328 }{@code >}
     *     
     */
    public void setE_Release_Number(JAXBElement<E_328> value) {
        this.eReleaseNumber = ((JAXBElement<E_328> ) value);
    }

    /**
     * Gets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_128_4 }{@code >}
     *     
     */
    public JAXBElement<E_128_4> getE_Reference_Identification_Qualifier() {
        return eReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_128_4 }{@code >}
     *     
     */
    public void setE_Reference_Identification_Qualifier(JAXBElement<E_128_4> value) {
        this.eReferenceIdentificationQualifier = ((JAXBElement<E_128_4> ) value);
    }

    /**
     * Gets the value of the e_Reference_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_127 }{@code >}
     *     
     */
    public JAXBElement<E_127> getE_Reference_Identification() {
        return eReferenceIdentification;
    }

    /**
     * Sets the value of the e_Reference_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_127 }{@code >}
     *     
     */
    public void setE_Reference_Identification(JAXBElement<E_127> value) {
        this.eReferenceIdentification = ((JAXBElement<E_127> ) value);
    }

    /**
     * Gets the value of the e_Purchase_Order_Number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_324 }{@code >}
     *     
     */
    public JAXBElement<E_324> getE_Purchase_Order_Number() {
        return ePurchaseOrderNumber;
    }

    /**
     * Sets the value of the e_Purchase_Order_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_324 }{@code >}
     *     
     */
    public void setE_Purchase_Order_Number(JAXBElement<E_324> value) {
        this.ePurchaseOrderNumber = ((JAXBElement<E_324> ) value);
    }

    /**
     * Gets the value of the e_Special_Services_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_560 }{@code >}
     *     
     */
    public JAXBElement<E_560> getE_Special_Services_Code() {
        return eSpecialServicesCode;
    }

    /**
     * Sets the value of the e_Special_Services_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_560 }{@code >}
     *     
     */
    public void setE_Special_Services_Code(JAXBElement<E_560> value) {
        this.eSpecialServicesCode = ((JAXBElement<E_560> ) value);
    }

    /**
     * Gets the value of the e_F_O_B_Point_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_433 }{@code >}
     *     
     */
    public JAXBElement<E_433> getE_F_O_B_Point_Code() {
        return eFOBPointCode;
    }

    /**
     * Sets the value of the e_F_O_B_Point_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_433 }{@code >}
     *     
     */
    public void setE_F_O_B_Point_Code(JAXBElement<E_433> value) {
        this.eFOBPointCode = ((JAXBElement<E_433> ) value);
    }

    /**
     * Gets the value of the e_Percent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_954 }{@code >}
     *     
     */
    public JAXBElement<E_954> getE_Percent() {
        return ePercent;
    }

    /**
     * Sets the value of the e_Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_954 }{@code >}
     *     
     */
    public void setE_Percent(JAXBElement<E_954> value) {
        this.ePercent = ((JAXBElement<E_954> ) value);
    }

    /**
     * Gets the value of the e_Percent_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_954 }{@code >}
     *     
     */
    public JAXBElement<E_954> getE_Percent_1() {
        return ePercent1;
    }

    /**
     * Sets the value of the e_Percent_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_954 }{@code >}
     *     
     */
    public void setE_Percent_1(JAXBElement<E_954> value) {
        this.ePercent1 = ((JAXBElement<E_954> ) value);
    }

    /**
     * Gets the value of the e_Monetary_Amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_782 }{@code >}
     *     
     */
    public JAXBElement<E_782> getE_Monetary_Amount() {
        return eMonetaryAmount;
    }

    /**
     * Sets the value of the e_Monetary_Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_782 }{@code >}
     *     
     */
    public void setE_Monetary_Amount(JAXBElement<E_782> value) {
        this.eMonetaryAmount = ((JAXBElement<E_782> ) value);
    }

    /**
     * Gets the value of the e_Terms_Type_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_336 }{@code >}
     *     
     */
    public JAXBElement<E_336> getE_Terms_Type_Code() {
        return eTermsTypeCode;
    }

    /**
     * Sets the value of the e_Terms_Type_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_336 }{@code >}
     *     
     */
    public void setE_Terms_Type_Code(JAXBElement<E_336> value) {
        this.eTermsTypeCode = ((JAXBElement<E_336> ) value);
    }

    /**
     * Gets the value of the e_Special_Services_Code_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_560 }{@code >}
     *     
     */
    public JAXBElement<E_560> getE_Special_Services_Code_1() {
        return eSpecialServicesCode1;
    }

    /**
     * Sets the value of the e_Special_Services_Code_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_560 }{@code >}
     *     
     */
    public void setE_Special_Services_Code_1(JAXBElement<E_560> value) {
        this.eSpecialServicesCode1 = ((JAXBElement<E_560> ) value);
    }

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public JAXBElement<E_355> getE_Unit_Or_Basis_For_Measurement_Code() {
        return eUnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code(JAXBElement<E_355> value) {
        this.eUnitOrBasisForMeasurementCode = ((JAXBElement<E_355> ) value);
    }

    /**
     * Gets the value of the e_Unit_Price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_212 }{@code >}
     *     
     */
    public JAXBElement<E_212> getE_Unit_Price() {
        return eUnitPrice;
    }

    /**
     * Sets the value of the e_Unit_Price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_212 }{@code >}
     *     
     */
    public void setE_Unit_Price(JAXBElement<E_212> value) {
        this.eUnitPrice = ((JAXBElement<E_212> ) value);
    }

    /**
     * Gets the value of the e_Terms_Type_Code_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_336 }{@code >}
     *     
     */
    public JAXBElement<E_336> getE_Terms_Type_Code_1() {
        return eTermsTypeCode1;
    }

    /**
     * Sets the value of the e_Terms_Type_Code_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_336 }{@code >}
     *     
     */
    public void setE_Terms_Type_Code_1(JAXBElement<E_336> value) {
        this.eTermsTypeCode1 = ((JAXBElement<E_336> ) value);
    }

    /**
     * Gets the value of the e_Yes_No_Condition_Or_Response_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1073 }{@code >}
     *     
     */
    public JAXBElement<E_1073> getE_Yes_No_Condition_Or_Response_Code() {
        return eYesNoConditionOrResponseCode;
    }

    /**
     * Sets the value of the e_Yes_No_Condition_Or_Response_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1073 }{@code >}
     *     
     */
    public void setE_Yes_No_Condition_Or_Response_Code(JAXBElement<E_1073> value) {
        this.eYesNoConditionOrResponseCode = ((JAXBElement<E_1073> ) value);
    }

    /**
     * Gets the value of the e_Yes_No_Condition_Or_Response_Code_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1073 }{@code >}
     *     
     */
    public JAXBElement<E_1073> getE_Yes_No_Condition_Or_Response_Code_1() {
        return eYesNoConditionOrResponseCode1;
    }

    /**
     * Sets the value of the e_Yes_No_Condition_Or_Response_Code_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1073 }{@code >}
     *     
     */
    public void setE_Yes_No_Condition_Or_Response_Code_1(JAXBElement<E_1073> value) {
        this.eYesNoConditionOrResponseCode1 = ((JAXBElement<E_1073> ) value);
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
            return "CS";
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
            return "Contract Summary";
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
