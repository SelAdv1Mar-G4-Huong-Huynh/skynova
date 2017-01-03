package common;


import java.util.Date;
import java.util.Random;


public class ActionCommon {
	public static String GenrateRandomString(int length)
    {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static String RandomDay(int day)
    {
    	Random rnd = new Random();
    	Date date = new Date(Math.abs(System.currentTimeMillis() - rnd.nextLong()));
    	System.out.println(date.toString());
    	return date.toString();
    	
    }
}
