package selenium.testngDemo.listenerdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(selenium.testngDemo.listenerdemo.ListenersDemoClass.class)
public class MyListenerExampleSuite  {
	
	@Test
	public void testCase1() {
		
		//Reporter.log("Test Case 1 Executed", true);
		Assert.fail();
	}

	
	@Test
	public void testCase2() {
		
		//Reporter.log("Test Case 2 Executed", true);
		Assert.assertTrue(true);
	}
}
