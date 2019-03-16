package clients.gpApiServices;


import static io.restassured.RestAssured.given;

import com.aventstack.extentreports.ExtentTest;

import entities.gpApiService.getGpApiDetails.Balance888Response;
import entities.gpApiService.getGpApiDetails.BalanceResponse;
import entities.gpApiService.getGpApiDetails.GetAccount888Response;
import entities.gpApiService.getGpApiDetails.Result888CompletedResponse;
import entities.gpApiService.getGpApiDetails.Result888PendingResponse;
import entities.gpApiService.getGpApiDetails.Wager888Response;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.GpApiProperties;


public class GetGPAPIDetails 
{
	public  BalanceResponse getBalance(ExtentTest extentTest)
	{
		extentTest.info(String.format("\n getWalletBalance URL --- POST %s", GpApiProperties.BalanceURL));
		Response response = given()
                .contentType(ContentType.XML)
                .get(GpApiProperties.BalanceURL);
		       
		extentTest.info(String.format("\n CreateCampaign Response status code --- %s", response.getStatusCode()));
		extentTest.info(String.format("\n CreateCampaign Response --- %s", response.asString()));
		
        BalanceResponse walletBalanceResponse = response.as(BalanceResponse.class);
        walletBalanceResponse.setHttpStatusCode(response.getStatusCode());
        return walletBalanceResponse;
	}
	
	public Balance888Response getBalance888(ExtentTest extentTest)
	{
		extentTest.info(String.format("\n getBalance888 URL --- POST %s", GpApiProperties.BalanceURL));
		
		Response response=given()
				.contentType(ContentType.XML)
				.get(GpApiProperties.Balance888URL);
		
		extentTest.info(String.format("\n getBalance888 Response status code --- %s", response.getStatusCode()));
		extentTest.info(String.format("\n getBalance888 Response --- %s", response.asString()));
		
		Balance888Response balance888Response=response.as(Balance888Response.class);
		balance888Response.setHttpStatusCode(response.getStatusCode());
		
		return balance888Response;
		
	}
	
	public GetAccount888Response getAccount888(ExtentTest extentTest) 
	{
		extentTest.info(String.format("\\n getBalance888 URL --- POST %s", GpApiProperties.Account888URL));
		
		Response response=given()
				.contentType(ContentType.XML)
				.get(GpApiProperties.Account888URL);
		
		extentTest.info(String.format("getBalance888 Response status code --- %s", response.getStatusCode()));
		extentTest.info(String.format("\\n getBalance888 Response --- %s", response.asString()));
		
		GetAccount888Response getAccount888Response=response.as(GetAccount888Response.class);
		getAccount888Response.setHttpStatusCode(response.getStatusCode());
		return getAccount888Response;
	}
	
	public Wager888Response getWager888()
	{
		Response response = given()
				.contentType(ContentType.XML)
				.get(GpApiProperties.Wager888URL);
					
		Wager888Response wager888Response=response.as(Wager888Response.class);
		wager888Response.setHttpStatusCode(response.getStatusCode());
		return wager888Response;
	}
	
	public Result888PendingResponse getResult888Pending()
	{
		Response response = given()
		.contentType(ContentType.XML)
		.get(GpApiProperties.Result888PendingURL);
		
		
		Result888PendingResponse result888PendingResponse = response.as(Result888PendingResponse.class);
		result888PendingResponse.setHttpStatusCode(response.getStatusCode());
		return result888PendingResponse;
	}

	public Result888CompletedResponse getResult888Complete()
	{
		 Response response = given()
		 .contentType(ContentType.XML)
		 .get(GpApiProperties.Result888CompletedURL);
		 Result888CompletedResponse result888CompletedResponse= response.as(Result888CompletedResponse.class);
		 result888CompletedResponse.setHttpStatusCode(response.getStatusCode());
		 return result888CompletedResponse;
		 
	}
	

}
