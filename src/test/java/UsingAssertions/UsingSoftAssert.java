package UsingAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingSoftAssert {

	@Test
	public static void NikeMinorTitleValidation() {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// navigate the application
		driver.get("https://www.nike.in/?utm_source=Google&utm_medium=Search&utm_campaign=Core_11-02-26_Acquisition_Google_Search_Text_Low_Keyword_PanIndia_Web&gad_source=1&gad_campaignid=23550254850&gbraid=0AAAABCZeWhjXZn2KXRsOhM42qE1AqbtbY&gclid=Cj0KCQjw8c3VBhCsARIsAA_xJ93PggAViw5NI95Fz9SmS4rDYNy-az4nGMTCpNgamrPBpR5GDO0upz4aAgKWEALw_wcB");

//		Assert.fail();
		
		// fetch the title of webpage
		String acttitle = driver.findElement(By.xpath("//h2[text()='Shop by Sport']")).getText();
		System.out.println(acttitle);
		String exptitle = "Shop by Sport";
		
		
		SoftAssert as = new SoftAssert();
		
		as.assertNotEquals(acttitle, exptitle,"Validating webpage title");
		
		String s = null;
		as.assertNotNull(s,"validating obj");
		
		as.assertFalse(acttitle.contains("dasadfadafag"),"Validating using condition");

		System.out.println("Test exe done");
		
		driver.quit();
		
		as.assertAll();

		
		
}
}