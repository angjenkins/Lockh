
package gov.gsa.fas.vision.dla.sf.caserequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Failed" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}FailedMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedList", propOrder = {
    "failed"
})
public class FailedList {

    @XmlElement(name = "Failed", nillable = true)
    protected List<FailedMessage> failed;

    /**
     * Gets the value of the failed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailedMessage }
     * 
     * 
     */
    public List<FailedMessage> getFailed() {
        if (failed == null) {
            failed = new ArrayList<FailedMessage>();
        }
        return this.failed;
    }

}
