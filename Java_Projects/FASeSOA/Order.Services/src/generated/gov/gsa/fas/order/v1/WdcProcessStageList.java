
package gov.gsa.fas.order.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WdcProcessStageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WdcProcessStageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stage" type="{http://fas.gsa.gov/Order/v1.0}WdcProcessStage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WdcProcessStageList", propOrder = {
    "stage"
})
public class WdcProcessStageList {

    protected List<WdcProcessStage> stage;

    /**
     * Gets the value of the stage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WdcProcessStage }
     * 
     * 
     */
    public List<WdcProcessStage> getStage() {
        if (stage == null) {
            stage = new ArrayList<WdcProcessStage>();
        }
        return this.stage;
    }

}
