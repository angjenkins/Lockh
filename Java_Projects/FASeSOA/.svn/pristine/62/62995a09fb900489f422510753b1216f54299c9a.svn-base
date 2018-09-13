/*
 * @(#)BaseDAO.java			Apr 10, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.persistence.common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

/**
 * <code>BaseDAO</code> provides the operations to get the
 * JDBC connection and release the connection to the pool.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public abstract class BaseDAO {

	private static final Logger logger = 
		Logger.getLogger(BaseDAO.class.getName());
	
	/**
	 * Look up CSC DataSource and return the connection.
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected Connection getCSCConnection() throws SQLException{
		DataSource ds = null;
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/VISS-CSC-DS");
		} catch (NamingException e) {
			logger.error("getCSCConnection(): Naming error occurred", e);
			throw new SQLException("Failed to lookup CSC DataSource");
		}
		conn = ds.getConnection();
		return conn;
	}
	
	/**
	 * Look up OCMS DataSource and return the connection.
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected Connection getOCMSConnection() throws SQLException{
		DataSource ds = null;
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/VISS-OCMS-DS");
		} catch (NamingException e) {
			logger.error("getOCMSConnection(): Naming error occurred", e);
			throw new SQLException("Failed to lookup OCMS DataSource");
		}
		conn = ds.getConnection();
		return conn;
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
	
	/**
	 * Look up VISS DataSource and return the connection.
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected Connection getVISSConnection() throws SQLException{
		DataSource ds = null;
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/VISS-DS");
		} catch (NamingException e) {
			logger.error("getVISSConnection(): Naming error occurred", e);
			throw new SQLException("Failed to lookup VISS DB DataSource");
		}
		conn = ds.getConnection();
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
}
