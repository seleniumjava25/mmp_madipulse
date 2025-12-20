package org.iit.healthcare.mmp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class LoginPage {

    private WebDriver driver;
    private ExtentTest test;
    private WebDriverWait wait;

    private By usernameBy = By.name("username");
    private By passwordBy = By.name("password");
    private By submitBy  = By.name("submit");

    public LoginPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void login(String username, String password) {

        // Wait for username field
        WebElement usernameField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameBy));
        usernameField.clear();
        usernameField.sendKeys(username);

        // Wait for password field
        WebElement passwordField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordBy));
        passwordField.clear();
        passwordField.sendKeys(password);

        // Wait for submit button
        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(submitBy));
        submitButton.click();
    }

    public void navigateToAModule(String moduleName) throws Exception {

        By moduleBy = By.xpath("//span[normalize-space()='" + moduleName + "']");
        wait.until(ExpectedConditions.elementToBeClickable(moduleBy)).click();

        ScreenshotUtil screenshotUtil = new ScreenshotUtil();
        String screenshotPath = screenshotUtil.captureScreenshot("PatientLogin", driver);

        if (test != null) {
            test.addScreenCaptureFromPath(screenshotPath, 
                "Navigated to module: " + moduleName);
        }
    }
}
