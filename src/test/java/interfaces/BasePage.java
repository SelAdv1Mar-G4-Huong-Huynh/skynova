package interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Constant;

public abstract class BasePage {
	public void SwitchToNewOpenedWindow(WebDriver driver)
    {
       /* String oldUrl = driver.Url;
        String[] handles = driver.WindowHandles.Where(h => h != driver.CurrentWindowHandle).ToArray();
        driver.SwitchTo().Window(handles.Last());
        if (isNewUrl && oldUrl == driver.Url)
        {
            WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(Constant.WaitTimeoutShortSeconds));
            //wait url
           /* wait.Until(drv =>
            {
                drv.SwitchTo().Window(handles.Last());
                return drv.Url != oldUrl;
            });
         }*/
    }

    public void SwitchToNewFrame(WebElement element)
    {
    	Constant.driver.switchTo().frame(element);
        //Constant.WebDriver.SwitchTo().Frame(element);
    }
    public void CloseWindow()
    {
        Constant.driver.close();
    }
}
