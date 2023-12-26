package testscripts.pom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobject.quickPractice.LoginPage;



public class LoginTest extends BaseTest{
	
//	@BeforeMethod
//	public void login() {
//		driver.get("http://www.flipkart.in/");
//	}
	
	@Test
	public void loginErrorTest() {
	
		
	LoginPage lp=new LoginPage(driver);
	lp.logintab();
	
	
	lp.login("learn.tech.update@gmail.com");
	
		
//	Assert.assertEquals(ExpErroMdg, ActualerrMsg);//will stop exe the next line if it fails
	//to exe next line we use soft assert
	SoftAssert sa=new SoftAssert();
	
	String ActualerrMsg=lp.readErrorMsg();
	String ExpErroMdg="There was a problemss";
	sa.assertEquals(ActualerrMsg,ExpErroMdg );
	sa.assertAll();
	}
}
