package com.xfleet.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.xfleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement userOptions;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//body/div[4]")
    public WebElement loaderMask;

}
