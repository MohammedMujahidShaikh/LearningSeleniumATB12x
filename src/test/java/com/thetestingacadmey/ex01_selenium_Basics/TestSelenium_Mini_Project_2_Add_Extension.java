package com.thetestingacadmey.ex01_selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_Mini_Project_2_Add_Extension {

    @Description ("Option Class")
    @Test
    public void test_Selenim01() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");

        chromeOptions.addExtensions((new File("src/test/java/com/thetestingacadmey/ex01_selenium_Basics/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx")));



     WebDriver driver = new ChromeDriver(chromeOptions);
     driver.get("https://www.youtube.com/watch?v=Az36V2ycdCU");


    }

}
