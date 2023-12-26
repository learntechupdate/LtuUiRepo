package test.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class LoginAmazon {
		
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
		driver.get("http://www.amazon.in/");
         String actualtitle= driver.getTitle();		
		System.out.println(actualtitle);
		
		WebElement loigntab = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
		loigntab.click();
		
		driver.findElement(By.id("ap_email")).sendKeys("learn.tech.update@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
//		String ExpErroMdg="There was a problem We cannot find an account with that email address";
//		String ActualerrMsg = driver.findElement(By.id("auth-error-message-box")).getText();
		
		String ExpErroMdg="There was a problem";
		String ActualerrMsg = driver.findElement(By.xpath("//h4[contains(text(),'There was a problem')]")).getText();
		
//		Assert.assertEquals(ExpErroMdg, ActualerrMsg);//will stop exe the next line if it fails
		//to exe next line we use soft assert
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ExpErroMdg, ActualerrMsg);
		
		driver.quit();
		
		sa.assertAll();
		
	}

}
