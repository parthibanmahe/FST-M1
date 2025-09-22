package example;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstTest {
	//Declare the required objects

	AppiumDriver driver;
	//TestNG Explicit Wait
	WebDriverWait wait;

	//setup function
	@BeforeClass
	public void setUp() throws MalformedURLException, URISyntaxException {
		//Set the Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.noReset();
		options.setApp("C:/Users/SelvapathyKalaimanna/Downloads/Calculator.apk");
		//only for android
		/*
		 * options.setAppPackage("com.google.anroid.calculator");
		 * options.setAppActivity("com.android.calculator2.Calculator");
		 */
		//set the Appium server URL
		URL serverURL = new URI("http://localhost:4723").toURL();
		//initialize the Appium driver
		driver = new AppiumDriver(serverURL, options);
		
	}
	
	@AfterClass
	public void tearDown() {
		//close the app
		driver.quit();
	}
}
