package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.BidLinePictureDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.FileUploadDTO;
import gov.gsa.fas.AutoChoice.DTO.GroupDunsDealerLocDTO;
import gov.gsa.fas.AutoChoice.DTO.ModelColorDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionFileCartDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsCategoryDTO;
import gov.gsa.fas.AutoChoice.DTO.OptionsTableDTO;
import gov.gsa.fas.AutoChoice.DTO.ReqDetailCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartColorDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsDTO;
import gov.gsa.fas.AutoChoice.DTO.RequisitionsJustDTO;
import gov.gsa.fas.AutoChoice.DTO.StatesDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemOptionDTO;
import gov.gsa.fas.AutoChoice.DTO.ContrLineDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemVerbiageDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAgBuReportDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAuditTrailDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.beans.ModelBean;
import gov.gsa.fas.AutoChoice.beans.OrderBean;
import gov.gsa.fas.AutoChoice.beans.OtherfeaturesBean;
import gov.gsa.fas.AutoChoice.beans.OtherfeaturesValueBean;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.util.UtilsLib;
import gov.gsa.fas.AutoChoice.DTO.ContrDeviationDTO;

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
public class OrderDAO implements Serializable {

	private SessionFactory sessionFactory = null;

	Logger logger = Logger.getLogger(OrderDAO.class.toString());

	public OrderDAO() {
		super();
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	}

	@SuppressWarnings("unchecked")
    public List<StdItemVerbiageDTO>  getStdItemVerbiageRecordsList(String stdItem){
		Transaction transaction =null;    	List<StdItemVerbiageDTO> result = null;
    try {
     	Session session = sessionFactory.getCurrentSession();
    	transaction = session.beginTransaction();
		Query query = (session.createQuery("from StdItemVerbiageDTO where Std_Item = :stdItem  and Flag_Current =:flagCurrent" ));
 	    query.setParameter("stdItem",stdItem);
 	    query.setParameter("flagCurrent","Y");	
 	    result = (List<StdItemVerbiageDTO>) query.list();
        transaction.commit();
        
       
        
	   }
   	catch (Exception e) { 
        if (transaction != null) {
        	transaction.rollback();
        	System.out.println("Select StdItemVerbiageDTO failed: " + e.getMessage());            	
        }
    }
   return result;        
   }
	

	
	
	@SuppressWarnings("unchecked")
	public List<StdItemDTO> getStdItemList(String flag1122, String vehType) {
		List<StdItemDTO> result = null;
		Transaction transaction = null;
		String stringQuery = "  SELECT  DISTINCT Std_items.Std_Item as stdItem,"
				+ " Std_items.Description as description, "
				+ " concat(Std_items.Std_Item,'-',Std_items.Description) as stdItemDesc, "
				+ " Veh_Type.Veh_Type as vehType, "
				+ " Veh_Type.DESCRIPTION  as vehDescription "
				+ " FROM Contract, "
				+ " Contr_Line, "
				+ " Std_items,  "
				+ " Veh_Type  "
				+ " WHERE ( Contract.For_Public_Internet in ('Y', 'D')) and "
				+ "  ( Contract.Contract = Contr_Line.Contract ) and "
				+ "  ( Contr_Line.Std_Item = Std_items.Std_Item ) and "
				+ "  ( Contr_Line.Active_Line = 'Y') and "
				+ "  ( Std_items.Veh_Type = Veh_Type.Veh_Type) and "
				+ "  ( Std_items.Status ='Y') and "
				+ "  ( Std_items.Veh_Type =:vehType) ";

		if (flag1122 == "Y") {
			stringQuery = stringQuery + " and  (Contr_Line.Flg_1122 ='Y') ";
		}

		stringQuery = stringQuery + " Order by Std_items.Std_Item ";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)
					.addScalar("stdItemDesc", Hibernate.STRING)
					.addScalar("vehType", Hibernate.STRING)
					.addScalar("vehDescription", Hibernate.STRING)

					.setResultTransformer(
							Transformers.aliasToBean(StdItemDTO.class));
			query.setParameter("vehType", vehType);
			result = (List<StdItemDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Std Item : "
						+ ex.getMessage());
			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<StdItemOptionDTO> getOptionsList(String stdItem,
			String proprietaryContract) {
		List<StdItemOptionDTO> result = null;
		Transaction transaction = null;
		String stringQuery = "	SELECT Distinct  straight_join   Contr_line_Option.Option_Code as option_Code, "
				+ " Options_Table.Description as optionsTableDescription,"
				+ " Options_Table.Category_Code as optionsCategoryCode, "
				+ " Options_Table.Sequence as optionsTableSequence, "
				+ " Options_Table.Valid_Qty as optionsTableValidQty, "
				+ " Options_Category.Selection_Type as optionsCategorySelectionType, "
				+ " Options_Category.Category_Name as optionsCategoryName, "
				+ " Options_Category.Sequence as optionsCategorySequence, "
				+ " Std_Itm_Options.Flag_Std "
				+ " FROM Contract, "
				+ " Contr_Line,"
				+ " Contr_line_Option, "
				+ " Options_Category, "
				+ " Options_Table, "
				+ " Std_Itm_Options "
				+ " WHERE  ( Contract.Contract = Contr_Line.Contract ) and "
				+ " ( Contract.Contract = Contr_Line.Contract ) and ";

		if (proprietaryContract.equals("Y")) {
			stringQuery = stringQuery
					+ " (Contract.For_Public_Internet = 'P') and ";
		} else {
			stringQuery = stringQuery
					+ " ( Contract.For_Public_Internet = 'Y' or Contract.For_Public_Internet = 'D' ) and ";
		}

		stringQuery = stringQuery
				+ " ( Contract.Expire_Date >=  Current_Date()) and "
				+ " ( Contr_Line.Contract = Contr_line_Option.Contract  ) and "
				+ " ( Contr_Line.Sch_Line = Contr_line_Option.Sch_Line ) and "
				+ " ( Contr_Line.Std_Item = Std_Itm_Options.Std_Item ) and "
				+ " ( Contr_Line.Active_Line = 'Y' )    and "
				+ " ( trim(Contr_Line.Std_Item) = trim(:stdItem)) and "
				+ " ( Contr_line_Option.Option_Code = Options_Table.Option_Code ) and "
				+ " ( Contr_line_Option.Option_Code =Std_Itm_Options.Option_Code ) and "
				+ " ( Contr_line_Option.OEM_Option_Type <> 'X') and "
				+ " ( Options_Category.Category_Code = Options_Table.Category_Code) and "
				+ " ( Options_Table.Category_Code <> 'Export' ) and "
				+ " ( Std_Itm_Options.Flag_Std ='N') "
				+ " ORDER BY  optionsCategorySequence,optionsCategoryCode,Flag_Std,optionsTableSequence asc ";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("option_Code", Hibernate.STRING)
					.addScalar("optionsTableDescription", Hibernate.STRING)
					.addScalar("optionsCategoryCode", Hibernate.STRING)
					.addScalar("optionsTableSequence", Hibernate.INTEGER)
					.addScalar("optionsTableValidQty", Hibernate.STRING)
					.addScalar("optionsCategorySelectionType", Hibernate.STRING)
					.addScalar("optionsCategoryName", Hibernate.STRING)
					.addScalar("optionsCategorySequence", Hibernate.INTEGER)

					.setResultTransformer(
							Transformers.aliasToBean(StdItemOptionDTO.class));
			query.setParameter("stdItem", stdItem);
			result = (List<StdItemOptionDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Std Item : "
						+ ex.getMessage());
			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<ContrLineDTO> getContractLineList(String stdItem,
			String proprietaryContract, String flag1122) {
		List<ContrLineDTO> result = null;
		Transaction transaction = null;
		String stringQuery = " SELECT distinct "
				+ " Contr_Line.Contract as contract ,"
				+ " Contr_Line.Sch_Line as sch_Line ,"
				+ " Contr_Line.Std_Item as stdItem, "
				+ " Contr_Line.MPG_B as mpgB, "
				+ " Contr_Line.MPG_C as mpgC, "
				+ " Contr_Line.MPG_H as mpgH, "
				+ " Contr_Line.Flg_1122 as flag1122, "
				+ " Contr_Line.Grams_Per_Mile as gramsPerMile, "
				+ " Contr_Line.ModelYYYY  as modelYYYY, "
				+ " Contr_Line.Allow_Ordering as allowOrder,"
				+ " Contr_Line.Active_Line as activeLine,"
				+ " Contr_Line.Open_Date as openDate, "
				+ " Contr_Line.Current_Unit_Price as currUnitPrice,"
				+ " Contr_Line.Description as description, "
				+ " Std_items.Description as stdItemDescription,"
				+ " Contr_Line.Contract as contract, "
				+ " ContrDUNS.Contr_Full_Name as contrFullName,"
				+ " Contract.Contract_Sc as contractSc, "
				+ " A.Manufacturer_Name as manufacturerName,"
				+ " Model_GroupDuns.Description as modelDescripton,"
				+ " '' as fedValueNext, "
				+ " Model.Model as modelCode,"
				+ " Contract.FY_Award as contractFYAward, "
				+ " Contr_Line.State50 as state50,"
				+ " Contr_Line.Ship_Days as shipDays " 
				+ " FROM Contract,"
				+ "      Contr_Line,"
				+ "      Std_items,"
				+ "      ContrDUNS, Model, Model_GroupDuns, Group_DUNS, Group_DUNS A "
				+ "  WHERE ";

		if (proprietaryContract.equals("Y")) {
			stringQuery = stringQuery
					+ " (Contract.For_Public_Internet = 'P') and ";
		} else {
			stringQuery = stringQuery
					+ " ( Contract.For_Public_Internet = 'Y' or Contract.For_Public_Internet = 'D' ) and ";
		}

		stringQuery = stringQuery
				+ " 	( Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ) and "
				+ " ( Contract.Contract = Contr_Line.Contract ) and "
				+ " ( Contr_Line.Model = Model.Model) and "
				+ " ( trim(Contr_Line.Std_Item) = trim(:stdItem)) and "
				+ " ( Contr_Line.Active_Line = 'Y') and "
				+ " ( Contr_Line.Std_Item = Std_items.Std_Item ) and "
				+ " ( Contr_Line.Std_Item = Model.Std_Item) and "
				+ " ( Model_GroupDuns.Model = Model.Model ) and "
				+ " ( Group_DUNS.Group_DUNS = Model_GroupDuns.Group_DUNS ) and "
				+ " ( A.Group_DUNS = ContrDUNS.Group_DUNS ) ";

		if (flag1122.equals("Y")) {
			stringQuery = stringQuery + " and	( Contr_Line.Flg_1122 ='Y') ";

		}

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("sch_Line", Hibernate.STRING)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("mpgB", Hibernate.STRING)
					.addScalar("mpgC", Hibernate.STRING)
					.addScalar("mpgH", Hibernate.STRING)
					.addScalar("flag1122", Hibernate.STRING)
					.addScalar("gramsPerMile", Hibernate.STRING)
					.addScalar("modelYYYY", Hibernate.STRING)
					.addScalar("allowOrder", Hibernate.STRING)
					.addScalar("activeLine", Hibernate.STRING)
					.addScalar("openDate", Hibernate.TIMESTAMP)
					.addScalar("currUnitPrice", Hibernate.DOUBLE)
					.addScalar("description", Hibernate.STRING)
					.addScalar("contrFullName", Hibernate.STRING)
					.addScalar("contractSc", Hibernate.STRING)
					.addScalar("manufacturerName", Hibernate.STRING)
					.addScalar("modelDescripton", Hibernate.STRING)
					.addScalar("fedValueNext", Hibernate.STRING)
					.addScalar("modelCode", Hibernate.STRING)
					.addScalar("modelDescripton", Hibernate.STRING)
					.addScalar("contractFYAward", Hibernate.STRING)
					.addScalar("state50", Hibernate.STRING)
					.addScalar("shipDays", Hibernate.INTEGER)
					.setResultTransformer(
							Transformers.aliasToBean(ContrLineDTO.class));
			query.setParameter("stdItem", stdItem);
			result = (List<ContrLineDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Std Item : "
						+ ex.getMessage());
			}

		}

		return result;

	}
//	public List<ContrLineOptionDTO> getContrLineOptionList(List<String> contract,List<String> schLine,
//			String paramflag, List<String> optionsList) {
//		
//		List<ContrLineOptionDTO> result = null;
//		Transaction transaction = null;
//		String stringQuery = " Select "
//				+ "  Contr_line_Option.Contract as Contract, "
//				+ "  Contr_line_Option.Sch_Line as Sch_Line, "
//				+ "  Contr_line_Option.Option_Code as Option_Code, "
//				+ "  Options_Table.Description as description, "
//				+ "  Contr_line_Option.Current_Unit_Price as currUnitPrice,"
//				+ "  Contr_line_Option.Option_MSRP_Price as optionMSRPPrice, "
//				+ "  Contr_line_Option.Option_Invoice_Price  as optionInvPrice,"
//				+ "  Options_Table.Category_Code as optionCategoryCode,"
//				+ "  Options_Table.MPG_Flag as mpgFlag, "
//				+ "  Contr_Line_Option.MPG_C as mpgC, "
//				+ "  Contr_Line_Option.MPG_B as mpgB, "
//				+ "  Contr_Line_Option.MPG_H as mpgH, "
//				+ "  Contr_Line_Option.Grams_Per_Mile as gramsPerMile, "
//				+ "  Options_Table.Valid_Qty as validQty, "
//				+ "  Contr_line_Option.Other_Specs as otherSpecs, "
//				+ "  Contr_line_Option.Add_Ship_Days as addShipDays "
//				+ "  From Contr_line_Option ,"
//				+ "  Options_Table  "
//				+ "  Where Contr_line_Option.Contract in (:contract) and "
//				+ "  Contr_line_Option.Sch_Line  in (:schline)  and "
//				+ "  Contr_line_Option.Option_Code = Options_Table.Option_Code ";
//
//		if (paramflag.equals("1")) {
//			stringQuery = stringQuery
//					+ " and Contr_line_Option.Option_Code in (:optionsList) ";
//
//		}
//
//		stringQuery = stringQuery + " Order By Contr_line_Option.Option_Code ";
//
//		try {
//			Session session = sessionFactory.getCurrentSession();
//			transaction = session.beginTransaction();
//			Query query = session
//					.createSQLQuery(stringQuery)
//					.addScalar("Contract", Hibernate.STRING)
//					.addScalar("Sch_Line", Hibernate.STRING)
//					.addScalar("Option_Code", Hibernate.STRING)
//					.addScalar("description", Hibernate.STRING)
//					.addScalar("currUnitPrice", Hibernate.DOUBLE)
//					.addScalar("optionMSRPPrice", Hibernate.DOUBLE)
//					.addScalar("optionInvPrice", Hibernate.DOUBLE)
//					.addScalar("optionCategoryCode", Hibernate.STRING)
//					.addScalar("mpgFlag", Hibernate.STRING)
//					.addScalar("mpgC", Hibernate.STRING)
//					.addScalar("mpgB", Hibernate.STRING)
//					.addScalar("mpgH", Hibernate.STRING)
//					.addScalar("gramsPerMile", Hibernate.STRING)					
//					.addScalar("validQty", Hibernate.STRING)
//					.addScalar("otherSpecs", Hibernate.STRING)
//					.addScalar("addShipDays", Hibernate.INTEGER) 
//
//					.setResultTransformer(
//							Transformers.aliasToBean(ContrLineOptionDTO.class));
//			query.setParameterList("contract", contract);
//			query.setParameterList("schline", schLine);
//			if (paramflag.equals("1")) {
//				query.setParameterList("optionsList", optionsList);
//
//			}
//			result = (List<ContrLineOptionDTO>) query.list();
//
//			transaction.commit();
//		}
//
//		catch (Exception ex) {
//			if (transaction != null) {
//				transaction.rollback();
//				logger.info("Exception while retrieving Contrline Option : "
//						+ ex.getMessage());
//			}
//
//		}
//
//		return result;
//
//	}
//
	@SuppressWarnings("unchecked")
	public List<RequisitionsCartDTO> getRequisitionCart(int caseNo) {

		List<RequisitionsCartDTO> result = null;
		Transaction transaction = null;
		String stringQuery = "  SELECT Requisitions_Cart.Contract as contract,"
				+ "  Requisitions_Cart.Sch_Line as schLine, "
				+ "  Requisitions_Cart.Quantity as quantity, "
				+ "  Requisitions_Cart.Std_Item as stdItem,  "
				+ "  Requisitions_Cart.Est_Unit_Price as estUnitPrice,"
				+ "  Requisitions_Cart.Fed_Mil_Req_No_1 as fedMilReqNo1, "
				+ "  Requisitions_Cart.Fed_Mil_Req_No_2 as fedMilREqNo2,"
				+ "  Requisitions_Cart.Fed_Mil_Req_No_3 as fedMilReqNo3, "
				+ "  Requisitions_Cart.CaseNo_Real as caseNoReal, "
				+ "  Requisitions_Cart.Fair_Opportunity as fairOpp"
				+ "  FROM Requisitions_Cart "
				+ "  WHERE Requisitions_Cart.CaseNo= :caseNo ";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("schLine", Hibernate.STRING)
					.addScalar("quantity", Hibernate.INTEGER)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("estUnitPrice", Hibernate.DOUBLE)
					.addScalar("fedMilReqNo1", Hibernate.STRING)
					.addScalar("fedMilReqNo2", Hibernate.STRING)
					.addScalar("fedMilReqNo3", Hibernate.STRING)
					.addScalar("caseNoReal", Hibernate.STRING)
					.addScalar(" fairOpp", Hibernate.STRING)

					.setResultTransformer(
							Transformers.aliasToBean(RequisitionsCartDTO.class));
			query.setParameter("caseNo", caseNo);
			result = (List<RequisitionsCartDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Std Item : "
						+ ex.getMessage());
			}

		}

		return result;
	}

//	public List<ContrLineOptionDTO> getContrOptionCheckerList(String contract,
//			String schline, String optionCheckedList) {
//
//		List<ContrLineOptionDTO> result = null;
//		Transaction transaction = null;
//		String stringQuery = " SELECT DISTINCT Contr_line_Option_Checker.Option_Code, "
//				+ " Contr_line_Option_Checker.Sequence, "
//				+ " Contr_line_Option_Checker.Option_Checked, "
//				+ " Contr_line_Option.Current_Unit_Price "
//				+ " FROM Contr_line_Option_Checker, Contr_line_Option "
//				+ " WHERE ( Contr_line_Option_Checker.Contract = :contract ) AND "
//				+ " ( Contr_line_Option_Checker.Sch_Line = :schline ) AND "
//				+ "  ( Contr_line_Option_Checker.Checker_Type = 'R' ) AND "
//				+ "  ( Contr_line_Option_Checker.Option_Code in (:optionCheckedList)) and  "
//				+ "  ( Contr_line_Option_Checker.Contract = Contr_line_Option.Contract ) and ( Contr_line_Option_Checker.Sch_Line = Contr_line_Option.Sch_Line ) and  "
//				+ " ( Contr_line_Option_Checker.Option_Checked = Contr_line_Option.Option_Code )  "
//				+ " ORDER BY Contr_line_Option_Checker.Option_Code ASC, Contr_line_Option_Checker.Sequence ASC  ";
//
//		try {
//			Session session = sessionFactory.getCurrentSession();
//			transaction = session.beginTransaction();
//			Query query = session
//					.createSQLQuery(stringQuery)
//					.addScalar("contract", Hibernate.STRING)
//					.addScalar("sch_Line", Hibernate.STRING)
//					.addScalar("option_Code", Hibernate.STRING)
//					.addScalar("description", Hibernate.INTEGER)
//					.addScalar("currentUnitPrice", Hibernate.DOUBLE)
//					.addScalar("optionMSRPPrice", Hibernate.DOUBLE)
//					.addScalar("optionInvPrice", Hibernate.DOUBLE)
//					.addScalar("optionCategoryCode", Hibernate.STRING)
//					.addScalar("validQty", Hibernate.INTEGER)
//					.addScalar("otherSpecs", Hibernate.STRING)
//
//					.setResultTransformer(
//							Transformers.aliasToBean(ContrLineOptionDTO.class));
//			query.setParameter("contract", contract);
//			query.setParameter("schline", schline);
//			query.setParameter("optionCheckedList", optionCheckedList);
//
//			result = (List<ContrLineOptionDTO>) query.list();
//
//			transaction.commit();
//		}
//
//		catch (Exception ex) {
//			if (transaction != null) {
//				transaction.rollback();
//				logger.info("Exception while retrieving Std Item : "
//						+ ex.getMessage());
//			}
//
//		}
//
//		return result;
//
//	}

	@SuppressWarnings("unchecked")
	public List<ContrDeviationDTO> getClarificationEmissionList(
			List<ModelBean> model, String cOre) {

		List<ContrDeviationDTO> result = null;
		List<String> contract = new ArrayList<String>();
		List<String> schLine = new ArrayList<String>();

		for (ModelBean tmpModel : model) {
			contract.add(tmpModel.getContract());
			schLine.add(tmpModel.getSchLine());
		}

		Transaction transaction = null;
		String stringQuery = "SELECT Contr_Deviation.Contract as contract,"
				+ "Contr_Deviation.Sch_Line as sch_Line, "
				+ "Contr_Deviation.Line_Number as line_Number, "
				+ "Contr_Deviation.Description as 'desc' "
				+ "FROM Contr_Deviation "
				+ "WHERE ( Contr_Deviation.Contract in(:contract)  ) AND "
				+ "( Contr_Deviation.Sch_Line in(:schLine) ) AND "
				+ "( ucase(Contr_Deviation.Description) <> 'NONE') AND "
				+ "( Contr_Deviation.Dev_Flag = :cOre ) "
				+ "Order By contract,sch_Line,line_Number";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("sch_Line", Hibernate.STRING)
					.addScalar("line_Number", Hibernate.DOUBLE)
					.addScalar("desc", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(ContrDeviationDTO.class));

			query.setParameterList("contract", contract);
			query.setParameterList("schLine", schLine);
			query.setParameter("cOre", cOre);

			result = (List<ContrDeviationDTO>) query.list();
			transaction.commit();
		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Clarificcation Emission List : "
						+ e.getMessage());
			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<ContrDeviationDTO> getOemClarificationList(OrderBean orderBean) {

		List<ContrDeviationDTO> result = null;

		Transaction transaction = null;
		String stringQuery = "SELECT Contr_Deviation.Contract as contract,"
				+ "Contr_Deviation.Sch_Line as sch_Line, "
				+ "Contr_Deviation.Line_Number as line_Number, "
				+ "Contr_Deviation.Description as 'desc' "
				+ "FROM Contr_Deviation "
				+ "WHERE ( Contr_Deviation.Contract =:contract  ) AND "
				+ "( Contr_Deviation.Sch_Line =:schLine ) AND "
				+ "( ucase(Contr_Deviation.Description) <> 'NONE') "
				+ "Order By contract,sch_Line,line_Number";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("sch_Line", Hibernate.STRING)
					.addScalar("line_Number", Hibernate.DOUBLE)
					.addScalar("desc", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(ContrDeviationDTO.class));

			// query.setParameter("contract",orderBean.getStdItemDTO().getContract());
			// query.setParameter("schLine",orderBean.getStdItemDTO().getSchLine());
			query.setParameter("contract", orderBean.getContrLineDTO().getContract());
			query.setParameter("schLine", orderBean.getContrLineDTO().getSch_Line());

			result = (List<ContrDeviationDTO>) query.list();
			transaction.commit();
		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Clarificcation Emission List : "
						+ e.getMessage());
			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public StdItemDTO getStdItemDTO(String stdItem) {
		Transaction transaction = null;
		List<StdItemDTO> result = null;
		StdItemDTO dto = null;

		String stringQuery = "SELECT Std_Item as stdItem , "
				+ " Description as description, " + " Veh_Type as vehType "
				+ " FROM  std_items "
				+ " Where trim(Std_Item) = trim(:stdItem) ";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)
					.addScalar("vehType", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(StdItemDTO.class));
			query.setParameter("stdItem", stdItem);

			dto = (StdItemDTO) query.uniqueResult();
			transaction.commit();

		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out
						.println("Select Std item  failed: " + e.getMessage());
			}

		}

		return dto;
	}

	@SuppressWarnings("unchecked")
	public BidLinePictureDTO getPictureOfContractAvailable(String contract,
			String schLine, String modelCode, int fiscalYear) {
		Transaction transaction = null;
		BidLinePictureDTO dto = null;

		String stringQuery = " select " + " Contract as Contract, "
				+ " Sch_Line as Sch_line, " + " Model as model, "
				+ " Sequence, " + " FY," + " Status as status,"
				+ " FileName as fileName" + " from bid_line_picture "
				+ " where Contract = :contract and "
				+ " Sch_Line    = :schLine and "
				+ " Model       = :modelCode and " + " Sequence    = 1   and "
				+ " FY          =  :currentFY  and " + " Status    <> 'D'   ";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("Contract", Hibernate.STRING)
					.addScalar("Sch_Line", Hibernate.STRING)
					.addScalar("model", Hibernate.STRING)
					.addScalar("Sequence", Hibernate.INTEGER)
					.addScalar("FY", Hibernate.INTEGER)
					.addScalar("status", Hibernate.STRING)
					.addScalar("fileName", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(BidLinePictureDTO.class));
			query.setParameter("contract", contract);
			query.setParameter("schLine", schLine);
			query.setParameter("modelCode", modelCode);
			query.setParameter("currentFY", fiscalYear);

			dto = (BidLinePictureDTO) query.uniqueResult();
			transaction.commit();

		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Select Bid_Line_Picture  failed: "
						+ e.getMessage());
			}

		}

		return dto;
	}

	@SuppressWarnings("unchecked")
	public List<OtherfeaturesBean> getOtherfeaturesdesc(OrderBean orderBean) {
		List<OtherfeaturesBean> result = null;
		Transaction transaction = null;
		
		String stringQuery = "SELECT S.Std_Item as std_Item, "
				+ "S.Option_Code as option_Code, "
				+ "O.Description as description, "
				+ "C.Category_Code as categoryCode, "
				+ "C.Category_Name as categoryName, "
				+ "S.Fed_Value_Next as fedValueNext "
				+ "FROM Std_Itm_Options S,Options_Table O,Options_Category C "
				+ "WHERE S.Std_Item = :stdItem and "
				+ "S.Fed_Flag_Current ='Y'  and "
				+ "S.Option_Code = O.Option_Code and "
				+ "O.Category_Code = C.Category_Code and "
				+ "O.Valid_Flag ='Y' and " + "S.Flag_Std_Next ='F'  "
				+ "Order By C.Sequence, O.Sequence";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("std_Item", Hibernate.STRING)
					.addScalar("option_Code", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)
					.addScalar("categoryCode", Hibernate.STRING)
					.addScalar("categoryName", Hibernate.STRING)
					.addScalar("fedValueNext", Hibernate.STRING)

					.setResultTransformer(
							Transformers.aliasToBean(OtherfeaturesBean.class));

			query.setParameter("stdItem", orderBean.getStdItemDTO()
					.getStdItem());
			result = (List<OtherfeaturesBean>) query.list();
			transaction.commit();
		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Clarificcation Emission List : "
						+ e.getMessage());
			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<OtherfeaturesValueBean> getOtherfeaturesval(OrderBean orderBean,
			String description) {
		
		List<OtherfeaturesValueBean> result = null;
		List<String> contract = new ArrayList<String>();
		List<String> schLine = new ArrayList<String>();

		for (ContrLineDTO tmpOrder : orderBean.getContrLineAvailableList()) {
			contract.add(tmpOrder.getContract());
			schLine.add(tmpOrder.getSch_Line());
		}
		Transaction transaction = null;
		
		String stringQuery = "Select  Contr_line_Option_Ext.Option_Code as Option_Code, "
				+ "Contr_line_Option_Ext.Fed_Value_Next as fedValueNext, "
				+ "Contr_line_Option_Ext.Sch_Line as Sch_Line, "
				+ "Contr_line_Option_Ext.Contract as Contract, "
				+ "Options_Category.Category_Code as categoryCode "
				+ "from Contr_line_Option_Ext, "
				+ "Contr_Line, "
				+ "Options_Table, "
				+ "Std_Itm_Options, "
				+ "Options_Category "
				+ "where  "
				+ "Contr_line_Option_Ext.Contract in(:contract) and "
				+ "Contr_line_Option_Ext.Sch_Line in(:Sch_Line)  and "
				+ "Contr_line_Option_Ext.Contract =  Contr_Line.Contract  and "
				+ "Contr_line_Option_Ext.Sch_Line =   Contr_Line.Sch_Line  and  "
				+ "Contr_line_Option_Ext.Option_Code = Options_Table.Option_Code  and "
				+ "Std_Itm_Options.Std_Item =  Contr_Line.Std_Item       and  "
				+ "Contr_line_Option_Ext.Option_Code = Std_Itm_Options.Option_Code and "
				+ "Options_Table.Category_Code = Options_Category.Category_Code  and "
				+ "Std_Itm_Options.Fed_Flag_Current ='Y'  and "
				+ "Std_Itm_Options.Flag_Std ='F'  and " 
				+ "Options_Table.Description =:description "
				+ "Order By Options_Category.Sequence, Options_Table.Sequence";

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("Option_Code", Hibernate.STRING)
					.addScalar("fedValueNext", Hibernate.STRING)
					.addScalar("Sch_Line", Hibernate.STRING)
					.addScalar("Contract", Hibernate.STRING)
					.addScalar("categoryCode", Hibernate.STRING)

					.setResultTransformer(
							Transformers.aliasToBean(OtherfeaturesValueBean.class));

			query.setParameterList("contract", contract);
			query.setParameterList("Sch_Line", schLine);
			query.setParameter("description", description);
			
			result = (List<OtherfeaturesValueBean>) query.list();
			transaction.commit();
			
			for(OtherfeaturesValueBean tmpOV:result){
				for (ContrLineDTO tmpOrder : orderBean.getContrLineAvailableList()){
					if(tmpOrder.getContract().equals(tmpOV.getContract())&&(tmpOrder.getSch_Line().equals(tmpOV.getSch_Line()))){
						tmpOV.setManufacturerName(tmpOrder.getManufacturerName());
						tmpOV.setModel(tmpOrder.getModel());
						tmpOV.setModelDescripton(tmpOrder.getModelDescripton());
						tmpOV.setModelCode(tmpOrder.getModelCode());
					}
				}
			}
		}

		catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Clarificcation Emission List : "
						+ e.getMessage());
			}

		}

		return result;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<ReqDetailCombinedDTO> fetchContrLineContract(RequisitionsCartDTO reqCart)  throws Exception{
		ArrayList<ReqDetailCombinedDTO> result = new ArrayList<ReqDetailCombinedDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" SELECT ");
		sqlBuff.append(" Contr_Line.Sch_Line as sch_line,"); 
		sqlBuff.append(" Contr_Line.Std_Item as std_item,");  
		sqlBuff.append(" Std_items.Description as std_item_description,");
		sqlBuff.append(" Contr_Line.Contract as contract,"); 
		sqlBuff.append(" ContrDUNS.Contr_Full_Name as contr_full_name,");
		sqlBuff.append(" Contr_Line.Current_Unit_Price as contr_line_curr_unit_price,");
		sqlBuff.append(" Contract.Contract_Sc as contract_sc,");
		sqlBuff.append(" Model.Description as ModelDesc as model_description,"); 
		sqlBuff.append(" Model.Model  as model ");
		sqlBuff.append(" FROM Contr_Line, Contract, ContrDUNS, Std_items, Model "); 
		sqlBuff.append(" WHERE ( Contr_Line.Contract = :contract )  "); 
		sqlBuff.append(" 	and ( Contr_Line.Sch_Line = :sch_line)  "); 
		sqlBuff.append(" 	and ( Contr_Line.Std_Item = :std_item )  "); 
		sqlBuff.append("    and ( Contr_Line.Contract = Contract.Contract )  "); 
		sqlBuff.append(" 	and ( Contr_Line.Model = Model.Model)  "); 
		sqlBuff.append(" 	and ( Contr_Line.Std_Item = Model.Std_Item)  "); 
		sqlBuff.append("    and ( Contr_Line.Std_Item = Std_items.Std_Item )  "); 
		sqlBuff.append(" 	and ( Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ) "); 
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(sqlBuff.toString())
					.addScalar("sch_line", Hibernate.STRING)
					.addScalar("std_item", Hibernate.STRING)
					.addScalar("std_item_description", Hibernate.STRING)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("contr_full_name", Hibernate.STRING)
					.addScalar("contr_line_curr_unit_price", Hibernate.DOUBLE)
					.addScalar("contract_sc", Hibernate.STRING)
					.addScalar("model_description", Hibernate.STRING)
					.addScalar("model", Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(ReqDetailCombinedDTO.class));
			query.setParameter("contract", reqCart.getContract());
			query.setParameter("sch_line", reqCart.getSchLine());
			query.setParameter("std_item", reqCart.getStdItem());
			result = (ArrayList<ReqDetailCombinedDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Contract Info : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
	
	public List<AgBuTableDTO> fetchAgBuTable(String agencyCode, String bureauCode) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<AgBuTableDTO> result = new ArrayList<AgBuTableDTO>();
		
		try{
			Query query =  session.createQuery("FROM AgBuTableDTO WHERE agency_code = :agencyCode and bureau_code = :bureauCode");
			query.setParameter("agencyCode", agencyCode);
			query.setParameter("bureauCode", bureauCode);
			result = (List<AgBuTableDTO>)query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select AgBuTableDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<UserGroupDTO> fetchUserGroup(String userID, String agencyCode, String bureauCode)  throws Exception{
		List<UserGroupDTO> result = new ArrayList<UserGroupDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" SELECT User_Group.Description as description,");
		sqlBuff.append(" User_Group.Group_Code  as group_Code");
		sqlBuff.append(" FROM User_Group, User_Group_Access  ");
		sqlBuff.append(" WHERE ( User_Group.Group_Code = User_Group_Access.Group_Code )  ");
		sqlBuff.append(" and ( User_Group.Agency_Code = User_Group_Access.Agency_Code )  ");
		sqlBuff.append(" and ( User_Group.Bureau_Code = User_Group_Access.Bureau_Code )  ");
		sqlBuff.append(" and ( ucase(User_Group_Access.User_ID) = ucase(:userID) ) ");
		sqlBuff.append(" and ( User_Group.Agency_Code = :agencyCode )  ");
		sqlBuff.append(" and ( User_Group.Bureau_Code = :bureauCode )  ");
		sqlBuff.append(" and ( User_Group_Access.Privilege <> '1') ");
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(sqlBuff.toString())
					.addScalar("description", Hibernate.STRING)
					.addScalar("group_Code", Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(UserGroupDTO.class));
			query.setParameter("userID", userID);
			query.setParameter("agencyCode", agencyCode);
			query.setParameter("bureauCode", bureauCode);
			result = query.list();

			transaction.commit();
		}
		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving User Group Info : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
		
	public List<RequisitionsCartDTO> fetchReqCart(String agencyCode, String bureauCode, String userID, Integer caseNo, String action) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsCartDTO> result = new ArrayList<RequisitionsCartDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append("FROM RequisitionsCartDTO WHERE agency_code = :agencyCode and bureau_code = :bureauCode ");
		if(action.equalsIgnoreCase("Add")){
			sql.append(" and user_updated = :userID ORDER BY caseno DESC");
		}
		else if(action.equalsIgnoreCase("Edit")){
			sql.append(" and caseNo = :caseNo" );
		}
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("agencyCode", agencyCode);
			query.setParameter("bureauCode", bureauCode);
			if(action.equalsIgnoreCase("Add")){				
				query.setParameter("userID", userID);
				query.setMaxResults(1);
			}
			else if(action.equalsIgnoreCase("Edit")){
				query.setParameter("caseNo", caseNo);
			}
			result = (List<RequisitionsCartDTO>)query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsCartDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	public List<OptionsTableDTO> fetchOptTable(List<String> optList) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<OptionsTableDTO> result = new ArrayList<OptionsTableDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM OptionsTableDTO "); 
		sql.append("where optionCode in :optList ");
		sql.append("Order by optionCode");
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameterList("optList", optList);
			result = (List<OptionsTableDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select OptionsTableDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	

	public List<StdItemDTO> fetchStdItem(String stdItem) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<StdItemDTO> result = new ArrayList<StdItemDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM StdItemDTO "); 
		sql.append("where stdItem = :stdItem ");
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("stdItem", stdItem);
			result = (List<StdItemDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select StdItemDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<StatesDTO> fetchStates() throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<StatesDTO> result = new ArrayList<StatesDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM StatesDTO ORDER BY State_Code "); 
		try{
			Query query =  session.createQuery(sql.toString());
			result = (List<StatesDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select StatesDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<OptionsCategoryDTO> fetchOptCatExDelDDR(List<String> optList) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<OptionsCategoryDTO> result = new ArrayList<OptionsCategoryDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT Distinct Options_Category.Category_Code as categoryCode");
		sql.append(" FROM Options_Category, Options_Table  ");
		sql.append(" WHERE Options_Category.Category_Code = Options_Table.Category_Code and "); 
		sql.append("       Options_Table.Option_Code in (:optList) and ");
		sql.append("       Options_Category.Category_Code in ('ExDel','DDR') ");
		
		try{
			Query query =  session.createSQLQuery(sql.toString())
					.addScalar("categoryCode", Hibernate.STRING)
					.setResultTransformer(Transformers.aliasToBean(OptionsCategoryDTO.class));
			query.setParameterList("optList", optList);
			
			result = (List<OptionsCategoryDTO>)query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select OptionsCategoryDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<ReqDetailCombinedDTO> fetchContrLineModel(RequisitionsCartDTO reqCart)  throws Exception{
		List<ReqDetailCombinedDTO> result = new ArrayList<ReqDetailCombinedDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append("   Select Model_GroupDUNS.Group_DUNS as model_groupduns_groupduns,");
		sqlBuff.append("   Model.Model as model,");
		sqlBuff.append("   Veh_Type.Veh_Type as veh_type_veh_type,");
		sqlBuff.append("   Veh_Type.Dealer_Flg as veh_type_dealer_flag,");
		sqlBuff.append("   Contr_Line.Allow_Ordering  as contr_line_allow_ordering, ");
		sqlBuff.append("   Std_items.section  as std_item_section, ");
		sqlBuff.append("   section_table.Buyer_Code  as buyer_code ");
		sqlBuff.append("   From Contr_Line,Model,Model_GroupDUNS,Veh_Type, ");
		sqlBuff.append("   Std_items, section_table ");
		sqlBuff.append("   Where Contr_Line.Contract = :contract and ");
		sqlBuff.append(" 		Contr_Line.Sch_Line = :sch_line and  ");
		sqlBuff.append(" 		Contr_Line.Model = Model_GroupDUNS.Model and ");
		sqlBuff.append(" 		Contr_Line.Model = Model.Model and ");
		sqlBuff.append(" 		Std_items.section = section_table.section and ");
		sqlBuff.append(" 		Contr_Line.Std_Item = Model.Std_Item and  ");
		sqlBuff.append(" 		Contr_Line.Std_Item = Std_items.Std_Item and ");
		sqlBuff.append(" 		Veh_Type.Veh_Type = Std_items.Veh_Type ");
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
				.createSQLQuery(sqlBuff.toString())
				.addScalar("model_groupduns_groupduns", Hibernate.INTEGER)
				.addScalar("model", Hibernate.STRING)
				.addScalar("veh_type_veh_type", Hibernate.STRING)
				.addScalar("veh_type_dealer_flag", Hibernate.STRING)
				.addScalar("contr_line_allow_ordering", Hibernate.STRING)
				.addScalar("std_item_section", Hibernate.STRING)
				.addScalar("buyer_code", Hibernate.STRING)
				.setResultTransformer(Transformers.aliasToBean(ReqDetailCombinedDTO.class));
			query.setParameter("sch_line", reqCart.getSchLine());
			query.setParameter("contract", reqCart.getContract());
			result = (List<ReqDetailCombinedDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Contr_Line, Model Info : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<GroupDunsDealerLocDTO> fetchDealerInfo(String model, Integer groupDUNS, String dealerCode)  throws Exception{
		List<GroupDunsDealerLocDTO> result = new ArrayList<GroupDunsDealerLocDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" SELECT GroupDUNS_Dealer_Loc.Group_DUNS as group_DUNS,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.Dealer_Code as dealer_Code,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.Dealer_Name as dealerName,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.Street as street,"); 
		sqlBuff.append(" GroupDUNS_Dealer_Loc.City as city,"); 
		sqlBuff.append(" GroupDUNS_Dealer_Loc.State as state,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.ZipCode as zipCode,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.Country as country,");
		sqlBuff.append(" GroupDUNS_Dealer_Loc.Telephone  as telephone");
		sqlBuff.append(" FROM GroupDUNS_Dealer_Loc, ");
		sqlBuff.append(" GroupDUNS_Dealer_Fran, ");
		sqlBuff.append(" Model_GroupDUNS  ");
		sqlBuff.append(" Where GroupDUNS_Dealer_Loc.Group_DUNS = :groupDUNS ");
		sqlBuff.append(" and GroupDUNS_Dealer_Loc.Dealer_Code = :dealerCode  ");
		sqlBuff.append(" and GroupDUNS_Dealer_Loc.Group_DUNS = GroupDUNS_Dealer_Fran.Group_DUNS  ");
		sqlBuff.append(" and GroupDUNS_Dealer_Loc.Dealer_Code = GroupDUNS_Dealer_Fran.Dealer_Code  ");
		sqlBuff.append(" and GroupDUNS_Dealer_Fran.Group_DUNS = Model_GroupDUNS.Group_DUNS  ");
		sqlBuff.append(" and GroupDUNS_Dealer_Fran.Fran_Code = Model_GroupDUNS.Fran_Code ");
		sqlBuff.append(" and Model_GroupDUNS.Model = :model ");
		 
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
				.createSQLQuery(sqlBuff.toString())
				.addScalar("group_DUNS", Hibernate.STRING)
				.addScalar("dealer_Code", Hibernate.STRING)
				.addScalar("dealerName", Hibernate.STRING)
				.addScalar("street", Hibernate.STRING)
				.addScalar("city", Hibernate.STRING)
				.addScalar("state", Hibernate.STRING)
				.addScalar("zipCode", Hibernate.STRING)
				.addScalar("country", Hibernate.STRING)
				.addScalar("telephone", Hibernate.STRING)
				.setResultTransformer(Transformers.aliasToBean(GroupDunsDealerLocDTO.class));
			query.setParameter("groupDUNS", groupDUNS);
			query.setParameter("dealerCode", dealerCode);
			query.setParameter("model",model);
			result = (List<GroupDunsDealerLocDTO>) query.list();
			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Dealer Info : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}

public RequisitionsJustDTO getRequisitionJust(RequisitionsCartDTO reqCart) throws Exception{
	Transaction transaction = null;
	RequisitionsJustDTO result = null;
	
	String stringQuery = " select  justification "+
	                    " From  Requisitions_just "+
	                    " where CaseNo = :caseno ";
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("justification", Hibernate.STRING)
					.setResultTransformer(
							Transformers.aliasToBean(RequisitionsJustDTO.class));

			query.setParameter("caseno", reqCart.getCaseNumber());
			result = (RequisitionsJustDTO) query.uniqueResult();
			transaction.commit();
		}
			catch (Exception ex) {
				if (transaction != null) {
					transaction.rollback();
					logger.info("Exception while retrieving RequisitionsJust  "
							+ ex.getMessage());
				}
				throw ex;
			}

			return result;

	
		                    
	 }	

	
	@SuppressWarnings("unchecked")
	public List<ModelColorDTO> getModelColorList(ContrLineDTO contrlineDTO) {
		Transaction transaction = null;
		List<ModelColorDTO> result = null;
		
		String stringQuery = " Select Model as model, " +
				             " Color_Code as color_Code , " +
				             " Description as description"+
							 "  From Model_Color "+
		                     " Where Model = :modelCode and "+
		                     " Std_Item = :stdItem ";


		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("model", Hibernate.STRING)
					.addScalar("color_Code", Hibernate.STRING)
					.addScalar("description", Hibernate.STRING)

					.setResultTransformer(
							Transformers.aliasToBean(ModelColorDTO.class));

			query.setParameter("modelCode", contrlineDTO.getModelCode());
			query.setParameter("stdItem",contrlineDTO.getStdItem());

			result = (List<ModelColorDTO>) query.list();
			transaction.commit();
		}
			catch (Exception ex) {
				if (transaction != null) {
					transaction.rollback();
					logger.info("Exception while retrieving RequisitionsJust  "
							+ ex.getMessage());
				}

			}

			return result;

	
		                    
	 }	

	@SuppressWarnings("unchecked")
	public List<AgBuTableDTO> fetchAgBuOnBehalf(List<String> list)  throws Exception{
		List<AgBuTableDTO> result = new ArrayList<AgBuTableDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" Select concat(Agency_code,Bureau_code) as combinedCode, ");
		sqlBuff.append(" concat(Agency_code,Bureau_code,'-',Agency,'/',Bureau) as codeNameDisplay ");
		sqlBuff.append(" from AgBu_Table ");
		sqlBuff.append(" where concat(Agency_code,Bureau_code) in :list ");
		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
				.createSQLQuery(sqlBuff.toString())
				.addScalar("combinedCode", Hibernate.STRING)
				.addScalar("codeNameDisplay", Hibernate.STRING)
				.setResultTransformer(Transformers.aliasToBean(GroupDunsDealerLocDTO.class));
			query.setParameterList("list", list);
			result = (List<AgBuTableDTO>) query.list();
			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving AgBuTable On Behalf Info : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
	
	public List<OptionFileCartDTO> fetchOptFileCartTable(Integer caseNumber) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<OptionFileCartDTO> result = new ArrayList<OptionFileCartDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM OptionFileCartDTO "); 
		sql.append("where caseNo = :caseNumber ");
		sql.append("Order by option_Code");
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("caseNumber", caseNumber);
			result = (List<OptionFileCartDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select OptionFileCartDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<RequisitionsCartColorDTO> fetchReqCartColorTable(Integer caseNumber) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsCartColorDTO> result = new ArrayList<RequisitionsCartColorDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsCartColorDTO "); 
		sql.append("where caseNo = :caseNumber ");
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("caseNumber", caseNumber);
			result = (List<RequisitionsCartColorDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsCartColorDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<RequisitionsJustDTO> fetchReqJustTable(Integer caseNumber) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsJustDTO> result = new ArrayList<RequisitionsJustDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsJustDTO "); 
		sql.append("where caseNo = :caseNumber ");
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("caseNumber", caseNumber);
			result = (List<RequisitionsJustDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsJustDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<RequisitionsCartDTO> fetchReqCartMaxCase()  throws Exception{
		List<RequisitionsCartDTO> result = new ArrayList<RequisitionsCartDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" Select max(CaseNo) as caseNumber from Requisitions_Cart");		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
				.createSQLQuery(sqlBuff.toString())
				.addScalar("caseNumber", Hibernate.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(RequisitionsCartDTO.class));
			result = (List<RequisitionsCartDTO>) query.list();
			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Max Req Cart Case Number : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
	
	
	public void saveReqCart(RequisitionsCartDTO dto) throws Exception {
		Transaction transaction=null;
		
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();	       	 	
	        	transaction = session.beginTransaction();
	        	session.saveOrUpdate(dto);
		        transaction.commit();
		           	
		     }
		     catch (Exception e) { 
		            if (transaction != null) {
		            	transaction.rollback();
		            	System.out.println("Saving record to RequisitionsCartDTO failed: " + e.getMessage());            	
		            }
		            throw e;
		     } 	
   }
	
	
	public void saveOptFileCart(OptionFileCartDTO dto) throws Exception {
		Transaction transaction=null;
		
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();	       	 	
	        	transaction = session.beginTransaction();
	        	session.saveOrUpdate(dto);
		        transaction.commit();
		           	
		     }
		     catch (Exception e) { 
		            if (transaction != null) {
		            	transaction.rollback();
		            	System.out.println("Saving record to OptionFileCartDTO failed: " + e.getMessage());            	
		            }
		            throw e;
		     } 	
   }
	
	
	public void saveReqCartColor(RequisitionsCartColorDTO dto) throws Exception {
		Transaction transaction=null;
		
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();	       	 	
	        	transaction = session.beginTransaction();
	        	session.saveOrUpdate(dto);
		        transaction.commit();
		           	
		     }
		     catch (Exception e) { 
		            if (transaction != null) {
		            	transaction.rollback();
		            	System.out.println("Saving record to RequisitionsCartColorDTO failed: " + e.getMessage());            	
		            }
		            throw e;
		     } 	
   }
		
	public void saveReqJust(RequisitionsJustDTO dto) throws Exception {
		Transaction transaction=null;
		
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();	       	 	
	        	transaction = session.beginTransaction();
	        	session.saveOrUpdate(dto);
		        transaction.commit();
		           	
		     }
		     catch (Exception e) { 
		            if (transaction != null) {
		            	transaction.rollback();
		            	System.out.println("Saving record to RequisitionsJustDTO failed: " + e.getMessage());            	
		            }
		            throw e;
		     } 	
   }
	
	public void saveNewOrderDetails(OrderBean orderBean, UserAccountDTO user) throws Exception{
		Transaction transaction=null;
		int caseNum = orderBean.getReqCart().getCaseNumber();
       	try {
       	 	Session session = sessionFactory.getCurrentSession();	       	 	
        	transaction = session.beginTransaction();
        	
        	//req cart
        	session.saveOrUpdate(orderBean.getReqCart());        	
        	
        	//opt file cart
        	if(orderBean.getOptFileCartList() != null && orderBean.getOptFileCartList().size() > 0){
	        	for(OptionFileCartDTO optdto : orderBean.getOptFileCartList()){
	        		optdto.setCaseNo(caseNum);
	        		optdto.setUserUpdated(user.getUserID());
					session.saveOrUpdate(optdto);
				}
        	}
        	
        	//req color cart
        	if(orderBean.getReqCartColorList() != null && orderBean.getReqCartColorList().size() > 0){
	        	for(RequisitionsCartColorDTO reqcolordto : orderBean.getReqCartColorList()){
	        		reqcolordto.setCaseNo(caseNum);
	        		reqcolordto.setCreatedBy(user.getUserID());
	        		reqcolordto.setCreatedDate(UtilsLib.getCurrentTimeStamp());
					session.saveOrUpdate(reqcolordto);
				}
        	}
        	
        	//req just
        	if(orderBean.getReqJust() != null && orderBean.getReqJust().getJustification() != null && orderBean.getReqJust().getJustification().trim().length() > 0){
        		orderBean.getReqJust().setCaseNo(caseNum);
        		orderBean.getReqJust().setUserUpdated(user.getUserID());
        		orderBean.getReqJust().setUpdatedDate(UtilsLib.getCurrentTimeStamp());
        		session.saveOrUpdate(orderBean.getReqJust());
        	}
        	
	        transaction.commit();	           	
	     }
	     catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	            	System.out.println("Saving new requistion failed: " + e.getMessage());            	
	            }
	            throw e;
	     } 	
	}
	
	@SuppressWarnings("unchecked")
	public List<ReqDetailCombinedDTO> fetchGroupDUNSDealerLocation(Integer groupDUNS, String model)  throws Exception{
		List<ReqDetailCombinedDTO> result = new ArrayList<ReqDetailCombinedDTO>();
		Transaction transaction = null;
		StringBuffer sqlBuff = new StringBuffer();
		sqlBuff.append(" Select GroupDUNS_Dealer_Loc.Dealer_Code as groupduns_dealer_loc_dealer_code,");   
		sqlBuff.append("   GroupDUNS_Dealer_Loc.Dealer_Name as groupduns_dealer_loc_dealer_name,");   
		sqlBuff.append("   GroupDUNS_Dealer_Loc.Street as groupduns_dealer_loc_dealer_street,");  
		sqlBuff.append("   GroupDUNS_Dealer_Loc.City as groupduns_dealer_loc_dealer_city,"); 
		sqlBuff.append("   GroupDUNS_Dealer_Loc.State as groupduns_dealer_loc_dealer_state,"); 
		sqlBuff.append("   GroupDUNS_Dealer_Loc.ZipCode as groupduns_dealer_loc_dealer_zip,");  
		sqlBuff.append("   GroupDUNS_Dealer_Loc.Country as groupduns_dealer_loc_dealer_country,"); 
		sqlBuff.append("   GroupDUNS_Dealer_Loc.Telephone as groupduns_dealer_loc_dealer_telephone, ");
		sqlBuff.append("   States.State_Name as groupduns_dealer_loc_dealer_statename ");
		sqlBuff.append(" FROM GroupDUNS_Dealer_Loc,GroupDUNS_Dealer_Fran,Model_GroupDUNS,States ");	
		sqlBuff.append(" WHERE GroupDUNS_Dealer_Loc.State = States.State ");
		sqlBuff.append(" AND GroupDUNS_Dealer_Loc.Group_DUNS = GroupDUNS_Dealer_Fran.Group_DUNS "); 
		sqlBuff.append(" AND GroupDUNS_Dealer_Loc.Dealer_Code = GroupDUNS_Dealer_Fran.Dealer_Code  ");  
		sqlBuff.append(" AND GroupDUNS_Dealer_Fran.Group_DUNS = Model_GroupDUNS.Group_DUNS 	"); 		
		sqlBuff.append(" AND GroupDUNS_Dealer_Fran.Fran_Code = Model_GroupDUNS.Fran_Code "); 
		sqlBuff.append(" AND States.Country = 'USA' "); 
		sqlBuff.append(" AND Model_GroupDUNS.Model = :model "); 		
		sqlBuff.append(" AND GroupDUNS_Dealer_Loc.Group_DUNS = :groupDUNS "); 
		sqlBuff.append(" ORDER BY States.State_Name, GroupDUNS_Dealer_Loc.City, GroupDUNS_Dealer_Loc.Dealer_Name"); 
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
				.createSQLQuery(sqlBuff.toString())
				.addScalar("groupduns_dealer_loc_dealer_code", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_name", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_street", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_city", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_state", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_zip", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_country", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_telephone", Hibernate.STRING)
				.addScalar("groupduns_dealer_loc_dealer_statename", Hibernate.STRING)
				.setResultTransformer(Transformers.aliasToBean(ReqDetailCombinedDTO.class));
			query.setParameter("model", model);
			query.setParameter("groupDUNS", groupDUNS);
			result = (List<ReqDetailCombinedDTO>) query.list();
			transaction.commit();
		}
		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving Dealer Locations : "
						+ ex.getMessage());
			}
			throw ex;
		}

		return result;
	}
	
	public List<RequisitionsCartDTO> fetchReqCartReqNumber(RequisitionsCartDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsCartDTO> result = new ArrayList<RequisitionsCartDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsCartDTO where fedMilReq1 = :fedMilReq1 and fedMilReq2 = :fedMilReq2 and fedMilReq3 = :fedMilReq3 "); 
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("fedMilReq1", dto.getFedMilReq1());
			query.setParameter("fedMilReq2", dto.getFedMilReq2());
			query.setParameter("fedMilReq3", dto.getFedMilReq3());
			result = (List<RequisitionsCartDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsCartDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<RequisitionsDTO> fetchReqReqNumber(RequisitionsCartDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsDTO> result = new ArrayList<RequisitionsDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsDTO where fedMilReq1 = :fedMilReq1 and fedMilReq2 = :fedMilReq2 and fedMilReq3 = :fedMilReq3 "); 
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("fedMilReq1", dto.getFedMilReq1());
			query.setParameter("fedMilReq2", dto.getFedMilReq2());
			query.setParameter("fedMilReq3", dto.getFedMilReq3());
			result = (List<RequisitionsDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public void saveExistingOrderDetails(OrderBean orderBean, UserAccountDTO user) throws Exception{
		Transaction transaction=null;
       	try {
       	 	Session session = sessionFactory.getCurrentSession();	       	 	
        	transaction = session.beginTransaction();
        	
        	//req cart
        	session.saveOrUpdate(orderBean.getReqCart());        	
        	
        	/* for Express Desk only?
        	//opt file cart
        	if(orderBean.getOptFileCartList() != null && orderBean.getOptFileCartList().size() > 0){
	        	for(OptionFileCartDTO optdto : orderBean.getOptFileCartList()){
	        		optdto.setCaseNo(caseNum);
	        		optdto.setUserUpdated(user.getUserID());
					session.saveOrUpdate(optdto);
				}
        	}
        	*/
        	
        	//user audit trail
        	UserAuditTrailDTO audit = new UserAuditTrailDTO();
        	audit.setCaseNo(orderBean.getReqCart().getCaseNumber());
        	audit.setUser_Id(user.getUserID());
        	audit.setDate_Modified(UtilsLib.getCurrentTS());
        	audit.setRemark("Change in some info");
        	session.saveOrUpdate(audit); 
        	
        	//file upload
        	Query query =  session.createQuery(" FROM FileUploadDTO where caseNo = :caseNum");
			query.setParameter("caseNum", orderBean.getReqCart().getAgencyOrderNo());
        	List<FileUploadDTO> fileUpList = (List<FileUploadDTO>)query.list();
        	if(fileUpList != null && fileUpList.size() > 0){        	
    			query =  session.createQuery("UPDATE FileUploadDTO set agencyOrderNo = :agencyOrderNo where caseNo = :caseNum");
    			query.setParameter("agencyOrderNo", orderBean.getReqCart().getAgencyOrderNo());
    			query.setParameter("caseNum", orderBean.getReqCart().getCaseNumber());
    			int result = query.executeUpdate();
        	}
	        transaction.commit();	           	
	     }
	     catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	            	System.out.println("Saving existing requistion failed: " + e.getMessage());            	
	            }
	            throw e;
	     } 	
	}
	
	public List<RequisitionsCartDTO> fetchReqCartMIPR(RequisitionsCartDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsCartDTO> result = new ArrayList<RequisitionsCartDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsCartDTO where agencyOrderNo = :agencyOrderNo and lineItem = :lineItem " );
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("agencyOrderNo", dto.getAgencyOrderNo());
			query.setParameter("lineItem", dto.getLineItem());
			result = (List<RequisitionsCartDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsCartDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
	public List<RequisitionsDTO> fetchReqMIPR(RequisitionsCartDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<RequisitionsDTO> result = new ArrayList<RequisitionsDTO>();
		StringBuffer sql = new StringBuffer();
		sql.append(" FROM RequisitionsDTO where agencyOrderNo = :agencyOrderNo and lineItem = :lineItem "); 
		try{
			Query query =  session.createQuery(sql.toString());
			query.setParameter("agencyOrderNo", dto.getAgencyOrderNo());
			query.setParameter("lineItem", dto.getLineItem());
			result = (List<RequisitionsDTO>)query.list();
	        transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Select RequisitionsDTO failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	

}
