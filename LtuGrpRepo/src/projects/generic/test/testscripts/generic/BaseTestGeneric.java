package testscripts.generic;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import library.generic.BrowserFactory;
import library.generic.GenericUtility;

/* Function Name : 
 * Description   : 
 * Parameters    : 
 * Author & Date : Touheed Aslam DD/MM/2019
 * Modified Date :*/

public class BaseTestGeneric {

	public WebDriver driver;

	@BeforeClass
	public void launch() {

		driver = BrowserFactory.startBrowser("Chrome");

	}

	@AfterClass
	public void closebrowser() {
		// BrowserFactory.closeBrowser();
	}

	@BeforeMethod
	public void beforeTCRunMethod() {

		Reporter.log("BeforeTCRunMethod", true);
	}

	@AfterMethod
	public void afterTCRunMethod() {
		Reporter.log("AfterTCRunMethod", true);
	}
}
