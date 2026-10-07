package UsingXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import GenericUtilities.WebDriverUtility;

public class UsingXpathByAxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverUtility wutil=new WebDriverUtility();
		
		//launch the browser
		wutil.launchTheBrowser();
		
		//maximize the window
		wutil.maximizeThewindow();
		
		//navigate to an appln
        wutil.navigateTheWebpage("https://www.flipkart.com/");  
        Thread.sleep(3000);
        
        // close the login popup
        wutil.driver.findElement(By.xpath("//span[text()='✕']")).click();
            
       //identify serach TF and click enter on it
       wutil.driver.findElement(By.name("q")).sendKeys("laptops"+Keys.ENTER);
         
     //verify price and print it
       WebElement price=wutil.driver.findElement(By.xpath("//div[contains(text(),' NU14A2 Thin and Light L...')]/ancestor::div[@class=\"ZFwe0M row\"]/descendant::div[@class=\"hZ3P6w DeU9vF\"]"));
       System.out.println(price.getText());
         Thread.sleep(2000);
         
         //close the browser
         wutil.quit();
         
	}

}
//forward and backward traversing 
// //div[contains(text(),'N4020 - (4')]/../../div[contains(@class,'mao5dl')]/div/div/div[@class="hZ3P6w DeU9vF"]
//  parent and child 
// //div[contains(text(),' N4020 - (4')]/parent::div/parent::div/child::div[contains(@class,'ao5dl')]/child::div/child::div/child::div[contains(@class,'DeU9vF')]
//  ancestor and descendant
// //div[contains(text(),' NU14A2 Thin and Light L...')]/ancestor::div[@class="ZFwe0M row"]/descendant::div[@class="hZ3P6w DeU9vF"]	