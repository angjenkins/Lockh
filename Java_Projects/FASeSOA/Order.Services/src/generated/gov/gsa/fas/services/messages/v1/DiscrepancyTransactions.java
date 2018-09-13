
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.orderdiscrepancy.v1.Finance305;
import gov.gsa.fas.orderdiscrepancy.v1.MaterialReturn;
import gov.gsa.fas.orderdiscrepancy.v1.Reshipment;
import gov.gsa.fas.orderdiscrepancy.v1.VendorOffset;
import gov.gsa.fas.orderdiscrepancy.v1.ZKP;
import gov.gsa.fas.orderdiscrepancy.v1.ZLA;
import gov.gsa.fas.orderdiscrepancy.v1.ZSA;


/**
 * <p>Java class for DiscrepancyTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zkp" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZKP" minOccurs="0"/>
 *         &lt;element name="finance305Credit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}Finance305" minOccurs="0"/>
 *         &lt;element name="finance305Debit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}Finance305" minOccurs="0"/>
 *         &lt;element name="reshipment" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}Reshipment" minOccurs="0"/>
 *         &lt;element name="materialReturn" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}MaterialReturn" minOccurs="0"/>
 *         &lt;element name="zlaCredit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZLA" minOccurs="0"/>
 *         &lt;element name="zlaDebit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZLA" minOccurs="0"/>
 *         &lt;element name="zsaCredit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZSA" minOccurs="0"/>
 *         &lt;element name="zsaDebit" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZSA" minOccurs="0"/>
 *         &lt;element name="zsaPZ" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}ZSA" minOccurs="0"/>
 *         &lt;element name="vendorOffset" type="{http://fas.gsa.gov/OrderDiscrepancy/v1.0}VendorOffset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscrepancyTransactions", propOrder = {
    "zkp",
    "finance305Credit",
    "finance305Debit",
    "reshipment",
    "materialReturn",
    "zlaCredit",
    "zlaDebit",
    "zsaCredit",
    "zsaDebit",
    "zsaPZ",
    "vendorOffset"
})
public class DiscrepancyTransactions {

    protected ZKP zkp;
    protected Finance305 finance305Credit;
    protected Finance305 finance305Debit;
    protected Reshipment reshipment;
    protected MaterialReturn materialReturn;
    protected ZLA zlaCredit;
    protected ZLA zlaDebit;
    protected ZSA zsaCredit;
    protected ZSA zsaDebit;
    protected ZSA zsaPZ;
    protected VendorOffset vendorOffset;

    /**
     * Gets the value of the zkp property.
     * 
     * @return
     *     possible object is
     *     {@link ZKP }
     *     
     */
    public ZKP getZkp() {
        return zkp;
    }

    /**
     * Sets the value of the zkp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZKP }
     *     
     */
    public void setZkp(ZKP value) {
        this.zkp = value;
    }

    /**
     * Gets the value of the finance305Credit property.
     * 
     * @return
     *     possible object is
     *     {@link Finance305 }
     *     
     */
    public Finance305 getFinance305Credit() {
        return finance305Credit;
    }

    /**
     * Sets the value of the finance305Credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Finance305 }
     *     
     */
    public void setFinance305Credit(Finance305 value) {
        this.finance305Credit = value;
    }

    /**
     * Gets the value of the finance305Debit property.
     * 
     * @return
     *     possible object is
     *     {@link Finance305 }
     *     
     */
    public Finance305 getFinance305Debit() {
        return finance305Debit;
    }

    /**
     * Sets the value of the finance305Debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Finance305 }
     *     
     */
    public void setFinance305Debit(Finance305 value) {
        this.finance305Debit = value;
    }

    /**
     * Gets the value of the reshipment property.
     * 
     * @return
     *     possible object is
     *     {@link Reshipment }
     *     
     */
    public Reshipment getReshipment() {
        return reshipment;
    }

    /**
     * Sets the value of the reshipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reshipment }
     *     
     */
    public void setReshipment(Reshipment value) {
        this.reshipment = value;
    }

    /**
     * Gets the value of the materialReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialReturn }
     *     
     */
    public MaterialReturn getMaterialReturn() {
        return materialReturn;
    }

    /**
     * Sets the value of the materialReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialReturn }
     *     
     */
    public void setMaterialReturn(MaterialReturn value) {
        this.materialReturn = value;
    }

    /**
     * Gets the value of the zlaCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ZLA }
     *     
     */
    public ZLA getZlaCredit() {
        return zlaCredit;
    }

    /**
     * Sets the value of the zlaCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZLA }
     *     
     */
    public void setZlaCredit(ZLA value) {
        this.zlaCredit = value;
    }

    /**
     * Gets the value of the zlaDebit property.
     * 
     * @return
     *     possible object is
     *     {@link ZLA }
     *     
     */
    public ZLA getZlaDebit() {
        return zlaDebit;
    }

    /**
     * Sets the value of the zlaDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZLA }
     *     
     */
    public void setZlaDebit(ZLA value) {
        this.zlaDebit = value;
    }

    /**
     * Gets the value of the zsaCredit property.
     * 
     * @return
     *     possible object is
     *     {@link ZSA }
     *     
     */
    public ZSA getZsaCredit() {
        return zsaCredit;
    }

    /**
     * Sets the value of the zsaCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZSA }
     *     
     */
    public void setZsaCredit(ZSA value) {
        this.zsaCredit = value;
    }

    /**
     * Gets the value of the zsaDebit property.
     * 
     * @return
     *     possible object is
     *     {@link ZSA }
     *     
     */
    public ZSA getZsaDebit() {
        return zsaDebit;
    }

    /**
     * Sets the value of the zsaDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZSA }
     *     
     */
    public void setZsaDebit(ZSA value) {
        this.zsaDebit = value;
    }

    /**
     * Gets the value of the zsaPZ property.
     * 
     * @return
     *     possible object is
     *     {@link ZSA }
     *     
     */
    public ZSA getZsaPZ() {
        return zsaPZ;
    }

    /**
     * Sets the value of the zsaPZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZSA }
     *     
     */
    public void setZsaPZ(ZSA value) {
        this.zsaPZ = value;
    }

    /**
     * Gets the value of the vendorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link VendorOffset }
     *     
     */
    public VendorOffset getVendorOffset() {
        return vendorOffset;
    }

    /**
     * Sets the value of the vendorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorOffset }
     *     
     */
    public void setVendorOffset(VendorOffset value) {
        this.vendorOffset = value;
    }

}
