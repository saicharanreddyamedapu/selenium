package UsingAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.*;

public class UsingHardAssert {

	@Test
	public static void zomatoTitleValidation() {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// navigate the application
		driver.get("https://www.zomato.com/");

//		Assert.fail(exe terminated);
		
		// fetch the title of webpage
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		String exptitle = "Zomato";
		

		// validate the webpage
//		if (acttitle.contains(exptitle)) {
//			System.out.println("test pass");
//		} else {
//			System.out.println("test fail");
//		}

		Assert.assertEquals(acttitle, exptitle,"Validating webpage title");
		
		String s = null;
		Assert.assertNull(s,"validating obj");
		
		Assert.assertTrue(acttitle.contains(exptitle),"Validating using condition");
		
		System.out.println("Test exe done");
		
		driver.quit();
	}
}
