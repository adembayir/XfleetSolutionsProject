package com.xfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboardHeader;
}
