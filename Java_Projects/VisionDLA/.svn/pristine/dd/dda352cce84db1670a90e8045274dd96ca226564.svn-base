/*
 * @(#)EmailNotificationDao.java			Sep 17, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.mail.EmailNotification;

/**
 * <code>EmailNotificationDao</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class EmailNotificationDao extends BaseDao{
	
	private static Logger logger = Logger.getLogger(EmailNotificationDao.class);

	public EmailNotification retrieveEmailNotification(int notificationId) 
				throws VisionDlaPersistenceException{
		logger.info("retrieveEmailNotification():Getting Email Notification details for->" +
				notificationId);
	  PreparedStatement pst = null;
	  ResultSet rs = null;
	  Connection conn = null;
	  try{
	  	conn = getVisionDlaConnection();
	  	pst = conn.prepareStatement(VisionDlaSqlConstants.RETRIEVE_EMAIL_NOTIFICATION);
	  	pst.setInt(1, notificationId);
	  	rs = pst.executeQuery();
			if(rs != null && rs.next()){
				EmailNotification emailNotification = new EmailNotification();
				emailNotification.setNotificationType(rs.getString("notification_type"));
				emailNotification.setFromAddress(rs.getString("from_address"));
				emailNotification.setToAddress(getAddressList(rs.getString("to_address")));
				emailNotification.setSubject(rs.getString("email_subject"));
				emailNotification.setCcAddress(getAddressList(rs.getString("cc_address")));
				emailNotification.setContent(rs.getString("email_content"));
				return emailNotification;
			}
			return null;
		} catch (SQLException e) {
			logger.error("retrieveEmailNotification(): Error occurred while retrieving Email Notification for " +
					"Notification Id->" + notificationId, e);
			throw new VisionDlaPersistenceException("Failed to retrieve Email Notification", e);
		}finally{
			closeResultSet(rs);
			closePreparedStatement(pst);
			closeConnection(conn);
		}		
	}

	/**
	 * @param string
	 * @return
	 */
	private List<String> getAddressList(String addresses) {
		if(addresses == null){
			return null;
		}
		if(addresses.indexOf(",") == -1){
			return Arrays.asList(new String[]{addresses});
		}
		String delims = ",";
		String[] addrs = addresses.split(delims);
		return Arrays.asList(addrs);
	}
}
