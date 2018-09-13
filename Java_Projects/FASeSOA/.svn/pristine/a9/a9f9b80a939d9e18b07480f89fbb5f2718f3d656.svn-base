/*
 * @(#)ContactPersistenceImpl.java			Mar 13, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.contact.service;

import gov.gsa.fas.persistence.contact.model.CustomerContact;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * <code>ContactPersistenceImpl</code> is the local EJB implementation for
 * CustomerContactPersistence service.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 * @see    	gov.gsa.fas.persistence.contact.service.ContactPersistence 
 */

@Stateless
public class ContactPersistenceImpl implements ContactPersistence {

	private static final Logger logger = 
		Logger.getLogger(ContactPersistenceImpl.class.getName());
	
	/**
	 * Retrieves Customer contact data by Activity Address code 
	 * from Advantage bvdb database.
	 * 
	 * @param 	aac
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<CustomerContact> retrieveContactByAAC(String aac)
			throws ContactPersistenceException {
		logger.info("retrieveContactByAAC(): Retrieving Contact details by AAC->" +aac);
		long time1=System.currentTimeMillis();
		List<CustomerContact> contactList=null;
	  CallableStatement cst = null;  
	  ResultSet rs = null;
	  Connection conn = null;		
		try {
			conn = getBVDBConnection();
			cst = conn.prepareCall(ContactSqlConstants.RETRIEVE_CONTACT_BY_AAC);
			cst.setString(2, aac);
			rs = cst.executeQuery();
			if(rs == null){
				return null;
			}
			contactList = new ArrayList<CustomerContact>();
			while(rs.next()){
				CustomerContact contact = new CustomerContact();
				contact.setLastName(rs.getString("LAST_NAME"));
				contact.setFirstName(rs.getString("FIRST_NAME"));
				contact.setShipAac(rs.getString("SHIP_AAC"));
				contact.setAgencyName(rs.getString("AGENCY_NAME"));
				contact.setBureauDescription(rs.getString("BUREAU_TEXT"));
				contact.setPhone(rs.getString("PHONE"));
				contact.setPhoneExt(rs.getString("PHONE_EXTENSION"));
				contact.setFax(rs.getString("FAX"));
				contact.setEmail(rs.getString("EMAIL"));
				contact.setShipToAddress1(rs.getString("SHIP_TO_ADDRESS1"));
				contact.setShipToAddress2(rs.getString("SHIP_TO_ADDRESS2"));
				contact.setShipToAddress3(rs.getString("SHIP_TO_ADDRESS3"));
				contact.setShipToCity(rs.getString("SHIP_TO_CITY"));
				contact.setShipToState(rs.getString("SHIP_TO_STATE"));
				contact.setShipToZip(rs.getString("SHIP_TO_ZIP"));
				contact.setShipToZip4(rs.getString("SHIP_TO_ZIP4"));
				contact.setShipToCountry(rs.getString("SHIP_TO_COUNTRY"));
				contact.setShipToPhone(rs.getString("SHIP_TO_PHONE"));
				contactList.add(contact);
			}
		}catch (SQLException e) {
			logger.error("retrieveContactByAAC(): Error occurred while retrieving Contact Details By AAC->" + aac, e);
			throw new ContactPersistenceException("Advantage Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(cst != null){
					cst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveContactByAAC(): Failed to close Resultset or CallableStatement", e);
			}
		}
		long time2 = System.currentTimeMillis();
		logger.info("retrieveContactByAAC():Total time taken to execute query->" + ((time2-time1)/1000.0) + " secs");
		int contactListSize = (contactList == null) ? 0 : contactList.size();
		logger.info("retrieveContactByAAC(): Contact list size->" + contactListSize +	" for AAC->" +aac);
		return contactList;
	}

	/**
	 * Retrieves Customer contact data by last name and first name 
	 * from Advantage BVDB database.
	 * 
	 * @param 	lastName
	 * @param 	firstName
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */	
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<CustomerContact> retrieveContactByName(String lastName, String firstName)
			throws ContactPersistenceException {
		logger.info("retrieveContactByName(): Retrieving Contact details by Last Name->" +lastName + 
				", First Name->"+ firstName);
		long time1=System.currentTimeMillis();
		List<CustomerContact> contactList=null;
	  CallableStatement cst = null;  
	  ResultSet rs = null;
	  Connection conn = null;		
		try {
			conn = getBVDBConnection();
			cst = conn.prepareCall(ContactSqlConstants.RETRIEVE_CONTACT_BY_NAME);
			cst.setString(2, lastName);
			cst.setString(3, firstName);
			rs = cst.executeQuery();
			if(rs == null){
				return null;
			}
			contactList = new ArrayList<CustomerContact>();
			while(rs.next()){
				CustomerContact contact = new CustomerContact();
				contact.setLastName(rs.getString("LAST_NAME"));
				contact.setFirstName(rs.getString("FIRST_NAME"));
				contact.setShipAac(rs.getString("SHIP_AAC"));
				contact.setAgencyName(rs.getString("AGENCY_NAME"));
				contact.setBureauDescription(rs.getString("BUREAU_TEXT"));
				contact.setPhone(rs.getString("PHONE"));
				contact.setPhoneExt(rs.getString("PHONE_EXTENSION"));
				contact.setFax(rs.getString("FAX"));
				contact.setEmail(rs.getString("EMAIL"));
				contact.setShipToAddress1(rs.getString("SHIP_TO_ADDRESS1"));
				contact.setShipToAddress2(rs.getString("SHIP_TO_ADDRESS2"));
				contact.setShipToAddress3(rs.getString("SHIP_TO_ADDRESS3"));
				contact.setShipToCity(rs.getString("SHIP_TO_CITY"));
				contact.setShipToState(rs.getString("SHIP_TO_STATE"));
				contact.setShipToZip(rs.getString("SHIP_TO_ZIP"));
				contact.setShipToZip4(rs.getString("SHIP_TO_ZIP4"));
				contact.setShipToCountry(rs.getString("SHIP_TO_COUNTRY"));
				contact.setShipToPhone(rs.getString("SHIP_TO_PHONE"));
				contactList.add(contact);
			}
		}catch (SQLException e) {
			logger.error("retrieveContactByName(): Error occurred while retrieving Contact Details By Last Name->" + lastName + 
					", First Name->" + firstName, e);
			throw new ContactPersistenceException("Advantage Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(cst != null){
					cst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveContactByName(): Failed to close Resultset or CallableStatement", e);
			}
		}
		long time2 = System.currentTimeMillis();
		logger.info("retrieveContactByName():Total time taken to execute query->" + ((time2-time1)/1000.0) + " secs");
		int contactListSize = (contactList == null) ? 0 : contactList.size();
		logger.info("retrieveContactByName(): Contact list size->" + contactListSize +	" for Last Name->" +lastName + 
				", First Name->" + firstName);
		return contactList;
	}

	/**
	 * Retrieves Customer contact data by email from Advantage BVDB database.
	 * 
	 * @param 	email
	 * @return	list of <code>CustomerContact</code> objects
	 * @throws 	ContactPersistenceException, if any error occurs
	 */
	@TransactionAttribute(TransactionAttributeType.NEVER)
	public List<CustomerContact> retrieveContactByEmail(String email)
			throws ContactPersistenceException {
		logger.info("retrieveContactByEmail(): Retrieving Contact details by E-Mail->" +email);
		long time1=System.currentTimeMillis();
		List<CustomerContact> contactList=null;
	  CallableStatement cst = null;  
	  ResultSet rs = null;
	  Connection conn = null;		
		try {
			conn = getBVDBConnection();
			cst = conn.prepareCall(ContactSqlConstants.RETRIEVE_CONTACT_BY_EMAIL);
			cst.setString(2, email);
			rs = cst.executeQuery();
			if(rs == null){
				return null;
			}
			contactList = new ArrayList<CustomerContact>();
			while(rs.next()){
				CustomerContact contact = new CustomerContact();
				contact.setLastName(rs.getString("LAST_NAME"));
				contact.setFirstName(rs.getString("FIRST_NAME"));
				contact.setShipAac(rs.getString("SHIP_AAC"));
				contact.setAgencyName(rs.getString("AGENCY_NAME"));
				contact.setBureauDescription(rs.getString("BUREAU_TEXT"));
				contact.setPhone(rs.getString("PHONE"));
				contact.setPhoneExt(rs.getString("PHONE_EXTENSION"));
				contact.setFax(rs.getString("FAX"));
				contact.setEmail(rs.getString("EMAIL"));
				contact.setShipToAddress1(rs.getString("SHIP_TO_ADDRESS1"));
				contact.setShipToAddress2(rs.getString("SHIP_TO_ADDRESS2"));
				contact.setShipToAddress3(rs.getString("SHIP_TO_ADDRESS3"));
				contact.setShipToCity(rs.getString("SHIP_TO_CITY"));
				contact.setShipToState(rs.getString("SHIP_TO_STATE"));
				contact.setShipToZip(rs.getString("SHIP_TO_ZIP"));
				contact.setShipToZip4(rs.getString("SHIP_TO_ZIP4"));
				contact.setShipToCountry(rs.getString("SHIP_TO_COUNTRY"));
				contact.setShipToPhone(rs.getString("SHIP_TO_PHONE"));
				contactList.add(contact);
			}
		}catch (SQLException e) {
			logger.error("retrieveContactByEmail(): Error occurred while retrieving Contact Details By Email->" + email, e);
			throw new ContactPersistenceException("Advantage Database Error-" + e.getMessage(), e);
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(cst != null){
					cst.close();
				}
				if(conn != null){
					closeConnection(conn);
				}
			} catch (SQLException e) {
				logger.error("retrieveContactByEmail(): Failed to close Resultset or CallableStatement", e);
			}
		}
		long time2 = System.currentTimeMillis();
		logger.info("retrieveContactByEmail():Total time taken to execute query->" + ((time2-time1)/1000.0) + " secs");
		int contactListSize = (contactList == null) ? 0 : contactList.size();
		logger.info("retrieveContactByEmail(): Contact list size->" + contactListSize +	" for Email->" +email);
		return contactList;
	}
	
	/**
	 * Look up Advantage BVDB DataSource and return the connection.
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected Connection getBVDBConnection() throws SQLException{
		DataSource ds = null;
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/VISS-BVDB-DS");
		} catch (NamingException e) {
			logger.error("getBVDBConnection(): Naming error occurred", e);
			throw new SQLException("Failed to lookup ACIS BVDB DataSource");
		}
		conn = ds.getConnection();
		return conn;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.sybase.jdbc3.jdbc.SybDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties props = new Properties();
		props.put("user", "viss_bv_maint");
		props.put("password", "pwd12345");
//		System.out.println("JDBC Url->" + JDBC_URL);
		try {
			conn = DriverManager.getConnection("jdbc:sybase:Tds:eagu40.fss.gsa.gov:5100/bvdb", props);
//			checkForWarning(conn.getWarnings());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	
	
	/**
	 * Releases connection to the connection pool.
	 * 
	 * @param 	conn
	 * @throws 	SQLException
	 */
	protected void closeConnection(Connection conn) throws SQLException{
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				logger.error("closeConnection():Failed to close the connection", e);
				throw e;
			}
		}
	}	
	
	//For testing purpose only
	public static void main(String args[]){
		ContactPersistenceImpl contactPers = new ContactPersistenceImpl();
		List<CustomerContact> contactList = null;
		try {
//			contactList = contactPers.retrieveContactByAAC("7532RA");
//			contactList = contactPers.retrieveContactByName("SMITH", "WAQUITA");
			contactList = contactPers.retrieveContactByEmail("d_wsmith@niaid.nih.gov");
		} catch (ContactPersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(CustomerContact contact:contactList){
			System.out.println("Last Name->" + contact.getLastName());
			System.out.println("First Name->" + contact.getFirstName());
			System.out.println("AAC->" + contact.getShipAac());
			System.out.println("Agency Name->" + contact.getAgencyName());
			System.out.println("Bureau->" + contact.getBureauDescription());
			System.out.println("Phone->" + contact.getPhone());
			System.out.println("Phone Ext->" + contact.getPhoneExt());
			System.out.println("Fax->" + contact.getFax());
			System.out.println("Email->" + contact.getEmail());
			System.out.println("Address1->" + contact.getShipToAddress1());
			System.out.println("Address2->" + contact.getShipToAddress2());
			System.out.println("Address3->" + contact.getShipToAddress3());
			System.out.println("City->" + contact.getShipToCity());
			System.out.println("State->" + contact.getShipToState());
			System.out.println("Country->" + contact.getShipToCountry());
			System.out.println("Zip->" + contact.getShipToZip());
			System.out.println("Zip4->" + contact.getShipToZip4());
			System.out.println("Ship To Phone->" + contact.getShipToPhone());
		}
	}
}
