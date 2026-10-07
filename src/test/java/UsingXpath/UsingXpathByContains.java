package UsingXpath;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingXpathByContains {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverUtility wutil=new WebDriverUtility();
	
	//launch the browser
	wutil.launchTheBrowser();
	
	//maximize the window
	wutil.maximizeThewindow();
	
	//naviagte to an appln
	wutil.navigateTheWebpage("https://www.instagram.com/?hl=en");
	Thread.sleep(5000);
	
	//identify usernameTF and enter text in it
	wutil.driver.findElement(By.xpath("//input[contains(@autocomplete,\"username webauthn\")]")).sendKeys("selenium");
	
	//identify pass TF and enter text in it
	wutil.driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("sel@123");
	
	//identify login button and click on it
	
	
}
}
