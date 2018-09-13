
package gov.gsa.fas.discrepancyoutcome.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="visionDlaKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="webSDRNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processResponse", propOrder = {
    "successful",
    "visionDlaKey",
    "webSDRNumber"
})
public class ProcessResponse {

    protected boolean successful;
    protected Long visionDlaKey;
    protected String webSDRNumber;

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the visionDlaKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisionDlaKey() {
        return visionDlaKey;
    }

    /**
     * Sets the value of the visionDlaKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisionDlaKey(Long value) {
        this.visionDlaKey = value;
    }

    /**
     * Gets the value of the webSDRNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSDRNumber() {
        return webSDRNumber;
    }

    /**
     * Sets the value of the webSDRNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSDRNumber(String value) {
        this.webSDRNumber = value;
    }

}
