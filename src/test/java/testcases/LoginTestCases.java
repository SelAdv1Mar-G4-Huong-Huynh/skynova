package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
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
	 * Testcase 01: TC02 - User can log into Twitter with invalid username and password.
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
	  System.out.println("TC01 - User can log into Twitter with valid username and password.");
      LoginPage loginPage = homePage.goToLoginPage();     
      EditWebsitePage editPage = loginPage.Login(Constant.UserName, Constant.Password);
      editPage.check("", true);
      //System.out.println(actualMsg);      
     // String expectedMsg = "Incorrectly formatted e-mail address. \"@\"-sign missing"; 
      String expectedMsg = "Incorrect e-mail address. Please check the spelling of your e-mail address and try again.";
      System.out.println(expectedMsg);
     // Assert.assertTrue(actualMsg.contains(expectedMsg));
  }
  /*@BeforeTest
	public void TestInitializeMethod() {
		System.out.println("Run Test Initialize");
		// Start Firefox browser and maximize window
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		  HomePage homePage = new HomePage(driver);
			homePage.Open();
	}

	@AfterTest
	public void TestCleanupMethod() {
		System.out.println("Run Test Cleanup");
		// Close browser
		homePage.close();
	}*/
  
 
}
