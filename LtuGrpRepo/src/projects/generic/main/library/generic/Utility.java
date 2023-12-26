package library.generic;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;


public class Utility 

{

			
	
			
		public static void wait(int sec)
		{
			try {
				Thread.sleep(sec*1000);
			} catch (InterruptedException e) {
				
			}
		}
		
		public static void dynamicwait(WebDriver driver,int timeOutInSeconds,String locator,String locatorvalue)
		{
			
			WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
			switch (locator) 
			{
			case "id": wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locatorvalue)));break;
			case "name": wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locatorvalue)));break;
			case "className": wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locatorvalue)));break;
			case "linkText": wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(locatorvalue)));break;	
			case "partiallinktext": wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locatorvalue)));break;
			case "tagName": wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(locatorvalue)));break;
			case "xpath": wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorvalue)));break;
			case "cssSelector": wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locatorvalue)));break;
			default:Reporter.log("not matching locator",true);
				break;
			}
		}
		public static void elementVisibledynamicwait(WebDriver driver,int timeOutInSeconds,String locator,String locatorvalue)
		{
			
			WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
			switch (locator) 
			{
			case "id": wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));break;
			case "name": wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));break;
			case "className": wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locatorvalue)));break;
			case "linkText": wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locatorvalue)));break;	
			case "partiallinktext": wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locatorvalue)));break;
			case "tagName": wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locatorvalue)));break;
			case "xpath": wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));break;
			case "cssSelector": wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorvalue)));break;
			default:Reporter.log("not matching locator",true);
				break;
			}
		}
		
		/* Function Name : Handling Java popup alert
		 * Description   : 
		 * Parameters    : WebDriver 
		 * Author & Date : Touheed Aslam 
		 * Modified Date :DD/Aug/2020 */
		public static void acceptalert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		
		public static void dismissalert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		
		public static String getAlertMessage(WebDriver driver)
		{
			return driver.switchTo().alert().getText();
		}
		
		
		
		/* Function Name : Handling dropdownlist
		 * Description   : 
		 * Parameters    : Webelement , text,index, value 
		 * Author & Date : Touheed Aslam 
		 * Modified Date :DD/Aug/2020 */
		public static void selectByVisbleText(WebElement list,String text)
		{
			new Select(list).selectByVisibleText(text);
		}
		
		
		public static void selectByIndex(WebElement list,int index)
		{
			new Select(list).selectByIndex(index);
		}
		
		public static void selectByValue(WebElement list,String value)
		{
			new Select(list).selectByValue(value);
		}
		
		
		/* Function Name : Handling dropdownMenu/Hoverevents
		 * Description   : 
		 * Parameters    : Webelement , text,index, value 
		 * Author & Date : Touheed Aslam 
		 * Modified Date :DD/Aug/2020 */
		public static void mouseHover(WebDriver driver,WebElement webelement)
		{
			new Actions(driver).moveToElement(webelement).click().perform();
		}
		
		public static void contextClick(WebDriver driver,WebElement webelement)
		{
			new Actions(driver).contextClick().perform();
		}
		
		
    
    /* Function Name : To convert the Alpanumeric String to Numeric String
	 * Description   : 
	 * Parameters    : AlphaNumeric String
	 * Author & Date : Touheed Aslam DD/Aug/2020
	 * Modified Date :*/
    
	public static String ConvertToNumericString(String inputString) 
	
	{
		
		String outputString= "";

		for(char ch : inputString.toCharArray() )
		{
			if (Character.isDigit(ch)) {
				
				outputString=outputString+ch;
			}
		}
		
		return outputString;
		
	}
	//To convert the Numeric String  to Integer
	public static int  AlpaNumericToInteger(String inputString) {
			
			return Integer.parseInt(ConvertToNumericString(inputString));
		
		}

	
	
	
	
}
