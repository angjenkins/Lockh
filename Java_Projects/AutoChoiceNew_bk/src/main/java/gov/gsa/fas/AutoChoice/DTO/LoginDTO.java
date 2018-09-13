/**
 * 
 */
package gov.gsa.fas.AutoChoice.DTO;

import java.io.Serializable;

/**
 * @author KarunakarChatla
 *
 */
public class LoginDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String password;
	private String email;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
