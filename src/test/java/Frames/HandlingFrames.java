package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;

public class HandlingFrames {

	@Test
	public void handlingFrames() throws InterruptedException {
		
		WebDriverUtility wutil = new  WebDriverUtility();
		
		wutil.launchTheBrowser();
		
		wutil.maximizeThewindow();
		
		wutil.navigateTheWebpage("https://www.zomato.com/chhindwara/restaurants");
		
		wutil.useimplicitlyWait(10);

		wutil.driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
	
//		switching to iframe using index value
//		wutil.driver.switchTo().frame(3);
		
		//switching to iframe using id value
//		wutil.driver.switchTo().frame("auth-login-ui");
		
//		target thge iframe webelement
		WebElement frame = wutil.driver.findElement(By.id("auth-login-ui"));
		
		//switching to iframe by targeting webelement
		wutil.driver.switchTo().frame(frame);

		Thread.sleep(3000);

		wutil.driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9191929292");
		Thread.sleep(3000);

		//close the frame
		wutil.driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		
		//switch driver to mainwebpage
		wutil.driver.switchTo().defaultContent();
		Thread.sleep(3000);

		wutil.driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(3000);
		
		
		
		wutil.quit();
		
		
		
	}
}
