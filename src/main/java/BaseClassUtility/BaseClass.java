package BaseClassUtility;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void bs() {
		Reporter.log("bs-connect to db");
	}
	
	@BeforeTest
	public void bt() {
		Reporter.log("bt-config the PE",true);

	}
	
	@BeforeClass
	public void bc() {
		Reporter.log("ac-Quit the browser",true);

	}
	
	@BeforeMethod
	public void bm() {
		Reporter.log("bm-login",true);

	}
	
	@AfterSuite
	public void as() {
		Reporter.log("bc-launch",true);

	}
	
	@AfterTest
	public void at() {
		Reporter.log("at-Close config of PE",true);
	}
	
	@AfterClass
	public void ac() {
		Reporter.log("ac-Quit the browser",true);
	}
	
	@AfterMethod
	public void am() {
		Reporter.log("am-logout");
	}
	
}
