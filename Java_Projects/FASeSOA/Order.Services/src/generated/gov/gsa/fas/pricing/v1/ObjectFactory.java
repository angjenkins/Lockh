
package gov.gsa.fas.pricing.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gsa.fas.pricing.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gsa.fas.pricing.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NIINItemPrice }
     * 
     */
    public NIINItemPrice createNIINItemPrice() {
        return new NIINItemPrice();
    }

    /**
     * Create an instance of {@link NIINItem }
     * 
     */
    public NIINItem createNIINItem() {
        return new NIINItem();
    }

    /**
     * Create an instance of {@link EDDItemPrice }
     * 
     */
    public EDDItemPrice createEDDItemPrice() {
        return new EDDItemPrice();
    }

    /**
     * Create an instance of {@link EDDItem }
     * 
     */
    public EDDItem createEDDItem() {
        return new EDDItem();
    }

}
