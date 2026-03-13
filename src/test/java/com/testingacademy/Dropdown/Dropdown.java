package com.testingacademy.Dropdown;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    @Description("Automate dropdown")
    public void automateDropdown() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        String selected = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected, "Option 1");
        select.selectByVisibleText("Option 2");
        String selected2 = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selected2, "Option 2");
    }
}
