package properties;

import utils.PropertiesReader;

public class GpApiProperties {

	private static final PropertiesReader propertiesReader = new PropertiesReader();

    private static final String gpApiHost = propertiesReader.getGpApihost();
    private static final String balance888host=propertiesReader.getBalance888host();
    
    
	public static final String BalanceURL=String.format("%s/gpapi?request=getbalance&apiversion=1.5&loginname=gameprovider&password=gameprovider&sessionid=f693b004-e60f-4f45-9954-e0a60f979c49&opid=5&gpid=100&gpgameid=foxinwinshq&device=desktop&currency=EUR&accountid=456", gpApiHost);
	
	public static final String Balance888URL=String.format("%s/gpapi?request=getbalance&apiversion=1.4&loginname=foo&password=bar&sessionid=c6cbb3bebbfa46a7b10db9ca661e0537&opid=929&gpid=100&gpgameid=foxinwinsagain&device=mobile&currency=GBP&accountid=100036772", balance888host);
	
	public static final String Account888URL=String.format("%s/gpapi?request=getaccount&apiversion=1.4&loginname=foo&password=bar&sessionid=c6cbb3bebbfa46a7b10db9ca661e0537&opid=929&gpid=100&gpgameid=foxinwinsagain&device=mobile&currency=GBP",balance888host);
	
	public static final String Wager888URL=String.format("%s/gpapi?request=wager&apiversion=1.4&loginname=foo&password=bar&sessionid=c6cbb3bebbfa46a7b10db9ca661e0537&opid=929&gpid=100&gpgameid=foxinwinsagain&device=mobile&currency=GBP&accountid=100036772&transactionid=3704472&roundid=2363565&betamount=2",balance888host);
	
	public static final String Result888PendingURL = String.format("%sgpapi?request=result&apiversion=1.4&loginname=foo&password=bar&sessionid=c6cbb3bebbfa46a7b10db9ca661e0537&opid=929&gpid=100&gpgameid=foxinwinsagain&device=mobile&currency=GBP&accountid=100036772&transactionid=3704473&roundid=2363565&gamestatus=pending&wonamount=0", balance888host);
	
	public static final String Result888CompletedURL= String.format("gpapi?request=result&apiversion=1.4&loginname=foo&password=bar&sessionid=c6cbb3bebbfa46a7b10db9ca661e0537&opid=929&gpid=100&gpgameid=foxinwinsagain&device=mobile&currency=GBP&accountid=100036772&transactionid=3704474&roundid=2363565&gamestatus=completed&wonamount=0",balance888host);
}
