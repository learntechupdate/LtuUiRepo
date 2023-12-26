package selenium.advance;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import library.generic.GenericUtility;
import testscripts.generic.BaseTestGeneric;

public class CaptureScreenshotOnFailure extends BaseTestGeneric{

	@Test
	public void captureScreenshot() {
		
		BrowserFactory.enterUrl("https://www.facebook.com/");
		//Assert.fail(); //We are purposefully failing the Test Case
		
	}
	
	@AfterMethod
	public void afterTCRunMethod(ITestResult result)
	{
		if(result.FAILURE==result.getStatus()) {
			GenericUtility.takeScreenShot(driver, "./screenshot/failedTC/", result.getName());
			
		}
			
		else {
			GenericUtility.takeScreenShot(driver, "./screenshot/passedTC/", result.getName());
		}
		//Reporter.log("AfterTCRunMethod", true);
		
		BrowserFactory.enterUrl("D:\\Riyaz\\AWB\\qspiderLtu\\QspidersLTU\\screenshot\\passedTC\\captureScreenshot.jpg");
	}
}
