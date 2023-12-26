package pageobject.quickPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	
	//Data Members-----------
	@FindBy(id ="ap_email")
  	private WebElement loginTextFeild;
	
	@FindBy(id ="continue")
  	private WebElement continueButton;
	
	@FindBy(xpath ="//h4[contains(text(),'here was a proble')]")
  	private WebElement errorMsgField;
	
	
	
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
    public void login(String loginData)
  	{
    	loginTextFeild.sendKeys(loginData);
    	
    	continueButton.click();
  	}
    
    public String readErrorMsg()
  	{
		return errorMsgField.getText();
    	
  	}
    //-----------------------------
    
}
