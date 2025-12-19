package org.iit.healthcare.mmp.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScheduleAppointment_findElements {


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
		
		List<WebElement> doctorList = driver.findElements(By.xpath("//h4"));
		System.out.println("Size of the doctor list: " + doctorList.size());
		System.out.println("Value stored in the index 0: " + doctorList.get(0).getText());
		for(int i=0;i<doctorList.size();i++) 
		{
			System.out.println("Doctor " + doctorList.get(i).getText());
		}
		
		
		 
		 
		
		
		
		
		
		
		
	}
}