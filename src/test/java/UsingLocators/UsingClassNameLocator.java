package UsingLocators;

import java.sql.Driver;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		
		//navigate the appln
		wutil.navigateTheWebpage("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(5000);
		
		//identify emailTF and pass the text
		wutil.driver.findElement(By.className("bg-gray-50")).sendKeys("sel@gmail.com");
		Thread.sleep(2000);
		
		//close the browser
		wutil.quit();
	}

}
