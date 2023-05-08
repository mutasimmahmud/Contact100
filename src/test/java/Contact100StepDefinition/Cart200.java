package Contact100StepDefinition;

import Contact100Action.CartPageAction;
import Contact100Action.HomepageAction;
import Contact100Action.ProductPageAction;
import Contact100Utility.Contact100Base;
import Contact100Utility.ContactContact100Utility;
import cucumber.api.java.en.Then;

public class Cart200 extends Contact100Base{
	HomepageAction homepageAction =new HomepageAction();
	ProductPageAction  productPageAction =new ProductPageAction ();
	CartPageAction cartPageAction = new CartPageAction();
	
	@Then("^Click Samsung Phone$")
	public void click_Samsung_Phone() throws Throwable {
		homepageAction.ClickSamsungPhone();
	}

	@Then("^Click Add to Cartt$")
	public void click_Add_to_Cartt() throws Throwable {
		productPageAction.ClickAddtoCartt(); 
	}

	@Then("^Click Cart Linkk$")
	public void click_Cart_Linkk() throws Throwable {
		cartPageAction.ClickCartLinkk();
	}

	@Then("^Verify user can Add item in Cartt$")
	public void verify_user_can_Add_item_in_Cartt() throws Throwable {
		cartPageAction.VerifyusercanAdditeminCartt();  
		ContactContact100Utility.takeMyScreenshot(driver, "cartpage");
	}


}
