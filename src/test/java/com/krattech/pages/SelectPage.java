package com.krattech.pages;

import com.krattech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectPage extends BasePage{

    @FindBy(xpath = "(//select[@class='form-select'])[1]")
    public WebElement select_loc;

}
