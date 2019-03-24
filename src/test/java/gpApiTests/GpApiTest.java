package gpApiTests;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import clients.gpApiServices.GetGPAPIDetails;
import entities.gpApiService.getGpApiDetails.Balance888Response;
import entities.gpApiService.getGpApiDetails.BalanceResponse;
import entities.gpApiService.getGpApiDetails.GetAccount888Response;

public class GpApiTest extends BaseTest{
	@Test(enabled=false)
	public void getBalanceTest()
	{
		GetGPAPIDetails mockWalletClient=new GetGPAPIDetails();
		BalanceResponse re = mockWalletClient.getBalance(test);
		test.log(Status.PASS, "dfsdf");
	
		re.verifyStatusCode(200);
		System.out.println("\n"+re.getAPIVERSION()+re.getBALANCE());
	}
	
	@Test(groups= {"SMOKE_TEST"})
	public void getBalance888Test() 
	{
		GetGPAPIDetails getGPAPIDetails=new GetGPAPIDetails();
		Balance888Response response = getGPAPIDetails.getBalance888(test);
		response.verifyStatusCode(200);
		response.assertApiVersion("1.4");
	}
	@Test(groups= {"SMOKE_TEST","REGRESSION_TEST"})
	public void getAccount888Test() 
	{
		GetGPAPIDetails getGPAPIDetails=new GetGPAPIDetails();
		GetAccount888Response response = getGPAPIDetails.getAccount888(test);
		response.verifyStatusCode(200);
		response.assertApiVersion("1.4");
	}
	
}
