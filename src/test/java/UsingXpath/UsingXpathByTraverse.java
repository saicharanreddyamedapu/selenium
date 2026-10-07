package UsingXpath;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingXpathByTraverse {
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launching the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		
		//navigate to the appln
		wutil.navigateTheWebpage("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//identify the ststic element
		wutil.driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[@class='add-info']/div/span"));
		
		//close the window
		wutil.quit();
		

	}


}
