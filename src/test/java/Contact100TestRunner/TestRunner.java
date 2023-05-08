package Contact100TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Contact100Utility.Contact100Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Folder"},
plugin = {"json:target/cucumber.json"},
glue = "Contact100StepDefinition" ,tags = {"@Dallas,@Jahan,@Next"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
@BeforeTest
public void OpenURL() {
	Contact100Base test = new Contact100Base();
	test.Contact100Browser();
	
}
@AfterTest
public void CloseURL() {
	Contact100Base test = new Contact100Base();
	test.driver.quit();
}
}
