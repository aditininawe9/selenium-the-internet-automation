package com.testingacademy.DynamicLoadTest;

import com.testingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicLoad extends CommonToAll {
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        openPage("dynamic_loading");
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
    @Test
    @Description("Automate dynamic hidden load")
    public void automateDynamicHiddenLoad() {
        driver.findElement(By.xpath("//div[@class='example']/a[1]")).click();
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        WebElement helloText = webDriverWait(10).until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assert.assertEquals(helloText.getText(), "Hello World!");
    }

    @Test
    @Description("Automate dynamic fact load")
    public void automateDynamicFactLoad() {
        driver.findElement(By.xpath("//div[@class='example']/a[2]")).click();
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        WebElement helloText = webDriverWait(10).until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assert.assertEquals(helloText.getText(), "Hello World!");
    }
}
