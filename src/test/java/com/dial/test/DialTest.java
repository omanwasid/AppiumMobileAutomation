package com.dial.test;

import com.sun.jdi.IntegerValue;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DialTest extends BaseDialTest {

    @Test
    public void verifyCallShouldSucceed(){

        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"4\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"2\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"2\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"2\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"6\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"7\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"0\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.samsung.android.dialer:id/dialpad_key_number\" and @text=\"7\"]")).click();

        driver.findElement(By.id("com.samsung.android.dialer:id/dialButtonImage")).click();
        //Assert.assertEquals(Integer.valueOf(driver.findElement(By.id("com.samsung.android.dialer:id/dialpad_spacer_view")).getText()), 42226707);
        //Assert.assertEquals(driver.findElement(By.id("com.samsung.android.dialer:id/dialpad_spacer_view")).getText(),"42226707");


    }
}
