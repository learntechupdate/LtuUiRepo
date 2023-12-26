package testscripts.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void launchBrower() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() {
		
		driver.get("http://www.amazon.in/");
        String actualtitle= driver.getTitle();		
		Reporter.log("actualtitle : "+actualtitle,true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("doing nothing",true);
	}
	
	
	@AfterClass
	public void quitBrowser() {
		driver.quit();
	}
}
