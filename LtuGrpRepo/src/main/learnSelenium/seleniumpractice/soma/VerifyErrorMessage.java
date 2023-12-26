package seleniumpractice.soma;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import testscripts.generic.BaseTestGeneric;

public class VerifyErrorMessage extends BaseTestGeneric{

	@Test
	public void verifyErrorMessage() {
		
		/*
		 * BrowserFactory.enterUrl("https://www.gmail.com");
		 * 
		 * driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 * 
		 * //String actualError=driver.findElement(By.
		 * xpath("//div[contains(text(),'Enter an email or phone number')]")).
		 * getAttribute("innerHTML");
		 * 
		 * String actualError=driver.findElement(By.
		 * xpath("//div[contains(text(),'Enter an email or phone number')]")).getText();
		 * String expectedError="Enter an email or phone number";
		 * 
		 * //Type1 Assert.assertEquals(actualError, expectedError);
		 */
		
		
		BrowserFactory.enterUrl("https://login.onepaperlane.com/users/login");
		
		driver.findElement(By.xpath("//button[contains(text(),' Continue')]")).click();
		
		//String actualError=driver.findElement(By.xpath("//div[contains(text(),'Enter an email or phone number')]")).getAttribute("innerHTML");
		
		String actualError=driver.findElement(By.id("email-error")).getAttribute("innerHTML");
		System.out.println("Actual Error is  "+actualError);
		
		String expectedError="Please enter business email idq";
		
		//Type1
		Assert.assertEquals(actualError, expectedError);
		
	}
	

}