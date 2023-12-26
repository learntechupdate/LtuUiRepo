package selenium.basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		// webDriver commands //added in team notes enter below link
		//https://docs.google.com/spreadsheets/d/1GNz2yIsjQSUrNHBjS_ocx2f7Jgige_hLLozF-Zu1_RM/edit#gid=1297887554
		
				String title = driver.getTitle();
				String currenturl = driver.getCurrentUrl();
				String pagesour = driver.getPageSource();
		
				System.out.println("title"+title);
				System.out.println("currenturl"+currenturl);
//				System.out.println("pagesour"+pagesour);
				
				//enter url in browser
				driver.navigate().to("https://www.amazon.in/");
				driver.navigate().refresh();
				
				
				WebElement we = driver.findElement(By.id(""));
		
				
				
				
		driver.close();// current
		driver.quit();// close all  browser opened by selenium
		
		
		
		
		
		
		
		
	}

}
