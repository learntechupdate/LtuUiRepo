package selenium.automationchallenges.popup;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import testscripts.opl.Basetest;

public class HiddenPopup extends Basetest{
	
	
	@Test
	public void alertdemo() {
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        
		BrowserFactory.enterUrl("https://login.onepaperlane.org/user/listing");
		
		driver.findElement(By.xpath("//*[contains(text(),'Employee')  and  @class='user_category user_real_category']")).click();
		
		
		List<WebElement> delref = driver.findElements(By.xpath("//a[@title='Remove User']"));
		
		delref.get(1).click();
		
		
		//cancel deletion
        System.out.println("cancel deletion");
		driver.findElement(By.id("popup_cancel")).click();
		
		
		//delete user
		System.out.println("delete user");
		delref.get(4).click();
		driver.findElement(By.id("popup_ok")).click();
		
		
	}
	
	
	

}
