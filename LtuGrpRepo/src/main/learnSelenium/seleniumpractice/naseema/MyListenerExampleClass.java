package seleniumpractice.naseema;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(seleniumpractice.naseema.Listener.class)
public class MyListenerExampleClass  {
	
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
