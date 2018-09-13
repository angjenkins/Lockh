/**
 * 
 */
package gov.gsa.fas.AutoChoice.aop;

import gov.gsa.fas.AutoChoice.beans.LoginBean;
import gov.gsa.fas.AutoChoice.beans.UserAccessBean;
import gov.gsa.fas.AutoChoice.controller.HomeController;

import java.util.Enumeration;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author KarunakarChatla
 *
 */
@Component
public class Advices {

	@Autowired
	private LoginBean loginBean;
	
	Logger logger = Logger.getLogger(UserAccessBean.class.toString());
	
	/**
	 * This is a advice method that is executed before any method in the application.
	 */
	public Object checkIfUserLoggedIn(ProceedingJoinPoint pjp) {
		//logger.info("Checking if the user is logged in...");
		try {
			String methodName = pjp.getSignature().getName();
			//logger.info("Method name :" + methodName);
			if( true == methodName.equalsIgnoreCase("home") || 
				true == methodName.equalsIgnoreCase("validate") ||
				true == methodName.equalsIgnoreCase("welcome") ||
				true == methodName.equalsIgnoreCase("handleSSOSuccess") ||
				true == methodName.equalsIgnoreCase("contact") ||
				true == methodName.equalsIgnoreCase("changePw") ||
				true == methodName.equalsIgnoreCase("forgotPw") ||
				true == methodName.equalsIgnoreCase("onContact")) { 
				// These two methods are out of user session and the user will be logged in.
				return pjp.proceed();
			}
			
			// Access to all other pages should be available only if the user is logged in.
			// We should have populated Current User details. 
			// If do not have current user then the user is not logged in and redirect to home page.
			if (!loginBean.getCurrentUser().getUserID().equals(null) &&
					!loginBean.getCurrentUser().getUserID().equals("")) {
				//logger.info("proceed with userid ...");
		 		return pjp.proceed();
		    } else {
		    	// Current user not defined, error out.
		        return "errorOrTimeout";
		    }
		} catch (Throwable e) {
			//logger.info("Error occured in executing the advice : " + e.getMessage());
			e.printStackTrace();
		}
		
		return "errorOrTimeout";
	}
	
	 
	
	/**
	 * This is a advice method that is executed on any uncaught exception in the application.
	 */
	public Object handleUnknowException(Exception ex) {
		//logger.info("Caught unknown exception : " + ex.getMessage());
		ex.printStackTrace();
		
		return "errorOrTimeout";
	}

	
	
}
