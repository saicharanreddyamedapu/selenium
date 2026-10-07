package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;

public class HandlingMouseActions {
@Test
   public void HAndlingMouseActions() throws InterruptedException {
	WebDriver web =new ChromeDriver();
	
	//maximize
	web.manage().window().maximize();
	
	//implicit wait
	web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//navigate toan url
	web.get("https://www.amazon.in/");
	WebElement ele = web.findElement(By.id("a-autoid-0-announce"));
	Actions act=new Actions(web);
	
	act.scrollToElement(ele).perform();
	Thread.sleep(4000);
	
	act.scrollByAmount(100, 100).perform();
	Thread.sleep(10000);
}
  @Test
  public void rightClick_Doubleclick() {
	//lAaunch the browser
	  WebDriver web=new ChromeDriver();
	  //maximize
	   web.manage().window().maximize();
	  //implicit wait
	   web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //navigate to an application
	   web.get("https://demo.guru99.com/test/simple_context_menu.html");
	   //Identify  right click btn and click on it
	 WebElement rightclickbtn = web.findElement(By.xpath("//span[text()='right click me']"));
	   
	   Actions act =new Actions(web);
	   act.contextClick(rightclickbtn).perform();
  }
  @Test
  public void Doubleclick() {
	  //launch the browser
	  WebDriver web=new ChromeDriver();
	  
	  //maximize
	  web.manage().window().maximize();
	  
	  //implicit wait
	  web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //navigate to an application
	  web.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //identify element double 
	 WebElement doubleclickbtn = web.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	 Actions act=new Actions(web);
	 act.doubleClick(doubleclickbtn).perform();
  }
  @Test
  public void Mousehover_clickandHold_DragandDrop() throws InterruptedException {
	WebDriver web=new ChromeDriver();
	    //maximize
	web.manage().window().maximize();
	 	  //implicit 
	   web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //navigate to an application
	   web.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
	   //IDentify i icon mouse actions section and click on it
	   WebElement icon = web.findElement(By.xpath("//img[contains(@src,'hint')]"));
	   Thread.sleep(3000);
	   
	   Actions act=new Actions(web);
	   act.moveToElement(icon).perform();
	   Thread.sleep(3000);
	   
	   //Identify mouse actions section and click on it
	   web.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	   Thread.sleep(3000);
	   
	   //Identify click and hold section and click on it
	   web.findElement(By.xpath("//section[text()='Click & Hold']")).click();
	   Thread.sleep(3000);
	   
	   //identify circle and click and hold
	  WebElement circle = web.findElement(By.id("circle"));
	  act.clickAndHold(circle).perform();
	  Thread.sleep(3000);
	  
	  //release the cursor
	  act.release(circle).perform();
	  
	  //Identify drag and drop section and circle on it
	  web.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
	  Thread.sleep(3000);
	  
	//  Identify drag position link and click on it
	  web.findElement(By.linkText("Drag Position")).click();
	  Thread.sleep(3000);
	  
	  //Drag and Drop mobile and laptop accesorries
	 WebElement dragable_mc = web.findElement(By.xpath("//div[text()='Mobile Charger']"));
	 WebElement dropable_MA = web.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	 
	 act.dragAndDrop(dragable_mc, dropable_MA).perform();
	 
	 //close the  browser
	 web.quit();
  }
}