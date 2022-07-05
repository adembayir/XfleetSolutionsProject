package com.xfleet.step_defs;

import com.xfleet.pages.*;
import com.xfleet.utilities.BrowserUtils;
import com.xfleet.utilities.ConfigurationReader;
import com.xfleet.utilities.Driver;
import com.xfleet.utilities.ExcelRead;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefs {
    //BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    DashboardPage dashboardPage = new DashboardPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I enter valid username {string}")
    public void iEnterValidUsername(String username) {
        loginPage.usernameInputBox.sendKeys(username);
    }

    @And("I enter valid password {string}")
    public void iEnterValidPassword(String password) {
        loginPage.passwordInputBox.sendKeys(password);
    }

    @When("I click log in button")
    public void i_click_log_in_button() {
        loginPage.loginButton.click();
    }

    @Then("I should land on the Quick Launchpad page.")
    public void i_should_land_on_the_quick_launchpad_page() {
        //wait.until(ExpectedConditions.visibilityOf(quickLaunchpadPage.quickLaunchpadHeader));

        String expectedHeader = "Quick Launchpad";
        String actualHeader = quickLaunchpadPage.quickLaunchpadHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("I should land on the Dashboard page.")
    public void iShouldLandOnTheDashboardPage() {
        //wait.until(ExpectedConditions.visibilityOf(dashboardPage.dashboardHeader));
        String expectedHeader = "Dashboard";
        String actualHeader = dashboardPage.dashboardHeader.getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @When("I enter invalid username {string}")
    public void iEnterInvalidUsername(String invalidUsername) {
        loginPage.usernameInputBox.sendKeys(invalidUsername);
    }

    @And("I enter invalid password {string}")
    public void iEnterInvalidPassword(String invalidPassword) {
        loginPage.passwordInputBox.sendKeys(invalidPassword);
    }

    @Then("{string} message should be displayed.")
    public void messageShouldBeDisplayed(String errorMessage) {
        String actualMessage = loginPage.invalidUserPassMsg.getText();

        Assert.assertEquals(errorMessage, actualMessage);
    }

    @Then("I should see required field error message for empty password")
    public void iShouldSeeRequiredFieldErrorMessageForEmptyPassword() {
        boolean emptyRequiredField = Boolean.parseBoolean(loginPage.passwordInputBox.getAttribute("required"));

        Assert.assertTrue(emptyRequiredField);


    }

    @Then("I should see required field error message for empty username")
    public void iShouldSeeRequiredFieldErrorMessageForEmptyUsername() {
        boolean emptyRequiredField = Boolean.parseBoolean(loginPage.usernameInputBox.getAttribute("required"));

        Assert.assertTrue(emptyRequiredField);
    }

    @When("I click Forgot your password? link.")
    public void iClickForgotYourPasswordLink() {
        loginPage.forgotYourPasswordLink.click();
    }


    @Then("I should land on the Forgot Password page")
    public void iShouldLandOnTheForgotPasswordPage() {
        String expectedPageHeader = "Forgot Password";
        String actualPageHeader = forgotPasswordPage.forgotPasswordHeader.getText();

        Assert.assertEquals(expectedPageHeader, actualPageHeader);

    }


    @Then("I can see Remember Me link exists and is clickable")
    public void iCanSeeRememberMeLinkExistsAndIsClickable() {
        loginPage.rememberMeText.click();
        Assert.assertTrue(loginPage.rememberMeCheckbox.isSelected());
        Assert.assertTrue(loginPage.rememberMeText.isDisplayed());
    }

    @Then("I can see password is in bullet sign")
    public void iCanSeePasswordIsInBulletSign() {
        String passwordInputBoxAttribute = loginPage.passwordInputBox.getAttribute("type");
        Assert.assertEquals("password", passwordInputBoxAttribute);
    }

    @When("I enter valid username {string}, press Enter, enter valid password {string}, press Enter")
    public void iEnterValidUsernamePressEnterEnterValidPasswordPressEnter(String username, String password) {
        loginPage.usernameInputBox.sendKeys(username + Keys.ENTER + password + Keys.ENTER);
    }

    @Then("I should see my username {string} on the upper right corner of the page.")
    public void iShouldSeeMyUsernameOnTheUpperRightCornerOfThePage(String username) {
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.userOptions));
        Assert.assertEquals(username, dashboardPage.userOptions.getText());
    }

    @And("I enter valid username")
    public void iEnterValidUsername() {
        loginPage.usernameInputBox.sendKeys(ExcelRead.getRandomValidUsername());
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
}
