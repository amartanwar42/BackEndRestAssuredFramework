package utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestHelper {

	public static String randomNumber() 
	{
        int random = (int) (Math.random() * (1000 - 1)) + 1;
        return new SimpleDateFormat("ddMMyyHHmmssSSS").format(new Date()) + random;
    }
	
	public static void wait(int milliSeconds) 
	{
        try 
        {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
	
    public static String getJsonString(Object o) 
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }	
}
