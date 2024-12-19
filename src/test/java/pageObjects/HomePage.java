package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public static final By clkAccount = By.xpath("//span[text()='My Account']");
	public static final By clkRegister = By.xpath("//a[text()='Register']");
	public static final By clkLogin = By.xpath("//a[text()='Login']");
	
	public void clickAccount() {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(clkAccount));
		driver.findElement(clkAccount).click();
	}
	
	public void clickRegister() {
		driver.findElement(clkRegister).click();
	}
	
	public void clickLogin() {
		driver.findElement(clkLogin).click();
	}
}
