
package gov.gsa.fas.vendor.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.vendor.v1 package. 
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

    private final static QName _Vendor_QNAME = new QName("http://fas.gsa.gov/Vendor/v1.0", "vendor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.vendor.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorizedNegotiator }
     * 
     */
    public AuthorizedNegotiator createAuthorizedNegotiator() {
        return new AuthorizedNegotiator();
    }

    /**
     * Create an instance of {@link VendorKey }
     * 
     */
    public VendorKey createVendorKey() {
        return new VendorKey();
    }

    /**
     * Create an instance of {@link OrderInvoiceData }
     * 
     */
    public OrderInvoiceData createOrderInvoiceData() {
        return new OrderInvoiceData();
    }

    /**
     * Create an instance of {@link VendorDetails }
     * 
     */
    public VendorDetails createVendorDetails() {
        return new VendorDetails();
    }

    /**
     * Create an instance of {@link CompanyInfo }
     * 
     */
    public CompanyInfo createCompanyInfo() {
        return new CompanyInfo();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link VendorPOC }
     * 
     */
    public VendorPOC createVendorPOC() {
        return new VendorPOC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/Vendor/v1.0", name = "vendor")
    public JAXBElement<Vendor> createVendor(Vendor value) {
        return new JAXBElement<Vendor>(_Vendor_QNAME, Vendor.class, null, value);
    }

}
