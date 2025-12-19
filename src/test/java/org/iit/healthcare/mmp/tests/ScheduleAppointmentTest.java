package org.iit.healthcare.mmp.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleAppointmentTest {


	@Test(description="Schedule Appointment")
	public void testScheduleAppointment() {
		WebDriver driver;
		String url = "http://85.209.95.122/MMP-Release2-Integrated-Build.6.8.000/portal/login.php";
		String username = "iitworkforce";
		String password = "IITWorkforce1!";
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Schedule Appointment']")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		
		driver.
		findElement(By.xpath("//h4[contains(text(),'Smith')]/following::p[text()='Description:Orthopedic']/following::button[1]")).click();
		
		 driver.switchTo().frame("myframe");
		 
		 driver.findElement(By.id("datepicker")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 
		 driver.findElement(By.linkText("25")).click();
		 
		 Select timeSelect = new Select(driver.findElement(By.id("time")));
		 timeSelect.selectByVisibleText("10Am");
		 
		 
		 driver.findElement(By.id("ChangeHeatName")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.id("sym")).sendKeys("Feeling pain in the knee");
		 
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
	}
}
