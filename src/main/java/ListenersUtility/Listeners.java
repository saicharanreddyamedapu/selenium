package ListenersUtility;


import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ISuiteListener,ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		Reporter.log("onTestStart-Test Exe started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		Reporter.log("Test Exe success"+testname+"",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		Reporter.log("Test Exe failed-screensot"+testname+"",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		Reporter.log("Test Exe skipped"+testname+"",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onstart-Suite Exe started-configuration of reports",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onfinish-Suite Exe finished-report backup",true);
	}
	

}