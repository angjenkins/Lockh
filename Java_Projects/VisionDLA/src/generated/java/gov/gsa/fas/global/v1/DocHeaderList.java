
package gov.gsa.fas.global.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocHeaderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocHeaderList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docId" type="{http://fas.gsa.gov/Global/v1.0}DocHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocHeaderList", propOrder = {
    "docId"
})
public class DocHeaderList {

    protected List<DocHeader> docId;

    /**
     * Gets the value of the docId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocHeader }
     * 
     * 
     */
    public List<DocHeader> getDocId() {
        if (docId == null) {
            docId = new ArrayList<DocHeader>();
        }
        return this.docId;
    }

}
