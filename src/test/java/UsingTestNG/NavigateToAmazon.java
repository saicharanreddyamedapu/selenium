package UsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateToAmazon {

	@Parameters("browser")
	@Test(groups = "smoke")
	public void amazon(String bro) throws InterruptedException {
		
		WebDriver driver = null;
		
		if(bro.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(bro.equals("edge")) {
				driver = new EdgeDriver();

			}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com");
		
		System.out.println("amazon");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
