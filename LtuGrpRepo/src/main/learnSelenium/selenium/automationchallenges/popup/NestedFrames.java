package selenium.automationchallenges.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/*
 https://www.guru99.com/handling-iframes-selenium.html
 Concept of Nested Frames(Frames inside Frames):
Let's assume that there are two frames one inside other like shown in below image and our requirement is printing the text in the outer frame and inner frame. In the case of nested frames,
At first we must switch to the outer frame by either Index or ID of the iframe
Once we switch to the outer frame we can find the total number of iframes inside the outer frame, and
We can switch to the inner frame by any of the known methods.
While exiting out of the frame, we must exit out in the same order as we entered into it from the inner frame first and then outer frame.
 */
public class NestedFrames {

	
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
	    driver.get("Url");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
               
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

		//Printing the text in outer frame
		size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();
	}
}
