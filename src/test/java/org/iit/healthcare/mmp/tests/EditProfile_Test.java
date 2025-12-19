package org.iit.healthcare.mmp.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditProfile_Test {
	
	public void testEditProfile() {
		
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
		driver.findElement(By.xpath("//span[normalize-space()='Profile']")).click();
	
		
	}	

}
