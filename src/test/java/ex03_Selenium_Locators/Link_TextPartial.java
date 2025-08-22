package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_TextPartial {

    @Description ("Verfiy VWO")
    @Test
    public void test_login_vwo (){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");
//        WebElement a_Tag_free_trail_full_Match = driver.findElement(By.linkText("Start a free trial"));
//        a_Tag_free_trail_full_Match.click();

        WebElement a_tag_free_trail_Partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_free_trail_Partial_match.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();



    }
}
