package TakeshScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class WebPageScreenshot {

	 @Test
	 public void takesScreenshotWebPage() throws InterruptedException, IOException {
		 //Launch the browser
		 WebDriver driver=new ChromeDriver();
		 //downcasting to the tks
		 TakesScreenshot tks = (TakesScreenshot)driver;
		 //maximize
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //navigTE TO AN URL
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 File src = tks.getScreenshotAs(OutputType.FILE);   
		 File dest = new File("./selenium/amz.png");
		 FileUtils.copyFile(src, dest); //automatically creates a folder
//		 FileHandler.copy(src, dest);  //in this way we have to create a folder manually
	
		 driver.quit();
		 
		 
		 
		 
}}
