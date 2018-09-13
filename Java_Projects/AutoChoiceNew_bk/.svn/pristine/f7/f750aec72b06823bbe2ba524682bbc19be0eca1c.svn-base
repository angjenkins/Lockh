package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.BidLinePictureDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsTableDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.beans.ModelBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrDeviationDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptCheckDTO;





import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

@Repository
public class ConflictDAO implements Serializable{

private SessionFactory sessionFactory = null;
	

    Logger logger = Logger.getLogger(OrderDAO.class.toString());


	public ConflictDAO() {
        super();
        sessionFactory = HibernateAnnotationUtil.getSessionFactory();
    }

		

		@SuppressWarnings("unchecked")
		public List<ContrLineDTO> getContractLineList(String stdItem,String proprietaryContract,String flag1122)  {
		  	List<ContrLineDTO> result = null;
	    	Transaction transaction = null;
	      	String stringQuery=" SELECT distinct " +
			                   " Contr_Line.Contract as contract ," +
 	      					   " Contr_Line.Sch_Line as sch_Line ," +
	      			           " Contr_Line.Std_Item as stdItem, " +
	      			           " Contr_Line.MPG_B as mpgB, " +
	      			           " Contr_Line.MPG_C as mpgC, " +
	      			           " Contr_Line.MPG_H as mpgH, "+
                               " Contr_Line.Flg_1122 as flag1122, " +
                               " Contr_Line.Grams_Per_Mile as gramsPerMile, " +
                               " Contr_Line.ModelYYYY  as modelYYYY, "+
                               " Contr_Line.Allow_Ordering as allowOrder," +
                               " Contr_Line.Active_Line as activeLine," +
                               " Contr_Line.Open_Date as openDate, "+
                               " Contr_Line.Current_Unit_Price as currUnitPrice," +
                               " Contr_Line.Description as description, "+
                               " Std_items.Description as stdItemDescription," +
                               " Contr_Line.Contract as contract, "+
                               " ContrDUNS.Contr_Full_Name as contrFullName," +
                               " Contract.Contract_Sc as contractSc, "+
                               " A.Manufacturer_Name as manufacturerName," +
                               " Model_GroupDuns.Description as modelDescripton," +
                               " '' as fedValueNext, "+
                               " Model.Model as modelCode," +
                               " Contract.FY_Award as contractFYAward, "+
                               " Contr_Line.State50 as state50 "+
                               
                               " FROM Contract," +
                               "      Contr_Line," +
                               "      Std_items," +
                               "      ContrDUNS, Model, Model_GroupDuns, Group_DUNS, Group_DUNS A "+
                               "  WHERE ";
	
	      	
	      	        if (proprietaryContract.equals("Y")  ){
	      	             stringQuery = stringQuery + " (Contract.For_Public_Internet = 'P') and ";
	      	        }
	      	        else {
	      	        	stringQuery = stringQuery + " ( Contract.For_Public_Internet = 'Y' or Contract.For_Public_Internet = 'D' ) and ";
	      	        } 
	      	        
	      	         stringQuery = stringQuery + " 	( Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ) and "+
	      	        		" ( Contract.Contract = Contr_Line.Contract ) and "+
	      	        		" ( Contr_Line.Model = Model.Model) and "+
	      	        		" ( Contr_Line.Std_Item = :stdItem) and "+
	      	        		" ( Contr_Line.Active_Line = 'Y') and "+
	      	        		" ( Contr_Line.Std_Item = Std_items.Std_Item ) and "+
	      	        		" ( Contr_Line.Std_Item = Model.Std_Item) and "+
	      	        		" ( Model_GroupDuns.Model = Model.Model ) and "+
	      	        		" ( Group_DUNS.Group_DUNS = Model_GroupDuns.Group_DUNS ) and "+ 
	      	        		" ( A.Group_DUNS = ContrDUNS.Group_DUNS ) ";
	      	        
	      	        		
	      	   		if ( flag1122.equals("Y")){
	      	        		 stringQuery = stringQuery + " and	( Contr_Line.Flg_1122 ='Y') ";
		
	      	   		}		
	      	   		
	      	   		
	      	   		

	    	     	try{
	    		    	Session session = sessionFactory.getCurrentSession();
	    		        transaction = session.beginTransaction();
	    	     		Query query =  session.createSQLQuery(stringQuery)
	    	            .addScalar("contract",Hibernate.STRING)
	    	            .addScalar("sch_Line",Hibernate.STRING)
	    	            .addScalar("stdItem",Hibernate.STRING)
	    	            .addScalar("mpgB",Hibernate.STRING)
	    	            .addScalar("mpgC",Hibernate.STRING)
	    	            .addScalar("mpgH",Hibernate.STRING)
	    	            .addScalar("flag1122",Hibernate.STRING)
	    	            .addScalar("gramsPerMile",Hibernate.STRING)
	                    .addScalar("modelYYYY",Hibernate.STRING)
	                    .addScalar("allowOrder",Hibernate.STRING)
	                    .addScalar("activeLine",Hibernate.STRING)
	                    .addScalar("openDate",Hibernate.TIMESTAMP)
	                    .addScalar("currUnitPrice",Hibernate.DOUBLE)
	                    .addScalar("description",Hibernate.STRING)
	                    .addScalar("contrFullName",Hibernate.STRING)
	                    .addScalar("contractSc",Hibernate.STRING)
	                    .addScalar("manufacturerName",Hibernate.STRING)
	                    .addScalar("modelDescripton",Hibernate.STRING)
	                    .addScalar("fedValueNext",Hibernate.STRING)
	                    .addScalar("modelCode",Hibernate.STRING)
	                    .addScalar("modelDescripton",Hibernate.STRING)
	                    .addScalar("contractFYAward",Hibernate.STRING)
	                    .addScalar("state50",Hibernate.STRING)

	                    
	                    .setResultTransformer(Transformers.aliasToBean(ContrLineDTO.class));
	    	        	query.setParameter("stdItem", stdItem);
	    	            result = (List<ContrLineDTO>) query.list();
	    	 	       	
	    	            transaction.commit();
	    	     	}     
	    	                
	    	     	catch (Exception ex) { 
	    	            if (transaction != null) {
	    	            	transaction.rollback();
	    		    		logger.info("Exception while retrieving Std Item : " + ex.getMessage());
	    	            }
	    	           
	    	                
	    	        }
	    	        
	    	       return result;

	      	   		
		}
		
		public List<ContrLineOptionDTO> getContrLineOptionList(List<String> contract,List<String> schLine,
				String paramflag, List<String> optionsList) {
			
			List<ContrLineOptionDTO> result = null;
			Transaction transaction = null;
			String stringQuery = " Select "
					+ "  Contr_line_Option.Contract as Contract, "
					+ "  Contr_line_Option.Sch_Line as Sch_Line, "
					+ "  Contr_line_Option.Option_Code as Option_Code, "
					+ "  Options_Table.Description as description, "
					+ "  Contr_line_Option.Current_Unit_Price as currUnitPrice,"
					+ "  Contr_line_Option.Option_MSRP_Price as optionMSRPPrice, "
					+ "  Contr_line_Option.Option_Invoice_Price  as optionInvPrice,"
					+ "  Options_Table.Category_Code as optionCategoryCode,"
					+ "  Options_Table.MPG_Flag as mpgFlag, "
					+ "  Contr_Line_Option.MPG_C as mpgC, "
					+ "  Contr_Line_Option.MPG_B as mpgB, "
					+ "  Contr_Line_Option.MPG_H as mpgH, "
					+ "  Contr_Line_Option.Grams_Per_Mile as gramsPerMile, "
					+ "  Options_Table.Valid_Qty as validQty, "
					+ "  Contr_line_Option.Other_Specs as otherSpecs, "
					+ "  Contr_line_Option.Add_Ship_Days as addShipDays "
					+ "  From Contr_line_Option ,"
					+ "  Options_Table  "
					+ "  Where Contr_line_Option.Contract in (:contract) and "
					+ "  Contr_line_Option.Sch_Line  in (:schline)  and "
					+ "  Contr_line_Option.Option_Code = Options_Table.Option_Code ";

			if (paramflag.equals("1")) {
				stringQuery = stringQuery
						+ " and Contr_line_Option.Option_Code in (:optionsList) ";

			}

			stringQuery = stringQuery + " Order By Contr_line_Option.Option_Code ";

			try {
				Session session = sessionFactory.getCurrentSession();
				transaction = session.beginTransaction();
				Query query = session
						.createSQLQuery(stringQuery)
						.addScalar("Contract", Hibernate.STRING)
						.addScalar("Sch_Line", Hibernate.STRING)
						.addScalar("Option_Code", Hibernate.STRING)
						.addScalar("description", Hibernate.STRING)
						.addScalar("currUnitPrice", Hibernate.DOUBLE)
						.addScalar("optionMSRPPrice", Hibernate.DOUBLE)
						.addScalar("optionInvPrice", Hibernate.DOUBLE)
						.addScalar("optionCategoryCode", Hibernate.STRING)
						.addScalar("mpgFlag", Hibernate.STRING)
						.addScalar("mpgC", Hibernate.STRING)
						.addScalar("mpgB", Hibernate.STRING)
						.addScalar("mpgH", Hibernate.STRING)
						.addScalar("gramsPerMile", Hibernate.STRING)					
						.addScalar("validQty", Hibernate.STRING)
						.addScalar("otherSpecs", Hibernate.STRING)
						.addScalar("addShipDays", Hibernate.INTEGER) 

						.setResultTransformer(
								Transformers.aliasToBean(ContrLineOptionDTO.class));
				query.setParameterList("contract", contract);
				query.setParameterList("schline", schLine);
				if (paramflag.equals("1")) {
					query.setParameterList("optionsList", optionsList);

				}
				result = (List<ContrLineOptionDTO>) query.list();

				transaction.commit();
			}

			catch (Exception ex) {
				if (transaction != null) {
					transaction.rollback();
					logger.info("Exception while retrieving Contrline Option : "
							+ ex.getMessage());
				}

			}

			return result;

		}


		
		
		
		public List<ContrLineOptCheckDTO> getContrOptionCheckerList(String contract,
				String schline, List<String> optionCheckedList, String checkerType, String sqlFlag) {

			List<ContrLineOptCheckDTO> result = null;
			Transaction transaction = null;
			String stringQuery = " SELECT DISTINCT Contr_line_Option.Contract as contract," 
					+ " Contr_line_Option.Sch_Line as sch_Line,"
					+ " Contr_line_Option_Checker.Option_Code as option_Code, "
					+ " Contr_line_Option_Checker.Checker_Type as checkerType, " 
					+ " Contr_line_Option_Checker.Sequence as sequence, "
					+ " Contr_line_Option_Checker.Option_Checked  as option_Checked, "
					+ " Contr_line_Option.Current_Unit_Price as  unitPrice "
					+ " FROM Contr_line_Option_Checker, Contr_line_Option "
					+ " WHERE ( Contr_line_Option_Checker.Contract = :contract ) AND "
					+ " ( Contr_line_Option_Checker.Sch_Line = :schline ) AND "
					+ "  ( Contr_line_Option_Checker.Checker_Type = :checkerType ) AND " 
					+ "  ( Contr_line_Option_Checker.Option_Code in (:optionCheckedList)) and  " ;
					
			        if (sqlFlag.equals("1")){
			        	
			        	stringQuery = stringQuery + "  ( Contr_line_Option_Checker.Option_Checked in (:optionCheckedList)) and  " ;
			        }
			         	
			        stringQuery = stringQuery + "  ( Contr_line_Option_Checker.Contract = Contr_line_Option.Contract ) and ( Contr_line_Option_Checker.Sch_Line = Contr_line_Option.Sch_Line ) and  "
					+ " ( Contr_line_Option_Checker.Option_Checked = Contr_line_Option.Option_Code )  "
					+ " ORDER BY Contr_line_Option_Checker.Option_Code ASC, Contr_line_Option_Checker.Sequence ASC  ";

			try {
				Session session = sessionFactory.getCurrentSession();
				transaction = session.beginTransaction();
				Query query = session
						.createSQLQuery(stringQuery)
						.addScalar("contract", Hibernate.STRING)
						.addScalar("sch_Line", Hibernate.STRING)
						.addScalar("option_Code", Hibernate.STRING)
						.addScalar("checkerType", Hibernate.STRING)
						.addScalar("option_Checked", Hibernate.STRING)
						.addScalar("sequence", Hibernate.INTEGER)
						.addScalar("unitPrice", Hibernate.DOUBLE)

						.setResultTransformer(
								Transformers.aliasToBean(ContrLineOptCheckDTO.class));
				query.setParameter("contract", contract);
				query.setParameter("schline", schline);
				query.setParameter("checkerType", checkerType);
				query.setParameterList("optionCheckedList", optionCheckedList);

				result = (List<ContrLineOptCheckDTO>) query.list();

				transaction.commit();
			}

			catch (Exception ex) {
				if (transaction != null) {
					transaction.rollback();
					logger.info("Exception while retrieving ContrLineOptCheckDTO : "
							+ ex.getMessage());
				}

			}

			return result;

		}

		@SuppressWarnings("unchecked")
		public List<OptionsTableDTO> geOptionList(List<String> optionsList)  {
		
		List<OptionsTableDTO> result = null;
	    Transaction transaction = null;
		String stringQuery= " Select " +
				            "  Options_Table.Category_Code as categoryCode," +
				            "  Options_Table.Option_Code as optionCode," +
				            "  Options_Table.Valid_Qty as validQty, " +
				            "  Options_Table.Description as description " +
	                        "  From Options_Table  " +
	                        "  Where " +
	                        "  Options_Table.Option_Code in (:optionsList)";
	
		try{
	    	Session session = sessionFactory.getCurrentSession();
	        transaction = session.beginTransaction();
     		Query query =  session.createSQLQuery(stringQuery)
     		.addScalar("categoryCode",Hibernate.STRING)
            .addScalar("optionCode",Hibernate.STRING)
            .addScalar("validQty",Hibernate.STRING)
            .addScalar("description",Hibernate.STRING)
            .setResultTransformer(Transformers.aliasToBean(OptionsTableDTO.class));
        	query.setParameterList("optionsList", optionsList);
        	result = (List<OptionsTableDTO>) query.list();
 	       	
            transaction.commit();
     	}     
                
     	catch (Exception ex) { 
            if (transaction != null) {
            	transaction.rollback();
	    		logger.info("Exception while retrieving OptionsTable : " + ex.getMessage());
            }
           
                
        }
      
         return result;

		}
		
		

		
		
}
 