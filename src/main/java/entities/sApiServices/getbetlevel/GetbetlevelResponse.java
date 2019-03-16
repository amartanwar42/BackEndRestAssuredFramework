package entities.sApiServices.getbetlevel;

import com.fasterxml.jackson.annotation.JsonProperty;

import entities.BaseResponse;

public class GetbetlevelResponse  extends BaseResponse
{
	private RSP RSP;

    public RSP getRSP ()
    {
        return RSP;
    }

    @JsonProperty("RSP")
    public void setRSP (RSP RSP)
    {
        this.RSP = RSP;
    }
	
}

