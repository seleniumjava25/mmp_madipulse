package org.iit.healthcare.mmp;

import java.util.HashMap;
import java.util.Map;

import org.iit.healthcare.util.FutureDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScheduleAppointmentPage {

	WebDriver driver;
	public ScheduleAppointmentPage(WebDriver driver) 
	{

		this.driver = driver;

	}
	public Map<String, String> bookAppointment() {
	
		//code to book appointment
		
		driver.findElement(By.xpath("//span[normalize-space()='Schedule Appointment']")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		
		driver.
		findElement(By.
				xpath("//h4[contains(text(),'Smith')]/following::p[text()='Description:Orthopedic']/following::button[1]")).click();
		
		 driver.switchTo().frame("myframe");
		 
		 Map<String,String> expectedHMap = new HashMap<String,String>();
		 expectedHMap.put("doctor", "Smith");
		 
		 driver.findElement(By.id("datepicker")).click();
		 String expectedDate = FutureDate.getFutureDate(30, "MMMMM/d/yyyy");
		 String expectedDateArr[] = expectedDate.split("/");
		 String expectedMonth = expectedDateArr[0];
		 String expectedDay = expectedDateArr[1];
		 String expectedYear = expectedDateArr[2];
		 
		 String actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		 String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		 System.out.println(""+ "Expected Month: " + expectedMonth + ", Actual Month: " + actualMonth);
		 System.out.println(""+ "Expected Year: " + expectedYear + ", Actual Year: " + actualYear);
		 //navigating to correct year
		 while(!(expectedYear.equals(actualYear)))
		 {
			 
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			 
		 }
		 //navigating to correct month
		 while(!(expectedMonth.equals(actualMonth)))
		 {
			 
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			 
		 }
		 //selecting the day
		 driver.findElement(By.linkText(expectedDay)).click();
		 //getDomProperty used to get the value attribute
		 expectedHMap.put("date",  driver.findElement(By.id("datepicker")).getDomProperty("value"));
		 Select timeSelect = new Select(driver.findElement(By.id("time")));
		 timeSelect.selectByVisibleText("10Am");
		 expectedHMap.put("time",timeSelect.getFirstSelectedOption().getText());
		 driver.findElement(By.id("ChangeHeatName")).click();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("sym")).sendKeys("Feeling pain in the knee");
		 //getDomProperty used to get the value attribute
		 expectedHMap.put("sym",driver.findElement(By.id("sym")).getDomProperty("value"));
		 
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
		 return expectedHMap;
	}
}
