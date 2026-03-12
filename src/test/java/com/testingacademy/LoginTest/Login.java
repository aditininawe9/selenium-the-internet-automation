package com.testingacademy.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {
    @Test
    public void testLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("SuperSecretPassword");

        WebElement submit = driver.findElement(By.cssSelector(".radius"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.urlContains("secure"));
        Assert.assertTrue(driver.getCurrentUrl().contains("secure"), "Login Unsuccessful");
    }
}
