//package StepsDefinitions;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import pageObjects.loginPage;
//
//public class POMLoginStepsDefinition {
//
//	loginPage login;
//	WebDriver driver;
//
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		driver = new ChromeDriver();
//		// driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@When("^user enters Valid (.+) and (.+)$")
//	public void user_enters_valid_username_and_password(String username, String password) {
////	    driver.findElement(By.id("user-name")).sendKeys(username);
////	    driver.findElement(By.id("password")).sendKeys(password);
//		login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@And("Clicks on login button")
//	public void clicks_on_login_button() {
//		// driver.findElement(By.id("login-button")).click();
//		login.clickOnLoginButton();
//	}
//
//	@Then("User is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		// driver.findElement(By.className("app_logo")).isDisplayed();
//		login.VerifyLogo();
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//		driver.close();
//		driver.quit();
//	}
//}
