package TakeshScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementScreenshot {

	 @Test
	 public void takesScreenshotWebElemet() throws InterruptedException, IOException {
		 //Launch the browser
		 WebDriver driver=new ChromeDriver();
		 //downcasting to the tks
		
		 //maximize
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //navigTE TO AN URL
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 WebElement  ele = driver.findElement(By.xpath("//img[@src='https://static-assets-web.flixcart.com/apex-static/images/svgs/L1Nav/home-final.svg']"));
		 
		 File src = ele.getScreenshotAs(OutputType.FILE);   
		 File dest = new File("./selenium/flipkart.png");
		 FileUtils.copyFile(src, dest); //automatically creates a folder
//		 FileHandler.copy(src, dest);  //in this way we have to create a folder manually
	
		 driver.quit();
		 
		 
		 
		 
}}

