package Navigate;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.cucumber.java.Scenario;

public class OpenMRSTest {
	
	   private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	    	

	     // Set up WebDriver and open the browser
	       //  System.setProperty("webdriver.chrome.driver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.openmrs.org/openmrs/login.htm");
	    }

	    @Test
	    public void performAppointment() throws InterruptedException {
	    	  WebElement username = driver.findElement(By.name("username"));  // Update with the actual name attribute
	          WebElement password = driver.findElement(By.name("password"));  // Update with the actual name attribute
	          WebElement InpatientWard = driver.findElement(By.xpath("//*[@id=\"Ambulante\"]"));
	          WebElement Login = driver.findElement(By.xpath("//input[@class='btn confirm']"));
	          		 // Enter your credentials
	          username.sendKeys("admin");
	          password.sendKeys("Admin123");
	          password.sendKeys(Keys.RETURN);
	          Thread.sleep(2000);
	          
	          InpatientWard.click();
	          Login.click();

	        // Adding a small delay for the page to load (not the best practice)

	        // Navigate to 'Appointment Scheduling' -> 'Manage Appointments'
	       driver.findElement(By.xpath("//a[contains(@href, 'appointmentschedulingui')]")).click();


			driver.findElement(By.xpath("//a[@id='appointmentschedulingui-manageAppointments-app']")).click();
			Thread.sleep(1500);
		
	        // Search for the patient
	        driver.findElement(By.xpath("//input[@id='patient-search']")).sendKeys("100EDN");
	    	Thread.sleep(1500);
	    	}

	     @AfterTest
	    public void tearDown() {
	        // Close the browser after test execution
	        driver.close();
	     }
}