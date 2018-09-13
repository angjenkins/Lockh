
package gov.gsa.fas.vision.dla.sf.caserequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscrepancyItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Discrepancy" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}DiscrepancyItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscrepancyItemList", propOrder = {
    "discrepancy"
})
public class DiscrepancyItemList {

    @XmlElement(name = "Discrepancy", nillable = true)
    protected List<DiscrepancyItem> discrepancy;

    /**
     * Gets the value of the discrepancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscrepancyItem }
     * 
     * 
     */
    public List<DiscrepancyItem> getDiscrepancy() {
        if (discrepancy == null) {
            discrepancy = new ArrayList<DiscrepancyItem>();
        }
        return this.discrepancy;
    }

}
