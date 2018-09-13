package com.gsa.gov.file.upload;

import gov.gsa.fas.attachment.config.rest.AttachmentConfig;
import gov.gsa.fas.attachment.config.rest.ConfigConstants;
import gov.gsa.fas.attachment.sftp.rest.SftpUtil;
import gov.gsa.fas.auth.rest.Auth;

import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;


@Path("/file")
public class FileUploadService {
	private static final Logger logger = Logger
			.getLogger(FileUploadService.class.getName());
	public static String REQUEST_ATTACHMENT_DIR = AttachmentConfig
			.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_ATT_DIR);
	public static String SALT = AttachmentConfig
			.getPropertyValue(ConfigConstants.SALT);
	public static String HASH_PASS = AttachmentConfig
			.getPropertyValue(ConfigConstants.HASH_PASS);

	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Result uploadFile(
		//@Context ServletContext context,
		//@Context HttpServletRequest request,@Context HttpServletResponse response,
		@FormDataParam("filecontent") InputStream uploadedInputStream,
		//@FormDataParam("filedetail") FormDataContentDisposition fileDetail,
		@FormDataParam("filename") String filename,
		@FormDataParam("username") String username,
		@FormDataParam("password") String password) throws NoSuchAlgorithmException, IOException, URISyntaxException {
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("filename = " + filename);
		
		
		String uploadedFileLocation = "c://tomcatupload/" + filename;
 
		// save i
		//writeToFile(uploadedInputStream, uploadedFileLocation);
		Result output = null;
		int result;
		result = validateuser(username,password);
		
		if (result == 0){
			result = sftpAttFile(uploadedInputStream,filename);
		}
		System.out.println("result = " + result);
		switch (result){
		case 00:
			return new Result("STATUS","SUCCESS");
		case 10:
			return new Result("STATUS","INVALID-USER-PASS");
		case 20:
			return new Result("STATUS","DUPLICATE-FILENAME");
		case 30:
			return new Result("STATUS","JSCHEXCEPTION");
		case 40:
			return new Result("STATUS","SFTPEXCEPTION");
		case 50:
			return new Result("STATUS","JSCHEXCEPTION");
		
		}
		
		//String output = "File uploaded to : " + uploadedFileLocation;
		//request.setAttribute("obj", new String("IT Works"));
		//Result result = new Result("status","success");
		//return new Viewable("/success.jsp",null);
		return output;

 
	}

	private int validateuser(String username, String password)
			throws NoSuchAlgorithmException {
		System.out.println("validateuser");
		byte[] saltpass = Auth.getHashWithSalt(password, SALT.getBytes());
		String decodedpass = Auth.bytetoString(saltpass);
		//logger.info("decoded hashpassword->" + decodedpass);
		if (!decodedpass.equals(HASH_PASS)
				&& !username.equalsIgnoreCase("p3xferdt")) {
			System.out.println("Username and password not matching");
			return 10;
		}
		return 0;
	}

	public static int sftpAttFile(InputStream ins, String fileName) {
		System.out.println("ftp file");
		int error = 0;
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
					return  20;
				}
			}
			SftpUtil.putFile(sftpChannel, ins, REQUEST_ATTACHMENT_DIR, fileName);

		} catch (JSchException e) {
			System.out.println("JSCHEXCEPTION");
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			error = 30;

		} catch (SftpException e) {
			System.out.println("SFTPEXCEPTION");
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			error = 40;

		} finally {
			try {
				if (sftpChannel != null)
					SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error(
						"archiveRequestXMLFile(): Failed to close SFTP channel",
						e);
				System.out.println("CLOSE JSCHEXCEPTION");
				error = 50;
			}
		}

		return error;
	}

	// save uploaded file to new location
	/*
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
	 */
}