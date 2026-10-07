package POM_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShop {
	
	//declare
	@FindBy(id="small-searchterms")private WebElement searchTf;
	
	@FindBy(xpath="//input[@type='submit']")private WebElement searchbtn;
	
	@FindBy(xpath="//input[@id='As']")private WebElement checkbox;
	
	
	//initilize
	public  DemoWebShop(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	

	//utilize
	public WebElement getSearchTf() {
		return searchTf;
	}


	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}
	

}
