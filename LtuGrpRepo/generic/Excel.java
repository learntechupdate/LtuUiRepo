package library.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
public class Excel 


{
	public static String readData(String filepath,String sheetname,int rowNo,int cellNo)   
	{
		
		try{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			Reporter.log("Enter the valid filepath",true);
			e.printStackTrace();
		}
		String data = null;
		try {
			data = WorkbookFactory.create(fis).getSheet(sheetname).getRow(rowNo).getCell(cellNo).getStringCellValue();
		} catch (EncryptedDocumentException | IOException e) {
			Reporter.log("Enter the valid celldetails",true);
		}
		return data;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			return " ";
		}
	}
	
	public static void writeExcelData(String filePath, String sheetName, int rowNo, int cellNo, String data)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			//wb.createSheet();
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			if (r == null)
		        r = st.createRow(rowNo);
			Cell c = r.getCell(cellNo);
			if (c == null)
		        c = r.createCell(cellNo);
			//c.setCellType(Cell.CELL_TYPE_STRING);
			c.setCellValue(data);
			FileOutputStream fileOut = new FileOutputStream(filePath);
			wb.write(fileOut);				
		}
		catch(Exception e)
		{
			
		}
}
	public static int getExcelRowCount(String filePath, String sheetName)
	{
		int rowNo = 0;
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			rowNo = st.getLastRowNum();
			
		}
		catch(Exception e)
		{
			
		}
		return rowNo;
}
	public static int getExcelCellCount(String filePath, String sheetName, int rowNo)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			return r.getLastCellNum();
		}
		catch(Exception e)
		{
			return -1;
		}
}

		
}
	
	
	
	


