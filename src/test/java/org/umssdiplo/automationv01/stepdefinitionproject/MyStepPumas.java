package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
        pumaPage.saveShoePrice(elementValue);
    }

    @And("^Click in element \"([^\"]*)\"$")
    public void clickInElement(String arg0) throws Throwable {
        pumaPage.clickInItem();
    }

    @And("^select TALLA \"([^\"]*)\"$")
    public void selectTALLA(String talla) throws Throwable {
        pumaPage.selectTalla(talla);
    }

    @And("^click to button \"([^\"]*)\"$")
    public void clickToButton(String button) throws Throwable {
        pumaPage.clickInButton(button);
    }

    @And("^Verify that VIEW SHOOPING BAG is ONE$")
    public void verifyThatVIEWSHOOPINGBAGIsONE() {
        pumaPage.getViewShoopingBag();
    }

    @And("^Click VER CARRITO link$")
    public void clickVERCARRITOLink() {
        pumaPage.clickInButton2();
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String title) throws Throwable {
        boolean aux = pumaPage.getTitle(title);
        Assert.assertTrue(aux, "the title is not displayed");
    }

    @And("^Price should be \\$\"([^\"]*)\"")
    public void priceShouldBe$(String amount) {
        float oldAmount = pumaPage.getPriceShoe();
        float newAmount = Float.parseFloat(amount);
        Assert.assertEquals(newAmount, oldAmount, "the price is not equals to amount "+amount);
    }

    @And("^Total should be \\$\"([^\"]*)\"")
    public void totalShouldBe$(String amount) {
        String aux = pumaPage.getPriceTotal();
        Assert.assertEquals(amount, aux, "the total price is not equals to amount "+amount);
    }
}