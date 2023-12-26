package testscripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import library.generic.BrowserFactory;
import library.generic.GenericUtility;
import testscripts.generic.BaseTestGeneric;

public class BaseTestIQ extends BaseTestGeneric {
	
	@AfterMethod
	public void afterTCRunMethod(ITestResult result) {

		GenericUtility.takeScreenshotOnPassOrFailure(driver, result);
		GenericUtility genericUtility = new GenericUtility();

		try {
			String screenshotPassedPath="D:/Riyaz/AWB/qspiderLtu/QspidersLTU/screenshot/passedTC/fetchItemPrice.jpg";
			// log with snapshot
			
			genericUtility.extentReport("fetchItemPrice",screenshotPassedPath);
			genericUtility.logger.pass("Passed Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPassedPath).build());
			
		} catch (IOException e) {
			genericUtility.extentReport("fetchItemPrice",
					"D:/Riyaz/AWB/qspiderLtu/QspidersLTU/screenshot/failedTC/fetchItemPrice.jpg");
			Assert.fail();

		}
	}

}
