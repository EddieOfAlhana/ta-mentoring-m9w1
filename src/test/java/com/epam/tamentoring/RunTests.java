package com.epam.tamentoring;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Zoltan_Siegl.
 */
@CucumberOptions(plugin = {"html:target/site/cucumber-report", "json:target/cucumber-report/cucumber.json"})
public class RunTests extends AbstractTestNGCucumberTests {
    @Before
    public void logBefore(Scenario scenario) {
    }

}