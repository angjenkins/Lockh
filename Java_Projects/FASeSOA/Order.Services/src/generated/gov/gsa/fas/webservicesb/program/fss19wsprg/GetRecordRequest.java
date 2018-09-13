
package gov.gsa.fas.webservicesb.program.fss19wsprg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="in_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inType",
    "inData"
})
@XmlRootElement(name = "get_recordRequest")
public class GetRecordRequest {

    @XmlElement(name = "in_type", required = true)
    protected String inType;
    @XmlElement(name = "in_data", required = true)
    protected String inData;

    /**
     * Gets the value of the inType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInType() {
        return inType;
    }

    /**
     * Sets the value of the inType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInType(String value) {
        this.inType = value;
    }

    /**
     * Gets the value of the inData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInData() {
        return inData;
    }

    /**
     * Sets the value of the inData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInData(String value) {
        this.inData = value;
    }

}
