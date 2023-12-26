package selenium.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGtest {
	
	//We need to explore 
	@BeforeGroups
	public void beforeGroups() {
		Reporter.log("Message beforeGroups",true);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Message beforeSuite",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Message afterSuite",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Message beforeTest",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Message afterTest",true);
	}
	
	
	@BeforeClass 
	public void beforeClass() {
		Reporter.log("Message beforeClass",true);
	}
	
	@AfterClass 
	public void afterClass() {
		Reporter.log("Message afterClass",true);
	}
	
	
	@BeforeMethod 
	public void beforeMethod () {
		Reporter.log("Message beforeMethod",true);
	}
	
	@AfterMethod 
	public void afterMethod () {
		Reporter.log("Message afterMethod",true);
	}
	/*
	 * @Test public void testAnnotaitonTCase() {
	 * 
	 * Reporter.log("Messages testAnnotaiton",true); }
	 */
	
	@Test
	public void TC1() {
	
		Reporter.log("Test Case 1",true);
	}
	
	@Test
	public void TC2() {
	
		Reporter.log("Test Case 2",true);
	}
	
	
	
	
	

}
