package selenium.automationchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordActions {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//keyborad action
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");//id
		WebElement password = driver.findElement(By.cssSelector("input[name='txtPassword']"));//attribute
	    password.sendKeys("admin123");
	    password.sendKeys(Keys.TAB);
		password.sendKeys(Keys.ENTER);
		//
		
	}

}
