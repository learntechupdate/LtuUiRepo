package selenium.advance;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;


@Listeners(selenium.advance.TestNGListerner.class)
public class MyFirstTestCaseOfListerner {
	WebDriver driver;
	@Test
	public void FacebookTitleVerify() {
	
		driver = BrowserFactory.startBrowser("chrome");
		
		BrowserFactory.enterUrl("https://www.facebook.com/");
		
		String My_Title = driver.getTitle();
		System.out.println("My Title"+My_Title);
		Assert.assertTrue(My_Title.contains("Facebook – log in or sign up"));
		
		Reporter.log("Verify the Completed page Title",true);
		
		BrowserFactory.closeBrowser();
		
	}
	@Test
	public void TitleMatch()
	
	{
	System.out.println("Test 2 For Dummy");
	Assert.assertTrue(false);
	
	System.out.println("Failed for Test Case");
	}
	
}
