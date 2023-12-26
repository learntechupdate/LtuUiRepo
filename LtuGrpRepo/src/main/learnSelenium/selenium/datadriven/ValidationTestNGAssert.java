package selenium.datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library.generic.BrowserFactory;

public class ValidationTestNGAssert {
	
	WebDriver driver;
	
	
	@Parameters({"BrowserName"})
	@Test
	public void softAssert(String BrowserName)
	{
		
//		driver= BrowserFactory.startBrowser(browertolauch);
		if (BrowserName.equalsIgnoreCase("mozilla")|BrowserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			
		    driver=new FirefoxDriver();
		    
		    
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    
		}
//        BrowserFactory.enterUrl("https://www.google.com/");
		
		driver.get("https://www.google.com/");
		
        String expectedTitle= "Googles";
        String actualTitle = driver.getTitle();
       
        SoftAssert sa = new SoftAssert();
        
        sa.assertEquals(actualTitle, expectedTitle);
        
        
        Reporter.log("I will pass",true);//i want to exe even if assert fail -> we go for Soft assert
        
//        BrowserFactory.closeBrowser();
        
        sa.assertAll();
        
	}
	
}
