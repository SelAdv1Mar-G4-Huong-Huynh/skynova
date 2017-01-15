package interfaces;

import org.openqa.selenium.WebDriver;
import common.Constant;

public class SignUpPage extends BasePage{
   /* static final By txtEmailAddress = By.xpath("//input[@name='emailaddress']");
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
 */
	public SignUpPage(WebDriver wdriver) {    	
		super(wdriver);
		loadControls("SignUpPage");
	}
    public SignUpPage Login(String username, String password)
    {
    	type(getControl("txtEmailAddress"), Constant.UserName);
    	type(getControl("txtPassword"),Constant.Password);
    	click(getControl("btnLogin"));    	
        return new SignUpPage(driver);
    }
    public String LoginInvalid(String username, String password)
    {
    	type(getControl("txtEmailAddress"), username);
    	type(getControl("txtPassword"), password);
    	click(getControl("btnLogin"));  
    	return getAttribute(getControl("lblErrorMsg"),"text");
        
    }
  

}
