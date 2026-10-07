package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetMethod {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to a application
		driver.get("https://www.zomato.com/");
		

	}

}
