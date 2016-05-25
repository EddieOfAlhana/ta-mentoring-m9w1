package com.epam.tamentoring;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

/**
 * @author Zoltan_Siegl.
 */
public class LoginStepDefs {
    final static Logger logger = Logger.getLogger(LoginStepDefs.class);

    WebDriver driver = new FirefoxDriver();

    @Given("I am on the sign in page")
    public void IAmOnTheSignInPage() throws Exception {
        logger.info("I am on the sign in page");
        driver.get("http://www.ironspeed.com/OMS");
        driver.findElement(By.id("ctl00__PageHeader__SignIn")).click();
        Assert.assertFalse(true);
    }
}
