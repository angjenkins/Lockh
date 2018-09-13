package gov.gsa.fas.AutoChoice.DAO;
//http://www.journaldev.com/3422/hibernate-native-sql-example-addscalar-addentity-addjoin-parameter-example
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;
import gov.gsa.fas.AutoChoice.DTO.VehicleReportDTO;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;

@Repository
public class VehicleAvailDAO {
	private SessionFactory sessionFactory = null;

	Logger logger = Logger.getLogger(VehicleAvailDAO.class.toString());

	public VehicleAvailDAO() {
		super();
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	}

	@SuppressWarnings("unchecked")
	public List<VehicleReportDTO> getReportItems() {
		String stringquery1 = "     SELECT  DISTINCT  Std_items.Std_Item,"
				+ " Veh_type.Veh_type,"
				+ "Std_items.Description as ItemDesc,"
				+ "Contr_Line.Closeout_Date,"
				+ "ContrDUNS.Contr_Full_Name,"
				+ "ContrDUNS.Contr_DUNS,"
				+ "Group_DUNS.Group_DUNS,"
				+ "Group_DUNS.Manufacturer_Name,"
				+ "Contr_Line.Model,"
				+ "Veh_type.Division,"
				+ "Veh_type.GROUP_DESCRIPTION,"
				+ "Veh_type.Group_Veh_Type,"
				+ "Contr_Line.Active_Line,"
				+ "Contr_Line.Open_Date,"
				+ "Contr_Line.Allow_Ordering"
				+ " FROM "
				+ " Contract, "
				+ "Contr_Line,"
				+ "Std_items,"
				+ "Veh_Type,"
				+ "Group_DUNS,"
				+ "ContrDUNS,"
				+ "Section_Table "
				+ " WHERE "
				+ " ( Contract.For_Public_Internet in ('Y', 'D')) and"
				+ "( Contract.Contract = Contr_Line.Contract ) and"
				+ "( Contr_Line.Std_Item = Std_items.Std_Item ) and"
				+ "( Contr_Line.Active_Line = 'Y') and"
				+ "( Std_items.Veh_Type = Veh_Type.veh_type ) and"
				+ "( Std_items.Status ='Y') and"
				+ "( Contract.Contr_DUNS=ContrDUNS.Contr_DUNS ) and"
				+ "( Group_DUNS.Group_DUNS = ContrDUNS.Group_DUNS )  and"
				+ "( Veh_Type.Division = Section_Table.Division)  and"
				+ "(Contract.Expire_Date > now() ) "
				
				  + "union" 
				  + "(SELECT  DISTINCT Std_items.Std_Item,Veh_type.Veh_type," 
				  + "Std_items.Description as ItemDesc,Contr_Line.Closeout_Date,"
				  + " ContrDUNS.Contr_Full_Name  ," 
				  + "ContrDUNS.Contr_DUNS," 
				  + "Group_DUNS.Group_DUNS," 
				  + "Group_DUNS.Manufacturer_Name," 
				  + "Contr_Line.Model," 
				  + "Veh_type.Division," 
				  + "Veh_type.GROUP_DESCRIPTION," 
				  + "Veh_type.Group_Veh_Type," 
				  + "Contr_Line.Active_Line," 
				  + "Contr_Line.Open_Date," 
				  + "Contr_Line.Allow_Ordering" 
				  + " FROM Contract," 
				  + "Contr_Line," + "Std_items," + "Veh_Type," + "Group_DUNS," 
				  +  "ContrDUNS," + "Section_Table" + " WHERE " 
				  + " ( Contract.For_Public_Internet in ('Y', 'D')) and " 
				  + " ( Contract.Contract = Contr_Line.Contract ) and " 
				  + " ( Contr_Line.Std_Item = Std_items.Std_Item ) and " 
				  + " ( Contr_Line.Active_Line = 'N') and " 
				  + " ( Std_items.Veh_Type = Veh_Type.veh_type ) and " 
				  + " ( Std_items.Status ='Y') and " 
				  + " ( Contr_Line.Closeout_Date <> '') and " 
				  + " ( Contract.Contr_DUNS=ContrDUNS.Contr_DUNS ) and " 
				  + " ( Group_DUNS.Group_DUNS = ContrDUNS.Group_DUNS )  and " 
				  + " ( Veh_Type.Division = Section_Table.Division) and " 
				  + " (Contract.Expire_Date > now() ) " 
				  + ")"
				+ " Order by  Division desc, Group_DUNS,Group_Veh_Type,Std_Item ";

		Transaction transaction = null;
		List<VehicleReportDTO> result = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			SQLQuery query = (session.createSQLQuery(stringquery1));
			result = query.addScalar("Std_Item").addScalar("Veh_type").addScalar("ItemDesc")
					.addScalar("Closeout_Date").addScalar("Contr_Full_Name").addScalar("Contr_DUNS").addScalar("Group_DUNS")
					.addScalar("Manufacturer_Name").addScalar("Model").addScalar("Division",Hibernate.STRING).addScalar("GROUP_DESCRIPTION")
					.addScalar("Group_Veh_Type").addScalar("Active_Line",Hibernate.STRING).addScalar("Open_Date").addScalar("Allow_Ordering",Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(VehicleReportDTO.class)).list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Select VehicleReportDTO failed : "
						+ e.getMessage());
			}
		}
		return result;
	}
}
