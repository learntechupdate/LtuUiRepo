package seleniumpractice.thoid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector 


{
	
	public static void main(String[] args) {
    WebDriver driver;
	
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    driver=new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/");
        
    
    System.out.println("using id '#' ");
    driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
    
    driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
    
    
    System.out.println("using class dot'.'");
    driver.findElement(By.cssSelector("input.button")).click();
    
    driver.findElement(By.cssSelector(".panelTrigger")).click();
    
    driver.findElement(By.cssSelector("a.panelTrigger")).click();
    
    System.out.println("attribute");
     driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Admin");
    
     System.out.println("multiple  attribute");
    driver.findElement(By.cssSelector("input[id='txtPassword'][type='password']")).sendKeys("admin");
    
	System.out.println("usingContains '*' star");
    driver.findElement(By.cssSelector("input[name*='txtUsername']")).sendKeys("Admin");
  
    driver.findElement(By.cssSelector("input[id*='txtPassword']")).sendKeys("admin");
	
    
    System.out.println("ends with ($)");
    driver.findElement(By.cssSelector("input[name$='Username']")).sendKeys("Admin");
  
    System.out.println("start (^)& end ($)");
    driver.findElement(By.cssSelector("input[name^='txtPass'][name$=word]")).sendKeys("admin");
    
    
	}
	
	
	
}
