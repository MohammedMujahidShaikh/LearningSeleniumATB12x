package com.thetestingacadmey.ex01_selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium05_Assertion_TestNg {

    @Description
    @Test

    public void test_selenium01(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //TESTNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");

        //Assert Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotEmpty().isEqualTo("https://google.com");

        driver.quit();

    }

}
