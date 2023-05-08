package Contact100Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Contact100Utility.Contact100Base;

public class ProductPageLocator extends Contact100Base {
	
	public ProductPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add to cart']")
	public WebElement AddtoCart;
	
	
	
}
