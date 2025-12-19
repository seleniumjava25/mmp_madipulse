package org.iit.healthcare.mmp;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[4]")
	private WebElement doctorWE;
	
	public HomePage(WebDriver driver) 
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void navigateToAModule(String moduleName) {
		driver.findElement(By.xpath("//span[normalize-space()='"+moduleName+"']")).click();
	}
	public Map<String, String> fetchPatientPortalTable() {
		//code to fetch patient portal table
		 
		 Map<String,String> actualHMap = new HashMap<String,String>();
		 actualHMap.put("doctor", doctorWE.getText());
		 actualHMap.put("time",  driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]")).getText());
		 actualHMap.put("date", driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[1]")).getText());
		 actualHMap.put("sym", driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[3]")).getText());
		 System.out.println("Actual HashMap: " + actualHMap);
		 return   actualHMap;
		 
	}

}
