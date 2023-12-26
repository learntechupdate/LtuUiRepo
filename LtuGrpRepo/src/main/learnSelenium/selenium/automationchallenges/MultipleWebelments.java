package selenium.automationchallenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebelments {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");//id
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");//attribute
		driver.findElement(By.cssSelector(".button")).click();//class
		System.out.println("logged in");
		
		/*
		//print all the links(use //a) present in the webpage
		
		     List<WebElement> linkref = driver.findElements(By.xpath("//a"));
		
		     System.out.println("Number of Webelement"+linkref.size());
		     
		     for (WebElement e : linkref) {
				System.out.println(e.getText());
			}
		     		   
		  */
		  
		
		//Type in MultitextBox
		
		driver.findElement(By.partialLinkText("y Info")).click();
		driver.findElement(By.xpath("(//input[@value='Edit'])[1]")).click();
		
		List<WebElement> textref = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(textref.size());
		
		/*
		for (WebElement webElement : textref) {
			
			webElement.sendKeys("LTU");
		}
		*/

		//Type in Multi box with diff values
		
       for (WebElement webElement : textref) {
			
			webElement.clear();
		}
		
		textref.get(0).sendKeys("Riyaz");
		textref.get(1).sendKeys("sekhar");
		textref.get(2).sendKeys("Touheed");
		
		for (int i = 3; i < textref.size(); i++) {
			textref.get(i).sendKeys("LTU");
		}
		
		
	}
	
	

}
