
package gov.gsa.fas.order.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WdcOrderedItemDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcOrderedItemDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fas.gsa.gov/Order/v1.0}WdcItemDetails">
 *       &lt;sequence>
 *         &lt;element name="documentIdentitierCode" type="{http://fas.gsa.gov/Global/v1.0}string3" minOccurs="0"/>
 *         &lt;element name="customerSatusUpdateMedium" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="supplementalAac" type="{http://fas.gsa.gov/Order/v1.0}ActivityAddressCode" minOccurs="0"/>
 *         &lt;element name="signalCode" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="fundCode" type="{http://fas.gsa.gov/Global/v1.0}string2" minOccurs="0"/>
 *         &lt;element name="distributionCode" type="{http://fas.gsa.gov/Global/v1.0}string4" minOccurs="0"/>
 *         &lt;element name="projectCode" type="{http://fas.gsa.gov/Global/v1.0}string5" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://fas.gsa.gov/Order/v1.0}RequisitionPriority" minOccurs="0"/>
 *         &lt;element name="adviceCode" type="{http://fas.gsa.gov/Global/v1.0}string2" minOccurs="0"/>
 *         &lt;element name="tdCode" type="{http://fas.gsa.gov/Global/v1.0}string5" minOccurs="0"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="editDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="requiredDeliveryDateCode" type="{http://fas.gsa.gov/Global/v1.0}string3" minOccurs="0"/>
 *         &lt;element name="calculatedRequiredDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="buyComputationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="futureFreezeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="associatedAgencyCodes" type="{http://fas.gsa.gov/Order/v1.0}AssociatedAgencyCodes" minOccurs="0"/>
 *         &lt;element name="exportType" type="{http://fas.gsa.gov/Order/v1.0}ExportType" minOccurs="0"/>
 *         &lt;element name="inputCode" type="{http://fas.gsa.gov/Global/v1.0}string1" minOccurs="0"/>
 *         &lt;element name="consignee" type="{http://fas.gsa.gov/Order/v1.0}WdcConsignee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcOrderedItemDetails", propOrder = {
    "documentIdentitierCode",
    "customerSatusUpdateMedium",
    "supplementalAac",
    "signalCode",
    "fundCode",
    "distributionCode",
    "projectCode",
    "priority",
    "adviceCode",
    "tdCode",
    "entryDate",
    "editDate",
    "requiredDeliveryDateCode",
    "calculatedRequiredDeliveryDate",
    "buyComputationDate",
    "futureFreezeDate",
    "associatedAgencyCodes",
    "exportType",
    "inputCode",
    "consignee"
})
public class WdcOrderedItemDetails
    extends WdcItemDetails
{

    protected String documentIdentitierCode;
    protected String customerSatusUpdateMedium;
    protected ActivityAddressCode supplementalAac;
    protected String signalCode;
    protected String fundCode;
    protected String distributionCode;
    protected String projectCode;
    protected RequisitionPriority priority;
    protected String adviceCode;
    protected String tdCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar editDate;
    protected String requiredDeliveryDateCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calculatedRequiredDeliveryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buyComputationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar futureFreezeDate;
    protected AssociatedAgencyCodes associatedAgencyCodes;
    protected ExportType exportType;
    protected String inputCode;
    protected WdcConsignee consignee;

    /**
     * Gets the value of the documentIdentitierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIdentitierCode() {
        return documentIdentitierCode;
    }

    /**
     * Sets the value of the documentIdentitierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIdentitierCode(String value) {
        this.documentIdentitierCode = value;
    }

    /**
     * Gets the value of the customerSatusUpdateMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSatusUpdateMedium() {
        return customerSatusUpdateMedium;
    }

    /**
     * Sets the value of the customerSatusUpdateMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSatusUpdateMedium(String value) {
        this.customerSatusUpdateMedium = value;
    }

    /**
     * Gets the value of the supplementalAac property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAddressCode }
     *     
     */
    public ActivityAddressCode getSupplementalAac() {
        return supplementalAac;
    }

    /**
     * Sets the value of the supplementalAac property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAddressCode }
     *     
     */
    public void setSupplementalAac(ActivityAddressCode value) {
        this.supplementalAac = value;
    }

    /**
     * Gets the value of the signalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalCode() {
        return signalCode;
    }

    /**
     * Sets the value of the signalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalCode(String value) {
        this.signalCode = value;
    }

    /**
     * Gets the value of the fundCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Sets the value of the fundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundCode(String value) {
        this.fundCode = value;
    }

    /**
     * Gets the value of the distributionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCode() {
        return distributionCode;
    }

    /**
     * Sets the value of the distributionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCode(String value) {
        this.distributionCode = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link RequisitionPriority }
     *     
     */
    public RequisitionPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequisitionPriority }
     *     
     */
    public void setPriority(RequisitionPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the adviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviceCode() {
        return adviceCode;
    }

    /**
     * Sets the value of the adviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviceCode(String value) {
        this.adviceCode = value;
    }

    /**
     * Gets the value of the tdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdCode() {
        return tdCode;
    }

    /**
     * Sets the value of the tdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdCode(String value) {
        this.tdCode = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the editDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditDate() {
        return editDate;
    }

    /**
     * Sets the value of the editDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditDate(XMLGregorianCalendar value) {
        this.editDate = value;
    }

    /**
     * Gets the value of the requiredDeliveryDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredDeliveryDateCode() {
        return requiredDeliveryDateCode;
    }

    /**
     * Sets the value of the requiredDeliveryDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredDeliveryDateCode(String value) {
        this.requiredDeliveryDateCode = value;
    }

    /**
     * Gets the value of the calculatedRequiredDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedRequiredDeliveryDate() {
        return calculatedRequiredDeliveryDate;
    }

    /**
     * Sets the value of the calculatedRequiredDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedRequiredDeliveryDate(XMLGregorianCalendar value) {
        this.calculatedRequiredDeliveryDate = value;
    }

    /**
     * Gets the value of the buyComputationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyComputationDate() {
        return buyComputationDate;
    }

    /**
     * Sets the value of the buyComputationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyComputationDate(XMLGregorianCalendar value) {
        this.buyComputationDate = value;
    }

    /**
     * Gets the value of the futureFreezeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFutureFreezeDate() {
        return futureFreezeDate;
    }

    /**
     * Sets the value of the futureFreezeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFutureFreezeDate(XMLGregorianCalendar value) {
        this.futureFreezeDate = value;
    }

    /**
     * Gets the value of the associatedAgencyCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedAgencyCodes }
     *     
     */
    public AssociatedAgencyCodes getAssociatedAgencyCodes() {
        return associatedAgencyCodes;
    }

    /**
     * Sets the value of the associatedAgencyCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedAgencyCodes }
     *     
     */
    public void setAssociatedAgencyCodes(AssociatedAgencyCodes value) {
        this.associatedAgencyCodes = value;
    }

    /**
     * Gets the value of the exportType property.
     * 
     * @return
     *     possible object is
     *     {@link ExportType }
     *     
     */
    public ExportType getExportType() {
        return exportType;
    }

    /**
     * Sets the value of the exportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportType }
     *     
     */
    public void setExportType(ExportType value) {
        this.exportType = value;
    }

    /**
     * Gets the value of the inputCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputCode() {
        return inputCode;
    }

    /**
     * Sets the value of the inputCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputCode(String value) {
        this.inputCode = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link WdcConsignee }
     *     
     */
    public WdcConsignee getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdcConsignee }
     *     
     */
    public void setConsignee(WdcConsignee value) {
        this.consignee = value;
    }

}
