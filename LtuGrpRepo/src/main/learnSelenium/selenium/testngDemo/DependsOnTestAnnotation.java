package selenium.testngDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnTestAnnotation {
	
	//DependsOn Method works only with the @Test annotation
	@Test
	public void startBrowser() {
			Reporter.log("Start the Browser", true);
			//Assert.fail();
	}

	@Test(dependsOnMethods = "startBrowser")
	public void login() {
		Reporter.log("Logged into the System", true);
		Assert.fail();
	}

	@Test(dependsOnMethods = "login")
	public void Activity() {
		Reporter.log("Activity Started in the System", true);
	}
}

