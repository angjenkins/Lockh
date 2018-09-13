
package gov.gsa.fas.vision.dla.sf.login;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassEmailMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassEmailMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:partner.soap.sforce.com}Email">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetObjectIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="250" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:partner.soap.sforce.com}ID"/>
 *         &lt;element name="whatIds" type="{urn:partner.soap.sforce.com}ID" maxOccurs="250" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassEmailMessage", propOrder = {
    "description",
    "targetObjectIds",
    "templateId",
    "whatIds"
})
public class MassEmailMessage
    extends Email
{

    @XmlElement(required = true, nillable = true)
    protected String description;
    protected List<ID> targetObjectIds;
    @XmlElement(required = true)
    protected ID templateId;
    protected List<ID> whatIds;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the targetObjectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetObjectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetObjectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ID }
     * 
     * 
     */
    public List<ID> getTargetObjectIds() {
        if (targetObjectIds == null) {
            targetObjectIds = new ArrayList<ID>();
        }
        return this.targetObjectIds;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setTemplateId(ID value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the whatIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whatIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhatIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ID }
     * 
     * 
     */
    public List<ID> getWhatIds() {
        if (whatIds == null) {
            whatIds = new ArrayList<ID>();
        }
        return this.whatIds;
    }

}
