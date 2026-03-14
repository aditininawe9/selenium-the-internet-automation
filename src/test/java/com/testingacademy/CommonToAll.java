package com.testingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {
    protected WebDriver driver;
    String baseUrl = "https://the-internet.herokuapp.com/";

    public void openPage(String url) {
        driver.get(baseUrl + url);
    }
    public String getResult() {
        String s = driver.findElement(By.id("result")).getText();
        return s;
    }
    public WebDriverWait webDriverWait(long waitInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitInSeconds));
    }
}
