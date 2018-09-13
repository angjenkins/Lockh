/**
 * 
 */
package gov.gsa.fas.AutoChoice.beans;


import gov.gsa.fas.AutoChoice.DTO.UserAccountDTO;
import gov.gsa.fas.AutoChoice.DTO.UserCombinedDTO;
import gov.gsa.fas.AutoChoice.util.UserException;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class LoginBean {
	Logger logger = Logger.getLogger(LoginBean.class.toString());

	private String nextpage = "";
	private String message = "";
	
	private String pageAction = "";
	private String fromPage = "";
	
	@Autowired
	private UserAccountDTO userAccountDTO;
	
	@Autowired
	private UserException errMsg = null;
	
	
	private Exception ErrMsg01 = null;
	
	private String errFlg = null;
	private String token = "";
	private String command=null;
	private String result=null;
	
	@Autowired
	private UserAccountDTO currentUser;
	
	private String validationResult =""; 
		
	private UserCombinedDTO userCombinedDTO = null;
	
	private boolean modalDialogFlag = false;
	
	@Autowired
	private UserException modalDialogErrMsg = null;
	// * @return the result
	public String getResult() {
		return result;
	}

	// * @param result
	// *            the result to set
	public void setResult(String result) {
		this.result = result;
	}

	public UserAccountDTO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(UserAccountDTO currentUser) {
		this.currentUser = currentUser;
	}

	public String getValidationResult() {
		return validationResult;
	}

	public void setValidationResult(String validationResult) {
		this.validationResult = validationResult;
	}
    	

	public String getNextpage() {
		return nextpage;
	}

	public void setNextpage(String nextpage) {
		this.nextpage = nextpage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserAccountDTO getUserAccountDTO() {
		return userAccountDTO;
	}

	public void setUserAccountDTO(
			UserAccountDTO userAccountDTO) {
		this.userAccountDTO = userAccountDTO;
	}

	public String getPageAction() {
		return pageAction;
	}

	public void setPageAction(String pageAction) {
		this.pageAction = pageAction;
	}

	public String getFromPage() {
		return fromPage;
	}

	public void setFromPage(String fromPage) {
		this.fromPage = fromPage;
	}

	public UserException getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(UserException errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrFlg() {
		return errFlg;
	}

	public void setErrFlg(String errFlg) {
		this.errFlg = errFlg;
	}

	public Exception getErrMsg01() {
		return ErrMsg01;
	}

	public void setErrMsg01(Exception errMsg01) {
		ErrMsg01 = errMsg01;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public UserCombinedDTO getUserCombinedDTO() {
		return userCombinedDTO;
	}

	public void setUserCombinedDTO(UserCombinedDTO userCombinedDTO) {
		this.userCombinedDTO = userCombinedDTO;
	}

	public boolean isModalDialogFlag() {
		return modalDialogFlag;
	}

	public void setModalDialogFlag(boolean modalDialogFlag) {
		this.modalDialogFlag = modalDialogFlag;
	}

	public UserException getModalDialogErrMsg() {
		return modalDialogErrMsg;
	}

	public void setModalDialogErrMsg(UserException modalDialogErrMsg) {
		this.modalDialogErrMsg = modalDialogErrMsg;
	}

	
}
