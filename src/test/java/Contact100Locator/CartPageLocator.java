package Contact100Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Contact100Utility.Contact100Base;

public class CartPageLocator extends Contact100Base{
	public CartPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Cart']")
	public WebElement ClickCartLink;
	@FindBy(xpath="//button[text()='Place Order']")
	public WebElement VerifyCart;
}
