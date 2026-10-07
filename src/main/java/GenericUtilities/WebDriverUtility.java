
package GenericUtilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverUtility {
	public WebDriver driver = null;

	// 1.Launch the browser
	public void launchTheBrowser() {
		driver = new ChromeDriver();
	}

	// 2.maximize the window
	public void maximizeThewindow() {
		driver.manage().window().maximize();
	}

	// 3.minimize the window
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}

	// 4.navigate the application
	public void navigateTheWebpage(String url) {
		driver.get(url);
	}

	// 5.navigate to previous page
	public void navigatePreviousWP() {
		driver.navigate().back();
	}

	// 6.navigate to next page
	public void navigateNextWP() {
		driver.navigate().forward();
	}

	// 7.refresh the page
	public void refreshThePage() {
		driver.navigate().refresh();
	}

	// 8.navigate to new webpage
	public void naviagtetourl_Stringurl(String url) {
		driver.navigate().to(url);
	}

	// 8.navigate to new webpage
	public void navigatetonewurl_Stringurl(String url) throws MalformedURLException {
		driver.navigate().to(new URL(url));
	}

	// 9.fetch html code of webpage
	public String htmlSourceCode() {
		return driver.getPageSource();
	}

	// 10.fetch current url
	public String currentUrl() {
		return driver.getCurrentUrl();
	}

	// 11.fullscreen the window
	public void fullScreen() {
		driver.manage().window().fullscreen();
	}

	// 12.fetch the size of window
	public Dimension dimension() {
		Dimension dim = driver.manage().window().getSize();
		return dim;
	}

	// 13.fetch the position of the window
	public Point windowPosition() {
		Point p = driver.manage().window().getPosition();
		return p;
	}

	// 14.set the window size
	public void setDimensions(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	// 15.set the window position
	public void setPosition(int X, int Y) {
		driver.manage().window().setPosition(new Point(X, Y));
	}

	// 16.fetch the title of webpage
	public String fetchPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 17.close the browser
	public void close() {
		driver.close();
	}

	// 18.quit the browser
	public void quit() {
		driver.quit();
	}

	// 19.fetch the current window
	public String fetchTheWindow() {
		String wid = driver.getWindowHandle();
		return wid;
	}

	// 20.fetch all window ids
	public Set<String> fetchAllWindowIds() {
		Set<String> wids = driver.getWindowHandles();
		return wids;
	}

	// 21.switch to window
	public void switchToWindow(String wid) {
		driver.switchTo().window(wid);
	}

	// 22.implicitly wait
	public void useimplicitlyWait(long timeouts) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeouts));
	}
}