package testscripts;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.InterviewUtility;
import library.generic.BrowserFactory;
import library.generic.GenericUtility;
import pageobject.AmazonBasePage;
import pageobject.FlipkartBasePage;

public class ItemPriceCompareTest extends BaseTestIQ {
	@Test(priority=1)
	public void fetchItemPrice(ITestContext context) throws InterruptedException {

		// String itemName="Apple iPhone XR 64GB Yellow";
		String itemName = "Galaxy F12";
		BrowserFactory.enterUrl("https://www.amazon.in/");
		AmazonBasePage aobj = new AmazonBasePage(driver);

		aobj.search(itemName);
		aobj.selectItem();
		GenericUtility.swtichToTab(driver, 2);
		String aitemPrice = aobj.fetchItemPrice();
		// int intaitemPrice = InterviewUtility.returnIntPrice(aitemPrice);
		float intaitemPrice = InterviewUtility.returnFloatPrice(aitemPrice);
		Reporter.log(itemName + " Amazon Item Price: Rs." + intaitemPrice, true);

		try {
			GenericUtility.staticWait(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BrowserFactory.enterUrl("https://www.flipkart.com/");
		FlipkartBasePage fobj = new FlipkartBasePage(driver);

		fobj.loginCloseButton();
		GenericUtility.staticWait(2);
		fobj.search(itemName);
		GenericUtility.staticWait(3);
		fobj.selectItem();
		GenericUtility.swtichToTab(driver, 3);
		String fitemPrice = fobj.fetchItemPrice();
		// int intfitemPrice = InterviewUtility.returnIntPrice(fitemPrice);
		float intfitemPrice = InterviewUtility.returnFloatPrice(fitemPrice);
		Reporter.log(itemName + " Flipkart Item Price: Rs." + intfitemPrice, true);

		float leastItemPrice;
		if (intaitemPrice > intfitemPrice) {

			System.out.println("Flipkart Price is Lower: Rs." + intfitemPrice);
			leastItemPrice = intfitemPrice;

		} else if (intaitemPrice == intfitemPrice) {
			System.out.println("Amazon Price is Equal to Flipkart Price " + intaitemPrice);
			System.out.println("Since the prices are same, so ordering from Amazon by default");
			leastItemPrice = intaitemPrice;
		} else {
			System.out.println("Amazon Price is Lower: Rs." + intaitemPrice);
			leastItemPrice = intaitemPrice;
		}
		context.setAttribute("leastItemPrice", leastItemPrice);
	}
}
