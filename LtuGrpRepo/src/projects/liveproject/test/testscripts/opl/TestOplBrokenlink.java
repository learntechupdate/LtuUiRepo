package testscripts.opl;

import org.testng.annotations.Test;

import library.generic.FindBrokenLinksLibrary;


public class TestOplBrokenlink extends Basetest{
	
	
	@Test
	public void oplBrokenlink() throws InterruptedException
	{
		Thread.sleep(10000);
		FindBrokenLinksLibrary.TestLink(driver);
	}


}
