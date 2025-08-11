import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("confirm")).click();

        // Switch focus to the alert
        Alert confirmAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
        confirmAlert.accept();

        System.out.println(driver.findElement(By.id("result")).getText());

        driver.quit();
    }
}
