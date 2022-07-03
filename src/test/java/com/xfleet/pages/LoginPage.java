package com.xfleet.pages;

import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameInputBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//label[@class='custom-checkbox absolute']/span[@class='custom-checkbox__text']")
    public WebElement rememberMeText;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotYourPasswordLink;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-error']/div")
    public WebElement invalidUserPassMsg;
}
