package selenium.datadriven;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import pageobject.LoginPage;

public class ParametersDemo {
	
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password)
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome");
		BrowserFactory.enterUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Reporter.log("Testing using Parameters", true);
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);
		
	}

}
