package selenium.advance;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener{
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        				
        System.out.println("Test Cases Failed and Test Cases details are "+result.getName());
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        				
    	System.out.println("Test Cases Skipped and Test Cases details are "+result.getName());		
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
    	System.out.println("Test Case Start and Test Cases details are "+result.getName());			
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
    	System.out.println("Test Case Success and Test Cases details are "+result.getName());
        		
    }		

}
