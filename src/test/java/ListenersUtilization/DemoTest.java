package ListenersUtilization;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;


@Listeners(ListenersUtility.Listeners.class)

public class DemoTest extends BaseClass {
	@Test(retryAnalyzer = ListenersUtility.RetryAnalyser.class )
	public void sampleTest() {
		Reporter.log("sample Test Execution",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "sampleTest")
	public void demo() {
		Reporter.log("Demo Test Execution");
	}

}