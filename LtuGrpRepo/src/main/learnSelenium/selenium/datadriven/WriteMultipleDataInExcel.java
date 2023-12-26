package selenium.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class WriteMultipleDataInExcel {

	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		//WebDriver driver = BrowserFactory.startBrowser("chrome");
	/*	File file =    new File("./testdata/Write Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		//Workbook wb = new XSSFWorkbook(fis);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("Sheet1");
		Row r = st.createRow(0);
		
		Cell c = r.createCell(0);
		
		c.setCellValue("Admin");
		
		
		FileOutputStream fileout = new FileOutputStream("./testdata/Write Data.xlsx");
		
		wb.write(fileout);
		
		String data = GenericUtility.readExcelData("./testdata/Write Data.xlsx", "Sheet1", 0, 0);
		
		Reporter.log("Data in Excel:- " +data, true);*/
		
		
		// To be done later
		
		
	}

	
}
