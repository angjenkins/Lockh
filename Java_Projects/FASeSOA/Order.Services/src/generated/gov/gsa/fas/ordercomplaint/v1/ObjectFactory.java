
package gov.gsa.fas.ordercomplaint.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.ordercomplaint.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.ordercomplaint.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Originator }
     * 
     */
    public Originator createOriginator() {
        return new Originator();
    }

    /**
     * Create an instance of {@link InvestigationDetails }
     * 
     */
    public InvestigationDetails createInvestigationDetails() {
        return new InvestigationDetails();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link PointOfContact }
     * 
     */
    public PointOfContact createPointOfContact() {
        return new PointOfContact();
    }

    /**
     * Create an instance of {@link Complaint }
     * 
     */
    public Complaint createComplaint() {
        return new Complaint();
    }

    /**
     * Create an instance of {@link NCSCContact }
     * 
     */
    public NCSCContact createNCSCContact() {
        return new NCSCContact();
    }

}
