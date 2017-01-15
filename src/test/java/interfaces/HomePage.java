package interfaces;
import org.openqa.selenium.WebDriver;
import common.Constant;

/**
* @author Huong Huynh
* This class will store all the locator and methods of Home page
*/
public class HomePage extends BasePage {
	//private WebDriver driver;
	
    public HomePage(WebDriver wdriver){  
    	super(wdriver);
		loadControls("HomePage");
	}

    public HomePage Open()
    {
    	openURL(Constant.HomePageUrl);     
        return this;
    }
    public SignUpPage goToSignUpPage(){
    	click(getControl("lnkSignUpTab"));
    	return new SignUpPage(driver);
    }
    public FreeWebSitePage goToSignFreeWebSite(){
    	click(getControl("lnkSingUpTab"));
    	//PageFactory.initElements(driver,LoginPage.class);
    	return new FreeWebSitePage();
    }
}
