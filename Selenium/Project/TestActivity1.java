package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {

	public static void main(String[] args) {
		
		// Webdriver
		WebDriver driver = new FirefoxDriver();
		// Setting the path of the geckodriver executable
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("Page title is: " + driver.getTitle());
		
		//verifying the page title 
		String PageTitle = "OrangeHRM";
		if (PageTitle.equals("OrangeHRM")) {
			System.out.println("Page title is correct");
		} else {
			System.out.println("Page title is incorrect");
		}
		// closing the browser
		driver.quit();
	}

}
