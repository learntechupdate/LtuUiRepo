package Automation.QspidersLTU;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		String expected= "Google";
		String actual = driver.getTitle();
		
		if (actual.equalsIgnoreCase(expected)) {
			
			System.out.println("success");
			
		} else {
			
			System.out.println("failed");

		}
				
		driver.quit();
		
		
		
	}

}
