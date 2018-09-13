
package gov.gsa.fas.services.messages.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import gov.gsa.fas.pricing.v1.EDDItemPrice;


/**
 * <p>Java class for EDDItemPriceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDDItemPriceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eddItemPrice" type="{http://fas.gsa.gov/Pricing/v1.0}EDDItemPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDDItemPriceList", propOrder = {
    "eddItemPrice"
})
public class EDDItemPriceList {

    protected List<EDDItemPrice> eddItemPrice;

    /**
     * Gets the value of the eddItemPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eddItemPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEddItemPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDDItemPrice }
     * 
     * 
     */
    public List<EDDItemPrice> getEddItemPrice() {
        if (eddItemPrice == null) {
            eddItemPrice = new ArrayList<EDDItemPrice>();
        }
        return this.eddItemPrice;
    }

}
