package com.testingacademy.tests;

import com.testingacademy.base.CommonToALLTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.PageObjectModel.OrangeHR.Dashboard_page_POM_OHR;
import com.testingacademy.pages.PageObjectModel.OrangeHR.Login_PagePOM_OHR;
import com.testingacademy.utils.PropertyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

import static com.testingacademy.driver.DriverManager.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class TestOHR_LoginPOM extends CommonToALLTest {

    @Owner("Dhivya")
    @Description("Verify the Orange HRM website is able to login successfully")
    @Test
    public void testLoginOHR(){

        Login_PagePOM_OHR loginPagePOMOhr=new Login_PagePOM_OHR(DriverManager.getDriver());
        loginPagePOMOhr.LoginToOHR_Credentials(PropertyReader.readKey("ohr_username"),(PropertyReader.readKey("ohr_password")));

        Dashboard_page_POM_OHR dashboardPagePomOhr=new Dashboard_page_POM_OHR(DriverManager.getDriver());
        String PIM_On_Dashboard=dashboardPagePomOhr.PIM_On_Dashboard();

        assertThat(PIM_On_Dashboard).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(PIM_On_Dashboard,(PropertyReader.readKey("ohr_expected_username")));
    }

}
