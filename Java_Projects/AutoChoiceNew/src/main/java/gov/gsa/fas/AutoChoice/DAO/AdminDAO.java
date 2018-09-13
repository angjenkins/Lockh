package gov.gsa.fas.AutoChoice.DAO;

import gov.gsa.fas.AutoChoice.DTO.RequisitionsFSRDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupAccessDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
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
public class AdminDAO {
	private SessionFactory sessionFactory = null;

    Logger logger = Logger.getLogger(CommonDAO.class.toString());

	public AdminDAO() {
        super();
        sessionFactory = HibernateAnnotationUtil.getSessionFactory();
    }

	/* Get group code and group code description based on the user privilege */
	@SuppressWarnings("unchecked")
	public ArrayList<UserGroupDTO> getGroupCodeList(UserAccountDTO user) throws Exception {

		ArrayList<UserGroupDTO> result = null;
		Transaction transaction = null;
		
		/*Query If user is Admin*/
		StringBuffer queryStringAdmin = new StringBuffer(
				"SELECT User_Group.Description as description, User_Group.Group_Code as group_Code");
		queryStringAdmin.append(" FROM  User_Group ");
		queryStringAdmin.append(" WHERE  Agency_Code = :agencyCode and");
		queryStringAdmin.append(" Bureau_Code = :bureauCode");
		
		/*Query If user is not an Admin*/
		StringBuffer queryStringNotAdmin = new StringBuffer("SELECT User_Group.Description as description, User_Group.Group_Code as group_Code");
		queryStringNotAdmin.append(" FROM User_Group,  User_Group_Access");
		queryStringNotAdmin.append(" WHERE ( User_Group.Group_Code = User_Group_Access.Group_Code ) and");
		queryStringNotAdmin.append(" ( User_Group.Agency_Code = User_Group_Access.Agency_Code ) and"); 
		queryStringNotAdmin.append(" ( User_Group.Bureau_Code = User_Group_Access.Bureau_Code ) and");
		queryStringNotAdmin.append(" ( User_Group.Agency_Code = :agencyCode ) and");
		queryStringNotAdmin.append(" ( User_Group.Bureau_Code = :bureauCode ) and");
		queryStringNotAdmin.append(" ( User_Group_Access.User_ID = :userId ) and");
		queryStringNotAdmin.append(" ( User_Group_Access.Privilege = :userPrivilige )");

		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = null;

			if (user.getPrivilege().equalsIgnoreCase("A")) {
				query = session
						.createSQLQuery(queryStringAdmin.toString())
						.addScalar("description", Hibernate.STRING)
						.addScalar("group_Code", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserGroupDTO.class));

				query.setParameter("agencyCode", user.getAgencyCode());
				query.setParameter("bureauCode", user.getBureauCode());
			} else {
				query = session
						.createSQLQuery(queryStringNotAdmin.toString())
						.addScalar("description", Hibernate.STRING)
						.addScalar("group_Code", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserGroupDTO.class));

				query.setParameter("agencyCode", user.getAgencyCode());
				query.setParameter("bureauCode", user.getBureauCode());
				query.setParameter("userId", user.getUserID());
				query.setParameter("userPrivilige", "S");
			}

			result = (ArrayList<UserGroupDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getGroupCodeList: Retrieving GroupList Failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return result;
	}

	/*Get the user details filtered by groupCode*/
	@SuppressWarnings("unchecked")
	public ArrayList<UserCombinedDTO> getUserDetails(String groupCode, UserAccountDTO currentUser) throws Exception {
		ArrayList<UserCombinedDTO> result = null;
		Transaction transaction = null;
		
		StringBuffer queryString = new StringBuffer(
				"SELECT User_Account.User_ID as userID,");
		queryString.append(" User_Account.FirstName as firstName,");   
		queryString.append(" User_Account.LastName as lastName,");
		queryString.append(" User_Account.MiddleName as middleName,");
		queryString.append(" User_Account.Telephone as telephone,"); 
		queryString.append(" User_Group_Access.Privilege as privilege,");
		queryString.append(" User_Account.Email as email,");
		queryString.append(" User_Group_Access.Group_Code as groupCode,");
		queryString.append(" User_Group_Access.Agency_Code as agencyCode,");
		queryString.append(" User_Group_Access.Bureau_Code as bureauCode");
		queryString.append(" FROM User_Group,");
		queryString.append(" User_Group_Access,");
		queryString.append(" User_Account");
		queryString.append(" WHERE ( User_Group.Agency_Code = :agencyCode ) and");
		queryString.append(" ( User_Group.Bureau_Code = :bureauCode ) and");
		queryString.append(" ( User_Group.Group_Code  = :groupCode) and");
		queryString.append(" ( User_Group.Agency_Code = User_Group_Access.Agency_Code ) and");
		queryString.append(" ( User_Group.Bureau_Code = User_Group_Access.Bureau_Code ) and");  
		queryString.append(" ( User_Group.Group_Code  = User_Group_Access.Group_Code ) and");
		queryString.append(" ( User_Group_Access.User_ID = User_Account.User_ID) and");
		queryString.append(" ( User_Group.Agency_Code = User_Account.Agency_Code ) and");
		queryString.append(" ( User_Group_Access.Bureau_Code = User_Account.Bureau_Code )");
		//queryString.append(" Order by User_Account.#ColumnName#  #SortOrder#
		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = null;

				query = session
						.createSQLQuery(queryString.toString())
						.addScalar("userID", Hibernate.STRING)
						.addScalar("firstName", Hibernate.STRING)
						.addScalar("lastName", Hibernate.STRING)
						.addScalar("middleName", Hibernate.STRING)
						.addScalar("telephone", Hibernate.STRING)
						.addScalar("privilege", Hibernate.STRING)
						.addScalar("email", Hibernate.STRING)
						.addScalar("groupCode", Hibernate.STRING)
						.addScalar("agencyCode", Hibernate.STRING)
						.addScalar("bureauCode", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserCombinedDTO.class));

				query.setParameter("agencyCode", currentUser.getAgencyCode());
				query.setParameter("bureauCode", currentUser.getBureauCode());
				query.setParameter("groupCode", groupCode);

			result = (ArrayList<UserCombinedDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getUserDetails: Retrieving UserDetailsList Failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return result;
	}

	/*Get all the existing group details*/	
	@SuppressWarnings("unchecked")
	public ArrayList<UserGroupDTO> getGroupAssignmentList(UserAccountDTO user) throws Exception {

		ArrayList<UserGroupDTO> result = null;
		Transaction transaction = null;
		
		StringBuffer queryString = new StringBuffer(
				"SELECT User_Group.Description as description, User_Group.Group_Code as group_Code");
		queryString.append(" FROM  User_Group ");
		queryString.append(" WHERE  Agency_Code = :agencyCode and");
		queryString.append(" Bureau_Code = :bureauCode");
		
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = null;

				query = session
						.createSQLQuery(queryString.toString())
						.addScalar("description", Hibernate.STRING)
						.addScalar("group_Code", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserGroupDTO.class));

				query.setParameter("agencyCode", user.getAgencyCode());
				query.setParameter("bureauCode", user.getBureauCode()); 

			result = (ArrayList<UserGroupDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getGroupList: Retrieving GroupAssignemntList Failed: "
						+ e.getMessage());
			}
			throw e;
		}
		
		return result;
	}


	/*Get UserGroupDTO record for the group code*/
	public UserGroupDTO getGroupDetails(String groupCode, String agencyCode, String bureauCode) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		UserGroupDTO result = null;
		
		try{
			Query query =  session.createQuery("FROM UserGroupDTO WHERE group_Code = :groupCode and agency_Code = :agencyCode and bureau_Code = :bureauCode");
			query.setParameter("groupCode", groupCode);
			query.setParameter("agencyCode", agencyCode);
			query.setParameter("bureauCode", bureauCode);
			
			if(query.list().size() > 0){
				result = (UserGroupDTO) query.list().get(0);
			}
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getGroupDetails: Select Group Details failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
		return result;
	}
	/*Adding a new Group or update an existing one*/
	public void addUpdateNewGroup(UserGroupDTO userGroupDTO) throws Exception {
		
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.saveOrUpdate(userGroupDTO);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.addNewGroup(): Adding a new User Group failed: "
						+ e.getMessage());
				throw e;
			}                
        }		
	}
	
	public void deleteGroup(UserGroupDTO dto) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.delete(dto);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Delete Group failed: "
						+ e.getMessage());
				throw e;
			}                
        }
	}

	public UserCombinedDTO getUserProfile(UserCombinedDTO userDetails) throws Exception {
		
		UserCombinedDTO result = null;
		Transaction transaction = null;
		
		StringBuffer queryString = new StringBuffer(
				"SELECT User_Account.User_ID as userID,");
		queryString.append(" User_Account.Password as passwd,");   
		queryString.append(" User_Account.FirstName as firstName,");
		queryString.append(" User_Account.LastName as lastName,");
		queryString.append(" User_Account.MiddleName as middleName,"); 
		queryString.append(" User_Account.Agency_Code as agencyCode,");  
		queryString.append(" User_Account.Bureau_Code as bureauCode,");  
		queryString.append(" User_Account.CAF_No as cafNo,");
		queryString.append(" User_Account.Telephone as telephone,");
		queryString.append(" User_Account.Fax as fax,");  
		queryString.append(" User_Account.Street as street,");
		queryString.append(" User_Account.City as city,");   
		queryString.append(" User_Account.State as state,");
		queryString.append(" User_Account.Country as country,");   
		queryString.append(" User_Account.ZipCode as zipcode,");   
		queryString.append(" User_Account.Created_By as createdBy,");
		queryString.append(" User_Account.Date_Created as dateCreated,");
		queryString.append(" User_Account.Date_Last_Updated as dateLastUpdated,");
		queryString.append(" User_Account.Modified_By as modifiedBy,"); 
		queryString.append(" User_Group_Access.Privilege as privilege,");
		queryString.append(" User_Account.Email as email,");  
		queryString.append(" User_Account.DateLastVisited as dateLastVisited,");
		queryString.append(" User_Account.Telephone_Ext as telephoneExt,");
		queryString.append(" User_Account.Address_1 as address1,");
		queryString.append(" User_Account.Address_2 as address2,");
		queryString.append(" User_Account.Address_3 as address3,");
		queryString.append(" User_Account.otherTelephone as otherTelephone");
		queryString.append(" FROM User_Account, User_Group_Access");
		queryString.append(" Where ltrim(rtrim(ucase(User_Account.User_ID))) = ucase( :userID) and");
		queryString.append(" User_Account.User_ID = User_Group_Access.User_ID and");
		queryString.append(" User_Group_Access.Group_Code = :groupCode and");
		queryString.append(" User_Group_Access.Agency_Code= :agencyCode and");
		queryString.append(" User_Group_Access.Bureau_Code= :bureauCode");
		 
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = null;

				query = session
						.createSQLQuery(queryString.toString())
						.addScalar("userID", Hibernate.STRING)
						.addScalar("passwd", Hibernate.STRING)
						.addScalar("firstName", Hibernate.STRING)
						.addScalar("lastName", Hibernate.STRING)
						.addScalar("middleName", Hibernate.STRING)						
						.addScalar("agencyCode", Hibernate.STRING)
						.addScalar("bureauCode", Hibernate.STRING)						
						.addScalar("cafNo", Hibernate.STRING)
						.addScalar("telephone", Hibernate.STRING)						
						.addScalar("fax", Hibernate.STRING)
						.addScalar("street", Hibernate.STRING)
						.addScalar("city", Hibernate.STRING)
						.addScalar("state", Hibernate.STRING)						
						.addScalar("country", Hibernate.STRING)						
						.addScalar("zipcode", Hibernate.INTEGER)
						.addScalar("createdBy", Hibernate.STRING)
						.addScalar("dateCreated", Hibernate.TIMESTAMP)
						.addScalar("dateLastUpdated", Hibernate.TIMESTAMP)
						.addScalar("modifiedBy", Hibernate.STRING)
						.addScalar("privilege", Hibernate.STRING)
						.addScalar("email", Hibernate.STRING)
						.addScalar("dateLastVisited", Hibernate.TIMESTAMP)						
						.addScalar("telephoneExt", Hibernate.STRING)
						.addScalar("address1", Hibernate.STRING)
						.addScalar("address2", Hibernate.STRING)
						.addScalar("address3", Hibernate.STRING)
						.addScalar("otherTelephone", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserCombinedDTO.class));
				
				query.setParameter("userID", userDetails.getUserID());
				query.setParameter("agencyCode", userDetails.getAgencyCode());
				query.setParameter("bureauCode", userDetails.getBureauCode());
				query.setParameter("groupCode", userDetails.getGroupCode());

			if(query.list().size() > 0){
				result = (UserCombinedDTO) query.list().get(0);
			}
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getUserViewProfile: Retrieving User View Profile failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return result;
	}

	public void deleteUser(UserGroupAccessDTO dto) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		try{
			session.delete(dto);
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Deleting User failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
	}

	public void updateUser(UserCombinedDTO userCombinedDTO,
			UserAccountDTO currentUser) throws Exception {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Calendar nowCal = Calendar.getInstance();
		Timestamp currentDate = new Timestamp(nowCal.getTimeInMillis());

		StringBuffer updUserAccountString = new StringBuffer(
				"Update User_Account");
		updUserAccountString.append(" set  FirstName  = :firstName,");
		updUserAccountString.append(" LastName   = :lastName,");
		updUserAccountString.append(" MiddleName = :middleName,");
		updUserAccountString.append(" Address_1  = :address1,");
		updUserAccountString.append(" Address_2  = :address2,");
		updUserAccountString.append(" Address_3  = :address3,");
		updUserAccountString.append(" Telephone  = :telephone,");
		updUserAccountString.append(" City = :city,");
		updUserAccountString.append(" State = :state,");
		updUserAccountString.append(" Country = :country,");
		updUserAccountString.append(" ZipCode = :zipcode,");
		updUserAccountString.append(" Email = :email,");
		updUserAccountString.append(" Telephone_Ext = :telephoneExt,");
		updUserAccountString.append(" OtherTelephone = :otherTelephone,");
		updUserAccountString.append(" Date_Last_Updated = :dateLastUpdated,");
		updUserAccountString.append(" Modified_By =  :modifiedBy");
		updUserAccountString
				.append(" Where User_ID = ucase(ltrim(rtrim( :userID)))");

		StringBuffer updUserAccessString = new StringBuffer(" Update User_Group_Access");
		updUserAccessString.append(" set Privilege = :privilege");  
		updUserAccessString.append(" Where ltrim(rtrim(User_ID)) = ucase(trim( :userID)) and");
		updUserAccessString.append(" Group_Code = :groupCode and");
		updUserAccessString.append(" Agency_Code = :agencyCode and");
		updUserAccessString.append(" Bureau_Code = :bureauCode");
		try {

			Query updUserAccountQuery = session.createSQLQuery(updUserAccountString
					.toString());

			updUserAccountQuery.setParameter("firstName", userCombinedDTO.getFirstName());
			updUserAccountQuery.setParameter("lastName", userCombinedDTO.getLastName());
			updUserAccountQuery.setParameter("middleName", userCombinedDTO.getMiddleName());
			updUserAccountQuery.setParameter("address1", userCombinedDTO.getAddress1());
			updUserAccountQuery.setParameter("address2", userCombinedDTO.getAddress2());
			updUserAccountQuery.setParameter("address3", userCombinedDTO.getAddress3());			
			updUserAccountQuery.setParameter("telephone", userCombinedDTO.getTelephone());
			updUserAccountQuery.setParameter("city", userCombinedDTO.getCity());
			updUserAccountQuery.setParameter("state", userCombinedDTO.getState());			
			updUserAccountQuery.setParameter("country", userCombinedDTO.getCountry());
			updUserAccountQuery.setParameter("zipcode", userCombinedDTO.getZipcode());
			updUserAccountQuery.setParameter("email", userCombinedDTO.getEmail());			
			updUserAccountQuery.setParameter("telephoneExt", userCombinedDTO.getTelephoneExt() );
			updUserAccountQuery.setParameter("otherTelephone", userCombinedDTO.getOtherTelephone());
			updUserAccountQuery.setParameter("dateLastUpdated",currentDate);
			updUserAccountQuery.setParameter("modifiedBy",currentUser.getUserID());
			updUserAccountQuery.setParameter("userID", userCombinedDTO.getUserID());

			updUserAccountQuery.executeUpdate();
			
			Query updUserAccessQuery = session.createSQLQuery(updUserAccessString
					.toString());

			updUserAccessQuery.setParameter("privilege", userCombinedDTO.getPrivilege());
			updUserAccessQuery.setParameter("userID", userCombinedDTO.getUserID());
			updUserAccessQuery.setParameter("groupCode", userCombinedDTO.getGroupCode());
			updUserAccessQuery.setParameter("agencyCode", userCombinedDTO.getAgencyCode());
			updUserAccessQuery.setParameter("bureauCode", userCombinedDTO.getBureauCode());
			
			updUserAccessQuery.executeUpdate();
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("Updating User Profile failed: " + e.getMessage());
				throw e;
			}
		}
	}
	
	/*Users List to add to a new group*/
	@SuppressWarnings("unchecked")
	public ArrayList<UserCombinedDTO> getUsersToAddInGroup(String groupCode, UserAccountDTO currentUser) throws Exception{
		
		ArrayList<UserCombinedDTO> result = null;
		Transaction transaction = null;
		
		StringBuffer queryString = new StringBuffer(
				"SELECT User_Account.User_ID as userID,");   
		queryString.append(" User_Account.FirstName as firstName,"); 
		queryString.append(" User_Account.LastName as lastName,");  
		queryString.append(" User_Account.MiddleName as middleName,");
		queryString.append(" User_Account.City as city,");
		queryString.append(" User_Account.State as state,");
		queryString.append(" User_Account.Telephone as telephone");
		queryString.append(" FROM User_Account");
		queryString.append(" WHERE User_Account.Agency_Code = :agencyCode AND");
		queryString.append(" User_Account.Bureau_Code = :bureauCode AND");
		queryString.append(" User_Account.User_ID NOT IN (");
		queryString.append(" SELECT User_Group_Access.User_ID");
		queryString.append(" FROM User_Group_Access,User_Account");
		queryString.append(" WHERE (User_Group_Access.User_ID = User_Account.User_ID) and");
		queryString.append(" ( User_Group_Access.Agency_Code = :agencyCode ) AND"); 
		queryString.append(" ( User_Group_Access.Bureau_Code = :bureauCode ) AND");  
		queryString.append(" ( User_Group_Access.Group_Code = :groupCode ))");
		try {
			Session session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			Query query = null;

				query = session
						.createSQLQuery(queryString.toString())
						.addScalar("userID", Hibernate.STRING)
						.addScalar("firstName", Hibernate.STRING)
						.addScalar("lastName", Hibernate.STRING)
						.addScalar("middleName", Hibernate.STRING)
						.addScalar("city", Hibernate.STRING)
						.addScalar("state", Hibernate.STRING)
						.addScalar("telephone", Hibernate.STRING)
						.setResultTransformer(
								Transformers.aliasToBean(UserCombinedDTO.class));

				query.setParameter("agencyCode", currentUser.getAgencyCode());
				query.setParameter("bureauCode", currentUser.getBureauCode());
				query.setParameter("groupCode", groupCode);

			result = (ArrayList<UserCombinedDTO>) query.list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
				System.out.println("AdminDAO.getUsersToAddInGroup: Retrieving User Details Failed: "
						+ e.getMessage());
			}
			throw e;
		}
		return result;
		 
	}

	public void addNewUser(List<UserGroupAccessDTO> userDTOList) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		int insertCount = 0;
		try{
			for(UserGroupAccessDTO dto: userDTOList){
				
				session.save(dto);
				
				if ( ++insertCount % 10 == 0 ) {
			        //flush a batch of updates and release memory:
			        session.flush();
			        session.clear();
			    }
			}
			
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("Delete Group failed: "
						+ e.getMessage());
				throw e;
			}                
        }
		
	}
		
}
