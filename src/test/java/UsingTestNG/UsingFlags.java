package UsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingFlags {
	
	@Test(dependsOnMethods = "register")
	   public void login() {
		Reporter.log("login",true);
	}
	   @Test
	   //(priority=1,enabled = =false)
	   public void register() {
		   Reporter.log("register",true);
	   }
	     @Test(dependsOnMethods = "login",threadPoolSize = 3, invocationCount = 3)
	    // (priority=3,invocationcount=5)
	     public void create() {
	    	 Reporter.log("create",true);
	     }
}


