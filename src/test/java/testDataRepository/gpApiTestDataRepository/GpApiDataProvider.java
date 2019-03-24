package testDataRepository.gpApiTestDataRepository;

import org.testng.annotations.DataProvider;

import utils.DataProviderGenerator;

public class GpApiDataProvider extends DataProviderGenerator {
	
	@DataProvider(name ="positveLoginPageTestWithAllFields")
	public static Object[][] getAccount888Test()
	{
		String excelName = "gpApiTestData";
		Object[][] leaseData=objectGeneratorFromSingleSheet(excelName, "getAccount888Test");
		return leaseData; 
	
	}

}
