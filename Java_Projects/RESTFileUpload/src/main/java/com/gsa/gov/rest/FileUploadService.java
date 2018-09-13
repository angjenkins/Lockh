/*package com.gsa.gov.rest;

import gov.gsa.fas.attachment.config.AttachmentConfig;
import gov.gsa.fas.attachment.config.ConfigConstants;
import gov.gsa.fas.attachment.sftp.SftpUtil;
import gov.gsa.fas.auth.Auth;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.sun.jersey.api.view.Viewable;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

@Path("/file")
public class FileUploadService {
	//private static final Logger logger = Logger
	//		.getLogger(FileUploadService.class.getName());
	public static String REQUEST_ATTACHMENT_DIR = AttachmentConfig
			.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_ATT_DIR);
	public static String SALT = AttachmentConfig
			.getPropertyValue(ConfigConstants.SALT);
	public static String HASH_PASS = AttachmentConfig
			.getPropertyValue(ConfigConstants.HASH_PASS);

	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Viewable uploadFile(
		//@Context ServletContext context,
		@Context HttpServletRequest request,@Context HttpServletResponse response,
		@FormDataParam("file") InputStream uploadedInputStream,
		@FormDataParam("file") FormDataContentDisposition fileDetail,
		@FormDataParam("username") String username,
		@FormDataParam("password") String password) throws NoSuchAlgorithmException, IOException, URISyntaxException {
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("filename = " + fileDetail.getFileName());
		
		
		String uploadedFileLocation = "c://tomcatupload/" + fileDetail.getFileName();
 
		// save i
		//writeToFile(uploadedInputStream, uploadedFileLocation);
		validateuser(username,password);
		if (validateuser(username,password).equals("")){
			sftpAttFile(uploadedInputStream,fileDetail.getFileName());
		}
		String output = "File uploaded to : " + uploadedFileLocation;
		request.setAttribute("obj", new String("IT Works"));
		//response.setHeader("Location", "/");
		//System.out.println("content = " + context.getContextPath());
		//System.out.println("context = " + String.format("%s",context.getContextPath()));
		//context.
		//return Response.status(201).header("Location",String.format("%s",context.getContextPath())).build(); 
		//UriBuilder builder = UriBuilder.fromPath(context.getContextPath());
	    //builder.path("index.jsp");	
		return new Viewable("/success.jsp",null);
	    //String name = new File(context.getRealPath("/")).getName();
	    //System.out.println("getrealname = " + name);
	    //return Response.seeOther(builder.build()).build();    
		//System.out.println("Prem");
		//return Response.seeOther(new URI("/")).build();
		//return Response.seeOther("/")
	    //           .cookie(new NewCookie("name", "Hello, world!"))
	    //           .build();
		//return Response.seeOther("/").build();
 
	}

	private String validateuser(String username, String password)
			throws NoSuchAlgorithmException {
		System.out.println("validateuser");
		byte[] saltpass = Auth.getHashWithSalt(password, SALT.getBytes());
		String decodedpass = Auth.bytetoString(saltpass);
		//logger.info("decoded hashpassword->" + decodedpass);
		if (!decodedpass.equals(HASH_PASS)
				&& !username.equalsIgnoreCase("p3xferdt")) {
			System.out.println("Username and password not matching");
			return "Invalid username/password";
		}
		return "";
	}

	public static String sftpAttFile(InputStream ins, String fileName) {
		System.out.println("ftp file");
		//logger.info("inside sftpattfile ");
		String error = "";
		ChannelSftp sftpChannel = null;
		try {
			//logger.info("sftpattfile get sftp channel");
			sftpChannel = SftpUtil.getSftpChannel();
			//logger.info("sftpattfile get sftp channel complete");
			// SftpUtil.mkdir(sftpChannel, REQUEST_ATTACHMENT_DIR, targetDir);
			// SftpUtil.putFile(sftpChannel, ins, REQUEST_ATTACHMENT_DIR + "/"
			// + targetDir, fileName);
			for (String fname : SftpUtil.getFileNames(sftpChannel,
					REQUEST_ATTACHMENT_DIR)) {
				//logger.info("filename = " + fname);
				if (fname.trim().toUpperCase()
						.equals(fileName.trim().toUpperCase())) {
					System.out.println("Same filename exist");
					error = "Same filename exist";
					return error;
				}
			}
			SftpUtil.putFile(sftpChannel, ins, REQUEST_ATTACHMENT_DIR, fileName);

		} catch (JSchException e) {
			//logger.error(
			//		"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
			//		e);
			error = "JschException";

		} catch (SftpException e) {
			//logger.error(
			//		"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
			//		e);
			error = "SFTPException";

		} finally {
			try {
				if (sftpChannel != null)
					SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				//logger.error(
				//		"archiveRequestXMLFile(): Failed to close SFTP channel",
				//		e);
				error = "JschException";
			}
		}

		return error;
	}

	// save uploaded file to new location
	
	 * private void writeToFile(InputStream uploadedInputStream, String
	 * uploadedFileLocation) {
	 * 
	 * try { OutputStream out = new FileOutputStream(new File(
	 * uploadedFileLocation)); int read = 0; byte[] bytes = new byte[1024];
	 * 
	 * out = new FileOutputStream(new File(uploadedFileLocation)); while ((read
	 * = uploadedInputStream.read(bytes)) != -1) { out.write(bytes, 0, read); }
	 * out.flush(); out.close(); } catch (IOException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 
}*/