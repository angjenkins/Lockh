
package gov.gsa.fas.vision.dla.sf.caserequest;

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
 *         &lt;element name="WSDRRequest" type="{http://soap.sforce.com/schemas/class/NCSCDLAService}DLARequest"/>
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
    "wsdrRequest"
})
@XmlRootElement(name = "ProcessWSDR")
public class ProcessWSDR {

    @XmlElement(name = "WSDRRequest", required = true, nillable = true)
    protected DLARequest wsdrRequest;

    /**
     * Gets the value of the wsdrRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DLARequest }
     *     
     */
    public DLARequest getWSDRRequest() {
        return wsdrRequest;
    }

    /**
     * Sets the value of the wsdrRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DLARequest }
     *     
     */
    public void setWSDRRequest(DLARequest value) {
        this.wsdrRequest = value;
    }

}
