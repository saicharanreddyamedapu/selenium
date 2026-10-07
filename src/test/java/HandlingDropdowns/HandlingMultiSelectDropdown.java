package HandlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingMultiSelectDropdown {
	@Test
	public void MultiSelectDD() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	 
	Thread.sleep(6000);
	
       	WebElement dropdown =driver.findElement(By.id("select-multiple-native"));
	
       	//create object of select class
	Select s = new Select(dropdown);
	
	s.selectByIndex(7);
	Thread.sleep(4000);

	s.selectByValue("Mens Cotton Jacket");
	Thread.sleep(4000);

	s.selectByVisibleText("Mens Casual Slim Fit...");
	Thread.sleep(4000);

	s.selectByContainsVisibleText("Gold");
	Thread.sleep(4000);

	
	
	
	List<WebElement> allOptions = s.getOptions();
	for(WebElement ele : allOptions) {
		System.out.println("ALL OPTIONS" + ele.getText());
	}
	
	List<WebElement> SelectedOptions = s.getAllSelectedOptions();
	for (WebElement ele : SelectedOptions) {
		System.out.println("Selected Options " + ele.getText());
	}
	
	if(s.isMultiple())
		System.out.println("Multiple Select DD");
	else {
		System.out.println("Single select DD");
	}
	
//	s.deselectByIndex(4);
//	s.deselectByValue("Mens Cotton Jacket...");
//	s.deselectByVisibleText("Mens Casual Slim Fit...");
//	s.deSelectByContainsVisibleText("Gold");
	
	s.deselectAll();
	
	driver.quit();
	
}
}
