package Contact100Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Contact100Utility.Contact100Base;

public class SignupPageLocator extends Contact100Base {
	public  SignupPageLocator () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="sign-username")
	public WebElement EnterUsername;
	
	@FindBy(id="sign-password")
	public WebElement EnterPassword;
	
	@FindBy(xpath="//button[text()='Sign up']")
	public WebElement clicksignupbutton;
	
	@FindBy(xpath="//h5[text()='Sign up']")
	public WebElement VerifySignup;
	
}
