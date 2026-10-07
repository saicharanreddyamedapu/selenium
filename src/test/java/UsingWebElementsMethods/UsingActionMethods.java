package UsingWebElementsMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;
import POM_Utility.DemoWebShop;

public class UsingActionMethods {
	
	@Test
	public void DemowebShopUsingActionsMethods() throws IOException, InterruptedException {
		
		///////connecting to properties
		
		//fetch the data from properties
		FileInputStream fis=new FileInputStream("./src/test/resources/DemoWebPage.properties");
		
		//create object for properties
		Properties p=new Properties();
		
		p.load(fis);
		String url = p.getProperty("url");
		String st1 = p.getProperty("stf1");
		String st2 = p.getProperty("stf2");
		String timeouts = p.getProperty("timeouts");
		
		/////connecting to WebUtilities
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the browser
		wutil.maximizeThewindow();
		
		//implicitlywait
		//long time = Long.parseLong(timeouts);
		wutil.useimplicitlyWait(10);
		
		//navigate to the appln
		wutil.navigateTheWebpage(url);
		
		//identify the searchTf 
		DemoWebShop dws= new DemoWebShop(wutil.driver);
		dws.getSearchTf().sendKeys(st1);
		Thread.sleep(3000);
		
		dws.getSearchTf().clear();
		Thread.sleep(2000);
		
		dws.getSearchTf().sendKeys(st2);
		Thread.sleep(3000);
		
		dws.getSearchbtn().submit();
		Thread.sleep(2000);
		
		dws.getCheckbox().click();
		Thread.sleep(2000);
		
		//close the browser
		wutil.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
