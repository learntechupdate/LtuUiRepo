package selenium.testngDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library.generic.BrowserFactory;

public class ValidationTestNGAssert {
	
	WebDriver driver;
	
	@Test(enabled = false)
	public void hardAssert()
	{
		 driver= BrowserFactory.startBrowser("chrome");
		
        BrowserFactory.enterUrl("https://www.google.com/");
        String expectedTitle= "Googles";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        
        Reporter.log("I will pass",true);//i want to exe even if assert fail -> we go for Soft assert
        
       
        
	}
	
	@Test
	public void softAssert()
	{
		 driver= BrowserFactory.startBrowser("firefox");
		
        BrowserFactory.enterUrl("https://www.google.com/");
        String expectedTitle= "Googles";
        String actualTitle = driver.getTitle();
       
        SoftAssert sa = new SoftAssert();
        
        sa.assertEquals(actualTitle, expectedTitle);
        
        
        Reporter.log("I will pass",true);//i want to exe even if assert fail -> we go for Soft assert
        
        BrowserFactory.closeBrowser();
        
        sa.assertAll();
        
	}
	
}
