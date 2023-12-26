package testscripts;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderLeastPriceItem extends BaseTestIQ{

	//@Test(dependsOnMethods = "fetchItemPrice")
	@Test(priority=2)
	public void testcase_OrderLeastPriceItem(ITestContext context) {
		float leastItemPrice = (float) context.getAttribute("leastItemPrice");
		Reporter.log("The Least Value found was "+leastItemPrice);
	}
}
