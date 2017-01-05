package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Constant;
import utils.IPage;

public class HomePage extends IPage {

	static final By lnkLoginTab = By.xpath("//a[contains(@href,'login.php')]");
    static final By lnkSignUpTab = By.xpath("//a[contains(@href,'signup.php')]");
    static final By lnkFreeWebSiteTab = By.xpath("//a[contains(@href,'signup.php')]");
    
    public WebElement LnkLoginTab()
    {
    	return Constant.driver.findElement(lnkLoginTab);
    }
    public WebElement LnkSignUpTab()
    {
    	return Constant.driver.findElement(lnkSignUpTab);
    }
    public WebElement LnkFreeWebSiteTab()
    {
    	return Constant.driver.findElement(lnkFreeWebSiteTab);
    }
    public HomePage(WebDriver driver) {
		setUp(driver);
		//loadControls("loginPage");
	}

    public HomePage Open()
    {
        Constant.driver.navigate().to(Constant.HomePageUrl);
        return this;
    }
    public SignUpPage goToSignUpPage(){
    	this.LnkSignUpTab().click();
    	return new SignUpPage();
    }
    public FreeWebSitePage goToSignFreeWebSite(){
    	this.LnkSignUpTab().click();
    	return new FreeWebSitePage();
    }
}
