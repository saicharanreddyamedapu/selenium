package UsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateToZepto {

	@Parameters("browser")

	@Test(groups = "reg")
	public void zepto(String bro) throws InterruptedException {

		WebDriver driver = null;

		if (bro.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (bro.equals("edge")) {
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.zepto.com");

		System.out.println("zepto");

		Thread.sleep(3000);

		driver.quit();

	}
}
