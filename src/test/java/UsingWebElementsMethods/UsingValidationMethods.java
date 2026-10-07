package UsingWebElementsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingValidationMethods {
  @Test
  public void validatemethods() throws InterruptedException {
	  //launch the browser
	  WebDriver web=new ChromeDriver();
	  //maximize
	  web.manage().window().maximize();
	  //implicit wAIT
	  web.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //navigate to an application
	  web.get("https://demoapps.qspiders.com/ui");
	  
	  //validate name Tf-->check whether it is displayed
	  WebElement nameTF = web.findElement(By.id("name"));
	  
	  if(nameTF.isDisplayed()) {
		  nameTF.sendKeys("selenium");
		  Reporter.log("NameTf is not displayed",true);
	  }else
		  Reporter.log("NameTf is not displayed",true);
	  Thread.sleep(2000);
	  
	  //validate checkbox section -->check whether ele is displayed
	  WebElement checkBox = web.findElement(By.xpath("//section[text()='check Box']"));
	  
	  if(checkBox.isEnabled()) {
		  checkBox.click();
		  Reporter.log("checkbox is enabled",true);
  }else
	  Reporter.log("checkbox is not disabled",true);
	  Thread.sleep(2000);
	  
	  //validate emailCB->check whether cb is selected
	 WebElement emailcb = web.findElement(By.id("domain_a"));
	 
	 if(emailcb.isSelected()) {
		  Reporter.log("checkbox is selected",true);
	 }else
		  Reporter.log("selected checkbox",true);
	 Thread.sleep(3000);
	 
	 //close the browser
	 web.quit();
  }
}
