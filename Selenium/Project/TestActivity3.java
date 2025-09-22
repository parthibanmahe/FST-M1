package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("Page title is: " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//find the username and password fields
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//wait condition to ensure the new page is loaded
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='MP_link']")));
		
		//print the new webpage title
		System.out.println("New Page title: " + driver.getTitle());
		driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click();
	
		driver.quit();
	}

}
