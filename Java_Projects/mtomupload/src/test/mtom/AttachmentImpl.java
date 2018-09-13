package test.mtom;



import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

//import org.jboss.ejb3.common.deployers.spi.AttachmentNames;
import org.jboss.wsf.spi.annotation.WebContext;


@Stateless()
@Remote(AttachmentWS.class)
@MTOM(enabled = true)
@WebContext(contextRoot = "/mtom.services", urlPattern = "/attachmentservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(value = "http://schemas.xmlsoap.org/wsdl/soap/http?mtom=true")
@WebService(endpointInterface = "test.mtom.AttachmentWS",portName = "AttachmentWS", targetNamespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "AttachmentImpl")
public class AttachmentImpl implements AttachmentWS{
	

	public void upload(byte[] imageBytes) {
		System.out.println("received data");
		 String filePath = "c:/tomcatupload/" + "temp";
         
	        try {
	            FileOutputStream fos = new FileOutputStream(filePath);
	            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
	            outputStream.write(imageBytes);
	            outputStream.close();
	             
	            System.out.println("Received file: " + filePath);
	             
	        } catch (IOException ex) {
	            System.err.println(ex);
	            throw new WebServiceException(ex);
	        }
		
	}
}