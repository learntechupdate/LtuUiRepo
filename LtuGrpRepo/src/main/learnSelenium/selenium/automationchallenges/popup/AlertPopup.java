package selenium.automationchallenges.popup;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;
import testscripts.pom.BaseTest;

public class AlertPopup extends BaseTest{
	
	
	@Test
	public void alertdemo() {
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        
		BrowserFactory.enterUrl("https://login.onepaperlane.org/user/listing");
		
		driver.findElement(By.xpath("//*[contains(text(),'Employee')  and  @class='user_category user_real_category']")).click();
		
		
		List<WebElement> delref = driver.findElements(By.xpath("//a[@title='Remove User']"));
		
		delref.get(1).click();
		
		//alert
		//assuming javascript popup
		WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alertpop = driver.switchTo().alert();
		
		System.out.println(alertpop.getText());
		
		alertpop.dismiss();
		
		delref.get(4).click();
		alertpop.accept();
		
	}
	
	
	

}
