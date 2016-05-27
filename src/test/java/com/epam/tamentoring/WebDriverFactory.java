package com.epam.tamentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Zoltan_Siegl.
 */
public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
