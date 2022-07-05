package com.xfleet.step_defs;

import com.xfleet.pages.BasePage;
import com.xfleet.pages.LoginPage;
import com.xfleet.pages.QuickLaunchpadPage;
import com.xfleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_StepDefs {

    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("I click username on the upper-right corner")
    public void i_click_username_on_the_upper_right_corner() {
        wait.until(ExpectedConditions.attributeToBe(quickLaunchpadPage.loaderMask, "class", "loader-mask"));
        quickLaunchpadPage.userOptions.click();
    }
    @When("I click log out button")
    public void i_click_log_out_button() {
        quickLaunchpadPage.logOutButton.click();
    }
    @Then("I should land on login page")
    public void i_should_land_on_login_page() {
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }
}
