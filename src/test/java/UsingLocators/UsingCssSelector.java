package UsingLocators;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		
		//navigate to appln
		wutil.navigateTheWebpage("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(5000);
		
		//identify the checkbox and click 
		wutil.driver.findElement(By.cssSelector("input[id=\"domain_a\"]")).click();
		wutil.driver.findElement(By.cssSelector("input[id=\"mode_b\"]")).click();
		wutil.driver.findElement(By.cssSelector("input[id=\"mode_f\"]")).click();
		Thread.sleep(3000);	
		//identify contiue button and click on it
		wutil.driver.findElement(By.cssSelector("input[id=\"mode_g\"]")).click();
		Thread.sleep(3000);
		
		//close the browser
		wutil.quit();
		
		

	}

}
