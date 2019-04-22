package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.PumaPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class MyStepPumas {
    private PumaPage pumaPage;

    @Given("^'PUMA ' page is loaded$")
    public void pumaPageIsLoaded() {
        pumaPage = LoadPage.loginPagePuma();
    }

    @And("^hover Men link Header$")
    public void hoverMenLinkHeader() {
        pumaPage.hoverToElement("dd");
    }

    @And("^click in link futbol$")
    public void clickInLinkFutbol() {
        pumaPage.clickInFutbol();
    }

    @And("^get price from element \"([^\"]*)\"$")
    public void getPriceFromElement(String elementValue) throws Throwable {

    }
}
