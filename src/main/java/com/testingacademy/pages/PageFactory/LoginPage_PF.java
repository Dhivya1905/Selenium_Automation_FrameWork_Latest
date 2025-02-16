package com.testingacademy.pages.PageFactory;

import com.testingacademy.base.CommonToALLPages;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToALLPages {

    public LoginPage_PF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //page locators

    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signinbutton;

    @FindBy(id = "js-notification-box-msg")
    private WebElement errorMessage;

    //pageActions

    public String loginVWOInvalidCredent() {
        EnterInput(username, PropertyReader.readKey("invalid_username"));
        EnterInput(password, PropertyReader.readKey("invalid_password"));
        ClickElement(signinbutton);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return errorMessage.getText();
    }

}

