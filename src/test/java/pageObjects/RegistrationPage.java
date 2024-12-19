package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	public static final By txtFirstName = By.id("input-firstname");
	public static final By txtLastName = By.id("input-lastname");
	public static final By txtEmail = By.id("input-email");
	public static final By txtTelephone = By.id("input-telephone");
	public static final By txtPassword = By.id("input-password");
	public static final By txtConfirmPassword = By.id("input-confirm");
	public static final By chkPrivacyPolicy = By.xpath("//a[@class='agree']//following::input[@name='agree']");
	public static final By btnContinue = By.xpath("//input[@value='Continue']");
	public static final By msgAccountCreation = By.xpath("//h1[text()='Your Account Has Been Created!']");
	public static final By btnContinueAccountSuccess = By.xpath("//a[text()='Continue']");
	
	public void enterFirstName(String firstName) {
		driver.findElement(txtFirstName).sendKeys(firstName);
	}
	
	public void enterLastName(String lasttName) {
		driver.findElement(txtLastName).sendKeys(lasttName);
	}
	
	public void enterEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		driver.findElement(txtTelephone).sendKeys(telephone);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(txtConfirmPassword).sendKeys(confirmPassword);
	}
	
	public void clickPrivacyPolicy() {
		WebElement privacyEle = driver.findElement(chkPrivacyPolicy);
		Actions action = new Actions(driver);
		action.click(privacyEle).build().perform();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click;", privacyEle);
	}
	
	public void clickContinue() {
		driver.findElement(btnContinue).click();
	}
	
	public String getAccountCreation() {
		String msgAccountCreated = driver.findElement(msgAccountCreation).getText();
		return msgAccountCreated;
	}
	
	public void clickContinueAccountSuccess() {
		driver.findElement(btnContinueAccountSuccess).click();
	}
}
