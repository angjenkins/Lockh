package gov.gsa.fas.AutoChoice.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

import gov.gsa.fas.AutoChoice.DAO.CommonDAO;
import gov.gsa.fas.AutoChoice.DAO.UserAccessDAO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.beans.MyProfileBean;
import gov.gsa.fas.AutoChoice.util.EncryptSHA1;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class MyProfileService {
	Logger logger = Logger.getLogger(MyProfileService.class.toString());
	
	@Autowired
	private MyProfileBean myProfileBean = null;
	
	@Autowired
	private UserAccessDAO userAccessDAO = null;
	
	@Autowired
	private CommonDAO commonDAO = null;
	
	@Autowired
	private CommonService commonService = null;
	
	public CommonDAO getCommonDAO() {
		return commonDAO;
	}

	public void setCommonDAO(CommonDAO commonDAO) {
		this.commonDAO = commonDAO;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public MyProfileBean getMyProfileBean() {
		return myProfileBean;
	}

	public void setMyProfileBean(MyProfileBean myProfileBean) {
		this.myProfileBean = myProfileBean;
	}

	public void populateProfileDetails(String userName) {
		UserAccountDTO dto = new UserAccountDTO();
		try {
			dto = userAccessDAO.getUser(userName);
			dto.setStateList(commonDAO.getStateList(dto.getCountry()));
			dto.setTelPhNo1(dto.getTelephone().substring(0, 3));
			dto.setTelPhNo2(dto.getTelephone().substring(4, 7));
			dto.setTelPhNo3(dto.getTelephone().substring(8, dto.getTelephone().length()));
			getMyProfileBean().setUserAccountDTO(dto);
		} catch (Exception e) {
			logger.info("Error while populating the profile details.");
		}
	}

	public void save(MyProfileBean myProfileBean, String userId) {
		UserAccountDTO dto = new UserAccountDTO();
		UserAccountDTO formDTO = new UserAccountDTO();
		myProfileBean.setResult("");
		try {
			formDTO = myProfileBean.getUserAccountDTO();
			dto = userAccessDAO.getUser(userId);
			
			dto.setFirstName(formDTO.getFirstName());
			dto.setLastName(formDTO.getLastName());
			dto.setMiddleName(formDTO.getMiddleName());
			dto.setEmail(formDTO.getEmail());
			dto.setJobTitle(formDTO.getJobTitle());
			/* dto.setTelephone(formDTO.getTelephone()); */
			dto.setTelephone(formDTO.getTelPhNo1() + "-"
					+ formDTO.getTelPhNo2() + "-" + formDTO.getTelPhNo3());
			dto.setTelephoneExt(formDTO.getTelephoneExt());
			dto.setOtherTelephone(formDTO.getOtherTelephone());
			dto.setAddress1(formDTO.getAddress1());
			dto.setAddress2(formDTO.getAddress2());
			dto.setAddress3(formDTO.getAddress3());
			dto.setCity(formDTO.getCity());
			dto.setState(formDTO.getState());
			dto.setCountry(formDTO.getCountry());
			dto.setZipCode(formDTO.getZipCode());
			if (null != formDTO.getNewPassword1()
					&& formDTO.getNewPassword1().length() > 0
					&& null != formDTO.getNewPassword2()
					&& formDTO.getNewPassword2().length() > 0) {
				String pwOld = UtilsLib.cString(formDTO.getOldPassword());
				String pwNew1 = UtilsLib.cString(formDTO.getNewPassword1());
				String pwNew2 = UtilsLib.cString(formDTO.getNewPassword2());
								
				/*String encrpPrevPass = UtilsLib.cString(formDTO.getPasswordLast());*/
				String encrpPrevPass = UtilsLib.cString(dto.getPasswordLast());
				String encrptpwNew1 = EncryptSHA1.getInstance().encrypt(pwNew1);
				String encrptpwNew2 = EncryptSHA1.getInstance().encrypt(pwNew2);
				if (encrpPrevPass.equals(encrptpwNew1)
						|| encrpPrevPass.equals(encrptpwNew2)) {
					getMyProfileBean().setProfileResult("New Password/Confirm New Password should not be same as previous password.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[a-z]", pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must contain at least one LOWER CASE alphabet.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[A-Z]", pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must contain at least one UPPER CASE alphabet.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[0-9]", pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must contain at least one number.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (UtilsLib.findMatch("\\s", pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must not contain spaces.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must contain at least one special character.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (pwOld.equals(pwNew1)) {
					getMyProfileBean().setProfileResult("New Password must not be same as old password.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[a-z]", pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm New Password must contain at least one alphabet.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[A-Z]", pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm New Password must contain at least one alphabet.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[0-9]", pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm New Password must contain at least one number.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (UtilsLib.findMatch("\\s", pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm New Password must not contain spaces.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm New Password must contain at least one special character.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (pwOld.equals(pwNew2)) {
					getMyProfileBean().setProfileResult("Confirm new Password must not be same as old password.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				} else if (!pwNew2.equals(pwNew1)) {
					getMyProfileBean().setProfileResult("New Password and Confirm New Password do not match.  Please try again.");
					getMyProfileBean().setMyprofileRedirect(true);
				}
				String usrPass = EncryptSHA1.getInstance().encrypt(pwNew1);
				Timestamp _pwExpDt = new Timestamp((UtilsLib.addDays(
						new Date(), 500)).getTime());

				dto.setPassword(usrPass);
				dto.setModifiedBy(dto.getUserID());
				dto.setLastUpdatedDate(UtilsLib.getCurrentTS());
				dto.setDatePasswordChanged(UtilsLib.getCurrentTS());
				dto.setDatePasswordExpire(_pwExpDt);
				dto.setPasswordCounter(0);
				dto.setPasswordLast(usrPass);
				Timestamp today = UtilsLib.getCurrentTS();
				dto.setDatePasswordChanged(today);
			}
			
			if(!(getMyProfileBean().getProfileResult().length() > 0)) {
				if (userAccessDAO.saveOrUpdateUser(dto) == 1) {
					getMyProfileBean().setProfileResult("UserProfile has been updated successfully.");
					getMyProfileBean().setMyprofileRedirect(true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			myProfileBean.setProfileResult("Failed to update UserProfile.");
		}
	}

	private boolean validateEmail(String email) {
		String regex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[_A-Za-z0-9-]+)";
		return email.matches(regex);
	}
}
