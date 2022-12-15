package com.krattech.step_definitions;

import com.krattech.pages.SelectPage;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Select_StepDefs {
    @When("The user should select from selectmenu two")
    public void the_user_should_select_from_selectmenu_two() {
        SelectPage selectPage=new SelectPage();
        Select select=new Select(selectPage.select_loc);
        select.selectByVisibleText("Two");
         String actualText = select.getFirstSelectedOption().getText();
         String expectedeText="Two";
        Assert.assertEquals(expectedeText,actualText);
    }
}
