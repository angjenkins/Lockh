package gov.gsa.fas.services.attachment.v1.client;

import java.io.File;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;
import javax.sound.sampled.Port;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;

public class WSClient {
	private static Attachment attachment;
	public static void main(String[] args) throws ServiceFault, IOException{
		AttachmentWSImplService service = new AttachmentWSImplService();
		AttachmentWS aws = service.getAttachmentWS();
		BindingProvider bindingProvider = (BindingProvider) aws;

		//Map<String,List<String>> headers = new HashMap<String,List<String>>();
		//headers.put("Username", Collections.singletonList("mkyong"));
		//headers.put("password", Collections.singletonList("mkyong"));
		//bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		SOAPBinding sopadBinding = (SOAPBinding) bindingProvider.getBinding();
		sopadBinding.setMTOMEnabled(true);
		
		bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"p3xferdt");
		bindingProvider.getRequestContext().put(bindingProvider.PASSWORD_PROPERTY,"92mnGg1Cb14D9hVhG1W5fZra4UI=");
		//bindingProvider.USERNAME_PROPERTY = "P3USER1";
		
		/*
		Authenticator myAuth = new Authenticator(){
			@Override
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication("prem","amamd".toCharArray());
			}
		};
		Authenticator.setDefault(myAuth);*/
		//((BindingProvider)aws).getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"p3xferdt");
		//((BindingProvider)aws).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY,"92mnGg1Cb14D9hVhG1W5fZra4UI=");
		System.out.println(bindingProvider.getRequestContext().get(BindingProvider.USERNAME_PROPERTY));
		attachment = new Attachment();
		attachment.setFilename("hugefile6.csv");
		//String filePath = "C:/EDW/Nov-files-dateformat/20140901_20141031_20141119_FSS_EDW-pppifver-Standard-8-0-0-0-1.csv";
		String filePath = "C:/Myong/Myong.txt";
		File afile=new File(filePath);
		DataHandler dh= new DataHandler(afile.toURI().toURL());
		attachment.setData(new byte[(int)afile.length()]);
		dh.getInputStream().read(attachment.getData());
		System.out.println("FIle loading start = " + attachment.getFilename());
		//service.getAttachmentWS().submitAttachmentData(attachment);
		aws.submitAttachmentData(attachment);
		System.out.println("FIle loading complete");
	}
}
