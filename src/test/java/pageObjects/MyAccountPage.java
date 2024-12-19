package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public static final By msgHeading = By.xpath("//h2[text()='My Account']"); // MyAccount Page heading
	public static final By lnkLogout = By.xpath("//div[@class='list-group']//a[text()='Logout']"); 
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (driver.findElement(msgHeading).isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		driver.findElement(lnkLogout).click();

	}
	
}
