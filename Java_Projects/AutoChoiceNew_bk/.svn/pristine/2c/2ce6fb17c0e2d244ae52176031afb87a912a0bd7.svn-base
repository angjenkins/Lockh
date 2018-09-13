package gov.gsa.fas.AutoChoice.service;

import gov.gsa.fas.AutoChoice.DAO.UserAccessDAO;
import gov.gsa.fas.AutoChoice.DTO.AgBuTableDTO;
import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.beans.OrderStatusBean;
import gov.gsa.fas.AutoChoice.util.EncryptSHA1;
import gov.gsa.fas.AutoChoice.util.SendMail;
import gov.gsa.fas.AutoChoice.util.UserException;
import gov.gsa.fas.AutoChoice.util.UtilsLib;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class LoginService {

	Logger logger = Logger.getLogger(LoginService.class.toString());

	@Autowired
	private LoginBean loginBean;

	@Autowired
	private UserAccessDAO userAccessDAO;

	private String nextpage = "";
	private String message = "";
	private String pageAction = "";
	private String fromPage = "";
	private UserException errMsg = null;
	private Exception ErrMsg01 = null;
	private String errFlg = null;
	private String token = "";
	private String command = null;
	private String result = null;

	private UserAccountDTO dataUser;
	private UserAccountDTO currentUser;
	private String validationResult = "";

	public void performLogout(HttpServletRequest request) {
		if (null == request) {
			logger.info("Request is null");
			return;
		}
		if (null == request.getSession()) {
			logger.info("Request is null");
			return;
		}
		request.getSession().invalidate();
		loginBean.setCurrentUser(null);
		loginBean.setResult("");
	}

	// * @return the result
	public String getResult() {
		return result;
	}

	// * @param result
	// * the result to set
	public void setResult(String result) {
		this.result = result;
	}

	public String getValidationResult() {
		return validationResult;
	}

	public void setValidationResult(String validationResult) {
		this.validationResult = validationResult;
	}

	public void validateFPHintW(UserAccountDTO dho, String answer,
			String question) throws UserException {
		if (dho.getPasswordQuestion() != null
				&& !dho.getPasswordQuestion().trim().equals("")) {
			if ("".equals(answer.trim())) {
				throw new UserException(1,
						"Password Hint Answer is required.  Please try again.");
			}
			// Hint Answers and passwords must match
			else if (!(EncryptSHA1.getInstance().encrypt(answer).equals(dho
					.getPasswordAnswer()))) {
				String msg1 = "Invalid Hint Answer. Please Try Again.";
				// System.out.println("answer:" +
				// (EncryptSHA1.getInstance().encrypt(answer)) +
				// ":"+dho.getHintAnswer());
				throw new UserException(1, msg1);
			}
		} else {
			if ("".equals(question.trim())) {
				throw new UserException(1,
						"Password Hint Question is required.  Please try again.");
			}
			if ("".equals(answer.trim())) {
				throw new UserException(1,
						"Password Hint Answer is required.  Please try again.");
			}
		}

	}

	public void performTask(LoginBean req) {

		String UserPswd = "";
		String userId = "";
		UserAccountDTO dataUser = loginBean.getUserAccountDTO();
		UserAccountDTO currentUser = loginBean.getUserAccountDTO();
		String nextPage = "";

		String avLid = req.getUserAccountDTO().getUserID();
		String avPassword = req.getUserAccountDTO().getPassword();
		String action = UtilsLib.cString(req.getPageAction());
		String defaultPW = "";
		String userType = null;

		boolean successFlag = false;
		HttpSession session = null;
		int loginFailCnt = 0;
		String pwdFail = "N";

		loginBean.setMessage(null);
		loginBean.setErrFlg(null);
		loginBean.setErrMsg(null);
		loginBean.setErrMsg01(null);
		loginBean.setNextpage(null);
		loginBean.setFromPage(null);

		try {
			defaultPW = "12345678";

			initialValidation(avLid);
			if ("Submit".equals(action)) {
				initialValidationPwd(avPassword);
			}

			dataUser = userAccessDAO.getUser(avLid);
			loginBean.setUserAccountDTO(dataUser);
			loginFailCnt = dataUser.getPasswordCounter();

			if (dataUser.getPasswordCounter() >= 5) {
				throw new UserException(
						3,
						"You tried more than five times, please contact GSA for resetting the password.");
			}

			/*
			 * Suspended Column not yet added*****************
			 * 
			 */ 
			  if ("I".equals(dataUser.getStatus().toUpperCase().trim())) { throw new
			  UserException( 3,
			  "You account is suspended. please contact GSA."); }
			 

			Timestamp pwExpDt = dataUser.getDatePasswordExpire();
			//Timestamp pwExpDt = new Timestamp(
			//		(UtilsLib.addDays(new Date(), 500)).getTime());
			Timestamp todayDt = UtilsLib.getCurrentTS();
			Timestamp dtLastLogon = dataUser.getDateLastVisited();

			long timeDiff = pwExpDt.getTime() - todayDt.getTime();
			timeDiff = timeDiff / (1000 * 60 * 60 * 24);

			UserPswd = dataUser.getPassword();
			userId = dataUser.getUserID();
			userType = dataUser.getPrivilege();
			dataUser.setPasswordCounter(loginFailCnt);

			if ("ForgotPw".equals(action)) {
				// If user with default password clicks on Forgot Password Link,
				// redirect user to Login page
				// and display message stating user password has previously been
				// reset and to see admin for further assistance.

				if ((EncryptSHA1.getInstance().encrypt(defaultPW)
						.equals(UserPswd)))// !!!REMOVE SUBSTRING ONCE DB FIELD
				// IS EXPANDED
				{
					throw new UserException(
							1,
							"Your Password was previously reset, please use the reset password.<br>"
									+ "For further assistance, please see System Admin .");
				}
				if (todayDt.after(pwExpDt)) {
					throw new UserException(3,
							"Your Password was expired. please contact GSA for resetting the password.");
				}

				// When User clicks Forgot Password link on Login page.
				// return forgot password jsp
				loginBean.setNextpage("forgotPassword");
				return;
			}
			// Validate Hint Answer, and New/Confirm Passwords and update
			// with new Password
			else if ("ForgotPwUpd".equals(action)) {
				String question = UtilsLib.cString(req.getUserAccountDTO()
						.getPasswordQuestion());
				String answer = UtilsLib.cString(req.getUserAccountDTO()
						.getPasswordAnswer());
				String pwNew1 = UtilsLib.cString(req.getUserAccountDTO()
						.getNewPassword1());
				;
				String pwNew2 = UtilsLib.cString(req.getUserAccountDTO()
						.getNewPassword2());

				// Validate Hint Answer and New/Confirm Passwords

				validateFPHintW(dataUser, answer, question);
				validateUserFPW(pwNew1, defaultPW, "New Password ");
				validateUserFPW(pwNew2, defaultPW, "Confirm New Password ");

				if (!(pwNew1.equals(pwNew2))) {
					String msg1 = "New and Confirm Password must match, Please Try Again.";
					throw new UserException(1, msg1);
				}

				String encrpPrevPass = UtilsLib.cString(dataUser
						.getPasswordLast());
				String encrptpwNew1 = EncryptSHA1.getInstance().encrypt(pwNew1);
				String encrptpwNew2 = EncryptSHA1.getInstance().encrypt(pwNew2);

				if (encrpPrevPass.equals(encrptpwNew1)
						|| encrpPrevPass.equals(encrptpwNew2)) {
					throw new UserException(
							1,
							"New Password/Confirm New Password should not be same as previous password.  Please try again.");
				}

				// Set new Password to save to database
				Timestamp _pwExpDt = new Timestamp((UtilsLib.addDays(
						new Date(), 500)).getTime());

				dataUser.setPassword(EncryptSHA1.getInstance().encrypt(pwNew1));
				dataUser.setModifiedBy(dataUser.getUserID());
				dataUser.setLastUpdatedDate(UtilsLib.getCurrentTS());
				dataUser.setDatePasswordChanged(UtilsLib.getCurrentTimeStamp());
				dataUser.setDatePasswordExpire(_pwExpDt);
				dataUser.setPasswordCounter(0);
				dataUser.setPasswordLast(EncryptSHA1.getInstance().encrypt(
						pwNew1));

				if (dataUser.getPasswordQuestion() == null
						|| dataUser.getPasswordQuestion().trim().equals("")) {

					dataUser.setPasswordQuestion(req.getUserAccountDTO()
							.getPasswordQuestion());
					dataUser.setPasswordAnswer(EncryptSHA1
							.getInstance()
							.encrypt(
									req.getUserAccountDTO().getPasswordAnswer()));

				}
				// Update with new password if it passes validation

				userAccessDAO.saveOrUpdateUser(dataUser);

				loginBean
						.setMessage("*** Password Updated Successfully.  Please login again. ***");
				loginBean.setCurrentUser(dataUser);
				loginBean.setNextpage("home");
				return;
			}

			if ("Submit".equals(action)) {
				
				// If password is defaultPW that means either a new user or
				// user's password has been reset
				// In either case the user will be directed to change his/her
				// password before logging in
				String Pwd = EncryptSHA1.getInstance().encrypt(avPassword);
				boolean valid = false;

				if ((defaultPW.equals(avPassword))
						|| (dataUser.getPasswordQuestion() == null || dataUser
								.getPasswordQuestion().trim().equals(""))) {// Initial
																			// login
																			// or
																			// user's
					// password has been reset.
					// Directs user to change
					// password page.
					valid = validateUser(UserPswd, Pwd, loginFailCnt);
					if (!valid) {
						String msg1 = "Invalid Password, Please Try Again.";
						dataUser.setPasswordCounter(dataUser
								.getPasswordCounter() + 1);

						if (dataUser.getPasswordCounter() >= 5) {
							userAccessDAO.saveOrUpdateUser(dataUser);
							throw new UserException(3,
									"You tried more than  5 times, please contact GSA for resetting the password.");
						} else {
							pwdFail = "Y";
							userAccessDAO.saveOrUpdateUser(dataUser);
							throw new UserException(1, msg1);
						}
					}
					// apm for vulnerability cross-site issue 04/05/2012
					createToken(userId, session);

					dataUser.setPasswordCounter(0);
					loginBean.setFromPage("home");

					loginBean.setNextpage("changePassword");
					return;
				}

				valid = validateUser(UserPswd, Pwd, loginFailCnt);
				if (!valid) {
					String msg1 = "Invalid Password, Please Try Again.";
					dataUser.setPasswordCounter(dataUser.getPasswordCounter() + 1);

					if (dataUser.getPasswordCounter() >= 5) {
						userAccessDAO.saveOrUpdateUser(dataUser);
						throw new UserException(3,
								"You tried more than 5 times, please contact GSA for resetting the password.");
					} else {
						pwdFail = "Y";
						userAccessDAO.saveOrUpdateUser(dataUser);
						throw new UserException(1, msg1);
					}

				}

				if (todayDt.after(pwExpDt)) {
					throw new UserException(3,
							"Your Password was expired. please contact GSA for resetting the password.");
				}

				if (dtLastLogon != null) {
					long timeDiffLastLogon = todayDt.getTime()
							- dtLastLogon.getTime();
					timeDiffLastLogon = timeDiffLastLogon
							/ (1000 * 60 * 60 * 24);

					if (todayDt.after(dtLastLogon)) {

						/*
						if (Math.abs(timeDiffLastLogon) > 400) {
							loginBean.setFromPage("home");
							throw new UserException(
									3,
									"You have exceeded more than 400 days of inactivity since your last logon to the system. Please contact GSA.");

						}*/
					}

				}

				// Get new session
				dataUser.setPasswordCounter(0);

				// apm for vulnerability cross-site issue 04/05/2012
				createToken(userId, session);

				// update DateLogonLast
				dataUser.setDateLastVisited(UtilsLib.getCurrentTimeStamp());
				userAccessDAO.saveOrUpdateUser(dataUser);

				loginBean.setCurrentUser(dataUser);
				loginBean.setNextpage("stdItem");
				return;
			}

			loginBean.setNextpage("home");
			return;

		} catch (UserException uex) {
			dataUser.setUserID(avLid);

			if (uex.getUserExType() == 1) {
				loginBean.setErrMsg(uex);
				loginBean.setErrFlg("Y");

				// System.out.println("IN LOG-EX " + uex.userExDetail);
				nextPage = "home";

				if (pwdFail.equals("Y")) {
					nextPage = "home";
				}
				if ("ForgotPwUpd".equals(UtilsLib.cString(req.getPageAction()))) {
					nextPage = "forgotPassword";
				}
				loginBean.setNextpage(nextPage);
				return;
			}

			if (uex.getUserExType() == 3) {
				loginBean.setErrMsg(uex);
				loginBean.setErrFlg("Y");
				nextPage = "suspended";
				loginBean.setNextpage(nextPage);
				return;
			}

			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
			return;
		}

		catch (Exception ex) {
			dataUser.setUserID(avLid);
			ex = new UserException(9, " Exception  Ex",
					UtilsLib.getStackTrace(ex));
			loginBean.setErrMsg01(ex);
			loginBean.setNextpage("ErrMsg01");
			return;
		}

	}

	public void initialValidation(String scLid) throws UserException {
		if (scLid == null || scLid.equalsIgnoreCase("")) {
			throw new UserException(1,
					"Invalid User ID, Please Enter a Valid User ID.");
		}

	}

	private void initialValidationPwd(String scPassword) throws UserException {
		if (scPassword == null || scPassword.equalsIgnoreCase("")) {
			throw new UserException(1, "Invalid Password. Please try again.");
		}

	}

	// Validate User Info on Forgot Password
	public void validateUserFPW(String pwNew, String defaultPW, String fldDesc)
			throws UserException {
		if ("".equals(pwNew.trim())) {
			throw new UserException(1, fldDesc
					+ " is required.  Please try again.");
		} else if ((pwNew.length() < 8) || (pwNew.length() > 16)) {
			throw new UserException(
					1,
					fldDesc
							+ " must contain more than 8 characters and less than 16 characters .  Please try again.");
		} else if (!UtilsLib.findMatch("[a-z]", pwNew)) {
			throw new UserException(
					1,
					fldDesc
							+ " must contain at least one LOWER CASE alphabet.  Please try again.");
		} else if (!UtilsLib.findMatch("[A-Z]", pwNew)) {
			throw new UserException(
					1,
					fldDesc
							+ " must contain at least one UPPER CASE alphabet.  Please try again.");
		} else if (!UtilsLib.findMatch("[0-9]", pwNew)) {
			throw new UserException(1, fldDesc
					+ " must contain at least one number.  Please try again.");
		} else if (UtilsLib.findMatch("\\s", pwNew)) {
			throw new UserException(1, fldDesc
					+ " must not contain spaces.  Please try again.");
		} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", pwNew)) {
			throw new UserException(
					1,
					fldDesc
							+ " must contain at least one special character.  Please try again.");
		} else if (defaultPW.equals(pwNew)) {
			throw new UserException(
					1,
					fldDesc
							+ " must not be same as default password.  Please try again.");
		}
	}

	public void createToken(String userId, HttpSession session) {

		Timestamp todayDt = UtilsLib.getCurrentTS();
		// System.out.println("In Token");
		String tokenkey = EncryptSHA1.getInstance().encrypt(
				userId + todayDt.getTime());

		// session.setAttribute("token", tokenkey);
		loginBean.setToken(tokenkey);
	}

	public boolean validateUser(String dbPwd, String encrytPass,
			int loginFailCnt) throws UserException {
		return (dbPwd.equals(encrytPass));
	}

	public void changePassword(LoginBean tmploginBean) {
		String loginJSP = "home";
		String changePwJSP = "changePassword";
		String nextPage = "";
		String action = UtilsLib.cString(tmploginBean.getPageAction());

		loginBean.setMessage(null);
		loginBean.setErrFlg(null);
		loginBean.setErrMsg(null);
		loginBean.setErrMsg01(null);
		loginBean.setNextpage(null);
		loginBean.setFromPage(null);

		// If coming from Login page then return login password page else return
		// change Password page
		if ("home".equals(tmploginBean.getFromPage()))
			nextPage = loginJSP;
		else
			nextPage = changePwJSP;

		try {
			UserAccountDTO cntrl = userAccessDAO.getUser(tmploginBean
					.getUserAccountDTO().getUserID());
			String defaultPW = "12345678";

			if ("Update".equals(action)) {

				// Sets User Id
				String userID = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getUserID());

				String pwOld = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getOldPassword());
				String pwNew1 = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getNewPassword1());
				String pwNew2 = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getNewPassword2());
				String hintQuestion = UtilsLib.cString(tmploginBean
						.getUserAccountDTO().getPasswordQuestion());
				String pwHint = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getPasswordAnswer());
				String email = UtilsLib.cString(tmploginBean.getUserAccountDTO()
						.getEmail());

				String encrpPrevPass = UtilsLib.cString(tmploginBean
						.getUserAccountDTO().getPasswordLast());
				String encrptpwNew1 = EncryptSHA1.getInstance().encrypt(pwNew1);
				String encrptpwNew2 = EncryptSHA1.getInstance().encrypt(pwNew2);

				cntrl.setOldPassword(pwOld);
				cntrl.setNewPassword1(pwNew1);
				cntrl.setNewPassword2(pwNew2);
				cntrl.setPasswordQuestion(hintQuestion);
				cntrl.setPasswordAnswer(pwHint);
				loginBean.setUserAccountDTO(cntrl);

				if ("".equals(userID.trim())) {
					throw new UserException(1,
							"User ID is required.  Please try again.");
				} else if ("".equals(pwOld.trim())) {
					throw new UserException(1,
							"Old Password is required.  Please try again.");
				} else if ("".equals(pwNew1.trim())) {
					throw new UserException(1,
							"New Password is required.  Please try again.");
				} else if ("".equals(pwNew2.trim())) {
					throw new UserException(1,
							"Confirm New Password is required.  Please try again.");
				} else if (encrpPrevPass.equals(encrptpwNew1)
						|| encrpPrevPass.equals(encrptpwNew2)) {
					throw new UserException(
							1,
							"New Password/Confirm New Password should not be same as previous password.  Please try again.");
				} else if ((pwNew1.length() < 8) || (pwNew1.length() > 16)) {
					throw new UserException(
							1,
							"New Password must contain more than 8 characters and less than 16 characters .  Please try again.");
				} else if (!UtilsLib.findMatch("[a-z]", pwNew1)) {
					throw new UserException(
							1,
							"New Password must contain at least one LOWER CASE alphabet.  Please try again.");
				} else if (!UtilsLib.findMatch("[A-Z]", pwNew1)) {
					throw new UserException(
							1,
							"New Password must contain at least one UPPER CASE alphabet.  Please try again.");
				} else if (!UtilsLib.findMatch("[0-9]", pwNew1)) {
					throw new UserException(1,
							"New Password must contain at least one number.  Please try again.");
				} else if (UtilsLib.findMatch("\\s", pwNew1)) {
					throw new UserException(1,
							"New Password must not contain spaces.  Please try again.");
				} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", pwNew1)) {
					throw new UserException(1,
							"New Password must contain at least one special character.  Please try again.");
				} else if (pwOld.equals(pwNew1)) {
					throw new UserException(1,
							"New Password must not be same as old password.  Please try again.");
				} else if (defaultPW.equals(pwNew1)) {
					throw new UserException(1,
							"New Password must not be same as default password.  Please try again.");
				} else if ((pwNew2.length() < 8) || (pwNew2.length() > 16)) {
					throw new UserException(
							1,
							"Confirm New Password must contain more than 8 characters and less than 16 characters .  Please try again.");
				} else if (!UtilsLib.findMatch("[a-z]", pwNew2)) {
					throw new UserException(1,
							"Confirm New Password must contain at least one alphabet.  Please try again.");
				} else if (!UtilsLib.findMatch("[A-Z]", pwNew2)) {
					throw new UserException(1,
							"Confirm New Password must contain at least one alphabet.  Please try again.");
				} else if (!UtilsLib.findMatch("[0-9]", pwNew2)) {
					throw new UserException(1,
							"Confirm New Password must contain at least one number.  Please try again.");
				} else if (UtilsLib.findMatch("\\s", pwNew2)) {
					throw new UserException(1,
							"Confirm New Password must not contain spaces.  Please try again.");
				} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", pwNew2)) {
					throw new UserException(
							1,
							"Confirm New Password must contain at least one special character.  Please try again.");
				} else if (pwOld.equals(pwNew2)) {
					throw new UserException(1,
							"Confirm new Password must not be same as old password.  Please try again.");
				} else if (defaultPW.equals(pwNew2)) {
					throw new UserException(1,
							"Confirm New Password must not be same as default password.  Please try again.");
				} else if (!pwNew2.equals(pwNew1)) {
					throw new UserException(1,
							"New Password and Confirm New Password do not match.  Please try again.");
				} else if ("".equals(hintQuestion.trim())) {
					throw new UserException(1,
							"Password Hint Question is required.  Please try again.");
				} else if ("".equals(pwHint.trim())) {
					throw new UserException(1,
							"Password Hint Answer is required.  Please try again.");
				} else if ("".equals(email.trim())) {
					throw new UserException(1,
							"Email is required.  Please try again.");
				}

				boolean valid = false;
				String UserPswd = cntrl.getPassword();

				valid = validateUser(UserPswd, EncryptSHA1.getInstance()
						.encrypt(pwOld), 0);

				if (!valid) {
					throw new UserException(1,
							"User ID/Password does not match.  Please try again.");
				}

				String usrPass = EncryptSHA1.getInstance().encrypt(pwNew1);
				Timestamp _pwExpDt = new Timestamp((UtilsLib.addDays(
						new Date(), 500)).getTime());

				cntrl.setPassword(usrPass);
				cntrl.setPasswordQuestion(hintQuestion);
				cntrl.setPasswordAnswer(EncryptSHA1.getInstance().encrypt(
						pwHint));
				cntrl.setEmail(email);
				cntrl.setModifiedBy(cntrl.getUserID());
				cntrl.setLastUpdatedDate(UtilsLib.getCurrentTS());
				cntrl.setDatePasswordChanged(UtilsLib.getCurrentTS());
				cntrl.setDatePasswordExpire(_pwExpDt);
				cntrl.setPasswordCounter(0);
				cntrl.setPasswordLast(usrPass);

				Timestamp today = UtilsLib.getCurrentTS();

				cntrl.setDatePasswordChanged(today);

				userAccessDAO.saveOrUpdateUser(cntrl);

				if ("home".equals(tmploginBean.getFromPage())) {
					// Displays message on success
					loginBean
							.setMessage("*** Account Info Updated Successfully.  Please login again. ***");
				}
				// Displays message on success
				loginBean
						.setMessage("*** Account Info Updated Successfully. ***");
			}
			loginBean.setUserAccountDTO(cntrl);
		} catch (UserException uex) {
			if (uex.userExType == 1) {
				loginBean.setErrMsg(uex);
				loginBean.setErrFlg("Y");
				loginBean.setFromPage(tmploginBean.getFromPage());// display menu
																// items based
																// on this
																// indicator
				loginBean.setNextpage(changePwJSP);
				return;
			}

			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
			return;
		} catch (Exception ex) {
			UserException uex = new UserException(9, " Exception  Ex",
					UtilsLib.getStackTrace(ex));
			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
			return;

		}

		loginBean.setNextpage(nextPage);
		return;

	}
		
	public void registerUser(LoginBean loginBean){		
		try{
			
			UserCombinedDTO userDTO = loginBean.getUserCombinedDTO();

			String password = UtilsLib.cString(userDTO
					.getPasswd());
			String confirmPassword = UtilsLib.cString(userDTO
					.getConfirmPasswd());

			String encrptPwd= EncryptSHA1.getInstance().encrypt(password);
			String encrptConfirmPwd = EncryptSHA1.getInstance().encrypt(confirmPassword);
			
			userDTO.setPasswd(encrptPwd);
			userDTO.setConfirmPasswd(encrptConfirmPwd);
			
			if ("".equals(userDTO.getUserID().trim())) {
				throw new UserException(1,
						"User ID is required.  Please try again.");
			}else if (checkIfUserNameExists(userDTO.getUserID())) {
				throw new UserException(1,
						"This User Name has been assigned to somebody! \n Please enter your new user name again.");
			} else if ("".equals(password.trim())) {
				throw new UserException(1,
						"Password is required.  Please try again.");
			} else if ("".equals(confirmPassword.trim())) {
				throw new UserException(1,
						"Confirm Password is required.  Please try again.");
			} else if (!encrptPwd.equals(encrptConfirmPwd)) {
				throw new UserException(
						1,
						"Password and Confirm Password should be same. Please try again.");
			} else if ((password.length() < 8) || (password.length() > 16)) {
				throw new UserException(
						1,
						"Password must contain more than 8 characters and less than 16 characters. Please try again.");
			} else if (!UtilsLib.findMatch("[a-z]", password)) {
				throw new UserException(
						1,
						"Password must contain at least one LOWER CASE alphabet.  Please try again.");
			} else if (!UtilsLib.findMatch("[A-Z]", password)) {
				throw new UserException(
						1,
						"Password must contain at least one UPPER CASE alphabet.  Please try again.");
			} else if (!UtilsLib.findMatch("[0-9]", password)) {
				throw new UserException(1,
						"Password must contain at least one number.  Please try again.");
			} else if (UtilsLib.findMatch("\\s", password)) {
				throw new UserException(1,
						"Password must not contain spaces.  Please try again.");
			} else if (!UtilsLib.findMatch("[^a-zA-Z0-9]", password)) {
				throw new UserException(1,
						"Password must contain at least one special character.  Please try again.");
			} else if ("".equals(userDTO
					.getEmail().trim())) {
				throw new UserException(1,
						"Email is required.  Please try again.");
			}else if("".equals(userDTO.getAgencyCode())){
				throw new UserException(1,
						"Agency Code is required.  Please try again.");
			}else if("".equals(userDTO.getBureauCode())){
				throw new UserException(1,
						"Bureau Code is required.  Please try again.");
			}else if(checkAgencyBureauCode(userDTO.getAgencyCode(), userDTO.getBureauCode())){
				throw new UserException(1,
						"You have entered a wrong AGENCY/BUREAU code. \n In order for your account to be added to the system, \n you must enter the valid code that has been assigned \n to your Agency/Bureau.");
			}else if("".equals(userDTO.getFirstName())){
				throw new UserException(1,
						"First Name is required.  Please try again.");
			}else if("".equals(userDTO.getLastName())){
				throw new UserException(1,
						"Last Name is required.  Please try again.");
			}else if("".equals(userDTO.getJobTitle())){
				throw new UserException(1,
						"Job Title is required.  Please try again.");
			}else if("".equals(userDTO.getTelephone())){
				throw new UserException(1,
						"Telephone is required.  Please try again.");
			}else if("".equals(userDTO.getCity())){
				throw new UserException(1,
						"City is required.  Please try again.");
			}else if("".equals(userDTO.getCountry())){
				throw new UserException(1,
						"Country is required.  Please try again.");
			}else if(!UtilsLib.isNumeric(String.valueOf(userDTO.getZipcode()), "INT")){
				throw new UserException(1,
						"Zipcode must be numeric.  Please try again.");
			}else if(!( String.valueOf(userDTO.getZipcode()).length() == 5)){
				throw new UserException(1,
						"Zipcode must of length 5.  Please try again.");
			}else if(!validateEmail(userDTO.getEmail())){
				throw new UserException(1,
						"Email is not in valid format.  Please try again.");
			}
			
			userAccessDAO.registerUser(userDTO);	
			loginBean.setModalDialogFlag(false);
			loginBean.getModalDialogErrMsg().userExDetail = "";
			
			loginBean.setMessage("New User registered successfully");
			sendRegConfirmationEmail(userDTO, password);
			
		} catch (UserException uex) {
			if (uex.userExType == 1) {
				loginBean.setModalDialogErrMsg(uex);
				loginBean.setModalDialogFlag(true);
				return;
			}
		} catch (Exception ex) {
			UserException uex = new UserException(9, " Exception  Ex",
					UtilsLib.getStackTrace(ex));
			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
			return;

		}
	}
	
	public boolean validateEmail(String email){
		
		boolean result = false;
			//If field has valid chars check format
			if(email.length() > 1)	
			{
				if((email.indexOf("@")>0) || (email.indexOf(".")>0))
				{
					result = true;
				}
			}
		return result;
	}
	
	public boolean checkAgencyBureauCode(String agencyCode, String bureauCode){
		
		boolean result = false;
		try{
			ArrayList<AgBuTableDTO> resultList = userAccessDAO.getAgencyBureauDetails(agencyCode, bureauCode);
			if(resultList.size() == 0){
				result = true;
			}
		}catch (Exception ex) {
			UserException uex = new UserException(9, " Exception  Ex",
					UtilsLib.getStackTrace(ex));
			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
		}
		
		return result;
	}
	
	public boolean checkIfUserNameExists(String userID){
		
		boolean result = false;
		try{
			ArrayList<UserAccountDTO> resultList = userAccessDAO.getUserDetails(userID);
			
			if(resultList.size() > 0){
				result = true;
			}
		}catch (Exception ex) {
			UserException uex = new UserException(9, " Exception  Ex",
					UtilsLib.getStackTrace(ex));
			loginBean.setErrMsg01(uex);
			loginBean.setNextpage("ErrMsg01");
		}
		
		return result;
	}
	
	 public void sendRegConfirmationEmail(UserCombinedDTO userDTO, String password){
		
		 try{
			 SendMail sendMail = new SendMail();
			 StringBuffer message = new StringBuffer();
					
				 message.append("Thank you for registering to AutoChoice. To access the AutoChoice just click or type this URL ");
				 message.append("http://www.autochoice.gsa.gov to your web browser (e.g. Netscape or Internet Exlplorer) ");
				 message.append("This is your user identification and password to login to AutoChoice. \n \n");	
				 message.append("User ID = "+userDTO.getUserID());
				 message.append("\n Password = "+password);
				
				String attachmentPath=null;
				String subject = "Welcome To AutoChoice";
				
				//sendMail.sendEmail(orderStatusBean.getFromEmail(), toEmailString.toString(),ccEmailString.toString(), subject, message.toString(), attachmentPath);
				sendMail.sendEmail("electronic.requisition@gsa.gov", userDTO.getEmail(),"satwika.chandran@gsa.gov", subject, message.toString(), attachmentPath);
		 }
		 catch(Exception ex){
			ex.printStackTrace();			
		}
	 }	

}
