package com.testingacademy.tests.PageFactoryTestCase;

import com.testingacademy.Listerner.RetryAnalyzer;
import com.testingacademy.Listerner.RetryListerner;
import com.testingacademy.base.CommonToALLTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.PageFactory.LoginPage_PF;
import com.testingacademy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(retryAnalyzer= RetryAnalyzer.class)
public class TestVWOLogin_PF extends CommonToALLTest {


    private static final Logger logger= LogManager.getLogger("TestVWOLogin_PF.class");

@Test
    public void testLoginNegative() {
 logger.info("Starting the Testcases page Factory");


    WebDriver driver = DriverManager.getDriver();
    driver.get(PropertyReader.readKey("url"));
        LoginPage_PF loginPagePf=new LoginPage_PF(driver);
String ErrorMessage= loginPagePf.loginVWOInvalidCredent();
        Assert.assertEquals(ErrorMessage,PropertyReader.readKey("error_message"));

        logger.info("End of the Testcase!!");

}
}
