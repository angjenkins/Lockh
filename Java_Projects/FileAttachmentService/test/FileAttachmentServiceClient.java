import gov.gsa.fas.services.attachment.v1.Attachment;
import gov.gsa.fas.services.attachment.v1.AttachmentWS;
import gov.gsa.fas.services.attachment.v1.ServiceFault;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;


public class FileAttachmentServiceClient {
	private static String wsdlServiceURL="https://sso-test.fas.gsa.gov/soatest/FileAttachmentService?wsdl";
	private static Attachment attachment;
	private static boolean success;

	public static void main(String[] args) throws MalformedURLException {
		
		
		Service service = Service.create(new URL(wsdlServiceURL), new QName("http://fas.gsa.gov/services/Attachment/v1.0", "FileAttachmentService_vs0_ext"));
		
		AttachmentWS attachmentService = service.getPort(AttachmentWS.class);
		((BindingProvider)attachmentService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"p3user1");
		((BindingProvider)attachmentService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"");
		attachment = new Attachment();
		attachment.setFilename("20130901_20140508_20140508_ENG_EDW-pppifver-Standard-8-0-0-0-1.csv");
		File afile=new File("C:/Desktop/BI/EDW/ftpservice/20130901_20140508_20140508_ENG_EDW-pppifver-Standard-8-0-0-0-1.csv");
		DataHandler dh= new DataHandler(afile.toURI().toURL());
		try {
			attachment.setData(new byte[(int)afile.length()]);
			dh.getInputStream().read(attachment.getData());
			
			 success=attachmentService.submitAttachmentData(attachment) ;
		} catch (ServiceFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		 }
		if (success)
			System.out.println("File is submiited successfully");
		else
			System.out.println("File submission is failed.");	
		
		
	}
}

