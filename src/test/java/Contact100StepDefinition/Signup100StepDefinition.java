package Contact100StepDefinition;


import Contact100Action.HomepageAction;
import Contact100Action.SignuppageAction;
import Contact100Utility.Contact100Base;
import Contact100Utility.ContactContact100Utility;
import cucumber.api.java.en.Then;

public class Signup100StepDefinition extends Contact100Base{
	SignuppageAction signuppageAction =new SignuppageAction();
	HomepageAction  homepageAction = new HomepageAction ();
	

	@Then("^clicck signup$")
	public void clicck_signup() throws Throwable {
		homepageAction.cliccksignup(); 
		Thread.sleep(40);
		
	}

	@Then("^enteer user name$")
	public void enteer_user_name() throws Throwable {
		signuppageAction.enteerusername(); 
	}

	@Then("^enteer password$")
	public void enteer_password() throws Throwable {
		signuppageAction.enteerpassword();  
		
	}

	@Then("^clicck signup button$")
	public void clicck_signup_button() throws Throwable {
		signuppageAction.cliccksignupbutton();
	}

	@Then("^Verify custoomer signup successfully$")
	public void verify_custoomer_signup_successfully() throws Throwable {
		signuppageAction.Verifycustoomersignupsuccessfully();
		ContactContact100Utility.takeMyScreenshot(driver, "signuppage");
	}
 

}
