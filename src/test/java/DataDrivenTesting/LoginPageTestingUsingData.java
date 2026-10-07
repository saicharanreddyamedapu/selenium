package DataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import POM_Utility.DemoPOMPage;

public class LoginPageTestingUsingData {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(LoginPageData.url);

        Thread.sleep(3000);

        DemoPOMPage demo = new DemoPOMPage(driver);

        demo.Register(
            LoginPageData.name,
            LoginPageData.email,
            LoginPageData.password
        );

        Thread.sleep(3000);

        driver.quit();
    }
}