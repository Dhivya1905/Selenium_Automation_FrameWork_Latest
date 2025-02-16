package com.testingacademy.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.testingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToALLTest {

//  public static ExtentReports report;
//  public   static ExtentTest Test;
//  public   static ExtentReports extent= new ExtentReports();

    @BeforeMethod
    public void setUp(){

        DriverManager.init();
//        ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
//        extent.attachReporter(spark);
    }


    @AfterMethod
 public void tearDown(){

DriverManager.down();
    }

}


