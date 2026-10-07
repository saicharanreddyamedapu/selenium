package UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an appln
		driver.get("https://www.instagram.com/?hl=en");
		
		
		//identify username TF and enter text in it
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("selenium");
		
		//identify password TF and enter text in it
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("sel@123");
		Thread.sleep(3000);
		
		//identify the login button and click on it
		driver.findElement(By.xpath("(//span)[2]")).click();
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		

	}

}
