package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;

//import java.io.Serializable;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.sql.Types;
import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import java.util.regex.Pattern;

import javax.naming.InitialContext;
import javax.sql.DataSource;

//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class MinimumDAO {
	private DataSource dataSource;

	// Veh_Type list AutoChoice
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> getMinimumList(StdItemDTO dto) throws Exception, Exception{
		
		
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		
		
		
		try {
			getConnection();
			NamedParameterJdbcTemplate rptCon = new NamedParameterJdbcTemplate(dataSource);
			MapSqlParameterSource parameters = new MapSqlParameterSource();
			
			parameters.addValue("Std_Item", dto.getStdItem());
			//String SQL="select * from bid_line_dev_new where Sol_No_2= :Sol_No_2 order by Date_Last_Updated desc LIMIT 50";
			String stringQuery = "SELECT distinct Contr_Line.Sch_Line"
					+ ", Contr_Line.Std_Item, Contr_Line.MPG_B, Contr_Line.MPG_C, "
					+ "Contr_Line.MPG_H, Contr_Line.Allow_Ordering, Contr_Line.Active_Line, "
					+ "Contr_Line.Current_Unit_Price, Contr_Line.Description as LineDesc, "
					+ "Std_items.Description as std_item_description, Contr_Line.Contract as Contract, "
					+ "ContrDUNS.Contr_Full_Name, Contract.Contract_Sc, "
					+ "A.Manufacturer_Name, Model_GroupDuns.Description as Model, '' as Fed_Value_Next,"
					+ "Model.Model as Model_Code,"
					+ "S.Option_Code,"
					+ "O.Description,"
					+ "C.Category_Code,"
					+ "C.Category_Name,"
					+ "S.Fed_Value_Current,"
					+ "Veh_Type.Description as VehDesc,"
					+ "Veh_Type.Veh_Type,"
					+ "Contr_line_Option_Ext.Option_Code,"
					+ "Contr_line_Option_Ext.Fed_Value_Next "
					+ "FROM Contract, Contr_Line, Std_items, ContrDUNS, Model, Model_GroupDuns, Group_DUNS, Group_DUNS A,"
					+ "Std_Itm_Options S, Options_Table O, Options_Category C,"
					+ "Veh_Type,"
					+ "Contr_line_Option_Ext "
					+ "WHERE ";
		
			       if (dto.getProprietary().equals('P')){
			         stringQuery = stringQuery  + " (Contract.For_Public_Internet in ('P')) and "; 
			       }
			       else {
			         stringQuery = stringQuery  + "  ( Contract.For_Public_Internet = 'Y' or Contract.For_Public_Internet = 'D' ) and "; 
			       }
			
			       stringQuery = stringQuery  +"	( Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ) and "
					+ "	( Contract.Contract = Contr_Line.Contract ) and "
					+ "	( Contr_Line.Model = Model.Model) and "
					+ "	( Contr_Line.Std_Item = :Std_Item) and"
					+ "	( Contr_Line.Active_Line = 'Y') and "
					+ "	( Contr_Line.Std_Item = Std_items.Std_Item ) and "
					+ "	( Contr_Line.Std_Item = Model.Std_Item) and "
					+ "	( Model_GroupDuns.Model = Model.Model ) and "
					+ "	( Group_DUNS.Group_DUNS = Model_GroupDuns.Group_DUNS ) and "
					+ "	( A.Group_DUNS = ContrDUNS.Group_DUNS ) AND "
					+ "	S.Std_Item = Std_items.Std_Item and "
					+ "	S.Fed_Flag_Current ='Y'  and "
					+ "	S.Flag_Std ='Y' and "
					+ "   S.Option_Code = O.Option_Code and "
					+ "	O.Category_Code = C.Category_Code and "
					+ "	O.Valid_Flag ='Y' and "
					+ "	S.Flag_Std ='Y' and "
					+ "	Std_items.Veh_Type = Veh_Type.Veh_Type AND "
					+ "        Contr_line_Option_Ext.Contract =  Contr_Line.Contract  and "
					+ "        Contr_line_Option_Ext.Sch_Line =  Contr_Line.Sch_Line  and "
					+ "	Contr_line_Option_Ext.Option_Code = S.Option_Code "
					+ "ORDER BY C.Category_Code, S.Option_Code, Model_Code";
			
			
				rows=rptCon.queryForList(stringQuery,parameters);

		} catch (Exception ex) {

			System.out.println(ex.getMessage());
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
