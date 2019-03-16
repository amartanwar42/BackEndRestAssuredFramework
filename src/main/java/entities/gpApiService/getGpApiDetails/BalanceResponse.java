package entities.gpApiService.getGpApiDetails;

import static org.testng.Assert.assertEquals;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import entities.BaseResponse;

@XmlRootElement(name="RSP")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class BalanceResponse  extends BaseResponse
{
	private String APIVERSION;

    private String CURRENCY;

    private String request;

    private String rc;

    private String SESSIONID;

    private String BONUSBALANCE;

    private String REALBALANCE;

    private String BALANCE;

    public String getAPIVERSION ()
    {
        return APIVERSION;
    }

    public void setAPIVERSION (String APIVERSION)
    {
        this.APIVERSION = APIVERSION;
    }

    public String getCURRENCY ()
    {
        return CURRENCY;
    }

    public void setCURRENCY (String CURRENCY)
    {
        this.CURRENCY = CURRENCY;
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

    public String getSESSIONID ()
    {
        return SESSIONID;
    }

    public void setSESSIONID (String SESSIONID)
    {
        this.SESSIONID = SESSIONID;
    }

    public String getBONUSBALANCE ()
    {
        return BONUSBALANCE;
    }

    public void setBONUSBALANCE (String BONUSBALANCE)
    {
        this.BONUSBALANCE = BONUSBALANCE;
    }

    public String getREALBALANCE ()
    {
        return REALBALANCE;
    }

    public void setREALBALANCE (String REALBALANCE)
    {
        this.REALBALANCE = REALBALANCE;
    }

    public String getBALANCE ()
    {
        return BALANCE;
    }

    public void setBALANCE (String BALANCE)
    {
        this.BALANCE = BALANCE;
    }
    
    public void assertBalance()
    {
    	assertEquals(getBALANCE(), "43");
    }
}
