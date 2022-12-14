package com.krattech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage2 {
    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement tabLocator;

    @FindBy(xpath = "//span[.='Modal']")
    public WebElement moduleLocator;
}
