package PomUtilization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Utility.DemoPOMPage;

public class DemoRegisterTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(3000);
		
		
		
		
		//for getting StaleElementReferenceException

//		WebElement nameTf= driver.findElement(By.xpath("//input[@id = 'name']"));
//		nameTf.sendKeys("selenium");
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		nameTf.sendKeys("java");
		
		
		DemoPOMPage demo = new DemoPOMPage(driver);
		 
		//validate webpage
////		  String headertext =demo.getHeader().getText();
////		  System.out.println(headertext);
//		  if(headertext.contains("Register")) {
//			  System.out.println("Test Passed");
//		  }
//		  else {
//			  System.out.println("Test Failed");
//		  }
		
//System.out.printl(demo.getHeader();
		  
		
//		  demo.getNameTF("selenium");
//			Thread.sleep(3000);
//
//		  demo.getEmailTF("sel@gmail.com");
//			Thread.sleep(3000);
//
//		  demo.getPasswordTF("sel@1234");
//			Thread.sleep(3000);
//
//		  demo.getRegisterBTN();
//			Thread.sleep(3000);
//          
//			driver.close();
//			
			
			demo.Register("selenium", "Sel@gamail.com", "sel@123");
			Thread.sleep(3000);
			
			driver.quit();
		
	}

}
