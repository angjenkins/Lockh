
package gov.gsa.fas.services.discrepancyoutcome.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.discrepancyoutcome.v1.OrderDiscrepancyOutcome;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessAttachmentRequest;
import gov.gsa.fas.discrepancyoutcome.v1.ProcessResponse;
import gov.gsa.fas.faults.v1.ServiceFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.discrepancyoutcome.v1 package. 
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

    private final static QName _DiscrepancyOutcome_QNAME = new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "discrepancyOutcome");
    private final static QName _OutcomeResponse_QNAME = new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "outcomeResponse");
    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "serviceFault");
    private final static QName _ProcessAttRequest_QNAME = new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "processAttRequest");
    private final static QName _ProcessAttResponse_QNAME = new QName("http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", "processAttResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.discrepancyoutcome.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDiscrepancyOutcome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", name = "discrepancyOutcome")
    public JAXBElement<OrderDiscrepancyOutcome> createDiscrepancyOutcome(OrderDiscrepancyOutcome value) {
        return new JAXBElement<OrderDiscrepancyOutcome>(_DiscrepancyOutcome_QNAME, OrderDiscrepancyOutcome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", name = "outcomeResponse")
    public JAXBElement<ProcessResponse> createOutcomeResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_OutcomeResponse_QNAME, ProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessAttachmentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", name = "processAttRequest")
    public JAXBElement<ProcessAttachmentRequest> createProcessAttRequest(ProcessAttachmentRequest value) {
        return new JAXBElement<ProcessAttachmentRequest>(_ProcessAttRequest_QNAME, ProcessAttachmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/DiscrepancyOutcome/v1.0", name = "processAttResponse")
    public JAXBElement<ProcessResponse> createProcessAttResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ProcessAttResponse_QNAME, ProcessResponse.class, null, value);
    }

}
