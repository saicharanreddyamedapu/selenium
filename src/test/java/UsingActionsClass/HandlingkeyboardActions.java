package UsingActionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingkeyboardActions {
 @Test
 public void usingKeyboards() throws InterruptedException {
	 //launch the browser
	 WebDriver web=new ChromeDriver();
	 
	 //maximize
	 web.manage().window().maximize();
	 //IMPLICIT wait
	 web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //navigate to an application
	 web.get("https://www.flipkart.com/");
	 
	 //close login popup
	 web.findElement(By.xpath("//span[@class=\"b3wTlE\"]")).click();
	 
	 
	 //identify search TF and mouseover
	WebElement searchTf = web.findElement(By.xpath("//input[@class=\"nw1UBF v1zwn26\"]"));
	
	Actions act =new Actions(web);
	act.moveToElement(searchTf).click(searchTf).keyDown(Keys.SHIFT)
	.sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
	Thread.sleep(3000);
	
	//close the window
	web.quit();
	
	
	
 }
}