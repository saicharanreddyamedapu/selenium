package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUps {
	
	@Test
	public void Alert() throws InterruptedException {
		
		//launch the browser
		WebDriver dirver=new ChromeDriver();
		
		//maximize the window
		dirver.manage().window().maximize();
		
		//implicit wait
		dirver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		dirver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identify js alert and click
		dirver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		
		//handle the alert popup and click on ok
		Alert al = dirver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		//identify and print result 
		String result = dirver.findElement(By.id("result")).getText();
		System.out.println(result);
		
		//close the browser
		dirver.quit();
	}
	

	@Test
	public void Confirmation() throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identify confirm and click
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		
		//identify and click on cancel
		Alert cancel = driver.switchTo().alert();
		System.out.println(cancel.getText());
		
		//identify and print result 
		String result1 = driver.findElement(By.id("result")).getText();
		System.out.println(result1);
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
	
	@Test
	public void JsPrompt() throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identify confirm and click
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		
		//identify and click on cancel
		Alert js = driver.switchTo().alert();
		System.out.println(js.getText());
		js.sendKeys("vishnu");
		js.accept();
		
		//identify and print result 
		String result1 = driver.findElement(By.id("result")).getText();
		System.out.println(result1);
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}


}
