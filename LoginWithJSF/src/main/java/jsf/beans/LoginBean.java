package jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean {
	private String userName;
	private String password;
	private String errorMsg;
	//private String colorOfErrorMessage;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String validate() {
		if ("admin".equals(userName) && "admin".equals(password)) {
			errorMsg = null;
			return "welcome"; // welcome.html
		} else {
			errorMsg = "Invalid user id or password. Please try again";
			return null;
		}
	}
}