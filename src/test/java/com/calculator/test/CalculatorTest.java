package com.calculator.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void addShouldSucceed() {
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("plus")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(Integer.valueOf(driver.findElement(By.id("formula")).getText()), 37);

    }

    @Test
    public void minusShouldSucceed() {

        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("minus")).click();
        driver.findElement(By.id("btn_3")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(Integer.valueOf(driver.findElement(By.id("formula")).getText()), 12);

    }
    @Test
    public void multiplyShouldSucceed() {

        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_6")).click();
        driver.findElement(By.id("multi")).click();
        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(Integer.valueOf(driver.findElement(By.id("formula")).getText()), 64);

    }
    @Test
    public void divisionShouldSucceed() {

        driver.findElement(By.id("btn_2")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("divi")).click();
        driver.findElement(By.id("btn_5")).click();
        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(Integer.valueOf(driver.findElement(By.id("formula")).getText()), 5);

    }
}