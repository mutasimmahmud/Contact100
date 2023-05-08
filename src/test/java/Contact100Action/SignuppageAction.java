package Contact100Action;

import org.testng.Assert;

import Contact100Locator.SignupPageLocator;
import Contact100Utility.Contact100Base;

public class SignuppageAction extends Contact100Base{
	SignupPageLocator signupPageLocator =new SignupPageLocator ();
	
	public void enteerusername() {
		signupPageLocator .EnterUsername.sendKeys("test");
	}
	public void enteerpassword() {
		signupPageLocator .EnterPassword.sendKeys("test");	
	}
	public void cliccksignupbutton() {
		signupPageLocator .clicksignupbutton.click();
	}
	public void Verifycustoomersignupsuccessfully() {
		boolean boo=signupPageLocator .VerifySignup.isDisplayed();
		Assert.assertTrue(boo);
	}
}
