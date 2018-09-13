package gov.gsa.fas.AutoChoice.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.BatchControlDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesZipDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.VehTypeDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.beans.ModelBean;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAO {
	private SessionFactory sessionFactory = null;

    Logger logger = Logger.getLogger(CommonDAO.class.toString());

	public CommonDAO() {
        super();
        sessionFactory = HibernateAnnotationUtil.getSessionFactory();
    }
	

	
	@SuppressWarnings("unchecked")
	public AgBuTableDTO  getAgencyBureauAccess(UserAccountDTO dto)  {
		Transaction transaction = null;
		AgBuTableDTO result = null;
    	
      	String stringQuery=" select Decentralized as decentralized," +
                " MultiRecordFile_Flag as multiRecordFileFlag , "+
				" Proprietary as proprietary, "+
                " Flg_1122  as flg1122 "+               
		    " from AgBu_Table "+
	     " where Agency_Code = :agencyCode and "+
		      " Bureau_Code =  :bureauCode ";
	  
	  
    	
     	try{
     	   	Session session = sessionFactory.getCurrentSession();
        	transaction = session.beginTransaction();
     		Query query =  session.createSQLQuery(stringQuery)
            .addScalar("decentralized",Hibernate.STRING)
            .addScalar("multiRecordFileFlag",Hibernate.STRING)
            .addScalar("proprietary",Hibernate.STRING)
            .addScalar("flg1122",Hibernate.STRING)
            .setResultTransformer(Transformers.aliasToBean(AgBuTableDTO.class));
     		query.setParameter("agencyCode", dto.getAgencyCode());
			query.setParameter("bureauCode", dto.getBureauCode());
     		
     		
     		result = (AgBuTableDTO) query.uniqueResult();
            transaction.commit();
     	}     
                
     	catch (Exception ex) { 
            if (transaction != null) {
            	transaction.rollback();
	    		logger.info("Exception while retrieving VehTypeDTO : " + ex.getMessage());
            }
           
                
        }
        
       return result;
   }      	          

	


	
	
	//Veh_Type list  AutoChoice
		@SuppressWarnings("unchecked")
		public List<VehTypeDTO> getVehTypeAutoChoiceList(String proprietary)  {
			Transaction transaction = null;
	    	List<VehTypeDTO> result = null;
	    	String stringQuery ="";
	      	
	    	
	    	if (!proprietary.equals("Y")) {
	    	  stringQuery="Select Distinct Veh_Type  as vehType, Description as description, Group_Veh_Type as groupVehType," +
	      						"Group_Description as groupDescription from Veh_Type " +
	      						"Where Status ='Y' and Open_For_Internet ='Y' Order by  Group_Veh_Type,Veh_Type";			   

	    	}	
	        else {
	      	stringQuery=" select distinct Veh_Type.Veh_Type as vehType, "+
	                " Veh_Type.DESCRIPTION as description, "+
	                " Veh_Type.Group_Veh_Type as groupVehType, "+
	                " veh_Type.Group_Description as groupDescription "+
	    	        "  From  Contract,"+
	    	        "  Contr_line,"+
	    	        "  Std_items,"+
	    	        "  Veh_Type "+
	                "  where   Contract.For_Public_Internet in ('P') and "+
	    		    "  Contract.Contract = Contr_Line.Contract and "+
	    		    "  Contr_Line.Std_Item = Std_items.Std_Item and "+
	                "  Contr_Line.Active_Line = 'Y' and "+
	    		    "  Std_items.Veh_type  = Veh_Type.Veh_Type and "+
	    		    "  Std_items.Status ='Y'	  and "+
	                "  Contract.Expire_Date  >= now() " +	
	    	      	"  Order by    Group_Description,Group_Veh_Type,Veh_Type ";
	    	    	

	        }
	      	
	     	try{
	     		
			Session session = sessionFactory.getCurrentSession();
		    transaction = session.beginTransaction();
	
	    	Query query =  session.createSQLQuery(stringQuery)
	            .addScalar("vehType",Hibernate.STRING)
	            .addScalar("description",Hibernate.STRING)
	            .addScalar("groupVehType",Hibernate.STRING)
	            .addScalar("groupDescription",Hibernate.STRING)
	            .setResultTransformer(Transformers.aliasToBean(VehTypeDTO.class));
	            result = (List<VehTypeDTO>) query.list();
	            transaction.commit();
	     	}     
	                
	     	catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	        		logger.info("Exception while retrieving VehTypeDTO : " + e.getMessage());
	            }
	           
	                
	        }
	        
	       return result;
	   }      	          

		
			

		@SuppressWarnings("unchecked")
		public List<StdItemDTO> getQuickStdItem(String flag1122)  {
	    	List<StdItemDTO> result = null;
	    	Transaction transaction = null;
	      	String stringQuery="  SELECT  DISTINCT Std_items.Std_Item as stdItem,"+
		          " Std_items.Description as description, "+
				  "  concat(lpad(Std_items.Std_Item,5,' '), ' - ', Std_items.Description)  as stdItemDesc "+
	      	      " FROM Contract, "+
		          " Contr_Line, "+
		          " Std_items  "+
		       " WHERE ( Contract.For_Public_Internet in ('Y', 'D')) and "+
		       "  ( Contract.Contract = Contr_Line.Contract ) and "+
			   "  ( Contr_Line.Std_Item = Std_items.Std_Item ) and "+
		       "  ( Contr_Line.Active_Line = 'Y') and "+
		       "  ( Std_items.Status ='Y') ";
		       
		      if ( flag1122 == "Y") {
		    	  stringQuery = stringQuery + " and  (Contr_Line.Flg_1122 ='Y') ";
		      }
		      
		      stringQuery = stringQuery + " Order by Std_items.Std_Item ";

	    	
	     	try{
		    	Session session = sessionFactory.getCurrentSession();
		        transaction = session.beginTransaction();
	     		Query query =  session.createSQLQuery(stringQuery)
	            .addScalar("stdItem",Hibernate.STRING)
	            .addScalar("description",Hibernate.STRING)
	            .addScalar("stdItemDesc",Hibernate.STRING)
	            .setResultTransformer(Transformers.aliasToBean(StdItemDTO.class));
	            result = (List<StdItemDTO>) query.list();
	            transaction.commit();
	     	}     
	                
	     	catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	        		logger.info("Exception while retrieving VehType : " + e.getMessage());
	            }
	           
	                
	        }
	        
	       return result;
	   }      	          

		
		@SuppressWarnings("unchecked")
		public BatchControlDTO  getBatchControl(String type)  {
			Transaction transaction = null;
			BatchControlDTO result = null;
	    	
	      	String stringQuery=" Select Batch_Control.OrderNo as orderNumber	"+
	      					 "	From Batch_Control "+
		                     "  Where Batch_Control.Type = :type ";
 
	    	
	     	try{
	     	   	Session session = sessionFactory.getCurrentSession();
	        	transaction = session.beginTransaction();
	     		Query query =  session.createSQLQuery(stringQuery)
	            .addScalar("orderNumber",Hibernate.INTEGER)
	            .setResultTransformer(Transformers.aliasToBean(BatchControlDTO.class));
	     		query.setParameter("type", type);
	     		result = (BatchControlDTO )query.uniqueResult();
	            transaction.commit();
	     	}     
	                
	     	catch (Exception ex) { 
	            if (transaction != null) {
	            	transaction.rollback();
		    		logger.info("Exception while retrieving Batch Control : " + ex.getMessage());
	            }
	           
	                
	        }
	        
	       return result;
	   }      	          




		@SuppressWarnings("unchecked")
		public List<ModelBean> getModelList(StdItemDTO stdItem) {
			List<ModelBean> result = null;
			Transaction transaction = null;
			String stringQuery = "SELECT A.Manufacturer_Name as manufacturerName, "
					+ "Model_GroupDUNS.Description as modelGroupDUNSDescription, "
					+ "Contr_Line.Description as contrLineDescription, "
					+ "Contr_Line.Contract as contract,  "
					+ "Contr_Line.Sch_Line as schLine "
					+ "FROM Contr_Line, Contract, ContrDUNS,Group_DUNS,Model,Model_GroupDUNS, Group_DUNS A  "
					+ "WHERE  "
					+ "( Contr_Line.Std_Item = :stdItem  )  and  "
					+ "( Contr_Line.Contract = Contract.Contract ) and  "
					+ "( Contr_Line.Std_Item = Model.Std_Item ) and  "
					+ "( ContrDUNS.Contr_DUNS = Contract.Contr_DUNS ) and  "
					+ "( Contr_Line.Model = Model.Model ) and    "
					+ "( Model_GroupDuns.Model = Model.Model ) and  "
					+ "( Group_DUNS.Group_DUNS = Model_GroupDuns.Group_DUNS ) and  "
					+ "(  A.Group_DUNS  =ContrDUNS.Group_DUNS ) and ";

			if (stdItem.getProprietary().equals('P')) {
				stringQuery = stringQuery
						+ " (Contract.For_Public_Internet in ('P'))  ";
			} else {
				stringQuery = stringQuery
						+ "  ( Contract.For_Public_Internet = 'Y' or Contract.For_Public_Internet = 'D' )  ";
			}

			stringQuery = stringQuery + " Order by manufacturerName";
			
			try {
				Session session = sessionFactory.getCurrentSession();
				transaction = session.beginTransaction();
				Query query = session
						.createSQLQuery(stringQuery)
						.addScalar("manufacturerName", Hibernate.STRING)
						.addScalar("modelGroupDUNSDescription", Hibernate.STRING)
						.addScalar("contrLineDescription", Hibernate.STRING)
						.addScalar("contract", Hibernate.STRING)
						.addScalar("schLine", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(ModelBean.class));
				query.setParameter("stdItem", stdItem.getStdItem());
				result = (List<ModelBean>) query.list();
				transaction.commit();
			}

			catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
					logger.info("Exception while retrieving VehType : "
							+ e.getMessage());
				}

			}

			return result;
		}

		@SuppressWarnings("unchecked")
	public List<StatesDTO> getStateList(String country) {
		List<StatesDTO> result = null;
		Transaction transaction = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = (session
					.createQuery("from StatesDTO where country =:country order by stateName"));
			query.setParameter("country", country);
			result = (List<StatesDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving states : "
						+ e.getMessage());
			}

		}
		return result;

	}
		
	@SuppressWarnings("unchecked")
	public List<StatesZipDTO> fetchStateZipList(List<String> stateList) {
		List<StatesZipDTO> result = new ArrayList<StatesZipDTO>();
		Transaction transaction = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = (session
					.createQuery("FROM StatesZipDTO where state in (:stateList) order by state"));
			query.setParameterList("stateList", stateList);
			result = (List<StatesZipDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving state zip list : "
						+ e.getMessage());
			}
		}
		return result;
	}
		

		
		
}
