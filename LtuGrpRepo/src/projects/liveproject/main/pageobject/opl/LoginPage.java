package pageobject.opl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	
	//Data Members-----------
	@FindBy(name ="email")
  	private WebElement emailTextFeild;
	
	@FindBy(xpath ="(//*[contains(text(),'Continue')])[1]")
  	private WebElement continueButton;
	
	@FindBy(name ="password")
  	private WebElement passwordTextFeild;
	
	@FindBy(xpath ="//*[@name='password']/../../../../..//button[1]")
  	private WebElement loginButton;
	
	
	//----------------------
	
	//Initializing the  Constructor
    public LoginPage(WebDriver driver)
    {
    	super(driver);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
   //---------------------------- 

    
  //Member Functions----------------
    public void login(String emailId, String password)
  	{
    	emailTextFeild.sendKeys(emailId);
    	
    	continueButton.click();
    	passwordTextFeild.sendKeys(password);
    	loginButton.click();
  	}
        
    //-----------------------------
    
}
