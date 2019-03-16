package entities.gpApiService.getGpApiDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import entities.BaseResponse;

@XmlRootElement(name="RSP")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Result888CompletedResponse extends BaseResponse{
	
	private String APIVERSION;

	public String getAPIVERSION() {
		return APIVERSION;
	}

	public void setAPIVERSION(String aPIVERSION) {
		APIVERSION = aPIVERSION;
	}
	

}
