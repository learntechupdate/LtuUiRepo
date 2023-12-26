package selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");//id
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");//attribute
		driver.findElement(By.cssSelector(".button")).click();//class
		System.out.println("logged in");
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		
		//enter username
		driver.findElement(By.cssSelector("input[name*='userName']")).sendKeys("Riyaz");//contains
		driver.findElement(By.cssSelector("input[name^='_sea']")).click();//Starts with
		driver.findElement(By.cssSelector("input[id$='tBtn']")).click();//Ends with
		
		
			
	}

}
