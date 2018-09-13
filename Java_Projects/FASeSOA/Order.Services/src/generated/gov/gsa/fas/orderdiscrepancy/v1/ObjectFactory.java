
package gov.gsa.fas.orderdiscrepancy.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.orderdiscrepancy.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.orderdiscrepancy.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZSA }
     * 
     */
    public ZSA createZSA() {
        return new ZSA();
    }

    /**
     * Create an instance of {@link Finance305 }
     * 
     */
    public Finance305 createFinance305() {
        return new Finance305();
    }

    /**
     * Create an instance of {@link Reshipment }
     * 
     */
    public Reshipment createReshipment() {
        return new Reshipment();
    }

    /**
     * Create an instance of {@link AgencyDetails }
     * 
     */
    public AgencyDetails createAgencyDetails() {
        return new AgencyDetails();
    }

    /**
     * Create an instance of {@link WdcOrderCodes }
     * 
     */
    public WdcOrderCodes createWdcOrderCodes() {
        return new WdcOrderCodes();
    }

    /**
     * Create an instance of {@link ZKP }
     * 
     */
    public ZKP createZKP() {
        return new ZKP();
    }

    /**
     * Create an instance of {@link DiscrepancyItem }
     * 
     */
    public DiscrepancyItem createDiscrepancyItem() {
        return new DiscrepancyItem();
    }

    /**
     * Create an instance of {@link ZLA }
     * 
     */
    public ZLA createZLA() {
        return new ZLA();
    }

    /**
     * Create an instance of {@link MaterialReturn }
     * 
     */
    public MaterialReturn createMaterialReturn() {
        return new MaterialReturn();
    }

    /**
     * Create an instance of {@link VendorOffset }
     * 
     */
    public VendorOffset createVendorOffset() {
        return new VendorOffset();
    }

}
