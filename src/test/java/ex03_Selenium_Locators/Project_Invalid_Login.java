package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_Invalid_Login {

     @Test

    public void Project_Invalid_Login() {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        WebElement email_input_box= driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("mohammedshaikh2109@gmail.com");
        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("Shaikh@2109");
        WebElement signup_button = driver.findElement(By.id("js-login-btn"));
        signup_button.click();
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
         System.out.println(error_message.getText());
         Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}



