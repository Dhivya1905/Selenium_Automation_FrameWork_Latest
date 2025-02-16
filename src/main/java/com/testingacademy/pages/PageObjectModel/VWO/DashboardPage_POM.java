package com.testingacademy.pages.PageObjectModel.VWO;

import com.testingacademy.base.CommonToALLPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_POM extends CommonToALLPages {

    WebDriver driver;

    public DashboardPage_POM(WebDriver driver) {
        this.driver = driver;
    }
//Page Locator

    private By UsernameOnDashboard=By.cssSelector("span[data-qa=\"lufexuloga\"]");

    public String LoggedInUsername(){

       presenceOfElement(UsernameOnDashboard);
       return getElement(UsernameOnDashboard).getText();

    }
}
