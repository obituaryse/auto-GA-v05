package org.umssdiplo.automationv01.stepdefinitionproject;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.PersonPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PersonSteps {

    private PersonPage personPage;

    @Given("^ingresar a la pagina person$")
    public void ingresarALaPaginaPerson() {
        personPage =  LoadPage.loginPagePerson();
    }

    @And("^click in element \"([^\"]*)\"$")
    public void clickInElement(String element) throws Throwable {
        personPage.clickInElement(element);
    }

    @And("^start with the unit (\\d+)$")
    public void startWithTheUnit(String element) {
        personPage.clickInStart(element);
    }

    @And("^click in the next view$")
    public void clickInTheNextView() {
        boolean resp = personPage.clickInNextView();
        Assert.assertTrue(resp,"Respuesta erronea en el test");
    }


    @And("^click in \"([^\"]*)\" in question (\\d+)$")
    public void clickInInQuestion(String value, int question) throws Throwable {
        boolean resp = personPage.clickInCheckbox(value,question);
        Assert.assertTrue(resp,"No se pudo dar click en la pregunta "+question);
    }


    @And("^select the option \"([^\"]*)\" in question (\\d+)$")
    public void selectTheOptionInQuestion(String option, int question) throws Throwable {
        boolean aux = personPage.selectAnoption(option, question);
        Assert.assertTrue(aux,"No se pudo dar seleccionar la respuesta para la pregunta "+question);
    }

    @Then("^the test finished correctly with (\\d+) points in test (\\d+)$")
    public void theTestFinishedCorrectlyWithPointsInTest(int points, String test) {
        String qua = personPage.getCalification(test);
        qua = qua.replaceAll("[^0-9?!\\.]","");
        Assert.assertEquals(points, Integer.parseInt(qua), "el test no termino correctamente");
    }

    @And("^drap the element \"([^\"]*)\" and drop in option \"([^\"]*)\"$")
    public void drapTheElementAndDropInOption(String from, String to) throws Throwable {
        boolean aux = personPage.dragAndDropOption(from,to);
        Assert.assertTrue(aux,"No se pudo  arrastrar y soltar los elementos"+from+" y "+to);
    }

    @And("^another dsds$")
    public void anotherDsds() {
        personPage.jejejej();
    }

    @And("^click in button \"([^\"]*)\"$")
    public void clickInButton(String button) throws Throwable {
        boolean aux =  personPage.clickInButton(button);
        Assert.assertTrue(aux,"No se pudo  dar click al elemento "+button);
    }

    @And("^validate if the answers are correct$")
    public void validateIfTheAnswersAreCorrect() {
        boolean aux =  personPage.answerCorrect();
        Assert.assertTrue(aux,"Las respuestas no son correctas");
    }

    @And("^click in button Next$")
    public void clickInButtonNext() {
        personPage.clickInNext();
    }

    @And("^drap the element \"([^\"]*)\" and drop in section \"([^\"]*)\" in answer \"([^\"]*)\"$")
    public void drapTheElementAndDropInAnswerInSection(String from, String section, String to) throws Throwable {
        boolean aux = personPage.dragAndDropAnswer(from, section, to);
        Assert.assertTrue(aux,"No se pudo dar click en la pregunta ");
    }

    @And("^down with the scroll bar$")
    public void downWithTheScrollBar() {
        personPage.downScrollbar();
    }
}
