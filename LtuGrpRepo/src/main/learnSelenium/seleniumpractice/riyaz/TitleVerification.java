package seleniumpractice.riyaz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;

public class TitleVerification {
		WebDriver driver;
	@Test
	public void applicationTitleVerification() {
		
		driver=BrowserFactory.startBrowser("Firefox");
		BrowserFactory.enterUrl("https://www.google.com/");
		String My_Title = driver.getTitle();
		System.out.println("My Title"+My_Title);
		Assert.assertTrue(My_Title.contains("Google"));
		
		System.out.println("Verify the Completed page Title");
	}
}
