package selenium.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InhertianceInTestNGTestClass extends InhertianceInTestNGBaseClass{

	
	@Test
	public void tc_1() {
		
		Reporter.log("Exe tc_1", true);
	}
	
	
	@Test
	public void tc_2() {
		
		Reporter.log("Exe tc_2", true);
	}
	
	
	@Test
	public void tc_3() {
		
		Reporter.log("Exe tc_3", true);
	}
	
	
	
}
