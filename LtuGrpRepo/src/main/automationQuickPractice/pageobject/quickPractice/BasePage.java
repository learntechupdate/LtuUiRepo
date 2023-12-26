package pageobject.quickPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
public WebDriver driver;
	
/*
 WebElement logintab = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
 logintab.click();
 */

	//Data Members-----------
	@FindBy(xpath  ="//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]")
  	private WebElement accountDetailsButton;
	
	//----------------------
	
	//Initializing the  Constructor
    public BasePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    public void logintab()
  	{
    	accountDetailsButton.click();
  	}
    //-----------------------------
    
}
