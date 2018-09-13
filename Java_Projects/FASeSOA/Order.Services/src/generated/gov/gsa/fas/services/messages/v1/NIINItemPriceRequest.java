
package gov.gsa.fas.services.messages.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NIINItemPriceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NIINItemPriceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="niin7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="store" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NIINItemPriceRequest", propOrder = {
    "niin7",
    "store"
})
public class NIINItemPriceRequest {

    @XmlElement(required = true)
    protected String niin7;
    @XmlElement(required = true)
    protected String store;

    /**
     * Gets the value of the niin7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiin7() {
        return niin7;
    }

    /**
     * Sets the value of the niin7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiin7(String value) {
        this.niin7 = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStore(String value) {
        this.store = value;
    }

}
