package selenium.testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;

public class TitleVerification {

	WebDriver driver;
	
	@Test
	public void applicationTitleVerification() {
		/*
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		*/
		
		driver = BrowserFactory.startBrowser("chrome");
		
		BrowserFactory.enterUrl("https://www.facebook.com/");
		
		String My_Title = driver.getTitle();
		System.out.println("My Title"+My_Title);
		
		//Assert.assertTrue(My_Title.contains("Facebook – log in or sign up"));
		
		Assert.assertTrue(My_Title.contains("Google"), "You are not in Facebook Page"); //Assert with Messages, if it fails
		
		Reporter.log("Verify the Completed page Title",true);
		
		BrowserFactory.closeBrowser();
		
		
		
	}
}
