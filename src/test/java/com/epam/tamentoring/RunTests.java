package com.epam.tamentoring;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Zoltan_Siegl.
 */
@CucumberOptions(plugin = {"html:target/site/cucumber-report", "json:target/cucumber-report/cucumber.json"})
public class RunTests extends AbstractTestNGCucumberTests {
    private static Logger logger = Logger.getLogger(RunTests.class);

    @Before
    public void logBefore(Scenario scenario) {
        logger.info(scenario.getName());
    }

    @After
    public void logAfter(Scenario scenario) {
        if (scenario.isFailed()) {
            final WebDriver webDriver = WebDriverFactory.getWebDriver();
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }



    @AfterClass
    public void after() {
        WebDriver driver = WebDriverFactory.getWebDriver();
        driver.close();
    }
}