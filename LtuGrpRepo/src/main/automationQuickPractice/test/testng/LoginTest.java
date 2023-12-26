package test.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{
	
//	@BeforeMethod
//	public void login() {
//		driver.get("http://www.flipkart.in/");
//	}
	
	@Test
	public void loginErrorTest() {
	
	driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")).click();
	driver.findElement(By.id("ap_email")).sendKeys("learn.tech.update@gmail.com");
	driver.findElement(By.id("continue")).click();
	
	
	String ExpErroMdg="There was a problem";
	String ActualerrMsg = driver.findElement(By.xpath("//h4[contains(text(),'There was a problem')]")).getText();
	
//	Assert.assertEquals(ExpErroMdg, ActualerrMsg);//will stop exe the next line if it fails
	//to exe next line we use soft assert
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(ExpErroMdg, ActualerrMsg);
	sa.assertAll();
	}
}
