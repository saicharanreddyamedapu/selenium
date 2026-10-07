package UsingLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import GenericUtilities.WebDriverUtility;

public class UsingTagnameHandlingMultipleElements {
public static void main(String[] args) throws InterruptedException {
	WebDriverUtility wutil=new WebDriverUtility();
	
	//launch the browser
	wutil.launchTheBrowser();
	
	//maximize the window
	wutil.maximizeThewindow();
	
	//navigate the appln
	wutil.navigateTheWebpage("https://demowebshop.tricentis.com/");
	Thread.sleep(5000);
	
	//fetch all the luinks present in webpage
	List<WebElement> links=wutil.driver.findElements(By.tagName("a"));
	
	for(WebElement ele:links) {
		System.out.println(ele.getText());
	}
	Thread.sleep(2000);
	
	//close the browser
	wutil.quit();
}
}
