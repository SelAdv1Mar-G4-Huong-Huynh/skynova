package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.Constant;
import interfaces.HomePage;
import interfaces.SignUpPage;

public class LoginTestCases extends BaseTestCase{

	HomePage homePage;
	/************************************************
	 * Testcase 01: TC01 - User can log into Twitter with invalid username and password.
	 * 
	 * Steps 1 - Navigate to Skynova Website
	 * Steps 2 - Click on SignUp tab
	 * Steps 3 - Enter invalid Email and Password
	 * Steps 4 - Click on "Create Account" button
	 * VP User is logged into Railway. Welcome user message is displayed.
	 * 
	 ************************************************/
  @Test
  public void LoginTC01(){
	  System.out.println("TC01 - User can log into Twitter with invalid username and password.");  
      
	  HomePage homePage = new HomePage(driver).Open();	  
      SignUpPage signUpPage =homePage.goToSignUpPage();     
      String actualMsg = signUpPage.LoginInvalid("fdfdsg", Constant.Password);
      System.out.println(actualMsg);      
      String expectedMsg = "Incorrectly formatted e-mail address. \"@\"-sign missing";
      
      System.out.println(expectedMsg);
      Assert.assertTrue(actualMsg.contains(expectedMsg));
  }
  
 
}
