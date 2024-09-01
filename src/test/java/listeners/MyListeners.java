package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.utility.ExtentReporter;

import Base.TestBase;



public class MyListeners extends TestBase implements ITestListener {

	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult testName) {

		extentTest = extentReport.createTest(testName.getName());
		extentTest.log(Status.INFO, testName +"started started");

	}

	@Override
	public void onTestSuccess(ITestResult testName) {

		extentTest.log(Status.PASS, testName +"started success");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		extentTest.fail(result.getThrowable());

		 WebDriver driver = null;

		 String testName = result.getName();


		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		 try {
			String screenshotPath = takeScreenshot(testName,driver);
			extentTest.addScreenCaptureFromPath(screenshotPath, testName);
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP,"Test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext result) {
		String testName =result.getName();
		 extentTest = extentReport.createTest(testName);
		extentTest.log(Status.INFO, testName +"started executing");
	}

	@Override
	public void onFinish(ITestContext context) {

		extentReport.flush();

	}

}
