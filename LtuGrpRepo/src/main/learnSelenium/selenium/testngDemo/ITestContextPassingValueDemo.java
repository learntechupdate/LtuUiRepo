package selenium.testngDemo;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContextPassingValueDemo {

		@Test
		public void test1(ITestContext context) throws Exception {
			
			String value = "Passing Value Test1";
			context.setAttribute("Key", value);
			//System.out.println("We are going to fail this Test Case");
			//Assert.fail();
		}
	
		@Test(dependsOnMethods = "test1")
		public void test2(ITestContext context) throws Exception {
			String test1Output = (String) context.getAttribute("Key");
			System.out.println("Output is : " +test1Output);
			
		}
}
