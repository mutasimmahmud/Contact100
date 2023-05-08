package Contact100Action;

import org.testng.Assert;

import Contact100Locator.HomepageLocator;
import Contact100Utility.Contact100Base;

public class HomepageAction extends Contact100Base{
	HomepageLocator homepageLocator = new HomepageLocator();
	
	
	public void ClickContactLinkk() {
		homepageLocator.ContactLink.click();
	}
		
		 public void  Verifyusercancontactbysendingmessage() {
			boolean boo= homepageLocator.ValidationofContact.isDisplayed();
			Assert.assertTrue(boo);
			 
		    }
		 public void cliccksignup() {
			 homepageLocator.ClickSignupLink.click(); }
			 
			 public void ClickSamsungPhone() {
				 homepageLocator.ClickSamsungGalaxy6 .click();
			 }
		 }
	

