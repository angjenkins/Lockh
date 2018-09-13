package gov.gsa.fas.services.attachment.v1.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPBinding;

public class Client {
	public static void main(String[] args){
		AttachmentImplService client = new AttachmentImplService();
		AttachmentWS aws = client.getAttachmentWS();
		BindingProvider bindingProvider = (BindingProvider) aws;
		SOAPBinding sopadBinding = (SOAPBinding) bindingProvider.getBinding();
		sopadBinding.setMTOMEnabled(true);

		String fileName = "binary.png";
        String filePath = "C:/EDW/Nov-files-dateformat/20140901_20141031_20141119_FSS_EDW-pppifver-Standard-8-0-0-0-1.csv";
		//String filePath = "C:/EDW/Nov-21st-files/20140901_20141031_20141119_FSS_EDW-pppifver-Standard-8-0-0-0-1.csv";
		//filePath = "C:/Myong/Myong.txt";
        File file = new File(filePath);
         
        // uploads a file
        try {
        	System.out.println("File uploading start");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] imageBytes = new byte[(int) file.length()];
            inputStream.read(imageBytes);
            //port.upload(file.getName(), imageBytes);
            System.out.println("Web service calling");
            //client.getAttachmentWS().upload(imageBytes);
            System.out.println("Web service calling end");
            inputStream.close();
            System.out.println("File uploaded: " + filePath);
        } catch (IOException ex) {
            System.err.println(ex);
        }      
	}
}
