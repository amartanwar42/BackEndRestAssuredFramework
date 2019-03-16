package entities.gpApiService.getGpApiDetails;

import static org.testng.Assert.assertEquals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import entities.BaseResponse;

@XmlRootElement(name="RSP")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class GetAccount888Response extends BaseResponse {
	
private String APIVERSION;
	

	public String getAPIVERSION() {
		return APIVERSION;
	}

	public void setAPIVERSION(String aPIVERSION) {
		APIVERSION = aPIVERSION;
	}
	
	public void assertApiVersion(String apiVersion)
	{
		assertEquals(getAPIVERSION(), apiVersion);
	}

}
