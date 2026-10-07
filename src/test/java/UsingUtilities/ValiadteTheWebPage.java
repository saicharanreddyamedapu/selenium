package UsingUtilities;

import GenericUtilities.WebDriverUtility;

public class ValiadteTheWebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriverUtility wutil = new WebDriverUtility();
		// launch the webpage
		wutil.launchTheBrowser();

		// maximize the window
		wutil.maximizeThewindow();

		// navigate to an app
		wutil.navigateTheWebpage("https://www.myntra.com/");

		// validate the webpage
		String actTitle = wutil.fetchPageTitle();
		String expTitle = "Men";
		if (actTitle.contains(expTitle))
			System.out.println("Test pass");
		else {
			System.out.println("test fail");
		}
		Thread.sleep(2000);
		// close the browser
		wutil.quit();

	}

}
