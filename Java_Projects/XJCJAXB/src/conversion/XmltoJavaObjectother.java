package conversion;


import gov.gsa.fas.vision.dla.request.beans.F_File_842AW;

import java.io.File;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XmltoJavaObjectother {
	public static void main(String[] args) {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(F_File_842AW.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String schemaLocation = "C:/Users/premanandpeddachetty/Desktop/vision/004030F842A3WA38_Aug2514_ADC_1043A.xsd";
			System.out.println(schemaLocation);
			SchemaFactory sf = SchemaFactory
					.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
			//URL schemaUrl = XmltoJavaObjectother.class.getClassLoader()
			//		.getResource(schemaLocation);
			//System.out.println(schemaUrl);
			Schema schema = sf.newSchema(new File("C:/Users/premanandpeddachetty/Desktop/vision/004030F842A3WA38_Aug2514_ADC_1043A.xsd"));
			unmarshaller.setSchema(schema);

		} catch (JAXBException e) {
			System.out.println("unmarshallXml(): Failed to unmarshall Xml->");
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("unmarshallXml(): Failed to unmarshall Xml");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*catch (Exception e) {
			System.out.println("unmarshallXml(): Schema validation Failed->");
		}*/

	}
}
