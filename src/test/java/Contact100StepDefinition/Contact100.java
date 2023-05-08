package Contact100StepDefinition;

import Contact100Action.ContactPageAction;
import Contact100Action.HomepageAction;
import Contact100Utility.Contact100Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contact100 extends Contact100Base {
	 HomepageAction  homepageAction =new  HomepageAction();
	 ContactPageAction contactPageAction = new ContactPageAction();
	@Given("^Open Demoblaze <\"([^\"]*)\"> Applicationn$")
	public void open_Demoblaze_Applicationn(String URL) throws Throwable {
		Contact100URL(URL);
		Contact100Utility.ContactContact100Utility.takeMyScreenshot(driver, "Homepage");
		
	}
	
	@Then("^Click Contact Linkk$")
	public void click_Contact_Linkk() throws Throwable {
		homepageAction.ClickContactLinkk();
	    	}

	@Then("^Enter Contact Emaill$")
	public void enter_Contact_Emaill() throws Throwable {
		contactPageAction.EnterContactEmaill();
	}

	@Then("^Enter Contact Namee$")
	public void enter_Contact_Namee() throws Throwable {
		contactPageAction.EnterContactNamee(); 
	}

	@Then("^Enter Contact Messagee$")
	public void enter_Contact_Messagee() throws Throwable {
		contactPageAction.EnterContactMessagee(); 
	}

	@Then("^Click Send Message$")
	public void click_Send_Message() throws Throwable {
		contactPageAction.ClickSendMessage();
	}
	@Then("^Verify user can contact by sending message$")
	public void verify_user_can_contact_by_sending_message() throws Throwable {
		homepageAction.Verifyusercancontactbysendingmessage();
		Contact100Utility.ContactContact100Utility.takeMyScreenshot(driver, "Homepage");
	   
	}



	


}
