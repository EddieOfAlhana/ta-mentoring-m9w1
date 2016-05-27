package com.epam.tamentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.epam.tamentoring.WebDriverFactory;

/**
 * @author Zoltan_Siegl.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        WebDriver driver = WebDriverFactory.getWebDriver();
    }

    public LoginPage openSiginPage() {
        driver.get("http://www.ironspeed.com/OMS");
        driver.findElement(By.id("ctl00__PageHeader__SignIn")).click();

        return this;
    }
}
