package com.krattech.pages;

import com.krattech.utilities.BrowserUtils;
import com.krattech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String tab, String module) {
        String tabLocator = "//li[@class='nav-item']//span[.='" + tab + "']";
        String moduleLocator = "//span[.='" + module + "']";

        BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
        WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
        BrowserUtils.clickWithJS(tabElement);
        //tabElement.click();
        if (!module.isEmpty()) {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
            WebElement modElement = Driver.get().findElement(By.xpath(moduleLocator));
            BrowserUtils.clickWithJS(modElement);
        }

    }

    public String subTitle(String subtitle) {
        String subTitleLocator = "//h1[.='" + subtitle + "']";

        BrowserUtils.waitForPresenceOfElement(By.xpath(subTitleLocator), 5);

        WebElement subTitle = Driver.get().findElement(By.xpath(subTitleLocator));

        String actualSubTitle = subTitle.getText();
        return actualSubTitle;
    }

    public String getAccountName_mtd(String accountName) {
        return Driver.get().findElement(By.xpath("//span[.='" + accountName + "']")).getText();
    }

    public String getSubtitle(String moduleName){
        return Driver.get().findElement(By.xpath("//li[.='"+moduleName+"']")).getText();
    }

    public void getNames(){

        System.out.println("zafer");
    }
}
