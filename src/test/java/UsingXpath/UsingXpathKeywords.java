package UsingXpath;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingXpathKeywords {
public static void main(String[] args) throws InterruptedException  {
	
	WebDriverUtility wutil=new WebDriverUtility();
	
	//launch the browser
	wutil.launchTheBrowser();
	
	//maximize the window
	wutil.maximizeThewindow();
	
	//navigate to appln
	wutil.navigateTheWebpage("https://www.flipkart.com/account/login?ret=/");
	Thread.sleep(5000);
	
	//find email TF and enter text in it
	wutil.driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"c3Bd2c yXUQVt\"]")).sendKeys("8977901099");
	//wutil.driver.findElement(By.xpath("//input[@type=\"text\" or @autocomplete=\"off\"]")).sendKeys("8977901099");
	Thread.sleep(3000);
	
	//close the browser
	wutil.quit();
}
}
