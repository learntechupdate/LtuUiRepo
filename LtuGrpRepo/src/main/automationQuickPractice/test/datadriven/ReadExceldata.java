package test.datadriven;

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


class ReadExcelUsingMethod {
	
	
	    public static String readExceldata(String filepath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, FileNotFoundException, IOException {
		   
	    	System.err.println("Reading data using method");
	    	
    	
		    FileInputStream fis = new FileInputStream(filepath);
	    	String data = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	    	
	    	return data;
		
	}
	
}


public class ReadExceldata {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.err.println("Reading data using Excel structure breakup");
		FileInputStream fis = new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s= wb.getSheet("Sheet1");
		Row row = s.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		System.err.println("Reading data from Optimized code ");
		String data2 = WorkbookFactory.create(new FileInputStream("./testdata/Testdata.xlsx")).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data2);
		
		System.out.println(ReadExcelUsingMethod.readExceldata("./testdata/Testdata.xlsx", "Sheet1", 2, 0));
					
		
		String data3 = ReadExcelUsingMethod.readExceldata("./testdata/Testdata2.xlsx", "Sheet1", 1, 0);
		System.out.println(data3+" : "+data3);
		//String data4 = ReadExcelUsingMethod.readExceldata("./testdata/Testdata2.xlsx", "Sheet1", 2, 1);
	       
		//System.out.println(data3+" : "+data4);
		
		
	}

}
