package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	
	//Data Members
	
	@FindBy(id="txtUsername")
	private WebElement loginTextfield;
	
	@FindBy(id="txtPassword")
	private WebElement passwordTextfield;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	@FindBy(id="forgotPasswordLink")
	private WebElement forgotPasswordLink;
	
	
	//Constructor Initialization
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Member Functions
	
	public void login(String login, String password) {
		
		loginTextfield.sendKeys(login);
		passwordTextfield.sendKeys(password);
		loginButton.click();
		
	}
	
	
	public void forgotPassword()
	{
		forgotPasswordLink.click();
	}
}
