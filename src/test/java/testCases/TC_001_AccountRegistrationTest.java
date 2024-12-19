package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test(groups = {"Regression", "Master"})
	public void testAccountCreation() throws InterruptedException {
		try {
			logger.info("***** Starting TC001_AccountRegistrationTest  ****");
			logger.debug("This is a debug log message");
			HomePage hp = new HomePage(driver);
			hp.clickAccount();
			logger.info("Clicked on MyAccount Link.. ");
			hp.clickRegister();
			logger.info("Clicked on Register Link.. ");
			RegistrationPage rp = new RegistrationPage(driver);
			logger.info("Providing customer details...");
			rp.enterFirstName(randomString().toUpperCase());
			rp.enterLastName(randomString().toUpperCase());
			rp.enterEmail(randomString() + "@gmail.com");
			rp.enterTelephone(randomNumber());
			String password = randomAlphaNumeric();
			rp.enterPassword(password);
			rp.enterConfirmPassword(password);
			rp.clickPrivacyPolicy();
			rp.clickContinue();
			logger.info("Validating expected message..");
			String confmsg = rp.getAccountCreation();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");
			rp.clickContinueAccountSuccess();
			logger.info("Test passed");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} finally {
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}

}
