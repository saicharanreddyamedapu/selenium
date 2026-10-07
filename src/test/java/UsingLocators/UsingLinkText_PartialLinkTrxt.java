package UsingLocators;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingLinkText_PartialLinkTrxt {

	public static void main(String[] args) throws InterruptedException {
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		
		//navigate to an appln
		wutil.navigateTheWebpage("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(5000);
		
		//identify men link and click on it
//		wutil.driver.findElement(By.linkText("Men")).click();//linkText
		wutil.driver.findElement(By.partialLinkText("Wom")).click();//PartialLinkText
		Thread.sleep(2000);
	    
		//close the browser
		wutil.quit();
		
		
	}

}
