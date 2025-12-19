package org.iit.healthcare.mmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class LoginPage {

	WebDriver driver;
	ExtentTest test;
	int i=0;
	private By usernameBy = By.name("username");
	private By passwordBy = By.name("password");
	private By submitBy = By.name("submit");

	public LoginPage(WebDriver driver,ExtentTest test) 
	{

		this.driver = driver;

	}


	public void login(String username,String password)
	{
		driver.findElement(usernameBy).sendKeys(username);
		driver.findElement(passwordBy).sendKeys(password);
		driver.findElement(submitBy).click();
		
	} 
	public void navigateToAModule(String moduleName) throws Exception {
		driver.findElement(By.xpath("//span[normalize-space()='"+moduleName+"']")).click();

		ScreenshotUtil screenshotUtil = new ScreenshotUtil();
		String screenshotPath = screenshotUtil.captureScreenshot("PatientLogin", driver);
		test.addScreenCaptureFromPath(screenshotPath, "Scheduling Appointment Screenshot");
	}

}
