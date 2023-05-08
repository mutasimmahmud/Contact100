package Contact100Action;

import Contact100Locator.ProductPageLocator;
import Contact100Utility.Contact100Base;

public class ProductPageAction extends Contact100Base{
	ProductPageLocator productPageLocator =new ProductPageLocator();
	
   public void ClickAddtoCartt() throws Exception {
	productPageLocator.AddtoCart.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}
   
}
