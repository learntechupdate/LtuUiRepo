package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//attribute
		String username="Admin";
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);
		
		//text
		driver.findElement(By.xpath("//*[text()='Forgot your password?']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='btnCancel']")).click();
		
		
		//contains
		driver.findElement(By.xpath("//a[contains(text(),'orgot your passwo')]")).click();
		
		//starts-with
		String pagename = driver.findElement(By.xpath("//label[starts-with(text(),'OrangeHRM')]")).getText();
		
		System.out.println(pagename);
		
		
		//following sibling 
		driver.findElement(By.xpath("//label[starts-with(text(),'OrangeHRM')]//following-sibling::input")).sendKeys("LTU");
		
		//following - will select all the child , grand child etc
//		driver.findElement(By.xpath("//label[starts-with(text(),'OrangeHRM')]//following::input"));
		
		
		//preceding
		String pagetitle = driver.findElement(By.xpath("//label[starts-with(text(),'OrangeHRM')]//preceding::h1")).getText();
		System.out.println(pagetitle);
		
		//Group index
		// (//*[@type='checkbox'])[3]  - Admin of orange HRM table
		
		//Or	
		
	    System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Aaliyah.Haq')] | //*[contains(text(),'Admin')]")).getText());
	    //a[contains(text(),'Aaliyah.Haq')] | //*[contains(text(),'Admin')]		
	  //*[contains(text(),'Aatmaram') or contains(text(),'ES')]
	    
	    
	    //indepent and dependent concept
	    //(//a[contains(text(),'Job Title')])[2]/../../../../../../../..//input[@type='button']
		
	    
	    
		
				
	}

}
