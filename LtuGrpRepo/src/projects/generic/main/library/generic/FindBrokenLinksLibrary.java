package library.generic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class FindBrokenLinksLibrary 
{
	 
		 private static List<WebElement> findAllLinks(WebDriver driver)
		 
		  {
			  List<WebElement> elementList = new ArrayList<WebElement>();
		
			  elementList = driver.findElements(By.tagName("a"));
			  elementList.addAll(driver.findElements(By.tagName("img")));
		 
			  
			  List<WebElement> finalList = new ArrayList<WebElement>(); 
		 
			  for (WebElement element : elementList)
		 
			  {
		 
				  if(element.getAttribute("href") != null)
		 
				  {
					  finalList.add(element);
				  }		  
		 
			  }	
		 
			  return finalList;
		 
		}
		 
			private static String isLinkBroken(URL url) throws Exception
		 
			{
		 
				String response = "";
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		 
				try
				{
				    connection.connect();
				    response = connection.getResponseMessage();	        
				    connection.disconnect();
		 
				    return response;
				}
		 
				catch(Exception exp)
				{
					return exp.getMessage();
				}  				
		 
			}
			public static  void TestLink(WebDriver driver)
			 
			{

				List<WebElement> allImages = FindBrokenLinksLibrary.findAllLinks(driver);    
				 
				Reporter.log("Total number of elements found " + allImages.size(),true);
				 
			    for( WebElement element : allImages)
			    {
				 
				 try
				 {
					 Reporter.log("URL: " + element.getAttribute("href")+ " returned " + FindBrokenLinksLibrary.isLinkBroken(new URL(element.getAttribute("href"))),true);
				 
				  //System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
				 
				   }
				 
				 catch(Exception exp)
				 {
				  System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured ; " + exp.getMessage());	    		
				 
			      }
				 
		       } 				
		 
			}
			
			
	 
}
