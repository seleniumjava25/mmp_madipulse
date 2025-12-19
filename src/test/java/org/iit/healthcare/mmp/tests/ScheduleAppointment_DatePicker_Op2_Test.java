package org.iit.healthcare.mmp.tests;

import java.time.Duration;
import java.util.Calendar;

import org.iit.healthcare.util.FutureDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScheduleAppointment_DatePicker_Op2_Test {


	@Test
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
		findElement(By.
				xpath("//h4[contains(text(),'Smith')]/following::p[text()='Description:Orthopedic']/following::button[1]")).click();
		
		 driver.switchTo().frame("myframe");
		 
		 driver.findElement(By.id("datepicker")).click();
		 
		 Calendar cal = Calendar.getInstance();
		 String expectedDate = FutureDate.getFutureDate(0, "MMMMM/d/yyyy");
		 String expectedDateArr[] = expectedDate.split("/");
		 String expectedMonth = expectedDateArr[0];
		 String expectedDay = expectedDateArr[1];
		 String expectedYear = expectedDateArr[2];
		 
		 String actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		 String actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		 
		 System.out.println(""+ "Expected Month: " + expectedMonth + ", Actual Month: " + actualMonth);
		 System.out.println(""+ "Expected Year: " + expectedYear + ", Actual Year: " + actualYear);
		 
		 while(((!(expectedYear.equals(actualYear))||(!(expectedMonth.equals(actualMonth))))))
		 {
			 
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 actualYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			 actualMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			 
		 }
	 
		 
		 driver.findElement(By.linkText(expectedDay)).click();
		 
		 
//		 driver.findElement(By.xpath("//span[text()='Next']")).click();
//		 
//		 driver.findElement(By.linkText("25")).click();
//		 
//		 Select timeSelect = new Select(driver.findElement(By.id("time")));
//		 timeSelect.selectByVisibleText("10Am");
//		 
//		 
//		 driver.findElement(By.id("ChangeHeatName")).click();
//		 
//		 driver.switchTo().defaultContent();
//		 
//		 driver.findElement(By.id("sym")).sendKeys("Feeling pain in the knee");
//		 
//		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
//		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
	}
}