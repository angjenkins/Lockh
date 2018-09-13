
package gov.gsa.fas.services.orderdiscrepancy.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.faults.v1.ServiceFault;
import gov.gsa.fas.services.messages.v1.DiscrepancyTransactions;
import gov.gsa.fas.services.messages.v1.TransactionsResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.orderdiscrepancy.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResetZkpResp_QNAME = new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "resetZkpResp");
    private final static QName _TransactionsResponse_QNAME = new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "transactionsResponse");
    private final static QName _DiscrepancyTransactions_QNAME = new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "discrepancyTransactions");
    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", "serviceFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.orderdiscrepancy.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestZkpReq }
     * 
     */
    public RequestZkpReq createRequestZkpReq() {
        return new RequestZkpReq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", name = "resetZkpResp")
    public JAXBElement<Boolean> createResetZkpResp(Boolean value) {
        return new JAXBElement<Boolean>(_ResetZkpResp_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", name = "transactionsResponse")
    public JAXBElement<TransactionsResponse> createTransactionsResponse(TransactionsResponse value) {
        return new JAXBElement<TransactionsResponse>(_TransactionsResponse_QNAME, TransactionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscrepancyTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", name = "discrepancyTransactions")
    public JAXBElement<DiscrepancyTransactions> createDiscrepancyTransactions(DiscrepancyTransactions value) {
        return new JAXBElement<DiscrepancyTransactions>(_DiscrepancyTransactions_QNAME, DiscrepancyTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderDiscrepancy/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

}
