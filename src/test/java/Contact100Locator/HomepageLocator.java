package Contact100Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Contact100Utility.Contact100Base;

public class HomepageLocator extends Contact100Base{

	public HomepageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Contact']")
	public WebElement ContactLink;
	
	@FindBy(id="cat")
	public WebElement ValidationofContact;
	

	@FindBy(id="signin2")
	public WebElement ClickSignupLink;
	
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	public WebElement ClickSamsungGalaxy6;
	
	
	}
	

