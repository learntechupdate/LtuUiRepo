package selenium.automationchallenges.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageOnLoadpopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://Username:password@url")
		driver.get("https://admin:admin123@opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		
	}

}
