package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public static final By txtEmailAddress = By.xpath("//input[@id='input-email']");
	public static final By txtPassword = By.xpath("//input[@id='input-password']");
	public static final By btnLogin = By.xpath("//input[@value='Login']");

	public void setEmail(String email) {
		driver.findElement(txtEmailAddress).sendKeys(email);
	}

	public void setPassword(String pwd) {
		driver.findElement(txtPassword).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}

}
