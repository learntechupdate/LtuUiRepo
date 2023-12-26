package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class GenericUtilityAFW {
	
	
	/* Function Name : Static or Dead Wait
	 * Description   : 
	 * Parameters    :  waitTimeSec
	 * Author & Date : LTU & 31 May 2021 
	 * Modified Date :*/
	public static void staticWait(int waitTimeSec) throws InterruptedException  {
		
		Thread.sleep(1000*waitTimeSec);
	}
	
	
	
	/* Function Name : Dynamic Expicit wait Presence of Element
	 * Description   : 
	 * Parameters    :  driver, waitTimeSec, locator, locatorValue
	 * Author & Date : LTU & 31 May 2021 
	 * Modified Date :*/
	
	public static void dynamicWait(WebDriver driver, int waitTimeSec,String locator, String locatorValue)
	{
		if (locator=="id") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.id(locatorValue)));}
		
		else if (locator=="name") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.name(locatorValue)));}
		
		else if (locator=="className") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.className(locatorValue)));}
		
		else if (locator=="cssSelector") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locatorValue)));}
		
		else if (locator=="linkText") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.linkText(locatorValue)));}
		
		else if (locator=="partialLinkText") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locatorValue)));}
		
		else if (locator=="tagName") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.tagName(locatorValue)));}
		
		else if (locator=="xpath") 
		{new WebDriverWait(driver, waitTimeSec).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorValue)));}
		
		else
		{
			Reporter.log("Please enter correct locator"+locator, true);
		}
	
		
	}
	
	

	
	/* Function Name : Handling List Box /Drop down List
	 * Description   : 
	 * Parameters    :  Webelement , Select Type, SelectTypeValue
	 * Author & Date : LTU & 31 May 2021 
	 * Modified Date :*/
	
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
	
	
	/* Function Name : Handling Drop Menu / Mouse Hover Event and Context click
	 * Description   : Using Actions Class which takes WebDriver as Argument
	 * Parameters    :  WebDriver , WebElement
	 * Author & Date : LTU & 31 May 2021 
	 * Modified Date :*/
	

	
	public static void dropdownMenu( WebDriver driver, WebElement dropdownMenu)
	{
		new Actions(driver).moveToElement(dropdownMenu).perform();
	}
	
	public static void contextClick(WebDriver driver,WebElement webelement)
	{
		new Actions(driver).contextClick().perform();
	}
	
	
	
	/* Function Name : Alert Popup
	 * Description   : Handling Alert Popup using SwitchTo
	 * Parameters    :  WebDriver
	 * Author & Date : LTU & 31-May-2021
	 * Modified Date :*/
	

	
	public static void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public static void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	/* Function Name : Closing Child Browsers
	 * Description   : Close Child Browsers using SwitchTo
	 * Parameters    :  WebDriver
	 * Author & Date : LTU & 31-May-2021
	 * Modified Date :*/
	
	public static void closeChildBrowser(WebDriver driver)
	{
		Set<String> windowsHandle = driver.getWindowHandles();
        Iterator<String> i=windowsHandle.iterator();
        
        String parent = i.next();
        
       
        while (i.hasNext()) {
        	
        	String child = i.next();
        	 driver.switchTo().window(child);
        	  driver.close();
		}
       
        driver.switchTo().window(parent);

	}
	
	
	/* Function Name : Handling popup using AutoIt
	 * Description   : 
	 * Parameters    :  exe file genereated by Autoit/vb scripts
	 * Author & Date : LTU & 31-May-2021
	 * Modified Date :*/
	
	public void autoITHandlingPopup(String actionTypepopupFilePath){
		
		try {
			Runtime.getRuntime().exec(actionTypepopupFilePath);
		} catch (IOException e) {
			
			System.out.println("Please check input execution file");
			
		}
	}
	
	
	/* Function Name : Handling Frames
	 * Description   : By Index, WebElement, FrameName
	 * Parameters    :  index, WebElement, FrameName
	 * Author & Date : LTU & 02-June-2021
	 * Modified Date :*/

     
     
     public void framesbyIndex(WebDriver driver, int index)
     {
    	 driver.switchTo().frame(index);
    	 
     }
   
     public void framesbyWebelement(WebDriver driver, WebElement webelement)
     {
    	 driver.switchTo().frame(webelement);
    	 
     }
	
     public void framesbyWebelement(WebDriver driver, String frameName)
     {
    	 driver.switchTo().frame(frameName);
    	 
     }
     
     
     public void returnToMainPageFromFrames(WebDriver driver)
     {
    	 driver.switchTo().defaultContent();
    	 
     }
	
	
     /* Function Name : Read Data From Excel
 	 * Description   : 
 	 * Parameters    :  filepath, sheetName, rowNumber, cellNumber
 	 * Author & Date : LTU & 13-June-2021
 	 * Modified Date :*/
     
     public static String readExcelData(String filepath, String sheetName, int rowNumber, int cellNumber) {
    	 
    		File file =    new File(filepath);
    		FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		//Workbook wb = new XSSFWorkbook(fis);
    		Workbook wb = null;
			try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		Sheet st = wb.getSheet(sheetName);
    		Row r = st.getRow(rowNumber);
    		Cell c = r.getCell(cellNumber);
    		String data =c.getStringCellValue();
    		
    		return data;
     }
    
     
     /* Function Name : Write Data into Excel
  	 * Description   : 
  	 * Parameters    :  filepath, sheetName, rowNumber, cellNumber
  	 * Author & Date : LTU & 15-June-2021
  	 * Modified Date :*/
     
     public static void writeDataIntoExcel(String filepath, String sheetName, int rowNumber, int cellNumber, String data) {
     
    	 File file =    new File(filepath);
    	 FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Workbook wb = new XSSFWorkbook(fis);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet st = wb.getSheet(sheetName);
		Row r = st.createRow(rowNumber);
		
		Cell c = r.createCell(cellNumber);
		
		c.setCellValue(data);
		
		FileOutputStream fileout = null;
		try {
			fileout = new FileOutputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb.write(fileout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
     }
     
     
     
     
}














