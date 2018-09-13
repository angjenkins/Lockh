/*
 * @(#)BaseDao.java			Apr 10, 2012	
 *
 * Copyright 2012 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package gov.gsa.fas.vision.dla.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import gov.gsa.fas.vision.dla.common.Utility;

/**
 * <code>BaseDao</code> provides the operations to get the
 * JDBC connection and release the connection to the pool.
 *
 * @author  PrasadRNerayanuru
 * @version 1.0
 */

public abstract class BaseDao {

	private static final Logger logger = 
		Logger.getLogger(BaseDao.class.getName());
	

	
	/**
	 * Look up Vision DLa DataSource and return the connection.
	 * 
	 * @return
	 * @throws SQLException
	 */
	protected Connection getVisionDlaConnection() 
									throws VisionDlaPersistenceException{
		DataSource ds = null;
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:/VISIONDLA-DS");
			conn = ds.getConnection();
		} catch (NamingException e) {
			logger.error("getVisionDlaConnection(): Naming error occurred", e);
			Utility.notifyDatabaseError(e.getMessage());
			throw new VisionDlaPersistenceException("Failed to lookup VISION DLA DataSource");
		} catch (SQLException e) {
			logger.error("getVisionDlaConnection(): SQLException error occurred", e);
			Utility.notifyDatabaseError(e.getMessage());
			throw new VisionDlaPersistenceException("Failed to lookup VISION DLA DataSource");
		}
		return conn;
	}
	
	/**
	 * Releases connection to the connection pool.
	 * 
	 * @param 	conn
	 * @throws 	SQLException
	 */
	protected void closeConnection(Connection conn) 
																throws VisionDlaPersistenceException{
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				logger.error("closeConnection():Failed to close the connection", e);
//				throw new VisionDlaPersistenceException("Failed to close VISION DLA Connection");
			}
		}
	}
	
	protected void closePreparedStatement(PreparedStatement ps) 
																				throws VisionDlaPersistenceException{
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				logger.error("closePreparedStatement():Failed to close the PreparedStatement", e);
//				throw new VisionDlaPersistenceException("ailed to close the PreparedStatement");
			}
		}
	}
	
	protected void closeResultSet(ResultSet rs) 
							throws VisionDlaPersistenceException{
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				logger.error("closeResultSet():Failed to close the ResultSet", e);
				//throw new VisionDlaPersistenceException("ailed to close the PreparedStatement");
			}
		}
	}	
}
