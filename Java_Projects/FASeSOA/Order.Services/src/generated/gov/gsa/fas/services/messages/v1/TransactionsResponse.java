
package gov.gsa.fas.services.messages.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transactionResponse" type="{http://fas.gsa.gov/services/Messages/v1.0}TransactionResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionsResponse", propOrder = {
    "allSuccessful",
    "transactionResponse"
})
public class TransactionsResponse {

    protected boolean allSuccessful;
    protected List<TransactionResponse> transactionResponse;

    /**
     * Gets the value of the allSuccessful property.
     * 
     */
    public boolean isAllSuccessful() {
        return allSuccessful;
    }

    /**
     * Sets the value of the allSuccessful property.
     * 
     */
    public void setAllSuccessful(boolean value) {
        this.allSuccessful = value;
    }

    /**
     * Gets the value of the transactionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionResponse }
     * 
     * 
     */
    public List<TransactionResponse> getTransactionResponse() {
        if (transactionResponse == null) {
            transactionResponse = new ArrayList<TransactionResponse>();
        }
        return this.transactionResponse;
    }

}
