package testcases;


import org.testng.Assert;
import org.testng.annotations.*;
import common.Constant;
import interfaces.EditWebsitePage;
import interfaces.LoginPage;


public class LoginTestCases extends BaseTestCase{

	/************************************************
	 * Testcase 01: TC01 - User can log into Twitter with invalid username and password.
	 * 
	 * Steps 1 - Navigate to Skynova Website
	 * Steps 2 - Click on Login tab
	 * Steps 3 - Enter invalid Email and Password
	 * Steps 4 - Click on "Login" button
	 * VP Verify that message "Incorrect e-mail address. Please check the spelling of your e-mail address and try again.."
	 * 
	 ************************************************/
  @Test
  public void LoginTC01(){
	  System.out.println("TC01 - User can log into Twitter with invalid username and password.");
      LoginPage loginPage = homePage.goToLoginPage();     
      String actualMsg = loginPage.LoginInvalid("fdfdsg", Constant.Password);
      System.out.println(actualMsg);      
     // String expectedMsg = "Incorrectly formatted e-mail address. \"@\"-sign missing"; 
      String expectedMsg = "Incorrect e-mail address. Please check the spelling of your e-mail address and try again.";
      System.out.println(expectedMsg);
      Assert.assertTrue(actualMsg.contains(expectedMsg));
  }
  
  /************************************************
	 * Testcase 02: TC02 - User can log into Twitter with invalid username and password.
	 * 
	 * Steps 1 - Navigate to Skynova Website
	 * Steps 2 - Click on Login tab
	 * Steps 3 - Enter valid Email and Password
	 * Steps 4 - Click on "Login" button
	 * VP Page will navigate to Create Website Page and the email and logout link display
	 * 
	 ************************************************/
  @Test  
  public void LoginTC02(){
	  System.out.println("TC02 - User can log into Twitter with valid username and password.");
      LoginPage loginPage = homePage.goToLoginPage();     
      EditWebsitePage editPage = loginPage.Login(Constant.UserName, Constant.Password);      
      Assert.assertTrue(editPage.isElementExists(editPage.getControl("lblEmail")));   
      Assert.assertTrue(editPage.isElementExists(editPage.getControl("lnkLogout")));
  }
  
  /************************************************
 	 * Testcase 03: TC03 - Update user profile.
 	 * 
 	 * Steps 1 - Navigate to Skynova Website
 	 * Steps 2 - Click on Login tab
 	 * Steps 3 - Enter valid Email and Password
 	 * Steps 4 - Click on "Login" button
 	 * Steps 5 - Move mouse on Settings menu and select My Profile
 	 * Steps 6 - Enter profile info (name, address, time zone, date formate..)
 	 * Steps 7 - Click on Submit button
 	 * VP: Message"Profile successfully saved " with update successfully icon is displayed
 	 ************************************************/
   @Test  
   public void LoginTC03(){
 	  System.out.println("TC03 - Update user profile.");
       LoginPage loginPage = homePage.goToLoginPage();     
       EditWebsitePage editPage = loginPage.Login(Constant.UserName, Constant.Password);      
       
   }
 
}
