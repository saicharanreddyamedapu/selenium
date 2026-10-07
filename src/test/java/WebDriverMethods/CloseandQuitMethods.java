package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitMethods {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the appln
				driver.manage().window().maximize();
				//navigate the appliaction
				driver.get("https://www.flipkart.com/search?q=shoes&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_2_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_2_0_na_na_na&as-pos=2&as-type=TRENDING&suggestionId=shoes&requestId=e9df3ee4-a023-48c3-afcd-ea51a762d69c");
				Thread.sleep(3000);
				//identify compare icon and click on it'
				WebElement compareicon=driver.findElement(By.linkText("VIGOR Athleisure Cultured Round-Toe Shape & Hyperfuse T..."));
				compareicon.click();
				Thread.sleep(3000);
				//close the browser
			//driver.close();
			driver.quit();
				
	}

}
