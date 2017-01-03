package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import common.Constant;

public abstract class BaseTestCase {
		public WebDriver driver; 
		
		@BeforeTest
		public void TestInitializeMethod() {
			System.out.println("Run Test Initialize");
			// Start Firefox browser and maximize window
			Constant.driver = new FirefoxDriver();
			Constant.driver.manage().window().maximize();
		}

		@AfterTest
		public void TestCleanupMethod() {
			System.out.println("Run Test Cleanup");
			// Close browser
			Constant.driver.quit();
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

