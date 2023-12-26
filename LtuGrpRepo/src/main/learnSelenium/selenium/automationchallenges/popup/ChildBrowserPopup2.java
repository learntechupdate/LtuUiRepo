package selenium.automationchallenges.popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;


/*
 Close all the Child Browsers without closing the Parent Browser
 */
public class ChildBrowserPopup2 {
	
	
		
		public WebDriver driver;
		
		@Test
		public void closeChildBrowsers() {
			
			driver= BrowserFactory.startBrowser("chrome");
			
	        BrowserFactory.enterUrl("https://www.naukri.com/");
	        
	        Set<String> windowsHandle = driver.getWindowHandles();
	        
	        for (String popups : windowsHandle) {
				System.out.println("Windows Popups of  Browsers:"+popups);
			}
	        
	        Iterator<String> i=windowsHandle.iterator();
	        
	        String parent = i.next();
	        
	       
	        while (i.hasNext()) {
	        	
	        	String child = i.next();
	        	 driver.switchTo().window(child);
	        	  driver.close();
			}
	        
	        driver.switchTo().window(parent);
	      
	
	
	
}

}
