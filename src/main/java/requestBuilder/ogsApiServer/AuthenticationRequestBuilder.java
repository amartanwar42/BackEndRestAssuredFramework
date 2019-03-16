package requestBuilder.ogsApiServer;

import entities.sApiServices.authentication.AuthenticationRequest;

public class AuthenticationRequestBuilder 
{
	AuthenticationRequest authenticationRequest;
	public AuthenticationRequestBuilder() {
		authenticationRequest=new AuthenticationRequest();
		authenticationRequest.setApiversion("set");
	}
	
	public AuthenticationRequestBuilder setApiversion(String apiversion) {
		authenticationRequest.setApiversion(apiversion);
		return this;
	}
	public AuthenticationRequestBuilder setRequest(String request) {
		authenticationRequest.setRequest(request);
		return this;
	}
	public AuthenticationRequestBuilder setUsername(String username) {
		authenticationRequest.setUsername(username);
		return this;
	}

	public AuthenticationRequestBuilder setPassword(String password) {
		authenticationRequest.setPassword(password);
		return this;
	}
	
	public AuthenticationRequest build() {
		return authenticationRequest;
	}
}
