
package gov.gsa.fas.global.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="input" type="{http://fas.gsa.gov/Global/v1.0}Input"/>
 *         &lt;element name="select" type="{http://fas.gsa.gov/Global/v1.0}Select"/>
 *         &lt;element name="select1" type="{http://fas.gsa.gov/Global/v1.0}Select1"/>
 *         &lt;element name="upload" type="{http://fas.gsa.gov/Global/v1.0}Upload"/>
 *       &lt;/choice>
 *       &lt;attribute name="oid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseItem", propOrder = {
    "input",
    "select",
    "select1",
    "upload"
})
public class ResponseItem {

    protected Input input;
    protected Select select;
    protected Select1 select1;
    protected Upload upload;
    @XmlAttribute(required = true)
    protected long oid;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link Input }
     *     
     */
    public Input getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link Input }
     *     
     */
    public void setInput(Input value) {
        this.input = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link Select }
     *     
     */
    public Select getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link Select }
     *     
     */
    public void setSelect(Select value) {
        this.select = value;
    }

    /**
     * Gets the value of the select1 property.
     * 
     * @return
     *     possible object is
     *     {@link Select1 }
     *     
     */
    public Select1 getSelect1() {
        return select1;
    }

    /**
     * Sets the value of the select1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Select1 }
     *     
     */
    public void setSelect1(Select1 value) {
        this.select1 = value;
    }

    /**
     * Gets the value of the upload property.
     * 
     * @return
     *     possible object is
     *     {@link Upload }
     *     
     */
    public Upload getUpload() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Upload }
     *     
     */
    public void setUpload(Upload value) {
        this.upload = value;
    }

    /**
     * Gets the value of the oid property.
     * 
     */
    public long getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     */
    public void setOid(long value) {
        this.oid = value;
    }

}
