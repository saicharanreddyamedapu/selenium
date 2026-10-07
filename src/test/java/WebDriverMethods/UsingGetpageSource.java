package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetpageSource {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//navigate the appliaction
		driver.get("https://www.flipkart.com/");
		//fetch the hmtl source code of WP
		String sc=driver.getPageSource();
		System.out.println(sc);

	}

}
