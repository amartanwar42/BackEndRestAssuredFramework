package entities.sApiServices.getbetlevel;

public class RSP
{
    private String msg;

    private String request;

    private String rc;

    private String apiversion;

    public String getMsg ()
    {
        return msg;
    }

    public void setMsg (String msg)
    {
        this.msg = msg;
    }

    public String getRequest ()
    {
        return request;
    }

    public void setRequest (String request)
    {
        this.request = request;
    }

    public String getRc ()
    {
        return rc;
    }

    public void setRc (String rc)
    {
        this.rc = rc;
    }

    public String getApiversion ()
    {
        return apiversion;
    }

    public void setApiversion (String apiversion)
    {
        this.apiversion = apiversion;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [msg = "+msg+", request = "+request+", rc = "+rc+", apiversion = "+apiversion+"]";
    }
}

	


