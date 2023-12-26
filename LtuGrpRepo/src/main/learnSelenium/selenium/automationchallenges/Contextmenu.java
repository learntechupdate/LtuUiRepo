package selenium.automationchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmenu {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
        driver.get("https://www.amazon.in/");
		
		WebElement link = driver.findElement(By.linkText("Mobiles"));
		
		
		
		
		Actions act = new Actions(driver);
		act.contextClick(link).sendKeys("L").build().perform();
		
		//sending the tab is not happeing
		
		
		
	}

}
