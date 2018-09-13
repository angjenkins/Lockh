package gov.gsa.fas.AutoChoice.DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class ReportBuilderDAO implements Serializable{

	private DataSource dataSource;
	
	public ArrayList<Map<String, Object>> getReportList(Map<String, String> reportQueryMap)
			throws Exception, Exception {

		ArrayList<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		
		
		
		try {
			getConnection();
			NamedParameterJdbcTemplate rptCon = new NamedParameterJdbcTemplate(dataSource);
			//String SQL="select * from bid_line_dev_new where Sol_No_2= :Sol_No_2 order by Date_Last_Updated desc LIMIT 50";
			
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			
			parameters.addValue("dtFrom", reportQueryMap.get("dtFrom"),Types.VARCHAR);
			parameters.addValue("dtTo", reportQueryMap.get("dtTo"), Types.VARCHAR);
			
			if(reportQueryMap.containsKey("caseFrom"))
			{
				parameters.addValue("caseFrom", reportQueryMap.get("caseFrom"),Types.VARCHAR);
				parameters.addValue("caseTo", reportQueryMap.get("caseTo"),Types.VARCHAR);
			}
			if(reportQueryMap.containsKey("regionList")){
				parameters.addValue("regionList", reportQueryMap.get("regionList"),Types.VARCHAR);
			}			
			
			rows=(ArrayList<Map<String, Object>>)rptCon.queryForList(reportQueryMap.get("sql"), parameters);
			
		
		} catch (Exception ex) {

			throw new Exception("Exception " + ex.getMessage());
		}
		
		return rows;

	}

	private void getConnection() throws Exception {
		InitialContext ctx = null;
		ctx = new InitialContext();
		dataSource = (DataSource) ctx.lookup("java:/autovendorDS");
		
		
	}

}
