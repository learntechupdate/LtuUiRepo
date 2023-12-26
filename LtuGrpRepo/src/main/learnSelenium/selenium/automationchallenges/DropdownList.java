package selenium.automationchallenges;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");//id
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");//attribute
		driver.findElement(By.cssSelector(".button")).click();//class
		System.out.println("logged in");
		
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		WebElement list = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select select = new Select (list);
		
		if( select.isMultiple()) {
			System.out.println("Multiselect");
		}
		
		else {
			System.out.println("Single select");
		}
		
		
		
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("0");
		Thread.sleep(2000);
		select.selectByVisibleText("ESS");
		
		//multi select
		WebElement list2 = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select selectM = new Select (list2);
		List<WebElement> alloptions = selectM.getOptions();
		for (WebElement webElement : alloptions) {
			webElement.click();
			
		}
		select.deselectAll();
		
				
		
		
		
	}

}
