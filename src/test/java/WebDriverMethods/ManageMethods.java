package WebDriverMethods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//navigate the application
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        //minimize the window
        driver.manage().window().minimize();
        Thread.sleep(2000);
        
        //fullscreen the window
        driver.manage().window().fullscreen();
        //Thread.sleep(2000);
        
        //fetch the size of window
        Dimension dim=driver.manage().window().getSize();
        System.out.println(dim);
        System.out.println("width :"+dim.getWidth());
        System.out.println("height :"+dim.getHeight());
        
        //fetch the position of the window
        Point p=driver.manage().window().getPosition();
        System.out.println(p);
        System.out.println("X :"+p.getX());
        System.out.println("Y :"+p.getY());
        
        //set the window size
        driver.manage().window().setSize(new Dimension(400,700));
        System.out.println(driver.manage().window().getSize());
        
        //set the window position
        driver.manage().window().setPosition(new Point(300, 450));
        System.out.println(driver.manage().window().getPosition());
        
        
	}

}
