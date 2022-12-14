package com.krattech.pages;

import com.krattech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle_loc;

    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFMTitle_loc;
    public String getHomeName(String name){
        String homeNameLocator="//li[.='"+name+"']";
        return Driver.get().findElement(By.xpath(homeNameLocator)).getText();
    }

}
