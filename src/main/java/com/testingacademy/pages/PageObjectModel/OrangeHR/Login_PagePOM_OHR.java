package com.testingacademy.pages.PageObjectModel.OrangeHR;

import com.testingacademy.base.CommonToALLPages;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_PagePOM_OHR extends CommonToALLPages {

    WebDriver driver;


    public Login_PagePOM_OHR(WebDriver driver)  {
        this.driver = driver;
    }

    private By Username=By.cssSelector("input[name='username']");
    private By Password=By.cssSelector("input[name='password']");
    private By submit_btn=By.xpath("//button[normalize-space() ='Login']");

    public void LoginToOHR_Credentials(String user,String pwd){
        driver.get(PropertyReader.readKey("orange_hr_url"));
        visibilityOfElement(Username);
       EnterInput(Username,user);
        EnterInput(Password,pwd);
ClickElement(submit_btn);

try{
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

//WebDriver wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOfElementLocated())
   }
}



