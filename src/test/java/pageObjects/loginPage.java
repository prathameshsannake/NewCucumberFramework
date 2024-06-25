//package pageObjects;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class loginPage {
//
//	WebDriver driver;
//	By txt_username = By.id("user-name");
//	By txt_password = By.id("password");
//	By login_button = By.id("login-button");
//	By logo = By.className("app_logo");
//
//	public loginPage(WebDriver driver) {
//		this.driver = driver;
//	}
//
//	public void enterUsername(String username) {
//		driver.findElement(txt_username).sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void clickOnLoginButton() {
//		driver.findElement(login_button).click();
//	}
//
//	public void VerifyLogo() {
//		driver.findElement(logo).isDisplayed();
//	}
//}
