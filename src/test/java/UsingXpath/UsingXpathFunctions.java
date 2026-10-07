package UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathFunctions {
public static void main(String[] args) throws InterruptedException {
	
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//maximize  the window
	driver.manage().window().maximize();
	
	//navigate to appln
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	//identify search TF and pass text in it
	driver.findElement(By.xpath("//input[starts-with(@class,'n')]")).sendKeys("toys");
	Thread.sleep(2000);
	
	//identify the search ico and click on it
	driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
	Thread.sleep(2000);
	
}
}
