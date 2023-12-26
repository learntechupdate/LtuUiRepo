package selenium.testngDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;


public class CrossBrowserTesting {
	
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName)
	{
		driver=BrowserFactory.startBrowser(browserName);
		BrowserFactory.enterUrl("https://login.onepaperlane.org/users/login");
		String title = driver.getTitle();
		Reporter.log(title,true);
	}

}
