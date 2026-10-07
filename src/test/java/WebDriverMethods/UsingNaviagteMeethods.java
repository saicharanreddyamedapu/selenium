package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNaviagteMeethods {
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//navigate the webpage
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	//navigate to previous page
	driver.navigate().back();
	Thread.sleep(3000);
	
	//navigate to next page
	driver.navigate().forward();
	Thread.sleep(3000);
	
	//refresh the page
	driver.navigate().refresh();
	Thread.sleep(3000);
	
	//navigate to new webpage
	driver.navigate().to("https://www.zomato.com/");
	Thread.sleep(3000);
     
	driver.navigate().to(new URL("https://www.Myntra.com/"));
	
	
}
}
