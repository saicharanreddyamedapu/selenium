package HandlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import GenericUtilities.WebDriverUtility;

public class HandlingFileUploadPopup {

	@Test
	public void handlingFileUpload() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//identify choosefileBtn and upload the file using sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Sai Charan Reddy\\Pictures\\Screenshots");
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}
	
	
	@Test
	public void handlingFileUpload_UsingRobotClass() throws InterruptedException, AWTException {
		
		
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		
		StringSelection str = new StringSelection("C:\\Users\\Sai Charan Reddy\\Desktop\\file.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		
		Actions at = new Actions(driver);
		
		//identify choosefileBtn and upload the file using sendkeys
		WebElement fu=driver.findElement(By.id("file-upload"));
		at.click(fu).perform();
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


		Thread.sleep(4000);

		
		//close the browser
		driver.quit();
	}}
