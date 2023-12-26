package selenium.basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.google.common.io.Files;

import library.generic.BrowserFactory;

public class TakingScreenshots {
				
	public  void takingScreenshotsGenaric(WebDriver driver, String path, String picName ) {
			
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+picName+ ".jpg");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
		
			public static void main(String[] args) throws IOException {
					WebDriver driver = BrowserFactory.startBrowser("Chrome");
					BrowserFactory.enterUrl("https://www.amazon.in/");
					String path = "./screenshot/";
					String picName = "ltu";
					
					//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					//File dest = new File(path+picName+ ".jpg");
					
					//Files.copy(src, dest);

					BrowserFactory.enterUrl("https://hginfra.onepaperlane.org/users/login");
					System.out.println("takingScreenshotsGenaric");
					TakingScreenshots res = new TakingScreenshots();
					res.takingScreenshotsGenaric(driver, path, "opl");
	}
}
