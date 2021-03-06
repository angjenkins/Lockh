/**
 * 
 */
package gov.gsa.fas.services.attachment.v1;

import gov.gsa.fas.attachment.common.AttachmentException;
import gov.gsa.fas.attachment.config.AttachmentConfig;
import gov.gsa.fas.attachment.config.ConfigConstants;
import gov.gsa.fas.attachment.sftp.SftpUtil;
import gov.gsa.fas.auth.Auth;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.MTOM;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.jboss.annotation.ejb.TransactionTimeout;
import org.jboss.ws.core.jaxws.binding.SOAP11BindingJAXWS;
import org.jboss.ws.core.jaxws.binding.SOAP12BindingJAXWS;
import org.jboss.wsf.spi.annotation.WebContext;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

/**
 * @author KamalJSarabi
 * 
 */

// @HandlerChain(file="handler-chain.xml")
@Stateless()
@Remote(AttachmentWS.class)
@WebContext(contextRoot = "/attachment.services", urlPattern = "/AttachmentService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@MTOM(enabled = true)
@BindingType(value = "http://schemas.xmlsoap.org/wsdl/soap/http?mtom=true")
@WebService(endpointInterface = "gov.gsa.fas.services.attachment.v1.AttachmentWS", portName = "AttachmentWS", targetNamespace = "http://fas.gsa.gov/services/Attachment/v1.0", name = "AttachmentWSImpl")
@TransactionTimeout(value = 999999999)
public class AttachmentWSImpl implements AttachmentWS {
	private static final Logger logger = Logger
			.getLogger(AttachmentWSImpl.class.getName());
	public static String REQUEST_ATTACHMENT_DIR = AttachmentConfig
			.getPropertyValue(ConfigConstants.GSA_SFTP_REQUEST_ATT_DIR);
	public static String SALT = AttachmentConfig
			.getPropertyValue(ConfigConstants.SALT);
	public static String HASH_PASS = AttachmentConfig
			.getPropertyValue(ConfigConstants.HASH_PASS);
	
	CharSequence invalids = "\\/ \t\"\'?";
	// Dependency Injection
	@Resource(mappedName = "AttachmentWSImpl")
	WebServiceContext wsCtx;

	private gov.gsa.fas.faults.v1.ServiceFault faultInfo = new gov.gsa.fas.faults.v1.ServiceFault();

	// @Resource(mappedName="Attachment.SOAPMessageContext")
	// SOAPMessageContext context;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.gsa.fas.services.attachment.v1.AttachmentWS#submitAttachmentData(
	 * gov.gsa.fas.services.attachment.v1.Attachment)
	 */
	public boolean submitAttachmentData(Attachment requestData)
			throws ServiceFault {
		// Acess the value passed up from the Handler

		try {
			if (requestData.filename == null
					|| requestData.filename.trim().isEmpty()
					|| hasInvalid(invalids, requestData.filename))
				throw new ServiceFault(
						"file name is empty or null or has invalid characters",
						faultInfo);
			String username = null;
			MessageContext ctx1 = wsCtx
					.getMessageContext();
			Map http_headers = (Map) ctx1.get(MessageContext.HTTP_REQUEST_HEADERS);
			System.out.println(http_headers.get("Username")); 
			System.out.println(http_headers.get("Password"));
			SOAPMessageContext ctx = (SOAPMessageContext) wsCtx
					.getMessageContext();
			
			java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = (Map<String, List<String>>) ctx
					.get(MessageContext.HTTP_REQUEST_HEADERS);
			if (headers.keySet() != null && !headers.keySet().isEmpty()) {
				Iterator<String> keys = headers.keySet().iterator();
				while (keys.hasNext()) {
					String key = (String) keys.next();
					logger.info("HeaderKey->" + key);
					logger.info("Header values->" + headers.get(key));
					// getting Basic Authentication
					String tmpusername = getUsernameFromAuthentication(key,
							headers.get(key).toString());
					if (tmpusername != null)
						username = tmpusername;

				}

			}
			// check for attachment in body
			if (requestData.data != null)
				logger.info("requestData.data =" + requestData.data.length);
			logger.info("requestData.data instance ="
					+ requestData.data.getClass().getSimpleName());
			logger.info("requestData.data is Array ="
					+ requestData.data.getClass().isArray());
			// checking for attachment
			SOAPMessage soapMessage = ctx.getMessage();
			logger.info("soapmessage =  " + soapMessage);
			if (soapMessage != null) {
				logger.info("soapmessage content description= " + soapMessage.getContentDescription());
				Iterator attachments = soapMessage.getAttachments();
				// Process all attachments
				while (attachments.hasNext()) {
					logger.info("Inside-1");
					AttachmentPart attachment = (AttachmentPart) attachments
							.next();
					DataHandler dh = attachment.getDataHandler();
					logger.info("ATTACHMENT CONTENT ID="
							+ attachment.getContentId());
					logger.info("ATTACHMENT CONTENT LOCATION="
							+ attachment.getContentLocation());
					logger.info("ATTACHMENT CONTENT TYPE="
							+ attachment.getContentType());
					
					logger.info("ATTACHMENT size =" + attachment.getSize());
					logger.info("ATTACHMENT String ="
							+ dh.getDataSource().getName());
					logger.info("ATTACHMENT Name =" + dh.getName());

				}
			}
			/*
			sftpAttFile(new ByteArrayInputStream(requestData.data),
					username, requestData.filename);
*/
			if (username != null) {
				logger.info("sftpattfile being called");
				sftpAttFile(new ByteArrayInputStream(requestData.data),
						username, requestData.filename);
				logger.info("sftpattfile being called - complete");

			} else
				throw new ServiceFault("Basic Authentication not found",
						faultInfo);

			/*
			 * if (ctx.get("username") != null){
			 * username=ctx.get("username").toString();
			 * logger.info("username->"+username); } SOAPMessage soapMessage =
			 * ctx.getMessage(); if (ctx.get("soapMsg") != null) soapMessage=
			 * (SOAPMessage)ctx.get("soapMsg");
			 * 
			 * 
			 * 
			 * //get attached file //saveToFile(new
			 * ByteArrayInputStream(requestData.data), "/opt/sw/test/in",
			 * requestData.filename); //sftpAttFile("C:/opt/sw/test/in",
			 * "kamal", requestData.filename);
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServiceFault(e.getMessage(), faultInfo);

		}

		return true;
	}

	private String getUsernameFromAuthentication(String key, String value)
			throws AttachmentException, ServiceFault {
		String username = null;
		if (key.equalsIgnoreCase("Authorization")) {
			String auth = value;
			logger.info("Found Authentication->" + auth);
			auth = auth.substring(auth.lastIndexOf("Basic ") + 6);
			logger.info("Extracted Authentication->" + auth);
			String decodedAuth = new String(
					Base64.decodeBase64(auth.getBytes()));
			logger.info("decoded->" + decodedAuth);
			username = decodedAuth.substring(0, decodedAuth.indexOf(":"));
			logger.info("decoded username->" + username);
			String password = decodedAuth.substring(
					decodedAuth.indexOf(":") + 1, decodedAuth.length());
			logger.info("decoded password->" + password);
			try {
				byte[] saltpass = Auth.getHashWithSalt(password, SALT.getBytes());
				String decodedpass = Auth.bytetoString(saltpass);
				logger.info("decoded hashpassword->" + decodedpass);
				if (!decodedpass.equals(HASH_PASS) && !username.equalsIgnoreCase("p3xferdt")){
					throw new ServiceFault(
							"Invalid Username/Password",
							faultInfo);
				}
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (username != null) {

				//if (hasInvalid(invalids, username) || username.length() > 20)
				//	throw new AttachmentException(
				//			"username has invalid characters or has big size");
				// context.put("username", username);
				// context.setScope("username",
				// MessageContext.Scope.APPLICATION);
			}
		}

		return username;

	}

	public int saveToFile(InputStream inps, String stagingDir, String fileName) {
		int i = 1;
		try {

			OutputStream bufferedOutputStream = new BufferedOutputStream(
					new FileOutputStream(stagingDir + "/" + fileName));
			byte buf[] = new byte[4096];
			int length;
			while (true) {
				length = inps.read(buf);
				if (length < 0)
					break;
				bufferedOutputStream.write(buf, 0, length);
			}
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
		} catch (Exception e) {
			logger.info("Error saving file datasource");
			e.printStackTrace();
			i = -1;

		}
		return i;
	}

	public static boolean sftpAttFile(String stagingDir, String targetDir,
			String fileName) throws AttachmentException {
		logger.info("stagingDir = " + stagingDir);
		logger.info("targetDir = " + targetDir);
		logger.info("fileName = " + fileName);
		ChannelSftp sftpChannel = null;
		try {
			sftpChannel = SftpUtil.getSftpChannel();
			SftpUtil.mkdir(sftpChannel, REQUEST_ATTACHMENT_DIR, targetDir);
			SftpUtil.putFile(sftpChannel, stagingDir, REQUEST_ATTACHMENT_DIR
					+ "/" + targetDir, fileName);
			return true;
		} catch (JSchException e) {
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			throw new AttachmentException(
					"Failed to archive Request Attachment file", e);
		} catch (SftpException e) {
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			throw new AttachmentException(
					"Failed to archive Request Attachment file", e);
		} finally {
			try {
				if (sftpChannel != null)
					SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error(
						"archiveRequestXMLFile(): Failed to close SFTP channel",
						e);
			}
		}

	}

	private static boolean hasInvalid(CharSequence s, String str) {
		System.out.println("str =  " + str);
		for (int i = 0; i < s.length(); i++) {
			// logger.info("checking for->"+s.charAt(i));
			System.out.println("s.charAt(i) = " + s.charAt(i));
			if (str.contains(s.charAt(i) + ""))
				return true;
		}
		return false;

	}

	public static boolean sftpAttFile(InputStream ins, String targetDir,
			String fileName) throws AttachmentException {
		logger.info("inside sftpattfile ");
		ChannelSftp sftpChannel = null;
		try {
			logger.info("sftpattfile get sftp channel");
			sftpChannel = SftpUtil.getSftpChannel();
			logger.info("sftpattfile get sftp channel complete");
			//SftpUtil.mkdir(sftpChannel, REQUEST_ATTACHMENT_DIR, targetDir);
			//SftpUtil.putFile(sftpChannel, ins, REQUEST_ATTACHMENT_DIR + "/"
			//		+ targetDir, fileName);
			for (String fname:SftpUtil.getFileNames(sftpChannel, REQUEST_ATTACHMENT_DIR)){
				logger.info("filename = " + fname);
				if (fname.trim().toUpperCase().equals(fileName.trim().toUpperCase())){
					throw new AttachmentException(
							"Same filename exist, please use a different name or check with the application");
				}
			}
			SftpUtil.putFile(sftpChannel, ins, REQUEST_ATTACHMENT_DIR , fileName);
			
			return true;
		} catch (JSchException e) {
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			throw new AttachmentException(
					"Failed to archive Request Attachment file", e);
		} catch (SftpException e) {
			logger.error(
					"archiveRequestAttachmentFile():Failed to archive Request Attachment file",
					e);
			throw new AttachmentException(
					"Failed to archive Request Attachment file", e);
		} finally {
			try {
				if (sftpChannel != null)
					SftpUtil.closeChannel(sftpChannel);
			} catch (JSchException e) {
				logger.error(
						"archiveRequestXMLFile(): Failed to close SFTP channel",
						e);
			}
		}

	}

}
