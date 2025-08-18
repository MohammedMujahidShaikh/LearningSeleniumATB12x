package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium01_Project_Locators_Selenium_ID_ClassName_Name {

    @Description
    @Owner("Mohammed")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void test_VWO_login_Invalid_Login() {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement email_input_box= driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("mohammedshaikh2109@gmail.com");
        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("Shaikh@2109");
        WebElement signup_button = driver.findElement(By.id("js-login-btn"));
        signup_button.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
