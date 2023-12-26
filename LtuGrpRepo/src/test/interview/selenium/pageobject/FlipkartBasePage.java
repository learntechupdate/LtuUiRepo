package pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import library.generic.GenericUtility;

public class FlipkartBasePage implements EcomBaseInterface{

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	private WebElement loginCloseButton;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement searchTextField;
	
	@FindBy(tagName ="button")
	private WebElement searchButton;

	@FindBys(@FindBy(xpath="//div[@class='CXW8mj']"))
	private List<WebElement> selectItemLink;
	
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	private WebElement itemPrice;
	
	
//Initializing the  Constructor
public FlipkartBasePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//---------------------------- 

public void loginCloseButton() {
	loginCloseButton.click();
	
}

@Override
	public void search(String search) {
	
	searchTextField.sendKeys(search);
	
	try {
		GenericUtility.staticWait(3);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

	searchButton.click();
	
	}
	
@Override
	public void selectItem() {
	selectItemLink.get(0).click();
		
	}
	
@Override
	public String fetchItemPrice() {
	return itemPrice.getText();
		
	}
	
}
