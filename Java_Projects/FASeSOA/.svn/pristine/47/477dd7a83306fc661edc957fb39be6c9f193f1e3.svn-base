/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

/**
 * @author CourtAZabel
 *
 */
public abstract class XmlUtils {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String marshallJaxbObject(Object object) {
		if( object==null )
			return "null";
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
			StringWriter writer = new StringWriter();
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(
					new JAXBElement( new QName("order"),
							object.getClass(), object),
					writer);
			return writer.toString();
		} catch (JAXBException e) {
			throw new RuntimeException("Cannot marshall object:"+object, e);
		}
	}
}
