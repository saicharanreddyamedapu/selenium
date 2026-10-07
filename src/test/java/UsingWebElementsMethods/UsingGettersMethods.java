package UsingWebElementsMethods;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingGettersMethods {
	
	@Test
	public void gettermethods() { 
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to the application
		driver.get("https://www.flipkart.com/");
		
		//identify the element
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		//fetch the text
		String text = electronics.getText();
		Reporter.log(text,true);
		
		//find attribute
		String attributesvalues = electronics.getAttribute("class");
		Reporter.log(attributesvalues,true);
		
		//find tagname
		String tagname = electronics.getTagName();
		Reporter.log(tagname,true);
//		
//		//find size
//		Dimension size = electronics.getSize();
//		Reporter.log(size,true);
//		
		
		//find size 
		Dimension size = electronics.getSize();
		Reporter.log(""+size,true);
		
		//Fetch the location
		Point coordinates = electronics.getLocation();
		Reporter.log("coordinates: "+coordinates,true);
				
		//Fetch the axis and width of element
		Rectangle r = electronics.getRect();
		Reporter.log("width: "+r.getWidth(),true );
		Reporter.log("xaxis: "+r.getX(),true);
		
		
		//Fetch the css value
		String cssvalue = electronics.getCssValue("font");
		Reporter.log("font css value :"+cssvalue,true);
		
		
		//close the browser
		driver.quit();
		
		
		
		
	}

}
