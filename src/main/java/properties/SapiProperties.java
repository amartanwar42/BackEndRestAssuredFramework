package properties;

import utils.PropertiesReader;

public class SapiProperties 
{
	private static final PropertiesReader propertiesReader = new PropertiesReader();

    private static final String postsApiHost = propertiesReader.postSapiHost();
    
    
    public static final String getbetlevelURL=String.format("%s/promotions/", postsApiHost);
	
}
