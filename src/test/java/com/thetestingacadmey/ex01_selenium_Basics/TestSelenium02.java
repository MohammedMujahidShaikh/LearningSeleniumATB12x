package com.thetestingacadmey.ex01_selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description
    @Test
    public void test_selenium02() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
