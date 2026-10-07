package UsingSynchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UsingExplicitWait {
	
	@Test
	public void Explicitwait() {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navitgate to appln
		driver.get("https://www.shoppersstack.com/");
		
		//wait until the title to be loaded
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.titleContains("ShoppersStack"));
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//identify loginbtn
		WebElement login = driver.findElement(By.id("loginBtn"));
		
		
		//wait until login btn is visible on the webpage
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		//click the button
		login.click();
	}
	

}
