package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingScrollBar {
	@Test
	public void ScrollBar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);

		// scroll the webpage by using hardcoded coordinates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);

		// scroll the webpage by using element reference
		WebElement header = driver.findElement(By.xpath("//p[text()='Mobile Web DB Testing: Practical Scenarios']"));
		js.executeScript("arguments[0].scrollIntoView(true)", header);
		Thread.sleep(4000);

		// scroll the webpage by using element coordinates
		int xaxis = header.getLocation().getX();
		int yaxis = header.getLocation().getY();
		js.executeScript("Window.scrollBy(" + xaxis + "," + yaxis + ")");
		Thread.sleep(4000);

		js.executeScript("Window.scrollBy(0,document.body.scrollHeight)");

		// close the window
		driver.quit();

	}

	@Test
	public void ScrolToBottomAndTop() throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate an appln
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(6000);

		// scroll to bottom
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		// scroll to Top
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);

	}
}