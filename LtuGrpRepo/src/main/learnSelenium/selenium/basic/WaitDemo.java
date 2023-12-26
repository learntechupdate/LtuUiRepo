package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import library.generic.GenericUtility;
import library.generic.Utility;




public class WaitDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Dyamic wait - implict wait
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		
        GenericUtility.swtichToTab(driver, 2);		
		
		
//		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
      //Static Wait
//      		Thread.sleep(5000);
      		
        //Expcit wait
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
        
        
                 
          /*
           Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);
	WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
	
		public WebElement apply(WebDriver driver ) {
			return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		}
	});
	//click on the selenium link
	clickseleniumlink.click();
           */
          
        
		driver.findElement(By.id("identifierId")).sendKeys("learn.tech.update@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		
		
		
				
	}
	
	

}
