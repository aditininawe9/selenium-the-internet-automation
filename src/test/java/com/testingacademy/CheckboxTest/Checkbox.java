package com.testingacademy.CheckboxTest;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkbox {
    @Test
    @Description("Verify Checkboxes")
    public void verifyCheckboxes() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        if(!checkbox1.isSelected()) {
            checkbox1.click();
        }
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox1.isSelected(),"Checkbox 1 is selected");
        Assert.assertTrue(checkbox2.isSelected(),"Checkbox 2 is selected");
    }
}
