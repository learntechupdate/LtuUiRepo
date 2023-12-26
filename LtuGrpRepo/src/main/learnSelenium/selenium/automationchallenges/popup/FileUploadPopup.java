package selenium.automationchallenges.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import library.generic.BrowserFactory;

public class FileUploadPopup{
	
	public WebDriver driver;
	
	@Test
	public void fileuploadtest() {
		
		driver= BrowserFactory.startBrowser("chrome");
		
		BrowserFactory.enterUrl("https://smallpdf.com/word-to-pdf");
		
		driver.findElement(By.id("//span[contains(text(),'Choose')]")).sendKeys("F:\\Interview.docx");//the button should have path
		
		
		//Auto IT 
		
		
	}

	
	
}
