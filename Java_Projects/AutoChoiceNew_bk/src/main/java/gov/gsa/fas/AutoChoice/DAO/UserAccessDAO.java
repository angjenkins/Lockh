package gov.gsa.fas.AutoChoice.DAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.ControlDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.DTO.UserGroupDTO;
import gov.gsa.fas.AutoChoice.util.HibernateAnnotationUtil;
import gov.gsa.fas.AutoChoice.util.UserException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserAccessDAO {
	
	
	Logger logger = Logger.getLogger(UserAccessDAO.class.toString());

	private SessionFactory sessionFactory = null;
	
	public UserAccessDAO() {
        super();
        sessionFactory = HibernateAnnotationUtil.getSessionFactory();
    }
	
	



	
	public UserAccountDTO getUser(String userName) throws UserException, Exception{
	    	Transaction transaction = null;
	    	
	    	
	    	UserAccountDTO user = null;
	    	
	    	try {
	    		Session session = sessionFactory.getCurrentSession();
	    		transaction = session.beginTransaction();
		
		    	// Get the B49UserAccessDTO object that has the idemail defined by the method parameter
		    	user = (UserAccountDTO)session.get(UserAccountDTO.class, userName);
		    	if( null != user ) {
		    		session.save(user);
		    	}
		    	else
		    	{
		    		
		    		throw new UserException(1,"Invalid User ID/Password! Please enter a valid User ID/Password.");
		    	}
		    	
		        transaction.commit();
	    	}catch(Exception ex) {
	    		logger.info("Exception while retrieving user : " + ex.getMessage());
	    		
	    		ex.printStackTrace();
	    		if( null != transaction ) {
	    			transaction.rollback();
	    		}
	    		throw new UserException(1,"Invalid User ID/Password! Please enter a valid User ID/Password.");
	    	}
			return user;         
	   }
	
	 
	 public UserAccountDTO validateUser(String userName,String password){
	    	Transaction transaction = null;
	    	UserAccountDTO user = null;
	    	try {
	    		Session session = sessionFactory.getCurrentSession();
	    		transaction = session.beginTransaction();

	    		user = (UserAccountDTO)session.get(UserAccountDTO.class, userName);
		    	if( null != user ) {
		    		session.save(user);
		    	}
		        transaction.commit();
	    	} catch(Exception ex) {
	    		logger.info("Exception while retrieving user : " + ex.getMessage());
	    		ex.printStackTrace();
	    		if( null != transaction ) {
	    			transaction.rollback();
	    		}
	    	}
	    	
	        return user;         
	   }
	
	public List<ControlDTO> getControl() {
    	Session session = sessionFactory.getCurrentSession();
    	Transaction transaction = session.beginTransaction();
    	List<ControlDTO> result = null;
    	
    	try{
	    	// Complete the statement that will load all B49UserAccessDTO objects from the database
	    	Query query = session.createQuery("from ControlDTO");
	    	
	        @SuppressWarnings("unchecked")
	        List<ControlDTO> queryResult = (List<ControlDTO>) query.list();
	        result = queryResult;
	        transaction.commit();
    	}
    	catch (Exception e) { 
            if (transaction != null) {
            	transaction.rollback();
            	System.out.println("Select Control failed: " + e.getMessage());
            	
            }
    	} 
        return result;        
    }
	
	 public int saveOrUpdateUser(UserAccountDTO dto ) {
		 int rowCount =0;
		 Transaction transaction =null;		       	
	       	try {
	       	 	Session session = sessionFactory.getCurrentSession();
	        	transaction = session.beginTransaction();
	       		session.saveOrUpdate(dto);
	           	transaction.commit();
	           	rowCount =1;
	       	}
	       	catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	            	System.out.println("Updating User failed: " + e.getMessage());            	
	            }
	           
	                
	        }
	    return rowCount;   	
   }
	
	 public void registerUser(UserCombinedDTO dto) throws Exception{
		 
		 	Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			Calendar nowCal = Calendar.getInstance();
			Timestamp currentDate = new Timestamp(nowCal.getTimeInMillis());

			StringBuffer insertUserAcctString = new StringBuffer(
					"Insert into User_Account");
			insertUserAcctString.append(" (User_ID, Password, FirstName,");
			insertUserAcctString.append(" LastName, MiddleName, Telephone,");
			insertUserAcctString.append(" Telephone_Ext, OtherTelephone, Agency_Code,");
			insertUserAcctString.append(" Bureau_Code, Date_Created, Date_Last_Updated,");
			insertUserAcctString.append(" Email, Privilege, Address_1, Address_2,");
			insertUserAcctString.append(" Address_3, City, State, Country,");
			insertUserAcctString.append(" ZipCode, Created_By, Job_Title)");
			insertUserAcctString.append(" values (ucase( :userID), :password , :firstName,");
			insertUserAcctString.append(" :lastName, :middleName, :telephone,");
			insertUserAcctString.append(" :ext, :otherTelephone, :agencyCode,");
			insertUserAcctString.append(" :bureauCode, :dateCreated, :dateLastUpd, :email, :privilege,");
			insertUserAcctString.append(" :address1, :address2,  :address3,");
			insertUserAcctString.append(" :city,:state, :country, :zipcode,");
			insertUserAcctString.append(" :userID, :jobTitle)");
			
			StringBuffer insertUserAccessString = new StringBuffer(
					" Insert into User_Group_Access");
			insertUserAccessString.append(" (User_ID, Agency_Code, Bureau_Code,");
			insertUserAccessString.append(" Group_Code, User_Last_Updated,");
			insertUserAccessString.append(" Date_Updated, Privilege)");
			insertUserAccessString.append(" values (ucase( :userID), :agencyCode,");
			insertUserAccessString.append(" :bureauCode, :groupCode, :userID,");
			insertUserAccessString.append(" :dateUpd, :privilege)");
			try{
				
				Query insertUserAcctQuery = session.createSQLQuery(insertUserAcctString
						.toString());
				
				insertUserAcctQuery.setParameter("userID", dto.getUserID());
				insertUserAcctQuery.setParameter("password", dto.getPasswd());
				insertUserAcctQuery.setParameter("firstName", dto.getFirstName());
				insertUserAcctQuery.setParameter("lastName", dto.getLastName());
				insertUserAcctQuery.setParameter("middleName", dto.getMiddleName());
				insertUserAcctQuery.setParameter("telephone", dto.getTelephone());
				insertUserAcctQuery.setParameter("ext", dto.getTelephoneExt());
				insertUserAcctQuery.setParameter("otherTelephone", dto.getOtherTelephone());
				insertUserAcctQuery.setParameter("agencyCode", dto.getAgencyCode());
				insertUserAcctQuery.setParameter("bureauCode", dto.getBureauCode());
				insertUserAcctQuery.setParameter("dateCreated", currentDate);
				insertUserAcctQuery.setParameter("dateLastUpd", currentDate);
				insertUserAcctQuery.setParameter("email", dto.getEmail());
				insertUserAcctQuery.setParameter("privilege",null);
				insertUserAcctQuery.setParameter("address1", dto.getAddress1());
				insertUserAcctQuery.setParameter("address2", dto.getAddress2());
				insertUserAcctQuery.setParameter("address3", dto.getAddress3());
				insertUserAcctQuery.setParameter("city", dto.getCity());
				insertUserAcctQuery.setParameter("state", dto.getState());
				insertUserAcctQuery.setParameter("country", dto.getCountry());
				insertUserAcctQuery.setParameter("zipcode", dto.getZipcode());
				insertUserAcctQuery.setParameter("userID", dto.getUserID());
				insertUserAcctQuery.setParameter("jobTitle", dto.getJobTitle());
				
				insertUserAcctQuery.executeUpdate();
				
				Query insertUserAccessQuery = session.createSQLQuery(insertUserAccessString
						.toString());
				
				String privilege = "2";
				if(dto.getAgencyCode().equals("14") && dto.getBureauCode().equals("17")){
					privilege ="1";
				}
				
				insertUserAccessQuery.setParameter("userID", dto.getUserID());
				insertUserAccessQuery.setParameter("agencyCode", dto.getAgencyCode());
				insertUserAccessQuery.setParameter("bureauCode", dto.getBureauCode());
				insertUserAccessQuery.setParameter("groupCode", "00001");
				insertUserAccessQuery.setParameter("userID", dto.getUserID());
				insertUserAccessQuery.setParameter("dateUpd", currentDate);
				insertUserAccessQuery.setParameter("privilege", privilege);
				
				insertUserAccessQuery.executeUpdate();
				
	           	transaction.commit();
	       	}
	       	catch (Exception e) { 
	            if (transaction != null) {
	            	transaction.rollback();
	            	System.out.println("Registering User failed: " + e.getMessage());        
	            	throw e;
	            }	           
	                
	        }
	 }






	@SuppressWarnings("unchecked")
	public ArrayList<AgBuTableDTO> getAgencyBureauDetails(String agencyCode,
			String bureauCode) throws Exception {
		
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<AgBuTableDTO> result = null;
		try{
			Query query =  session.createQuery("FROM AgBuTableDTO WHERE agency_Code = :agencyCode and bureau_Code = :bureauCode");
			query.setParameter("agencyCode", agencyCode);
			query.setParameter("bureauCode", bureauCode);
			
			result = (ArrayList<AgBuTableDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("UserAccessDAO.getAgencyBureauDetails: Retrieving Agency Bureau Details failed"
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}






	@SuppressWarnings("unchecked")
	public ArrayList<UserAccountDTO> getUserDetails(String userID) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		ArrayList<UserAccountDTO> result = null;
		
		try{
			Query query =  session.createQuery("FROM UserAccountDTO WHERE ucase(userID) = ucase( :userID)");
			query.setParameter("userID", userID);
			
			result = (ArrayList<UserAccountDTO>) query.list();
            transaction.commit();
		}
		catch (Exception e) { 
     		if (transaction != null) {
				transaction.rollback();
				System.out.println("UserAccessDAO.getUserDetails: Retrieving User Details failed"
						+ e.getMessage());
				throw e;
			}                
        }
		return result;
	}
	
}
