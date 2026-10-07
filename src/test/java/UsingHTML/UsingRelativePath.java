package UsingHTML;

import org.openqa.selenium.By;

import GenericUtilities.WebDriverUtility;

public class UsingRelativePath {

		public static void main(String[] args) throws InterruptedException {
			WebDriverUtility web=new WebDriverUtility();
			
			//launch the browser
			web.launchTheBrowser();
			
			//maximize the browser
			web.maximizeThewindow();
			
			//navigate to an appli
			web.navigateTheWebpage("https://www.instagram.com/");
			
	       //Identify login ele and click on it
			web.driver.findElement(By.xpath("//span[text()='Log in']")).click();
			Thread.sleep(3000);
			
			//identify username TF and pass the text
			web.driver.findElement(By.xpath("(//input)[1]")).sendKeys("Selenium");
			Thread.sleep(3000);
			
			
			//Identify password TF and pass the text
			web.driver.findElement(By.xpath("(//input)[2]")).sendKeys("Sel@123");
			Thread.sleep(3000);
			
			
			//Identify button and pass the text
			web.driver.findElement(By.xpath("//span[ytext()='Log in']")).click();
			Thread.sleep(3000);
			
			//close the browser
			web.quit();
			
		

	}

}
