package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.RequisitionsCartDTO;
import gov.gsa.fas.AutoChoice.DTO.StdItemDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;

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
public class PendingOrderDAO implements Serializable {
	
	private SessionFactory sessionFactory = null;

	Logger logger = Logger.getLogger(OrderDAO.class.toString());

	public PendingOrderDAO() {
		super();
		sessionFactory = HibernateAnnotationUtil.getSessionFactory();
	}

	@SuppressWarnings("unchecked")
	public List<RequisitionsCartDTO> getRequisitionsCart(UserAccountDTO userAccount, String groupCode) {
		
		System.out.println(userAccount.getAgencyCode());
		System.out.println(userAccount.getBureauCode());
		System.out.println(groupCode);
		System.out.println(userAccount.getUserID());
		
		List<RequisitionsCartDTO> result = null;
		Transaction transaction = null;
		String stringQuery = "SELECT  Requisitions_Cart.CaseNo as caseNumber, "
		         +"Requisitions_Cart.Fed_Mil_Req_No_1 as fedMilReq1," 
		         +"Requisitions_Cart.Fed_Mil_Req_No_2 as fedMilReq2, "
		         +"Requisitions_Cart.Fed_Mil_Req_No_3 as fedMilReq3, "
				 +"concat(Requisitions_Cart.Fed_Mil_Req_No_1, Requisitions_Cart.Fed_Mil_Req_No_2, Requisitions_Cart.Fed_Mil_Req_No_3) as reqNo, "
		         +"Requisitions_Cart.Quantity as quantity , "
		         +"Requisitions_Cart.Est_Unit_Price as estUnitPrice , "
		         +"Requisitions_Cart.Agency_Order_No as agencyOrderNo, "
				 +"Requisitions_Cart.Date_Received as receivedDate, "
				 +"Requisitions_Cart.Date_Last_Updated as lastUpdatedDate, "
				 +"ContrDUNS.Contr_Full_Name as contrFullName, "
				 +"Requisitions_Cart.Std_Item as stdItem, "
				 +"Requisitions_Cart.Total_Unit_Price as totUnitPrice, "
				 +"Requisitions_Cart.Quantity * Requisitions_Cart.Est_Unit_Price as totalPriceObligated, "
				 +"Requisitions_Cart.Quantity * Requisitions_Cart.Total_Unit_Price as totalPriceActual, "
				 +"Model_GroupDuns.Model as model, "
				 +"Requisitions_Cart.Created_By as createdBy, "
				 +"Requisitions_Cart.User_Updated as userUpdated, "
				 +"Requisitions_Cart.Priority as priority, "
				 +"Requisitions_Cart.Contract as contract , "
				 +"U.Group_Code as userGroupCode, "
				 +"U.Privilege as privilege, "
				 +"Requisitions_Cart.CaseNo_Real as caseNoReal, "
				 +"C.Allow_Ordering as allowOrdering, "
			     +"C.Active_Line as activeLine, "
				 +"Requisitions_Cart.Additional_Fund as addFund, "
				 +"Contract.For_Public_Internet as forPublicInternet, "
				 +"Requisitions_Cart.Line_Item as lineItem, "
				 +"Requisitions_Cart.Sch_Line as schLine, "
				 +"Requisitions_Cart.Non_Std_Desc as nonStdDesc, "
				 +"Requisitions_Cart.Buyer_Code as buyerCode, "
				 +"Requisitions_Cart.Agency_Code as agencyCode, "
				 +"Requisitions_Cart.Bureau_Code as bureauCode, "
				 +"Requisitions_Cart.Bill_Add_Line1 as billAddLine1, "
				 +"Requisitions_Cart.Bill_Add_Line2 as billAddLine2, "
				 +"Requisitions_Cart.Bill_Add_Line3 as billAddLine3, "
				 +"Requisitions_Cart.Bill_Add_Line4 as billAddLine4, "
				 +"Requisitions_Cart.Bill_Add_Country as billAddCountry, "
				 +"Requisitions_Cart.Bill_Add_State as billAddState, "
				 +"Requisitions_Cart.Bill_Add_Zip as billAddZip, "
				 +"Requisitions_Cart.Status as status, "
				 +"Requisitions_Cart.Section as section, "
				 +"Requisitions_Cart.Con_Fax_Intl as conFaxIntl, "
				 +"Requisitions_Cart.Req_Fax_Intl as reqFaxIntl, "
				 +"Requisitions_Cart.Sequence as sequence, "
				 +"Requisitions_Cart.Veh_Color as vehColor, "
				 +"Requisitions_Cart.Fair_Opportunity as fairOpp, "
				 +"Requisitions_just.CAseno as justCaseno "
				 +"FROM Requisitions_Cart  "
				 +"Left Join Requisitions_Just on (Requisitions_Just.Caseno =Requisitions_Cart.Caseno), "
		         +"User_Group_Access U, "
		         +"Contract, "
		         +"Contr_Line C, "
		         +"ContrDUNS, "
		         +"Model M , "
		         +"Model_GroupDUNS "
		         +"WHERE "
		         +"( Requisitions_Cart.Agency_Code =:agencyCode) and "
		         +"( Requisitions_Cart.Bureau_Code =:bureauCode) and "
		         +"( Requisitions_Cart.Group_Code =:groupCode) and "
			     +"( Requisitions_Cart.Status      = '0') and "
		         +"( ucase(U.User_ID)=:userid)	and "
		         +"(( Requisitions_Cart.Created_By =  U.User_ID ) or "
		         +"( U.Privilege in ( '3','S' ) )) and "
			     +"( Requisitions_Cart.Agency_Code = U.Agency_Code ) and "
		         +"( Requisitions_Cart.Bureau_Code = U.Bureau_Code ) and "
		         +"( Requisitions_Cart.Group_Code = U.Group_Code ) and "
		    	 +"( Requisitions_Cart.Contract    = Contract.Contract ) and "
		         +"( Contract.Contract    = C.Contract ) and "
			     +"( Requisitions_Cart.Sch_Line    = C.Sch_Line) and "
		         +"( Requisitions_Cart.Std_Item = M.Std_Item) and "
		         +"( Contract.Contr_DUNS = ContrDUNS.Contr_DUNS ) and "
		         +"( C.Model = M.Model)  and "
		         +"Model_GroupDuns.Model = M.Model ";

		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("caseNumber", Hibernate.INTEGER)
					.addScalar("fedMilReq1", Hibernate.STRING)
					.addScalar("fedMilReq2", Hibernate.STRING)
					.addScalar("fedMilReq3", Hibernate.STRING)
					.addScalar("reqNo", Hibernate.STRING)
					.addScalar("quantity", Hibernate.INTEGER)
					.addScalar("estUnitPrice", Hibernate.DOUBLE)
					.addScalar("agencyOrderNo", Hibernate.STRING)
					.addScalar("receivedDate", Hibernate.TIMESTAMP)
					.addScalar("lastUpdatedDate", Hibernate.TIMESTAMP)
					.addScalar("contrFullName", Hibernate.STRING)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("totUnitPrice", Hibernate.DOUBLE)
					.addScalar("totalPriceObligated", Hibernate.DOUBLE)
					.addScalar("totalPriceActual", Hibernate.DOUBLE)
					.addScalar("model", Hibernate.STRING)
					.addScalar("createdBy", Hibernate.STRING)
					.addScalar("userUpdated", Hibernate.STRING)
					.addScalar("priority", Hibernate.STRING)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("userGroupCode", Hibernate.STRING)
					.addScalar("privilege", Hibernate.STRING)
					.addScalar("caseNoReal", Hibernate.STRING)
					.addScalar("allowOrdering", Hibernate.STRING)
					.addScalar("activeLine", Hibernate.STRING)
					.addScalar("addFund", Hibernate.DOUBLE)
					.addScalar("forPublicInternet", Hibernate.STRING)
					.addScalar("lineItem", Hibernate.STRING)
					.addScalar("schLine", Hibernate.STRING)
					.addScalar("nonStdDesc", Hibernate.STRING)
					.addScalar("buyerCode", Hibernate.STRING)
					.addScalar("agencyCode", Hibernate.STRING)
					.addScalar("bureauCode", Hibernate.STRING)
					.addScalar("billAddLine1", Hibernate.STRING)
					.addScalar("billAddLine2", Hibernate.STRING)
					.addScalar("billAddLine3", Hibernate.STRING)
					.addScalar("billAddLine4", Hibernate.STRING)
					.addScalar("billAddCountry", Hibernate.STRING)
					.addScalar("billAddState", Hibernate.STRING)
					.addScalar("billAddZip", Hibernate.STRING)
					.addScalar("status", Hibernate.STRING)
					.addScalar("section", Hibernate.STRING)
					.addScalar("conFaxIntl", Hibernate.STRING)
					.addScalar("reqFaxIntl", Hibernate.STRING)
					.addScalar("sequence", Hibernate.DOUBLE)
					.addScalar("vehColor", Hibernate.STRING)
					.addScalar("fairOpp", Hibernate.STRING)
					.addScalar("justCaseno", Hibernate.INTEGER)
			
					.setResultTransformer(
							Transformers.aliasToBean(RequisitionsCartDTO.class));
			
			query.setParameter("agencyCode", userAccount.getAgencyCode());
			query.setParameter("bureauCode", userAccount.getBureauCode());
			query.setParameter("groupCode",groupCode);
			query.setParameter("userid", userAccount.getUserID());

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
	
	@SuppressWarnings("unchecked")
	public List<RequisitionsCartDTO> getMasRequisitionsCart(UserAccountDTO userAccount,String groupCode) {
		
		List<RequisitionsCartDTO> result = null;
		Transaction transaction = null;
		String stringQuery = "SELECT  Requisitions_Cart.CaseNo as caseNumber, "
								+"Requisitions_Cart.Fed_Mil_Req_No_1 as fedMilReq1,"
								+"Requisitions_Cart.Fed_Mil_Req_No_2 as fedMilReq2, "
								+"Requisitions_Cart.Fed_Mil_Req_No_3 as fedMilReq3, "
								+"concat(Requisitions_Cart.Fed_Mil_Req_No_1, Requisitions_Cart.Fed_Mil_Req_No_2, Requisitions_Cart.Fed_Mil_Req_No_3)  as reqNo,  "
								+"Requisitions_Cart.Quantity as quantity,    "
								+"Requisitions_Cart.Est_Unit_Price as estUnitPrice , "
								+"Requisitions_Cart.Agency_Order_No as agencyOrderNo, "
								+"Requisitions_Cart.Date_Received as receivedDate, "
								+"Requisitions_Cart.Std_Item as stdItem, "
								+"Requisitions_Cart.Total_Unit_Price as totUnitPrice, "
								+"Requisitions_Cart.Quantity * Requisitions_Cart.Est_Unit_Price as totalPriceObligated, "
								+"Requisitions_Cart.Quantity * Requisitions_Cart.Total_Unit_Price  as totalPriceActual, "
								+"Requisitions_Cart.Created_By as createdBy, "
								+"Requisitions_Cart.User_Updated  as userUpdated, "
								+"Requisitions_Cart.Priority as priority, "
								+"Requisitions_Cart.Contract as contract , "
								+"U.Group_Code as  userGroupCode, "
								+"U.Privilege  as privilege, "
								+"Requisitions_Cart.CaseNo_Real as caseNoReal, "
								+"Requisitions_Cart.Additional_Fund as addFund, "
								+"Requisitions_Cart.Line_Item as lineItem, "
								+"Requisitions_Cart.Date_Last_Updated  as lastUpdatedDate "
								+"FROM Requisitions_Cart ,User_Group_Access U " 
								+"WHERE  "
		 						+"( Requisitions_Cart.Agency_Code = :agencyCode) and "
		 						+"( Requisitions_Cart.Bureau_Code = :bureauCode) and "
		 						+"( Requisitions_Cart.Agency_Code = U.Agency_Code ) and   "
		 						+"( Requisitions_Cart.Bureau_Code = U.Bureau_Code ) and   "
		 						+"( Requisitions_Cart.Group_Code = U.Group_Code ) and   "
		 						+"( Requisitions_Cart.Group_Code = :groupCode) and "
		 						+"( ( U.User_ID = Requisitions_Cart.Created_By) or  "
		 						+"( U.Privilege in ( '3','S' ) )) and  "
		 						+"( U.User_ID=:userid)  and  "
		 						+"( Requisitions_Cart.Status ='0') and  "
		 						+"( Requisitions_Cart.Contract ='') ";
		 
					try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = session
					.createSQLQuery(stringQuery)
					.addScalar("caseNumber", Hibernate.INTEGER)
					.addScalar("fedMilReq1", Hibernate.STRING)
					.addScalar("fedMilReq2", Hibernate.STRING)
					.addScalar("fedMilReq3", Hibernate.STRING)
					.addScalar("reqNo", Hibernate.STRING)
					.addScalar("quantity", Hibernate.INTEGER)
					.addScalar("estUnitPrice", Hibernate.DOUBLE)
					.addScalar("agencyOrderNo", Hibernate.STRING)
					.addScalar("receivedDate", Hibernate.TIMESTAMP)
					.addScalar("stdItem", Hibernate.STRING)
					.addScalar("totUnitPrice", Hibernate.DOUBLE)
					.addScalar("totalPriceObligated", Hibernate.DOUBLE)
					.addScalar("totalPriceActual", Hibernate.DOUBLE)
					.addScalar("createdBy", Hibernate.STRING)
					.addScalar("userUpdated", Hibernate.STRING)
					.addScalar("priority", Hibernate.STRING)
					.addScalar("contract", Hibernate.STRING)
					.addScalar("userGroupCode", Hibernate.STRING)
					.addScalar("privilege", Hibernate.STRING)
					.addScalar("caseNoReal", Hibernate.STRING)
					.addScalar("addFund", Hibernate.DOUBLE)
					.addScalar("lineItem", Hibernate.STRING)
					.addScalar("lastUpdatedDate", Hibernate.TIMESTAMP)
					
					.setResultTransformer(
							Transformers.aliasToBean(RequisitionsCartDTO.class));
			
			query.setParameter("agencyCode", userAccount.getAgencyCode());
			query.setParameter("bureauCode", userAccount.getBureauCode());
			query.setParameter("groupCode",groupCode);
			query.setParameter("userid", userAccount.getUserID());

			result = (List<RequisitionsCartDTO>) query.list();

			transaction.commit();
		}

		catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
				logger.info("Exception while retrieving getMasRequisitionsCart : "
						+ ex.getMessage());
			}
		}

		return result;
		
	}
}