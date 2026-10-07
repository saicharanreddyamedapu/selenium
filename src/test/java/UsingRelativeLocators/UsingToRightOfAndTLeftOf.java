package UsingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import GenericUtilities.WebDriverUtility;

public class UsingToRightOfAndTLeftOf {

	public static void main(String[] args) throws InterruptedException {

		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		Thread.sleep(2000);
		
		//navigate to an appln
		wutil.navigateTheWebpage("https://www.google.com/");
		
		//identify telugu link
	WebElement telugu=	wutil.driver.findElement(By.linkText("తెలుగు"));
		
	    //identify tullu and click on it
	wutil.driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(telugu)).click();
	Thread.sleep(2000);
	
	//identify telugu link
		WebElement telugu2=	wutil.driver.findElement(By.linkText("తెలుగు"));
			
	    //identify marathi link and  click on it
	wutil.driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(telugu2)).click();
     Thread.sleep(2000);
	
	    //close the window
	 //  wutil.quit();
	   
	   //using near locator
	 //identify telugu link
	 		WebElement telugu3=	wutil.driver.findElement(By.linkText("తెలుగు"));
	 		
	 		//identify neareast button and click on it
	 		wutil.driver.findElement(RelativeLocator.with(By.tagName("input")).near(telugu3)).click();
	 		Thread.sleep(2000);
	   
	   
		
	}

}
