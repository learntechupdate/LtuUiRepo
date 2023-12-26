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

					
		public static String takeScreenShot(WebDriver driver,String path,String picName)
		{
			
			try 
			{
					
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest=new File(path+picName+".jpg");
					
					try {
						Files.copy(src, dest);//https://www.journaldev.com/861/java-copy-file
						//FileUtils.copyFile(src, dest); //not supproting now
					} catch (IOException e) {
						Reporter.log("file not copied to destination",true);
					}
				
								
			} 
			
			catch (Exception e)
			{
			 
				Reporter.log("Exception while taking screenshot "+e.getMessage(),true);
			}
			
			return path+picName+".jpg";	 
			
		}
		

			
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
		
		public static void mouseHover(WebDriver driver,WebElement webelement)
		{
			new Actions(driver).moveToElement(webelement).click().perform();
		}
		
		public static void contextClick(WebDriver driver,WebElement webelement)
		{
			new Actions(driver).contextClick().perform();
		}
		
		
		public static void switchToWindow(WebDriver driver,String title)
		{
			Iterator<String> i=driver.getWindowHandles().iterator();
			while (i.hasNext()) 
			{
				driver.switchTo().window(i.next());
				
				if (driver.getTitle().equalsIgnoreCase(title)) 
				{
					Reporter.log("Switched to window having"+title,true);
					break;
				}
				
			}
		}
		
		
	
	
		/* Function Name : scrollTillWebelement
		 * Description   : 
		 * Parameters    : TabNumber
		 * Author & Date : Touheed Aslam DD/Aug/2020
		 * Modified Date :*/
    public static void scrollTillWebelement(WebDriver driver ,WebElement webelement) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", webelement);
    }
    
	//To convert the Alpanumeric String to Numeric String
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

	
	/* Function Name : Switch to Tab
	 * Description   : 
	 * Parameters    : TabNumber
	 * Author & Date : Touheed Aslam DD/Aug/2020
	 * Modified Date :*/
	
	//to perform action on new tab
	public static void swtichToTab(WebDriver driver, int TabNo)
	{	
	ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(windowHandles.get(TabNo-1));
	}
	
	
}
