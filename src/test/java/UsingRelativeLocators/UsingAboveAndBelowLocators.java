package UsingRelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveAndBelowLocators {

	public static void main(String[] args) throws InterruptedException {
     
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
	   	//maximaize the window
		driver.manage().window().maximize();
		
		//navigate to an appln
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	    Thread.sleep(5000);
	
	    //identify email text field
	    WebElement email=driver.findElement(By.id("email"));
	    email.sendKeys("sel@gmail.com");
	    
	    //identify name TF
	    WebElement name=driver.findElement(RelativeLocator.with(By.tagName("input")).above(email));
	    name.sendKeys("selenium");
	    	 
	    //identify password TF
	    WebElement pswd=driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
	    pswd.sendKeys("sel@123");
	    Thread.sleep(3000);
	    
	    //identify register button 
	    driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd)).click();
	    Thread.sleep(2000);
	    
	   //close the window
	    driver.quit();
	    
	    
	}

}
