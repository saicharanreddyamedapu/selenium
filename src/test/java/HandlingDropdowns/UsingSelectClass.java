package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UsingSelectClass {
 @Test
 public void HandlingDDUsingSelectClass() throws InterruptedException {
	 //Launch the browser
	 WebDriver web=new ChromeDriver();
	 //maximize
	 web.manage().window().maximize();
	 //implicit wait
	 web.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //navigTE TO AN URL
	 web.get("https://www.amazon.in/");
	 Thread.sleep(3000);
	 //identify dropdown
	 WebElement dropdown =web.findElement(By.id("searchDropdownBox"));
	 
	 Select sec=new Select(dropdown);
	 //Select an option using index
	 sec.selectByIndex(5);
	 Thread.sleep(3000);
	 
	 //select an a option by value
	 sec.selectByValue("search-alias=jewelry");
	 Thread.sleep(3000);
	 
	 //select an a option by using text
	 sec.selectByVisibleText("Toys & Games");
	 Thread.sleep(3000);
	 
	//Select an option using partial text
	// sec.selectByContainsVisibleText("Gardens"); unsupportedoperationException
	 Thread.sleep(3000);
	 
	 //Fetch all the options
	   List<WebElement> options =sec.getOptions();
	   
	   for(WebElement ele : options) {
		   System.out.println("All Options :"+ele.getText());
	   }
	   
	   //Fetch the selected options
	   List<WebElement> selectedOptions =sec.getAllSelectedOptions();
	   for(WebElement ele :selectedOptions) {
		   System.out.println("All selectedOptions :"+ele.getText());
	   }
	  // sec.deselectByVisibleText("Toys & Games");
	   
	   //check the DD
	   if(sec.isMultiple())
		   System.out.println("MultiSelect DropDown");
	   else
		   System.out.println("SingleSelect DropDown");
	   
	   //close the browser
	   web.quit();
	 
	 }
 
}