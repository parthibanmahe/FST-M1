package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("Page title is: " + driver.getTitle());
		
		//enter username and password
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
			
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[4]/div/a/img")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='applyleave_txtLeaveType']")));
		String message = driver.findElement(By.xpath("//h1[contains(text(), 'Apply Leave')]")).getText();
		System.out.println("Header name is " + message);
		
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")).click();
		driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[2]")).click();

		
		
		WebElement fromDate = wait.until (ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='applyleave_txtFromDate']")));
		fromDate.clear();
		fromDate.sendKeys("2017-08-01");
		
		WebElement toDate = wait.until (ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='applyleave_txtToDate']")));
		toDate.clear();
		toDate.sendKeys("2025-08-17");
		
	
		driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		
		//my leave
		driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
		//check the status of the leave request
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='resultTable']/tbody/tr/td[6]/a")));
		String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[6]/a")).getText();
		
		System.out.println("Status of the leave request is: " + status);
		driver.quit();
		

	}

}
