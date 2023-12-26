package selenium.automationchallenges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenuMouserHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		Actions act = new Actions(driver);
		WebElement dropdownMenu = driver.findElement(By.xpath("(//span[contains(text(),'Mobiles & Accessories')])[2]"));
		act.moveToElement(dropdownMenu).perform();
		
		driver.findElement(By.xpath("(//a[contains(text(),'OnePlus')])[1]")).click();
		
		
		
	}
}
