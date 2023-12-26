package selenium.automationchallenges.popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;

/*
 How to switch over the elements in iframes using Web Driver commands:
Basically, we can switch over the elements and handle frames in Selenium using 3 ways.

By Index
By Name or Id
By Web Element


To move back to the parent frame, you can either use switchTo().parentFrame() or 
if you want to get back to the main (or most parent) frame, you can use switchTo().defaultContent();

	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
driver.switchTo().defaultContent();}
 */

public class IFrames {
	

	public WebDriver driver;
	
	
	@Test
	public void iframesTest() {
		
		driver= BrowserFactory.startBrowser("chrome");
		
        BrowserFactory.enterUrl("https://www.naukri.com/hr-recruiters-consultants");
        
        /*Set<String> windowsHandle = driver.getWindowHandles();
        
        for (String popups : windowsHandle) {
			System.out.println("Windows Popups of  Browsers:"+popups);
		}
        
        Iterator<String> i=windowsHandle.iterator();
        
        String parent = i.next();
        
       
        while (i.hasNext()) {
        	
        	String child = i.next();
        	 driver.switchTo().window(child);
        	  driver.close();
		}*/
      
        
        //handling i frames
        
         WebElement ifrmae = driver.findElement(By.xpath("//a[@id='login_Layer']"));
        System.out.println("ifarme text"+ifrmae.getText());
        ifrmae.click();
        
        driver.switchTo().frame(1);
        driver.switchTo().frame("loginpage");
        driver.switchTo().frame(ifrmae);
        
        driver.switchTo().defaultContent();
        


}
	
	

}

