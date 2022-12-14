package com.krattech.pages;

import com.krattech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage{
    @FindBy(xpath = "//iframe")
    public WebElement iframe_loc;

    @FindBy(xpath = "//button[@class='btn-close btn-close-white']")
    public WebElement closeRight_loc;

    @FindBy(xpath = "//button[@class='btn-close']")
    public WebElement closeLeft_loc;

    public void closeIframes (){
        closeRight_loc.click();
        //BrowserUtils.waitFor(2);
       BrowserUtils.waitForPageToLoad(2);
        closeRight_loc.click();
        //BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(2);
        closeRight_loc.click();
       // BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(2);
        closeLeft_loc.click();
       // BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(2);
        closeLeft_loc.click();
        //BrowserUtils.waitFor(2);
        BrowserUtils.waitForPageToLoad(2);
        closeLeft_loc.click();

    }
}
