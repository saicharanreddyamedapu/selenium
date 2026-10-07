package UsingHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import GenericUtilities.WebDriverUtility;

public class UsingAbsolutePath {
	public static void main(String[] args) throws InterruptedException {

		WebDriverUtility wutil = new WebDriverUtility();

		// launch the browser
		wutil.launchTheBrowser();

		// maximize the window
		wutil.maximizeThewindow();

		// navigate to an appln
		wutil.navigateTheWebpage("file:///C:/Users/HP/Desktop/LoginPage.html");
		Thread.sleep(3000);

		// identify username TF and pass the text in it
		WebElement usernameTF = wutil.driver.findElement(By.xpath("html/body/input[1]"));
		usernameTF.sendKeys("selenium");
		Thread.sleep(3000);

		// identify pass TF and pass the text in it
		wutil.driver.findElement(By.xpath("html/body/input[2]")).sendKeys("sel@123");
		Thread.sleep(3000);

		// identify login button and click on it
		wutil.driver.findElement(By.xpath("html/body/button[1]"));
		Thread.sleep(3000);

		// identify forget password and click on it
		wutil.driver.findElement(By.xpath("html/body/a")).click();
		Thread.sleep(3000);

		// close the browser
		wutil.quit(); 
	}
}
