package Contact100Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Contact100Utility.Contact100Base;

public class ContactpageLocator  extends Contact100Base {
	public ContactpageLocator() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="recipient-email")
public WebElement ContactEmail;

@FindBy(id="recipient-name")
public WebElement ContactName;

@FindBy(id="message-text")
public WebElement ContactMessage;

@FindBy(xpath="//button[text()='Send message']")
public WebElement SendMessage;

}
