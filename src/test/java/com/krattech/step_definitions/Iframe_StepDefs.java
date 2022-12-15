package com.krattech.step_definitions;

import com.krattech.pages.IframePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Iframe_StepDefs {

    @Then("The user should verify {string}")
    public void theUserShouldVerify(String expectedIframeURL) {
        IframePage iframePage=new IframePage();
        Assert.assertEquals(expectedIframeURL,iframePage.getIframeCurrentURL());
    }
}
