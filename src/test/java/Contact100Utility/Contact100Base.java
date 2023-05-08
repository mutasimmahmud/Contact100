package Contact100Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Contact100Base {
             public static WebDriver driver;
             public static Properties pro;
	public  Contact100Base() {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Contact100Configuration\\Contact100.properties");
		    pro = new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please check your code");
			e.printStackTrace();
		}
	}
	public void Contact100Browser() {
		String browser= pro.getProperty("Browser1");
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",(System.getProperty("user.dir")+"\\EdgeWebDriver\\msedgedriver.exe"));
			driver= new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Contact100TestData.implicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Contact100TestData.pageLoadTimeout));
			driver.manage().window().maximize();			
			driver.manage().deleteAllCookies();
		}
	
		else if (browser.equalsIgnoreCase("FF"));
	}
	public static void Contact100URL(String URL) {
		driver.get("https://demoblaze.com/");
	}
}
