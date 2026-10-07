package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetcurrentURL {
	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to application
		driver.get("https://www.zomato.com/");
	//fetch the current url
	String acturl=driver.getCurrentUrl();
	System.out.println(acturl);
	String expurl="https://www.zomato.com/";
	//validate the webpage
	if (acturl.contains(expurl)) {
		System.out.println("test pass");
		
		
	}else {
		System.out.println("test fail");
	}
	

	}
}
	
