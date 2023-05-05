package utilities;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import constants.Constantss;

public class TestListener extends CommonFunctions implements ITestListener {
 
	CommonFunctions cfs = new CommonFunctions();
     
      
      
    @Override
	public void onTestStart(ITestResult result) {
    	String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onStart(ITestContext context) {

		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		String ssLocation = Constantss.screenshotLocation;
		try {
			cfs.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The ScreenShot Location is: "+ssLocation);
	}


		
    
  }

