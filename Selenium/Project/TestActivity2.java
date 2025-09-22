package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity2 {
	public static void main(String[] args) {
		//webdriver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("Page title is : " + driver.getTitle());
		//verifying the header text image
		WebElement header = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
				
		//printing the header text
		System.out.println("Header image is: " + header.getAttribute("src"));
		
		driver.quit();
	}
		
}
