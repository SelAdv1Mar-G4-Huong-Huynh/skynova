package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Constant;

public class SignUpPage {
	private WebDriver driver;
    static final By txtEmailAddress = By.xpath("//input[@name='emailaddress']");
    static final By txtPassword = By.xpath("//input[@name='password']");
    static final By btnLogin = By.xpath("//button[@name='submit']");
    static final By lblErorMsg = By.xpath("//div[@id='no_vendor']");

    public WebElement TxtEmailAddress()
    {
    	return driver.findElement(txtEmailAddress);
    }
    public WebElement TxtPassword()
    {
    	return driver.findElement(txtPassword);
    }
    
    public WebElement BtnLogin()
    {
        return driver.findElement(btnLogin);
    }

    public WebElement LblErorMsg()
    {
    	return driver.findElement(lblErorMsg);
    }
 
    public SignUpPage Login(String username, String password)
    {
    	TxtEmailAddress().sendKeys(username);
        TxtPassword().sendKeys(password);
        BtnLogin().click();
        return new SignUpPage();
    }
    public String LoginInvalid(String username, String password)
    {
    	TxtEmailAddress().sendKeys(username);
        TxtPassword().sendKeys(password);
        BtnLogin().click();            
        return LblErorMsg().getText();
    }
    public SignUpPage Open()
    {
        driver.navigate().to(Constant.HomePageUrl);
        return this;
    }

}
