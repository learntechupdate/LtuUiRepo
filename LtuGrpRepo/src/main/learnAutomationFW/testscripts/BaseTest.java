package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageobject.LoginPage;

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
		public void enterUrl() {
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        String actualtitle= driver.getTitle();		
			Reporter.log("actualtitle : "+actualtitle,true);
			LoginPage lp=new LoginPage(driver);
			lp.login("Admin", "admin123");
		}
		
		@AfterMethod
		public void dummy() {
			Reporter.log("Do nothing",true);
		}
		
		
		@AfterClass
		public void quitBrowser() {
			driver.quit();
		}
	
}
