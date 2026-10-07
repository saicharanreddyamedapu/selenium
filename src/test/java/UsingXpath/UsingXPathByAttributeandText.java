package UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXPathByAttributeandText {
public static void main(String[] args) throws InterruptedException {
	
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//navigate to an appln
	driver.get("https://demoapps.qspiders.com/ui/login3.0?sublist=0&scenario=1");
	Thread.sleep(5000);
	
	//identify header and print
	WebElement header = driver.findElement(By.xpath("//button[text()='Login']"));
	String headertext = header.getText();
	System.out.println(headertext);
	Thread.sleep(3000);
	
	//identify username tf and enter text in it
	driver.findElement(By.xpath("//input[@placeholder=\'Username\'])")).sendKeys("selenium");
	Thread.sleep(3000);
	
	//identify password tf and enter text in it
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("sel@123");
	Thread.sleep(3000);
	
    //identify login button and click on it
	driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	Thread.sleep(3000);
	
	//close the browser
	driver.quit();
}
}
