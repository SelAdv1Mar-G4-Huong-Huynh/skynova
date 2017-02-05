package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import interfaces.BasePage;
import interfaces.EditWebsitePage;
import interfaces.HomePage;
public abstract class BaseTestCase {
		public WebDriver driver; 
		public HomePage homePage;
		public EditWebsitePage editWebPage;
		/**
		* @author Huong Huynh
		* <summary>
		* Opens multiple browsers and run parallel
		*/		
		/*Run with multiple browser mode
		 * @Parameters("browser")
		@BeforeMethod
		public void TestInitializeMethod(String browser) {
			System.out.println("Run Test Initialize");
			// Start Firefox browser and maximize window			
			if(browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();	
			}else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "library\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("ie")){
				System.setProperty("webdriver.ie.driver", "library\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
			System.out.println("System is running with "  + browser);
			driver.manage().window().maximize();	
			BasePage basePage = new BasePage(driver);
			homePage = basePage.Open();
		}*/
		
		@BeforeMethod
		public void TestInitializeMethod() {
			System.out.println("Run Test Initialize");
			// Start Firefox browser and maximize window
			driver = new FirefoxDriver();
			System.out.println("System is running with Firefox");
			driver.manage().window().maximize();	
			BasePage basePage = new BasePage(driver);
			homePage = basePage.Open();
		}
		@AfterMethod
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

