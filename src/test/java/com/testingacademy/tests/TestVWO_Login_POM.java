package com.testingacademy.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.testingacademy.base.CommonToALLTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.PageObjectModel.VWO.DashboardPage_POM;
import com.testingacademy.pages.PageObjectModel.VWO.LoginPage_POM;
import com.testingacademy.utils.PropertyReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWO_Login_POM extends CommonToALLTest {






    @Owner("Dhivya")
    @Description("Verify invalid credentials shows error message correctly")

    @Test

    public void LoginVWO_NegativeTestcase() {
// Test= extent.createTest("Verify the Error Message of Login Page",
//         "This Test Validates the error messaage is showing correctly for invalid users ");
        LoginPage_POM loginPagePom=new LoginPage_POM(DriverManager.getDriver());
        String Error_Msg=loginPagePom.VMOLoginInvalidCredentials(PropertyReader.readKey("invalid_username"),PropertyReader.readKey("invalid_password"));

        assertThat(Error_Msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(Error_Msg, PropertyReader.readKey("error_message"));
//        extent.flush();

    }

    @Owner("Dhivya")
    @Description("Verify valid credentials login into page and able to see Username correctly")
    @Test
    public void LoginVWO_PositiveTestcase() {

        LoginPage_POM loginPagePom=new LoginPage_POM(DriverManager.getDriver());
        loginPagePom.VMOLoginValidCredentials(PropertyReader.readKey("username"),PropertyReader.readKey("password"));


        DashboardPage_POM dashboardPagePom=new DashboardPage_POM(DriverManager.getDriver());
        String loginUser=  dashboardPagePom.LoggedInUsername();

        assertThat(loginUser).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loginUser, PropertyReader.readKey("expected_username"));

    }
}


