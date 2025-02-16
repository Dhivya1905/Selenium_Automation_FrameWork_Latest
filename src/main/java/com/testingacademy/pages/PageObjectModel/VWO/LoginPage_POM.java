package com.testingacademy.pages.PageObjectModel.VWO;

import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage_POM  {

    WebDriver driver;

    public LoginPage_POM(WebDriver driver) {
        this.driver=driver;
    }

    //Page Locator
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    public String VMOLoginInvalidCredentials(String user, String pwd) {
        driver.get(PropertyReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
//try{
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }


        String ErrorMessageText=driver.findElement(error_message).getText();
 return ErrorMessageText;
    }

    public void VMOLoginValidCredentials(String user, String pwd) {
        driver.get(PropertyReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

    }
}