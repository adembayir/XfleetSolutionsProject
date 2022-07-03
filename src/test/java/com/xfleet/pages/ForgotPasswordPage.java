package com.xfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends LoginPage {

    @FindBy(xpath = "//h2[@class='title']")
    public WebElement forgotPasswordHeader;
}
