package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends ORMBasePage{
	
	//Data Members
	
	@FindBy(id="searchSystemUser_userName")
	private WebElement userNameSearchfield;
	
	@FindBy(id="searchBtn")
	private WebElement searchButton;
	
	@FindBy(id="resetBtn")
	private WebElement resetButton;
	
	
	//Constructor Initialization
	
	public UsersPage(WebDriver driver) {
		super(driver);
		// As the WebElements are initialized in the SuperClass(LoginPage), we can skip or need not write the below 2 lines
		//this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	//Member Functions
	
	public void userNameSearchfield(String userName) {
		
		userNameSearchfield.sendKeys(userName);
	}
	
	
	public void searchButton(){
		
		searchButton.click();
	}
	
	public void resetButton(){
		
		resetButton.click();
	}
}
