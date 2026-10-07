package POM_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPOMPage {
	
	//declare
	@FindBy(xpath = "//h1[text()='Register']")
	private WebElement Header;
	
	@FindBy(id = "name")
	private WebElement NameTF;
	
	@FindBy(name = "email")
	private WebElement EmailTF;
	
	@FindBy(id = "password")
	private WebElement PasswordTF;
	
	@FindBy(xpath = "//button[text()= 'Register']")
	private WebElement RegisterBTN;

	//intialize

	public DemoPOMPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	//utilize


//	public WebElement getHeader() {
//		return Header;
//	}
//
//	public WebElement getNameTF() {
//		return NameTF;
//	}
//
//	public WebElement getEmailTF() {
//		return EmailTF;
//	}
//
//	public WebElement getPasswordTF() {
//		return PasswordTF;
//	}
//
//	public WebElement getRegisterBTN() {
//		return RegisterBTN;
//	}
	
	public String getHeader() {
		return Header.getText();
	}
	
	
	
	public void getNameTF(String name) {
		 NameTF.sendKeys(name);
	}

	public void getEmailTF(String email ) {
		 EmailTF.sendKeys(email);
	}

	public void getPasswordTF(String password) {
		 PasswordTF.sendKeys(password);
	}

	public void getRegisterBTN() {
		 RegisterBTN.click();
	}
	
	//bussiness logic 
	
	public void Register(String name, String email, String password) {
		
		NameTF.sendKeys(name);
		EmailTF.sendKeys(email);
		 PasswordTF.sendKeys(password);
		 RegisterBTN.click();

}	
}
