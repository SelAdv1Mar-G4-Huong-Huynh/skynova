package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import interfaces.HomePage;

public abstract class BaseTestCase {
		public WebDriver driver; 
		
		@BeforeTest
		public void TestInitializeMethod() {
			System.out.println("Run Test Initialize");
			// Start Firefox browser and maximize window
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			HomePage homePage = new HomePage(driver);
			homePage.Open();
			///loadControls("loginPage");
		
		}

		@AfterTest
		public void TestCleanupMethod() {
			System.out.println("Run Test Cleanup");
			// Close browser
			driver.quit();
		}

		/*
		 * public void ConfirmDialog(string buttonName) { switch
		 * (buttonName.ToUpper()) { case "OK": case "YES":
		 * Constant.WebDriver.SwitchTo().Alert().Accept(); break;
		 * 
		 * case "NO": case "CANCEL":
		 * Constant.WebDriver.SwitchTo().Alert().Dismiss(); break; } }
		 */
}

