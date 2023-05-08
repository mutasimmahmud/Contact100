package Contact100Action;

import org.testng.Assert;

import Contact100Locator.CartPageLocator;
import Contact100Utility.Contact100Base;

public class CartPageAction extends Contact100Base{
	CartPageLocator cartPageLocator =new CartPageLocator();
		
	
	public void ClickCartLinkk() {
		cartPageLocator.ClickCartLink.click();
		
	}
	public void VerifyusercanAdditeminCartt() {
		boolean boo=cartPageLocator.VerifyCart.isDisplayed();
		Assert.assertTrue(boo);
	}
	}

