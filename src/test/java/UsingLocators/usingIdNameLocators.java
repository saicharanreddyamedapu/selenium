package UsingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingIdNameLocators {
	public static void main(String[] args) throws InterruptedException {
//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//navigate to appln
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(5000);
	
	//identify nameTF and pass the text
	driver.findElement(By.id("name")).sendKeys("selenium");
	Thread.sleep(2000);
	
	//identify the emailTF and pass the text
	driver.findElement(By.id("email")).sendKeys("sel@gmail.com");
	Thread.sleep(2000);
	
	//identify pass TF and pass text
	driver.findElement(By.name("password")).sendKeys("sel12345");
	Thread.sleep(2000);
	
	//identify register button and click on it
	driver.findElement(By.xpath("//button")).click();
	Thread.sleep(3000);
	
	//close the browser
	driver.quit();
	
}
}