
package gov.gsa.fas.services.ordercomplaint.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.gsa.fas.faults.v1.ServiceFault;
import gov.gsa.fas.ordercomplaint.v1.Complaint;
import gov.gsa.fas.ordercomplaint.v1.InvestigationDetails;
import gov.gsa.fas.services.messages.v1.ModifyComplaint;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.services.ordercomplaint.v1 package. 
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

    private final static QName _ModifyComplaintRequest_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "modifyComplaintRequest");
    private final static QName _CancelComplaintResponse_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "cancelComplaintResponse");
    private final static QName _GetInvestigationResponse_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "getInvestigationResponse");
    private final static QName _ComplaintKeyCancel_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "complaintKeyCancel");
    private final static QName _ServiceFault_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "serviceFault");
    private final static QName _CreateComplaintRequest_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "createComplaintRequest");
    private final static QName _ComplaintKeyInvestigate_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "complaintKeyInvestigate");
    private final static QName _ModifyComplaintResponse_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "modifyComplaintResponse");
    private final static QName _ComplaintKeyCreate_QNAME = new QName("http://fas.gsa.gov/services/OrderComplaint/v1.0", "complaintKeyCreate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.services.ordercomplaint.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyComplaint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "modifyComplaintRequest")
    public JAXBElement<ModifyComplaint> createModifyComplaintRequest(ModifyComplaint value) {
        return new JAXBElement<ModifyComplaint>(_ModifyComplaintRequest_QNAME, ModifyComplaint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "cancelComplaintResponse")
    public JAXBElement<Boolean> createCancelComplaintResponse(Boolean value) {
        return new JAXBElement<Boolean>(_CancelComplaintResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestigationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "getInvestigationResponse")
    public JAXBElement<InvestigationDetails> createGetInvestigationResponse(InvestigationDetails value) {
        return new JAXBElement<InvestigationDetails>(_GetInvestigationResponse_QNAME, InvestigationDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "complaintKeyCancel")
    public JAXBElement<Long> createComplaintKeyCancel(Long value) {
        return new JAXBElement<Long>(_ComplaintKeyCancel_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "serviceFault")
    public JAXBElement<ServiceFault> createServiceFault(ServiceFault value) {
        return new JAXBElement<ServiceFault>(_ServiceFault_QNAME, ServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Complaint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "createComplaintRequest")
    public JAXBElement<Complaint> createCreateComplaintRequest(Complaint value) {
        return new JAXBElement<Complaint>(_CreateComplaintRequest_QNAME, Complaint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "complaintKeyInvestigate")
    public JAXBElement<Long> createComplaintKeyInvestigate(Long value) {
        return new JAXBElement<Long>(_ComplaintKeyInvestigate_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "modifyComplaintResponse")
    public JAXBElement<Boolean> createModifyComplaintResponse(Boolean value) {
        return new JAXBElement<Boolean>(_ModifyComplaintResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fas.gsa.gov/services/OrderComplaint/v1.0", name = "complaintKeyCreate")
    public JAXBElement<Long> createComplaintKeyCreate(Long value) {
        return new JAXBElement<Long>(_ComplaintKeyCreate_QNAME, Long.class, null, value);
    }

}
