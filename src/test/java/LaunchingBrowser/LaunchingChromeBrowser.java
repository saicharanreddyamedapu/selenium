package LaunchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String browser="Chrome";
		if (browser.equals("Chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browser.equals("Edge")) {
			driver=new EdgeDriver();
			
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

