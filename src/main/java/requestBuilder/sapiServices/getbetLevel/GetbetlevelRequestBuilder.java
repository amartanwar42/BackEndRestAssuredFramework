package requestBuilder.sapiServices.getbetLevel;

import entities.sApiServices.getbetlevel.GetbetlevelRequest;

public class GetbetlevelRequestBuilder 
{
	GetbetlevelRequest getbetlevelRequest;
	
	public GetbetlevelRequestBuilder() 
	{
		getbetlevelRequest=new GetbetlevelRequest();
		getbetlevelRequest.setApiversion("1.4");
		getbetlevelRequest.setRequest("getbetlevels");
	}
	
	public GetbetlevelRequestBuilder setSapisession(String sapisession)
	{
		getbetlevelRequest.setSapisession(sapisession);
		return this;
	}
	
	public GetbetlevelRequestBuilder setOgsoperatorid(int ogsoperatorid)
	{
		getbetlevelRequest.setOgsoperatorid(ogsoperatorid);
		return this;
	}
	
	public GetbetlevelRequestBuilder setOgsgameids(String ogsgameids)
	{
		getbetlevelRequest.setOgsgameids(ogsgameids);
		return this;
	}
	
	public GetbetlevelRequestBuilder setCurrency(String currency)
	{
		getbetlevelRequest.setCurrency(currency);
		return this;
	}
	
	public GetbetlevelRequest build()
	{
		return getbetlevelRequest;
	}
	
	
	
	

}
