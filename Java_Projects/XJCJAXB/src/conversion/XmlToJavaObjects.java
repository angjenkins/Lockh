package conversion;

import gov.gsa.fas.vision.dla.request.beans.ObjectFactory;
import gov.gsa.fas.vision.dla.request.beans.T_842;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import gov.gsa.fas.vision.dla.request.beans.F_File_842AW; 
public class XmlToJavaObjects {
 
  /**
   * @param args
   * @throws JAXBException 
   */
  public static void main(String[] args) throws JAXBException {
	System.out.println("Marshalling start");
    //1. We need to create JAXContext instance
    JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
     
    //2. Use JAXBContext instance to create the Unmarshaller.
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
 
    //3. Use the Unmarshaller to unmarshal the XML document to get an instance of JAXBElement.
    JAXBElement<FFile842AR> unmarshalledObject = 
        (JAXBElement<FFile842AR>)unmarshaller.unmarshal(
            ClassLoader.getSystemResourceAsStream("conversion/failed.xml"));
    T842 res = unmarshalledObject.getValue().getTNonconformanceReport842AR().get(0);
    res.getLHierarchicalLevel().get(0).getSReferenceIdentification();
    System.out.println(res.getCreatedBy());
    System.out.println("Marshalling over");
    
  }
 
}
