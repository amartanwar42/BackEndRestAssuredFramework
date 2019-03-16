package clients.sapiServices;

import static io.restassured.RestAssured.given;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import entities.sApiServices.authentication.AuthenticationRequest;
import entities.sApiServices.authentication.AuthenticationResponse;
import entities.sApiServices.getbetlevel.GetbetlevelRequest;
import entities.sApiServices.getbetlevel.GetbetlevelResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.GpApiProperties;
import properties.SapiProperties;
import utils.TestHelper;

public class PostSapiDetails {

	public AuthenticationResponse postAuthenticate(AuthenticationRequest authenticationRequest)
	{
		Reporter.log(String.format("\n postAuthenticate URL --- POST %s", GpApiProperties.BalanceURL), true);
		Reporter.log(String.format("\n postAuthenticate Request --- POST %s", TestHelper.getJsonString(authenticationRequest)), true);
		
		Response response = given()
                .contentType(ContentType.XML)
                .body(authenticationRequest)
				.post(GpApiProperties.BalanceURL);
		       
        Reporter.log(String.format("\n postAuthenticate Response --- (%s) %s", response.getStatusCode(), response.asString()), true);
        AuthenticationResponse authenticationResponse = response.as(AuthenticationResponse.class);
        authenticationResponse.setHttpStatusCode(response.getStatusCode());
        return authenticationResponse;
	}
	
	public GetbetlevelResponse getbetlevel(GetbetlevelRequest getbetlevelRequest, ExtentTest extentTest)
	{
		extentTest.info(String.format("\n getbetlevel URL --- POST  %s", SapiProperties.getbetlevelURL));
		extentTest.info(String.format("\n getbetlevel request --- %s", TestHelper.getJsonString(getbetlevelRequest)));
		
		Response response=given()
				.contentType(ContentType.JSON)
				.body(getbetlevelRequest)
				.post(SapiProperties.getbetlevelURL);
		extentTest.info(String.format("\n getbetlevel Status Code --- POST  %s", response.getStatusCode()));
		extentTest.info(String.format("\n getbetlevel response --- POST  %s", response.asString()));
		
		GetbetlevelResponse getbetlevelResponse=response.as(GetbetlevelResponse.class);
		getbetlevelResponse.setHttpStatusCode(response.getStatusCode());
		
		return getbetlevelResponse;
	}
}
