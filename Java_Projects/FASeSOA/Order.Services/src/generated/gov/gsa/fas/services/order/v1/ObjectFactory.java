
package gov.gsa.fas.services.order.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.faults.v1.ServiceFault;
import gov.gsa.fas.services.messages.v1.CancelOrderRequest;
import gov.gsa.fas.services.messages.v1.CscPORequest;
import gov.gsa.fas.services.messages.v1.CscPOResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.order.v1 package. 
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

    private final static QName _GetPODetailsRequest_QNAME = new QName("http://fas.gsa.gov/services/Order/v1.0", "GetPODetailsRequest");
    private final static QName _CancelOrderResponse_QNAME = new QName("http://fas.gsa.gov/services/Order/v1.0", "CancelOrderResponse");
    private final static QName _CancelOrderRequest_QNAME = new QName("http://fas.gsa.gov/services/Order/v1.0", "CancelOrderRequest");
    private final static QName _GetPODetailsResponse_QNAME = new QName("http://fas.gsa.gov/services/Order/v1.0", "GetPODetailsResponse");
    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/Order/v1.0", "serviceFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.order.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderDetailsResponse }
     * 
     */
    public GetOrderDetailsResponse createGetOrderDetailsResponse() {
        return new GetOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link GetOrderSessionRequest }
     * 
     */
    public GetOrderSessionRequest createGetOrderSessionRequest() {
        return new GetOrderSessionRequest();
    }

    /**
     * Create an instance of {@link GetOrderSessionResponse }
     * 
     */
    public GetOrderSessionResponse createGetOrderSessionResponse() {
        return new GetOrderSessionResponse();
    }

    /**
     * Create an instance of {@link GetOrderDetailsRequest }
     * 
     */
    public GetOrderDetailsRequest createGetOrderDetailsRequest() {
        return new GetOrderDetailsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CscPORequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Order/v1.0", name = "GetPODetailsRequest")
    public JAXBElement<CscPORequest> createGetPODetailsRequest(CscPORequest value) {
        return new JAXBElement<CscPORequest>(_GetPODetailsRequest_QNAME, CscPORequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Order/v1.0", name = "CancelOrderResponse")
    public JAXBElement<Boolean> createCancelOrderResponse(Boolean value) {
        return new JAXBElement<Boolean>(_CancelOrderResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Order/v1.0", name = "CancelOrderRequest")
    public JAXBElement<CancelOrderRequest> createCancelOrderRequest(CancelOrderRequest value) {
        return new JAXBElement<CancelOrderRequest>(_CancelOrderRequest_QNAME, CancelOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CscPOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Order/v1.0", name = "GetPODetailsResponse")
    public JAXBElement<CscPOResponse> createGetPODetailsResponse(CscPOResponse value) {
        return new JAXBElement<CscPOResponse>(_GetPODetailsResponse_QNAME, CscPOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Order/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

}
