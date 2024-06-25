package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePagePageFactory {

	WebDriver driver;
	@FindBy(className="app_logo")
	WebElement app_logo;
	
	public void verifyLogo()
	{
		app_logo.isDisplayed();
	}
	
	public homePagePageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
