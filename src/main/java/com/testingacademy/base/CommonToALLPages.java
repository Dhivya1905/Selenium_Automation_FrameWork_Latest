package com.testingacademy.base;

import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.testingacademy.driver.DriverManager.getDriver;

public class CommonToALLPages {


    public void ClickElement(By by ){
        getDriver().findElement(by).click();

    }

    public void ClickElement(WebElement by){
        by.click();
    }

    public void EnterInput(By by,String key){
        getDriver().findElement(by).sendKeys(key);

    }

    public void EnterInput(WebElement by,String key){
        by.sendKeys(key);

    }

    public void getText(By by){
        getDriver().findElement(by).getText();
    }

    public WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By ElementLocation){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(ElementLocation));
    }

    public WebElement getElement(By key){

        return getDriver().findElement(key);
    }
}
