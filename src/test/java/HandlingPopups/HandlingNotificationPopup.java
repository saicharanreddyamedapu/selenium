package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingNotificationPopup {
	
	@Test
	public void Notification() throws InterruptedException {
		
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
		//launch the browser
		WebDriver driver=new ChromeDriver(opt);
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(3000);
		
		//identify notification and click
		driver.findElement(By.id("browNotButton")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
		
	}

}
