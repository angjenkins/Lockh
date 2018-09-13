
package gov.gsa.fas.services.pricing.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.faults.v1.ServiceFault;
import gov.gsa.fas.pricing.v1.EDDItem;
import gov.gsa.fas.pricing.v1.NIINItemPrice;
import gov.gsa.fas.services.messages.v1.EDDItemPriceList;
import gov.gsa.fas.services.messages.v1.NIINItemPriceRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.pricing.v1 package. 
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

    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/Pricing/v1.0", "serviceFault");
    private final static QName _GetEddPriceResponse_QNAME = new QName("http://fas.gsa.gov/services/Pricing/v1.0", "getEddPriceResponse");
    private final static QName _GetNiinPriceResponse_QNAME = new QName("http://fas.gsa.gov/services/Pricing/v1.0", "getNiinPriceResponse");
    private final static QName _GetNiinPriceRequest_QNAME = new QName("http://fas.gsa.gov/services/Pricing/v1.0", "getNiinPriceRequest");
    private final static QName _GetEddPriceRequest_QNAME = new QName("http://fas.gsa.gov/services/Pricing/v1.0", "getEddPriceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.pricing.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Pricing/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EDDItemPriceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Pricing/v1.0", name = "getEddPriceResponse")
    public JAXBElement<EDDItemPriceList> createGetEddPriceResponse(EDDItemPriceList value) {
        return new JAXBElement<EDDItemPriceList>(_GetEddPriceResponse_QNAME, EDDItemPriceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIINItemPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Pricing/v1.0", name = "getNiinPriceResponse")
    public JAXBElement<NIINItemPrice> createGetNiinPriceResponse(NIINItemPrice value) {
        return new JAXBElement<NIINItemPrice>(_GetNiinPriceResponse_QNAME, NIINItemPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIINItemPriceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Pricing/v1.0", name = "getNiinPriceRequest")
    public JAXBElement<NIINItemPriceRequest> createGetNiinPriceRequest(NIINItemPriceRequest value) {
        return new JAXBElement<NIINItemPriceRequest>(_GetNiinPriceRequest_QNAME, NIINItemPriceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EDDItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Pricing/v1.0", name = "getEddPriceRequest")
    public JAXBElement<EDDItem> createGetEddPriceRequest(EDDItem value) {
        return new JAXBElement<EDDItem>(_GetEddPriceRequest_QNAME, EDDItem.class, null, value);
    }

}
