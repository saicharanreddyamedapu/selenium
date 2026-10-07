package BaseClassUtilization;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class TestBaseClass extends BaseClass {
	
	@Test
	public void demoTest() {
		Reporter.log("demo-test",true);
		Assert.fail();
	}
	@Test
	public void sampletest() {
		Reporter.log("sample-test",true);
	}

}