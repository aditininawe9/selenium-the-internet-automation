package UploadTest;

import com.testingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Upload extends CommonToAll {
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        openPage("upload");
    }
    @Test
    @Description("Automate upload test")
    public void automateUploadTest() {
        driver.findElement(By.id("file-upload")).sendKeys("/Users/mayanksoni/Downloads/beautyGirl.png");
        driver.findElement(By.id("file-submit")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("upload"));
    }
}
