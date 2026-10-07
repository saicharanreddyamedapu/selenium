package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethos {
	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// navigate the application
		driver.get("https://www.zomato.com/");

		// fetch the title of webpage
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		String exptitle = "Zomato";

		// validate the webpage
		if (acttitle.contains(exptitle)) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}

	}
}
