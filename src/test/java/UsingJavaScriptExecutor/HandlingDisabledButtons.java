package UsingJavaScriptExecutor;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDisabledButtons {
@Test
public void disabledelements() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(4000);
	
	//idntify disbled link and click onit
	driver.findElement(By.xpath("//li[text()=\"Disabled\"]")).click();
	Thread.sleep(4000);
	
	//identify nameTF 
	WebElement disnameTF = driver.findElement(By.id("name"));
	
	//enter text in nameTF using JSE
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value=arguments[1]", disnameTF,"selenium");
	Thread.sleep(4000);
	
	driver.quit();
}
   @Test
   public void enabledelements() throws InterruptedException {
	   
	   WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		//identify searchTF 
		WebElement enaSearchTF = driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
		
		//enter text in searchTF
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]", enaSearchTF,"selenium");
		Thread.sleep(4000); 
		
		driver.quit();
   }
   
   @Test
   
   public void disabledbtn() throws InterruptedException {
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	   
	   //identify disabled link and click on it
	   driver.findElement(By.xpath("//a[text()=\"Disabled\"]")).click();
	   
	   //identify yesBtn and click on it using JSE
       WebElement yesBtn = driver.findElement(By.id("btn_abc"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", yesBtn);
        Thread.sleep(4000);
        
        //identify disabled checkbox and click on it using JSE
        WebElement disCheckBox = driver.findElement(By.id("submit"));
        
        js.executeScript("arguments[0].removeAttribute('disabled')", disCheckBox);
        Thread.sleep(3000);
        
        disCheckBox.click();
        Thread.sleep(3000);

        driver.quit();
        
   }
   
   @Test
   public void navigatebyJSE() throws InterruptedException {
	   
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	   //navigate by JSE
	  String url = "https://demoapps.qspiders.com/ui?scenario=1";
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.location=arguments[0]", url);
	  Thread.sleep(3000);
	  
	  //fetch title using JSE
	  System.out.println(js.executeScript("return document.title"));
	  
	  //fetch url using JSE
	  System.out.println(js.executeScript("return document.URL"));
	  
	  //refresh using JSE
	  js.executeScript("history.go(0)");
	  Thread.sleep(3000);
	  
	  driver.quit();  
	  
   }
		
   }