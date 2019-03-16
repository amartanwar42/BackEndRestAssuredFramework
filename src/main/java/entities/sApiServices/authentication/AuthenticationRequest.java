package entities.sApiServices.authentication;

public class AuthenticationRequest
{
	private String apiversion;
	private String request;
	private String username;
	private String password;
	public String getApiversion() {
		return apiversion;
	}
	public void setApiversion(String apiversion) {
		this.apiversion = apiversion;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
