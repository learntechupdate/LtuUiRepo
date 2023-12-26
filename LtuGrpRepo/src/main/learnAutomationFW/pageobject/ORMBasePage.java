package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORMBasePage extends LoginPage{

	public WebDriver driver;
	
	
	//Data Members
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement adminTab;
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pimTab;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leaveTab;
	
	
	//Constructor Initialization
	
	public ORMBasePage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	//Member Functions
	
	public void adminTab() {
		
		adminTab.click();
	}
	
	
	public void pimTab(){
		
		pimTab.click();
	}
	
	public void leaveTab(){
		
		leaveTab.click();
	}
}
