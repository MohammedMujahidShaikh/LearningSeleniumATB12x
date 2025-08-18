package com.thetestingacadmey.ex01_selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium04_Maximize_Minimize {

    @Test
    public void test_1(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.manage().window().minimize();
        driver.manage().window().maximize();


        driver.quit();


    }

}
