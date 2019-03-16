package entities.sApiServices.getbetlevel;

public class GetbetlevelRequest 
{
	private String apiversion;
	
	private String request;
	
	private String sapisession;
	
	private int ogsoperatorid;
	
	private String ogsgameids;
	
	private String currency;

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

	public String getSapisession() {
		return sapisession;
	}

	public void setSapisession(String sapisession) {
		this.sapisession = sapisession;
	}

	public int getOgsoperatorid() {
		return ogsoperatorid;
	}

	public void setOgsoperatorid(int ogsoperatorid) {
		this.ogsoperatorid = ogsoperatorid;
	}

	public String getOgsgameids() {
		return ogsgameids;
	}

	public void setOgsgameids(String ogsgameids) {
		this.ogsgameids = ogsgameids;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
	
	

