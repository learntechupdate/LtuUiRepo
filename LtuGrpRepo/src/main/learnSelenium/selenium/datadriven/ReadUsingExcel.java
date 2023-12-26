package selenium.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.GenericUtilityAFW;
import library.generic.BrowserFactory;
import pageobject.LoginPage;

public class ReadUsingExcel {

	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome");
	/*	File file =    new File("./testdata/DatadrivenExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		//Workbook wb = new XSSFWorkbook(fis);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("Sheet1");
		Row r = st.getRow(1);
		Cell c = r.getCell(0);
		String url =c.getStringCellValue();
	*/
		
		//Optimized Code
		String url =WorkbookFactory.create(new FileInputStream(new File("./testdata/DatadrivenExcel.xlsx"))).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		
		Reporter.log("ORANGE HRM URL" +url, true);
				
		BrowserFactory.enterUrl(url);
		
		Reporter.log("Testing using Excel", true);
		
		LoginPage lp = new LoginPage(driver);
		String username=GenericUtilityAFW.readExcelData("./testdata/DatadrivenExcel.xlsx", "Sheet1", 4, 0);
		String password=GenericUtilityAFW.readExcelData("./testdata/DatadrivenExcel.xlsx", "Sheet1", 4, 1);
		lp.login(username, password);
		
		
	}

	
}
