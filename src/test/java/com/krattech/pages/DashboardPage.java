package com.krattech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle_loc;

    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFMTitle_loc;
}
