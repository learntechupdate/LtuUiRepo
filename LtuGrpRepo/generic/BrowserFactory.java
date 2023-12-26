package library.generic;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

/* Function Name : 
 * Description   : 
 * Parameters    : 
 * Author & Date : Touheed Aslam DD/Aug/2020
 * Modified Date :*/

public class BrowserFactory 

{
  public static  WebDriver driver;
  
  		  
	public static WebDriver startBrowser(String BrowserName)
	{
		
		
		if (BrowserName.equalsIgnoreCase("mozilla")|BrowserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			
		    driver=new FirefoxDriver();
		    
		    
		}
		
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    
		}
		
		else if (BrowserName.equalsIgnoreCase("ie")|BrowserName.equalsIgnoreCase("InternetExplorer")) 
		{

//			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
//		    driver=new InternetExplorerDriver(); 
		    
			//modified on 18/08/2020 by Touheed Aslam
			//The code will ignore the setup of Protected mode settings for all zone in the IE browser. 
		    DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			File file = new File("./driver/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver = new InternetExplorerDriver(capabilities);
			
			
		}
		
		
		
		Reporter.log("[Browser Activity] "+BrowserName +" Browser Launched",true);
		driver.manage().window().maximize();
		Reporter.log("[Browser Activity] "+"Browser Maximized",true);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public static void closeBrowser()
	{
		driver.quit();
		Reporter.log("[Browser Activity]"+" Browser Closed",true);
	}
	
	
	public static void enterUrl(String url)
	{
		
		driver.get(url);
		Reporter.log("[Browser Activity]"+" URL entered : "+url,true);
	}
	
}
