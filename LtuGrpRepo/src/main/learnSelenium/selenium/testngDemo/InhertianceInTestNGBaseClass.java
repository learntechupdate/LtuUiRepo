package selenium.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class InhertianceInTestNGBaseClass {
	
	
	@BeforeClass 
	public void LaunchBrowser() {
		Reporter.log("BeforeClass Message LaunchBrowser",true);
	}
	
	@BeforeMethod 
	public void Login () {
		Reporter.log("BeforeMethod Message Login",true);
	}
	
	
	@AfterClass 
	public void CloseBrowser() {
		Reporter.log("AfterClass Message CloseBrowser",true);
	}
	
	@AfterMethod
	public void Logout () {
		Reporter.log("AfterMethod Message Logout",true);
	}
	
	

}
