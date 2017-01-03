package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.Constant;
import interfaces.HomePage;
import interfaces.SignUpPage;

public class loginTestCases extends BaseTestCase{

  @Test
  public void LoginTC01(){
	  System.out.println("TC01 - User can log into Twitter with invalid username and password.");
	  
      //1. Navigate to Skynova Website	
	  HomePage homePage = new HomePage().Open();	  
      SignUpPage signUpPage =homePage.goToSignUpPage();
   // 2. Click on SignUp tab
      //3. Enter invalid Email and Password	
      //4. Click on "Create Account" button
      //VP User is logged into Railway. Welcome user message is displayed.
      String actualMsg = signUpPage.LoginInvalid("fdfdsg", Constant.Password);//.GetWelcomeMessage();
      System.out.println(actualMsg);
      
      String expectedMsg = "Incorrectly formatted e-mail address. \"@\"-sign missing";
      
      System.out.println(expectedMsg);
      Assert.assertTrue(actualMsg.contains(expectedMsg));
  }
  
 
}
