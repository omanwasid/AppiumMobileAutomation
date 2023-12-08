package com.calculator.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    @BeforeClass
    public  void setup() throws MalformedURLException {
        try {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("udid","R58M422VZXL");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.bng.calculator");
        capabilities.setCapability("appActivity","com.bng.calc.MainActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:automationName","UiAutomator2");

             driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }

    @AfterClass
    public  void tearDown(){
        driver.quit();

    }
}
