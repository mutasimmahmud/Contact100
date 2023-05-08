package Contact100Action;

import org.testng.Assert;

import Contact100Locator.ContactpageLocator;
import Contact100Utility.Contact100Base;
import Contact100Utility.Contact100TestData;

public class ContactPageAction extends Contact100Base{
	ContactpageLocator contactpageLocator = new ContactpageLocator();
	
	public void  EnterContactEmaill() {
		contactpageLocator.ContactEmail.sendKeys(Contact100TestData.ContactEmail);
	}
	public void EnterContactNamee() {
		contactpageLocator.ContactName.sendKeys(Contact100TestData.ContactName);
	}
    public void EnterContactMessagee() {
    	contactpageLocator.ContactMessage.sendKeys(Contact100TestData.ContactMessage);
    }
    public void ClickSendMessage() throws Exception {
    	contactpageLocator.SendMessage.click();
    	Thread.sleep(4000);
    	driver.switchTo().alert().accept();
    }
   
}
