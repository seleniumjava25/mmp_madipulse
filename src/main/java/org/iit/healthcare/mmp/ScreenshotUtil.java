package org.iit.healthcare.mmp;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	public String captureScreenshot(String screenshotName,WebDriver driver) throws Exception {
		// Implementation for capturing screenshot
		System.out.println("Screenshot captured: " +screenshotName);
		TakesScreenshot ts = (TakesScreenshot) driver;
		String scrFilePath = ts.getScreenshotAs(OutputType.FILE).getAbsolutePath();
		File srcFile = new File(scrFilePath);
		File destFile=new File(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName + ".png");
        FileUtils.copyFile(srcFile, destFile );
		return destFile.getAbsolutePath();
	 
		
	}

}
