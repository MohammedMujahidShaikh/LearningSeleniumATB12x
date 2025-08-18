package com.thetestingacadmey.ex01_selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium06_Navigation_NavigateTo {

    @Description("Open The URL")
    @Test

    public void test_selenium03() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        // Use navigation methods

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();


    }
}
