
package gov.gsa.fas.services.attachment.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.faults.v1.ServiceFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.attachment.v1 package. 
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

    private final static QName _Success_QNAME = new QName("http://fas.gsa.gov/services/Attachment/v1.0", "success");
    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/Attachment/v1.0", "serviceFault");
    private final static QName _Attachment_QNAME = new QName("http://fas.gsa.gov/services/Attachment/v1.0", "attachment");
    private final static QName _FileName_QNAME = new QName("http://fas.gsa.gov/services/Attachment/v1.0", "FileName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.attachment.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "success")
    public JAXBElement<Boolean> createSuccess(Boolean value) {
        return new JAXBElement<Boolean>(_Success_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<Attachment>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "FileName")
    public JAXBElement<String> createFileName(String value) {
        return new JAXBElement<String>(_FileName_QNAME, String.class, null, value);
    }

}
