package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.PersonPage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PersonSteps {
    private PersonPage personPage;

    @Given("^enter the person page$")
    public void enterThePersonPage() {
        personPage =  LoadPage.loginPagePerson();
    }

    @And("^click in element \"([^\"]*)\"$")
    public void clickInElement(String element) throws Throwable {
        personPage.clickInElement(element);
    }

    @When("^start with the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void startWithTheAnd(String unit, String activity) throws Throwable {
        boolean resp = personPage.findUnitAndClickInStart(unit, activity);
        Assert.assertTrue(resp,"No se encontro la unidad "+unit+" o la actividad "+activity);
    }

    @And("^click in \"([^\"]*)\" option in question (\\d+)$")
    public void clickInOptionInQuestion(String option, int question) throws Throwable {
        boolean resp = personPage.clickInAnswer(option,question);
    }

    @And("^click in the next view$")
    public void clickInTheNextView() {
        boolean resp = personPage.clickInNextView();
        Assert.assertTrue(resp,"Respuesta erronea en el test");
    }

    @Given("^ingresar a la pagina person$")
    public void ingresarALaPaginaPerson() {
        personPage =  LoadPage.loginPagePerson();
    }

    @And("^click in \"([^\"]*)\" in question (\\d+)$")
    public void clickInInQuestion(String answer, int question) throws Throwable {
        personPage.replyQuestion(answer, question);
    }

    @And("^write in the question (\\d+) the answer \"([^\"]*)\" and \"([^\"]*)\"$")
    public void writeInTheQuestionTheAnswerAnd(int question, String arg1, String arg2) throws Throwable {
        personPage.writeTheTwoAnswer(question, arg1, arg2);
    }

    @And("^write in the question (\\d+) the answer \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void writeInTheQuestionTheAnswerAndAnd(int question, String arg1, String arg2, String arg3) throws Throwable {
        personPage.writeTheTreeAnswer(question, arg1, arg2, arg3);
    }

    @And("^write in the question (\\d+) the answer \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void writeInTheQuestionTheAnswerAndAndAnd(int question, String arg1, String arg2, String arg3, String arg4) throws Throwable {
        personPage.writeTheFourAnswer(question, arg1, arg2, arg3, arg4);
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

    @Then("^the test finished correctly with (\\d+) points in test (\\d+)$")
    public void theTestFinishedCorrectlyWithPointsInTest(int points, String test) {
        String qua = personPage.getCalification(test);
        qua = qua.replaceAll("[^0-9?!\\.]","");
        Assert.assertEquals(points, Integer.parseInt(qua), "el test no termino correctamente");
    }

    @And("^click in the next view page$")
    public void clickInTheNextViewPage() {
        personPage.nextViewPage();
    }

    @And("^start with the unit (\\d+)$")
    public void startWithTheUnit(String element) {
        personPage.clickInStart(element);
    }

    @And("^select the option \"([^\"]*)\" in question (\\d+)$")
    public void selectTheOptionInQuestion(String option, int question) throws Throwable {
        boolean aux = personPage.selectAnoption(option, question);
        Assert.assertTrue(aux,"No se pudo dar seleccionar la respuesta para la pregunta "+question);
    }

    @And("^drap the element \"([^\"]*)\" and drop in option \"([^\"]*)\"$")
    public void drapTheElementAndDropInOption(String from, String to) throws Throwable {
        boolean aux = personPage.dragAndDropOption(from,to);
        Assert.assertTrue(aux,"No se pudo  arrastrar y soltar los elementos"+from+" y "+to);
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
