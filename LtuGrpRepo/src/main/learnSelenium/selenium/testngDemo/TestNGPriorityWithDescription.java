package selenium.testngDemo;

import org.testng.annotations.Test;

public class TestNGPriorityWithDescription {

	
	//By Default TestNG will Execute according to Alphabetical Order
	
	@Test(priority=1, description="This is Login Test Case")
	public void login()
	{
		System.out.println("This is Login");
		
	}
	
	
	@Test(priority = 2, description = "This is any one item Test Case")
	public void selectitem() 
	{
		System.out.println("Select any one item");
	}
	
	
	@Test(priority = -1, description = "This is acceptIteam Teat Case")
	public void RejectItem()
	{
		System.out.println("Order this acceptItem");

	}
	
}
