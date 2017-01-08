package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

//import com.thoughtworks.selenium.webdriven.commands.GetAlert;

import common.Constant;
import utils.ControlFactory;
import utils.IPage;

public class HomePage extends ControlFactory {
	/*private WebDriver driver;
	
	static final By lnkLoginTab = By.xpath("//a[contains(@href,'login.php')]");
    static final By lnkSignUpTab = By.xpath("//a[contains(@href,'signup.php')]");
    static final By lnkFreeWebSiteTab = By.xpath("//a[contains(@href,'signup.php')]");
    
    public WebElement LnkLoginTab()
    {
    	return driver.findElement(lnkLoginTab);
    	//return Constant.driver.findElement(lnkLoginTab);
    }
    public WebElement LnkSignUpTab()
    {
    	return driver.findElement(lnkSignUpTab);
    	//return Constant.driver.findElement(lnkSignUpTab);
    }
    public WebElement LnkFreeWebSiteTab()
    {
    	return driver.findElement(lnkFreeWebSiteTab);
    	//return Constant.driver.findElement(lnkFreeWebSiteTab);
    }*/
	public Logger log = Logger.getLogger(HomePage.class);
	
    public HomePage(WebDriver driver) {    	
		setUp(driver);
		loadControls("HomePage");
	}

    /*public HomePage Open()
    {
    	driver.navigate().to(Constant.HomePageUrl);
        //Constant.driver.navigate().to(Constant.HomePageUrl);
        return this;
    }*/
    public SignUpPage goToSignUpPage(){
    	this.LnkSignUpTab().click();
    	return new SignUpPage();
    }
    public FreeWebSitePage goToSignFreeWebSite(){
    	this.LnkSignUpTab().click();
    	return new FreeWebSitePage();
    }
}
