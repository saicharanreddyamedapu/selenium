package UsingJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;

public class HandlingDisabledElements {

	@Test
	public void disabledText() throws InterruptedException {
		
		
		WebDriverUtility wutil = new WebDriverUtility();
		
		wutil.launchTheBrowser();
		
		wutil.maximizeThewindow();
		
		wutil.useimplicitlyWait(10);
		
		wutil.navigateTheWebpage("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(2000);
		
		//identify disabled section and click on it 
		wutil.driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		Thread.sleep(3000);	

		//identify disabled Tf and pass the text using JSE
		
		JavascriptExecutor js = (JavascriptExecutor)wutil.driver;
		WebElement disnameTf = wutil.driver.findElement(By.id("name"));

		
		js.executeScript("arguments[0].value=arguments[1]", disnameTf, "Selenium");
		
		Thread.sleep(3000);	
		
		wutil.quit();
		
	} 
	
	@Test
	public void enabledText() throws InterruptedException {
		
		WebDriverUtility wutil = new WebDriverUtility();
		
		wutil.launchTheBrowser();
		
		wutil.maximizeThewindow();
		
		wutil.useimplicitlyWait(10);
		
		wutil.navigateTheWebpage("https://www.flipkart.com/");
		
		Thread.sleep(3000);	

		WebElement ennameTf = wutil.driver.findElement(By.name("q"));
		
		JavascriptExecutor js = (JavascriptExecutor)wutil.driver;
		
		js.executeScript("arguments[0].value=arguments[1]", ennameTf, "Selenium");
		
		Thread.sleep(3000);	
		
	}
	
	
}
