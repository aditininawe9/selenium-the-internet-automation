package com.testingacademy.Alerts;

import com.testingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts extends CommonToAll {
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        openPage("javascript_alerts");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
    @Test
    @Description("Automate Javascript alerts")
    public void testAlerts() {
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(getResult(), "You successfully clicked an alert");
    }

    @Test
    @Description("Automate Confirm Alert")
    public void testConfirmAlert() {
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Assert.assertEquals(getResult(), "You clicked: Cancel");
    }

    @Test
    @Description("Automate JS Prompt")
    public void  testJSPrompt() {
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Aditi");
        alert3.accept();
        Assert.assertEquals(getResult(), "You entered: Aditi");
    }
}

