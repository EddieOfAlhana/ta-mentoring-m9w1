package com.epam.tamentoring;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.epam.tamentoring.pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Zoltan_Siegl.
 */
public class LoginStepDefs {
    final static Logger logger = Logger.getLogger(LoginStepDefs.class);
    final private LoginPage loginPage = new LoginPage();



    @Given("I am on the sign in page")
    public void IAmOnTheSignInPage() throws Exception {
        logger.info("I am on the sign in page");
        loginPage.openSiginPage();
    }


    @Given("I am not signed in")
    public void IAmNotSignedIn() throws Exception {
        logger.info("I am not signed in");
        WebDriver driver = WebDriverFactory.getWebDriver();
        final String signInMessage = driver.findElement(By.id("ctl00__PageHeader__UserStatusLbl")).getText();
        Assert.assertEquals(signInMessage, "You are not signed-in.");
    }

    @When("^I enter (.*) credentials$")
    public void iEnterIncorrectCredentials(String correct) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver = WebDriverFactory.getWebDriver();
        driver.findElement(By.id("ctl00_PageContent_UserName")).sendKeys("incorrectUser");
        driver.findElement(By.id("ctl00_PageContent_Password")).sendKeys("incorrectPassword");

        if (correct.equals("correct")) {
            Assert.assertTrue(false);
        }

    }

    @And("^I try to sign in$")
    public void iTryToSignIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver = WebDriverFactory.getWebDriver();
        driver.findElement(By.id("ctl00_PageContent_OKButton__Button")).click();
    }

    @Then("^Invalid login message is displayed$")
    public void invalidLoginMessageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver = WebDriverFactory.getWebDriver();
        final String loginMessage = driver.findElement(By.id("ctl00_PageContent_LoginMessage")).getText();
        Assert.assertEquals(loginMessage, "Invalid login information. Please enter a valid user name and password.");
    }

    @When("^I enter (.+) as username$")
    public void iEnterUsernameAsUsername(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
