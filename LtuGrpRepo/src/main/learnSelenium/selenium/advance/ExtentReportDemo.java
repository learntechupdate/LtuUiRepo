package selenium.advance;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import library.generic.GenericUtility;

public class ExtentReportDemo {
	
	@Test
	public void login() throws IOException {
		System.out.println("Login Test Case");
		
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./ExtentReports/ExtentReportsDemo.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// creates a toggle for the given test, adds all log events under it
		ExtentTest logger = extent.createTest("Login");
		
		logger.log(Status.INFO, "Information : Login Test Case");
		logger.log(Status.PASS, "Login Test Case Verified");
		
		String screenshotPath = "D:\\Riyaz\\AWB\\qspiderLtu\\QspidersLTU\\screenshot\\passedTC\\captureScreenshot.jpg";
		
		
		// log with snapshot
		logger.pass("Passed Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		
		// test with snapshot
        //logger.addScreenCaptureFromPath(screenshotPath);
		
		
		// calling flush writes everything to the log file
		extent.flush();
	}

}
