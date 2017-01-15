package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;
import common.Constant;
import interfaces.SignUpPage;


public class LoginTestCases extends BaseTestCase{

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
      SignUpPage signUpPage = homePage.goToSignUpPage();     
      String actualMsg = signUpPage.LoginInvalid("fdfdsg", Constant.Password);
      System.out.println(actualMsg);      
      String expectedMsg = "Incorrectly formatted e-mail address. \"@\"-sign missing";      
      System.out.println(expectedMsg);
      Assert.assertTrue(actualMsg.contains(expectedMsg));
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
