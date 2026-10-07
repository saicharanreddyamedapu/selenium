package UsingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class UsingThreadsAndSleepImplicitwaits {
	
	@Test
	public void UsingThreads_implicitwait() throws InterruptedException {
	
		//launching the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to the appln
		driver.get("https://www.shoppersstack.com/");
		
//		Thread.sleep(50000);
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//identify and click on login
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
		

	
	}
}
