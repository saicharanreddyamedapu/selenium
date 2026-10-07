package UsingXpath;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

    public class UsingXpathKeywords2 {
    public static void main(String[] args) throws InterruptedException {
	
	WebDriverUtility wutil=new WebDriverUtility();
	
	//launch the browser
	wutil.launchTheBrowser(); 
	
	//maximize the window
	wutil.maximizeThewindow();
	
	//navigate to appln
	wutil.navigateTheWebpage("https://www.instagram.com/?hl=en");
	Thread.sleep(3000);
	
	//find mobile no TF and enter text in it
	wutil.driver.findElement(By.xpath("//input[@type=\"text\" or @name=\"email\" ]")).sendKeys("sel@123");
	
	//find password TF and enter text in it
	wutil.driver.findElement(By.xpath("//input[@type=\"password\" and @name=\"pass\"]")).sendKeys("selenium");
    Thread.sleep(3000);
    
    //find login button and click on it
    wutil.driver.findElement(By.xpath("//span[text()=\"Log in\" and contains(@class,'xuxw1ft')]")).click();
    Thread.sleep(3000);
    
    //close the browser
    wutil.quit();
    

}
}
