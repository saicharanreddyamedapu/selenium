package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDynamicDropdowns {

	@Test
	public void MultiSelectDD() throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	driver.get("https://www.google.com/");
	 
	Thread.sleep(5000);
	
       	driver.findElement(By.name("q")).sendKeys("selen");
       	
       	List<WebElement> autosugg = driver.findElements(By.xpath("//span[text()='selen']"));
       	
       	for(WebElement x : autosugg) {
       		System.out.println("ALL Suggestions "+ x.getText());
       		if(x.getText().contains("selenophile meaning")) {
       			x.click();
       		}
       	}
       	
}}
