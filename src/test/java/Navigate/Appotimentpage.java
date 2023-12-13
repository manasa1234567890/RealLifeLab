package Navigate;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Appotimentpage {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// wait for 2 seconds the page to Load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
         // Locate the login elements and perform login
        WebElement username = driver.findElement(By.name("username"));  // Update with the actual name attribute
        WebElement password = driver.findElement(By.name("password"));  // Update with the actual name attribute
        WebElement InpatientWard = driver.findElement(By.xpath("//li[@id='Inpatient Ward']"));
        WebElement Login = driver.findElement(By.xpath("//input[@class='btn confirm']"));
        		

        // Enter your credentials
        username.sendKeys("admin");
        password.sendKeys("Admin123");
        password.sendKeys(Keys.RETURN);
        
        InpatientWard.click();
        Login.click();
      
      

        // Navigate to Appointment Scheduling >> Manage Appointments
        WebElement appointmentMenu = driver.findElement(By.linkText("Appointment Scheduling"));
        appointmentMenu.click();

        WebElement manageAppointments = driver.findElement(By.linkText("Manage Appointments"));
        manageAppointments.click();

        // Search with "Je"
        WebElement searchInput = driver.findElement(By.id("searchInput"));  // Update with the actual id attribute
        searchInput.sendKeys("//*[@id=\"patient-search\"]");
        searchInput.sendKeys(Keys.RETURN);

        // Choose any patient
        WebElement patientLink = driver.findElement(By.partialLinkText("Je"));  // Update with appropriate link text
        patientLink.click();

        // Perform Patient Appointments (replace this with the actual actions you want to perform)
        // ...

        // Close the browser
        try {
            Thread.sleep(5000);  // Add a delay to observe the changes (you can adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
