package com.testingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
