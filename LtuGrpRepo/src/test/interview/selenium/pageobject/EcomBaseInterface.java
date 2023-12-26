package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public interface EcomBaseInterface {

	public void search(String search);
	
	public void selectItem();
	
	public String fetchItemPrice(); 

	
}
