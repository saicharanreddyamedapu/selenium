package HandlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;

@Test
public class HandlingChildWindowPopups {
	
	@Test
	  public void chidwindowpopup() throws InterruptedException {
		  //launch the browser
		  WebDriver web=new ChromeDriver();
		  //maximze
		  web.manage().window().maximize();
		  //implicit
		  web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //navigate to an application
		  web.get("https://www.flipkart.com/");
		  //Identify login popup and click on it
		  web.findElement(By.xpath("//span[@role=\"button\"]")).click();
		  
		  //identify searchtF and pass mobile in it
		  web.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		  Thread.sleep(3000);
		  //Identify product name and click on it
		  web.findElement(By.xpath("//div[text()='Ai+ Pulse 2 (Purple, 64 GB)']")).click();
		  
		  //fetch the parent window id
		   String pwid = web.getWindowHandle();
		   
		   //fetch all the windows id
		   Set<String> wids = web.getWindowHandles();
		   
		   for(String id:wids) {
			   web.switchTo().window(id);
		 if(web.getTitle().contains("Ai+ Pulse 2 (64 GB Storage, 4 GB RAM)")) {
			 WebElement mobilename= web.findElement(By.tagName("h1"));
			System.out.println(mobilename.getText());
	          Thread.sleep(3000);
			
		 }
		   } 
		   //switch back to parent window
		   web.switchTo().window(pwid);
		   
		   System.out.println(web.getTitle());
		   Thread.sleep(3000);
		   
		   //close the browser
		   web.quit();
	  }
	
}