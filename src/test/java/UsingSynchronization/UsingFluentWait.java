package UsingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class UsingFluentWait {
	
	@Test
	public void demoapps() throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to an appln
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  
		  //wait until element is clickable
		  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		  //time
		  wait.withTimeout(Duration.ofSeconds(20));
		  //customize the polling period
		  wait.pollingEvery(Duration.ofSeconds(1));
		  //ignore exceptions
		  wait.ignoring(Exception.class);
		  
		  //wait for title to be visible
		  wait.until(ExpectedConditions.titleContains("demologin"));
		  Thread.sleep(3000);
		  
		  //identify login now link
		  WebElement loginlink= driver.findElement(By.partialLinkText("Login Now"));
		  wait.until(ExpectedConditions.elementToBeClickable(loginlink));
		  loginlink.click();
	  }
	}
