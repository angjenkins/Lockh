
package gov.gsa.fas.ordersession.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.ordersession.v1 package. 
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

    private final static QName _OrderSession_QNAME = new QName("http://fas.gsa.gov/OrderSession/v1.0", "orderSession");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.ordersession.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderSession }
     * 
     */
    public OrderSession createOrderSession() {
        return new OrderSession();
    }

    /**
     * Create an instance of {@link LineItemListing }
     * 
     */
    public LineItemListing createLineItemListing() {
        return new LineItemListing();
    }

    /**
     * Create an instance of {@link OrderSession.LineItemList }
     * 
     */
    public OrderSession.LineItemList createOrderSessionLineItemList() {
        return new OrderSession.LineItemList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/OrderSession/v1.0", name = "orderSession")
    public JAXBElement<OrderSession> createOrderSession(OrderSession value) {
        return new JAXBElement<OrderSession>(_OrderSession_QNAME, OrderSession.class, null, value);
    }

}
