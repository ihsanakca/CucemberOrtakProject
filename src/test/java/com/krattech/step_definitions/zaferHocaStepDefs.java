package com.krattech.step_definitions;

import com.krattech.pages.DashboardPage;
import com.krattech.pages.IframePage;
import com.krattech.pages.LoginPages;
import com.krattech.utilities.ConfigurationReader;
import com.krattech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class zaferHocaStepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    IframePage iframePage=new IframePage();

    @Given("The user is on the Login Page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user input valid credentials to {string} and {string} bars")
    public void the_user_input_valid_credentials_to_and_bars(String userEmail, String password) {
        LoginPages loginPages = new LoginPages();
        loginPages.loginWithParameter(userEmail, password);
        if (userEmail.equals("")) {
            System.out.println("email eksiktir..");
        }
    }

    @Then("The user verify that on the {string} page")
    public void theUserVerifyThatOnThePage(String relatedPageTitle) {

        String homeName = dashboardPage.getHomeName(relatedPageTitle);
        Assert.assertEquals(relatedPageTitle, homeName);
    }

    @When("The user navigate to {string} {string}")
    public void the_user_navigate_to(String tab, String module) {
        dashboardPage.navigateToModule(tab, module);
    }

    @Then("The user verfiy that {string}")
    public void the_user_verfiy_that(String moduleSubtitle) {
        String actualSubtitle = dashboardPage.getSubtitle(moduleSubtitle);
        Assert.assertEquals(moduleSubtitle,actualSubtitle);
    }

    @When("The user should close all tabs")
    public void the_user_should_close_all_tabs() {

        Driver.get().switchTo().frame(iframePage.iframe_loc);
        iframePage.closeIframes();
        Driver.get().switchTo().defaultContent();
    }
    @Then("The user navigate to back and verify the current URL")
    public void The_user_navigate_to_back_and_verify_the_current_URL() {
        Driver.get().navigate().back();
        String actualURL = Driver.get().getCurrentUrl();
        String expectedURL="https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedURL, actualURL);
    }


}
