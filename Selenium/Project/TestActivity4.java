package Project;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("http://alchemy.hguy.co/orangehrm");
		System.out.println("Page title is: " + driver.getTitle());
		
		//enter username and password
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement menuLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewPimModule']")));
		menuLink.click();
		
		//click on the PIM tab
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
				
		//click on the Add Employee button
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		//enter first name, last name and employee id
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Selvapathy");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kalaimannan");
		
		//save the employee details
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		//find the employee list have updated the new employee
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id ='empsearch_employee_name_empName']")).sendKeys("Selvapathy");
		
		//WebElement Empage = wait.until(ExpectedConditions.visibilityOfElementLocated
				//(By.xpath("//input[contains(@value, 'Selvapathy')]")));
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
	
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@id, 'resultTable')]/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        // Print the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id, 'resultTable')]/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
     
        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@id, 'resultTable')]/tbody/tr[1]/td[3]"));
        System.out.println("Employee Firstname retrieved is : " + cellValue.getText());
        
		driver.quit();
		
	}

}
