package com.app.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class OpenMRSNew {
	
	@FindBy(xpath="//*[@id=\"Ambulante\"]")
	WebElement InpatientWard;
	
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement confirm ;
	
	@FindBy(xpath="//a[contains(@href, 'appointmentschedulingui')]")
	WebElement appointment;
	
	@FindBy(xpath="//a[@id='appointmentschedulingui-manageAppointments-app']")
	WebElement manage;
	
	@FindBy(xpath="//input[@id='patient-search']")
	WebElement search;
	
	
	public OpenMRSNew(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddingNewService(String name, String time) throws InterruptedException {
		
		InpatientWard.click();
		confirm.click();
		appointment.click();
		manage.click();
		Thread.sleep(2000);
		
		String expected = "Manage Service Types";
		WebElement verify = null;
		String actual = verify.getText();
		Assert.assertEquals(expected, actual);

		SoftAssert sf = new SoftAssert();
		boolean Added = verify.isDisplayed();
		sf.assertTrue(Added);
		sf.assertAll();
	}
}

