package com.testingacademy.pages.PageObjectModel.OrangeHR;

import com.testingacademy.base.CommonToALLPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard_page_POM_OHR extends CommonToALLPages {

    WebDriver driver;

    public Dashboard_page_POM_OHR(WebDriver driver) {
        this.driver = driver;
    }

    //page Locator

    By PIMonDashboard= By.xpath("//span[normalize-space()='PIM']");

    //page Actions


    public String PIM_On_Dashboard(){

        presenceOfElement(PIMonDashboard);
        return getElement(PIMonDashboard).getText();



    }
}
