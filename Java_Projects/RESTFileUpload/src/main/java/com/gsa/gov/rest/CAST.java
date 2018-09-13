package com.gsa.gov.rest;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.xml.internal.txw2.Document;

public class CAST {
	public static void main(String[] args) throws JAXBException {
		System.out.println("tst");
		String ticket = "ST-27788-oo3NhLYa7bqZ9p5KiWQs-login.max.gov";
		String cas_validate = "https://login.max.gov/cas/serviceValidate?ticket="
				+ ticket
				+ "&service=http://p3-dev.cap.gsa.gov/gui/ReturnLoginViaMax";
		System.out.println("cas_validate string = " + cas_validate);
		Client client = Client.create();

		WebResource webResource = client.resource(cas_validate);
		ClientResponse response = webResource.get(ClientResponse.class);
		System.out.println(response.getStatus());
		String casresponse = response.getEntity(String.class);
		System.out.println("casresponse = " + casresponse);
		String User = parse_tag(casresponse,"cas:user");
		String saml = parse_tag(casresponse,"maxAttribute:samlAuthenticationStatementAuthMethod");
		String loa = parse_tag(casresponse,"maxAttribute:EAuth-LOA");
		String group = parse_tag(casresponse,"maxAttribute:GroupList");
	    String user_classification = parse_tag(casresponse,"maxAttribute:User-Classification");
	    
	    System.out.println("User = " + User);
	    System.out.println("Saml = " + saml);
	    System.out.println("loa = " + loa);
	    System.out.println("group = " + group);
	    System.out.println("User_classification = " + user_classification);

        System.out.println("Completed");
        
	}
	/*
	  Used for parsing xml.  Search str for first occurance of
	  <tag>.....</tag> and return text (striped of leading and
	  trailing whitespace) between tags.  Return "" if tag not
	  found.
	*/
	public static String parse_tag(String str,String tag){
		int tag1_pos1 = str.indexOf("<"+tag);
		System.out.println("tag1_pos1 = " + tag1_pos1);
		if (tag1_pos1 == -1){
			return "";
		}
		
		int tag1_pos2 = str.indexOf(">",tag1_pos1);
		
		System.out.println("tag1_pos2 = " + tag1_pos2);
		if (tag1_pos2 == -1){
			return "";
		}
		
		int tag2_pos1 = str.indexOf("</"+tag,tag1_pos2);
		System.out.println("tag2_pos1 = " + tag2_pos1);
		if (tag2_pos1 == -1){
			return "";
		}
		
		
		return str.substring(tag1_pos2+1, tag2_pos1);
	}
	/*
		   tag1_pos1 = str.find("<" + tag)
		   #  No tag found, return empty string.
		   if tag1_pos1==-1: return ""
		   tag1_pos2 = str.find(">",tag1_pos1)
		   if tag1_pos2==-1: return ""
		   tag2_pos1 = str.find("</" + tag,tag1_pos2)
		   if tag2_pos1==-1: return ""
		   return str[tag1_pos2+1:tag2_pos1].strip()
		   */

}


