package sApiTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import clients.sapiServices.PostSapiDetails;
import entities.sApiServices.getbetlevel.GetbetlevelRequest;
import entities.sApiServices.getbetlevel.GetbetlevelResponse;
import gpApiTests.BaseTest;
import requestBuilder.sapiServices.getbetLevel.GetbetlevelRequestBuilder;

public class GetBetlevelTest extends BaseTest{
	
	@Test
	public void getBetlevelTest()
	{
		GetbetlevelRequest getbetlevelRequest=new GetbetlevelRequestBuilder()
				.setCurrency("")
				.setOgsgameids("70233")
				.setOgsoperatorid(5)
				.setSapisession("185aqc8d0sjeot3de16j2tpkpeh98ljskuvnnghifv9bq88qto4b")
				.build();
		
		PostSapiDetails postSapiDetails=new PostSapiDetails();
		GetbetlevelResponse response = postSapiDetails.getbetlevel(getbetlevelRequest, test);
		
		response.verifyStatusCode(200);
	}

}
