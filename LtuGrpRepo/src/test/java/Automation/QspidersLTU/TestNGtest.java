package Automation.QspidersLTU;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGtest {
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Browser launched",true);
		
	}
	
	@BeforeMethod
	public void enterurl() {
		Reporter.log("Entering URL",true);
		driver.get("https://www.google.com");
	}
	
	
	String actual=null;
	String expected= "Google";
	
	@Test
	public void verifypage() {
		Reporter.log("Verifing page",true);
		
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterMethod
	public void msg() {
		Reporter.log("Page title is : "+actual ,true);
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	

}
