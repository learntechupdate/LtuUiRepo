package selenium.datadriven;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import pageobject.LoginPage;

public class DataProviderDemo {
		
/*	@Test(dataProvider = "LoginTestData")
	
	public void login(String username, String password)
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome");
		BrowserFactory.enterUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Reporter.log("Testing using Data Provider", true);
		
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		
		
		
	}
	@DataProvider(name="LoginTestData")
	public Object[][] getTestdata()
	{
		Object [][] data = new Object[2][2];
		data[0][0] = "Admin1";
		data[0][1] ="admin1234";
		
		data[1][0]="Admin";
		data[1][1]="admin123";
		
		
		
	return data;
		
		
	}*/

	
@Test(dataProvider = "LoginTestDataArray")
	
	public void loginArray(String username, String password)
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome");
		BrowserFactory.enterUrl("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Reporter.log("Testing using Data Provider Array", true);
		
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		
		
		
	}
	@DataProvider(name="LoginTestDataArray")
	public Object[][] getTestdataArray()
	{
		return new Object[][] 
		    	{
		            { "Guru99", "India" },
		            { "Krishna", "UK" },
		            { "Bhupesh", "USA" },
		            {"Admin", "admin123"}
		        };
		
		
	}

}
