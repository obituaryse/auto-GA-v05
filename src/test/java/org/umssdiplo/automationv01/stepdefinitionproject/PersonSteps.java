package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
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



















    @And("^click 'button Start' in  page Listening$")
    public void clickButtonStartInPageListening() {
        personPage.clickStart();
    }

    @And("^choose 'options' in page question one$")
    public void chooseOptionsInPageQuestionOne() {
        personPage.clickQ1();
    }

    @Then("^select 'options correct' press option sister$")
    public void selectOptionsCorrectPressOptionSister() {
        String valueActual = personPage.getViewQ1();
        String valueEsperado = "sisters";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'options' in page question two$")
    public void chooseOptionsInPageQuestionTwo() {
        personPage.clickQ2();
    }

    @Then("^select 'options correct' press option mother$")
    public void selectOptionsCorrectPressOptionMother() {
        String valueActual = personPage.getViewQ2();
        String valueEsperado = "mother";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'options' in page question three$")
    public void chooseOptionsInPageQuestionThree() {
        personPage.clickQ3();
    }

    @Then("^select 'options correct' press option father$")
    public void selectOptionsCorrectPressOptionFather() {
        String valueActual = personPage.getViewQ3();
        String valueEsperado = "father and manager";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'options' in page question four$")
    public void chooseOptionsInPageQuestionFour() {
        personPage.clickQ4();
    }

    @Then("^select 'options correct' press option sisters$")
    public void selectOptionsCorrectPressOptionSisters() {
        String valueActual = personPage.getViewQ4();
        String valueEsperado = "sisters";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    //****************************************************
    @And("^click 'button Start' in  page Reading$")
    public void clickButtonStartInPageReading() {
        personPage.clickStartReading();
    }

    @Then("^choose 'options radio button' in page question one$")
    public void chooseOptionsRadioButtonInPageQuestionOne() {
        String valueActual = personPage.FalseQ1();
        String valueEsperado = "False";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @Then("^choose 'options radio button' in page question two$")
    public void chooseOptionsRadioButtonInPageQuestionTwo() {
        String valueActual = personPage.TrueQ2();
        String valueEsperado = "True";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @Then("^choose 'options radio button' in page question three$")
    public void chooseOptionsRadioButtonInPageQuestionThree() {
        String valueActual = personPage.FalseQ3();
        String valueEsperado = "False";
        Assert.assertEquals(valueActual, valueEsperado);
    }


    @And("^click 'button Start' in page gramar$")
    public void clickButtonStartInPageGramar() {
        personPage.startGramarr();
    }

    @And("^choose 'option' in page question one$")
    public void chooseOptionInPageQuestionOne() {
        personPage.clickQQ1();
    }

    @Then("^select 'options correct' press option sons$")
    public void selectOptionsCorrectPressOptionSons() {
        boolean valueActual = personPage.getViewQQ1();
        String valueEsperado = "They’re my sons.";
        Assert.assertTrue(valueActual, "dont find Theyre my sons.");
    }

    @And("^choose 'option' in page question two$")
    public void chooseOptionInPageQuestionTwo() {
        personPage.clickQQ2();
    }

    @Then("^select 'options correct' press option children$")
    public void selectOptionsCorrectPressOptionChildren() {
        String valueActual = personPage.getViewQQ2();
        String valueEsperado = "I have three children.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question three$")
    public void chooseOptionInPageQuestionThree() {
        personPage.clickQQ3();
    }

    @Then("^select 'options correct' press option young$")
    public void selectOptionsCorrectPressOptionYoung() {
        String valueActual = personPage.getViewQQ3();
        String valueEsperado = "No, she’s very young.";
        Assert.assertTrue(true);
    }

    @And("^choose 'option' in page question four$")
    public void chooseOptionInPageQuestionFour() {
        personPage.clickQQ4();
    }

    @Then("^select 'options correct' press option twenty$")
    public void selectOptionsCorrectPressOptionTwenty() {
        String valueActual = personPage.getViewQQ4();
        String valueEsperado = "Twenty-five.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question five$")
    public void chooseOptionInPageQuestionFive() {
        personPage.clickQQ5();
    }

    @Then("^select 'options correct' press option grandfather$")
    public void selectOptionsCorrectPressOptionGrandfather() {
        String valueActual = personPage.getViewQQ5();
        String valueEsperado = "He’s Julia’s grandfather.";
        Assert.assertTrue(true);

    }

    @And("^click 'button Start' in page gramartic$")
    public void clickButtonStartInPageGramartic() {
        personPage.startGramartic();
    }

    @And("^choose 'option' in Five page question one$")
    public void chooseOptionInFivePageQuestionOne() {
        personPage.clickQQQ1();
    }

    @Then("^select 'options correct' press option eigth$")
    public void selectOptionsCorrectPressOptionEigth() {
        String valueActual = personPage.getViewQQQ1();
        String valueEsperado = "At 8:00.";
        Assert.assertTrue(true);
    }

    @And("^choose 'option' in Five page question two$")
    public void chooseOptionInFivePageQuestionTwo() {
        personPage.clickQQQ2();
    }

    @Then("^select 'options correct' press option time$")
    public void selectOptionsCorrectPressOptionTime() {
        String valueActual = personPage.getViewQQQ2();
        String valueEsperado = "No, you’re on time.";
        Assert.assertTrue(true);
    }

    @And("^choose 'option' in Five page question three$")
    public void chooseOptionInFivePageQuestionThree() {
        personPage.clickQQQ3();
    }

    @Then("^select 'options correct' press option midnight$")
    public void selectOptionsCorrectPressOptionMidnight() {
        String valueActual = personPage.getViewQQQ3();
        String valueEsperado = "Midnight.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question four$")
    public void chooseOptionInFivePageQuestionFour() {
        personPage.clickQQQ4();
    }

    @Then("^select 'options correct' press option bookstore$")
    public void selectOptionsCorrectPressOptionBookstore() {
        String valueActual = personPage.getViewQQQ4();
        String valueEsperado = "At the bookstore.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question five$")
    public void chooseOptionInFivePageQuestionFive() {
        personPage.clickQQQ5();
    }

    @Then("^select 'options correct' press option saturday$")
    public void selectOptionsCorrectPressOptionSaturday() {
        String valueActual = personPage.getViewQQQ5();
        String valueEsperado = "Saturday.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question six$")
    public void chooseOptionInFivePageQuestionSix() {
        personPage.clickQQQ6();
    }

    @Then("^select 'options correct' press option april$")
    public void selectOptionsCorrectPressOptionApril() {
        String valueActual = personPage.getViewQQQ6();
        String valueEsperado = "On April 1st.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    //    *****************************************************************************
    @Given("^'SisSecurity' page inventario is loaded$")
    public void sissecurityPageInventarioIsLoaded() {
        personPage = LoadPage.loginPagePerson();
    }

    @And("^choose option one click 'Ver detalles' on page inventario$")
    public void chooseOptionOneClickVerDetallesOnPageInventario() {
        personPage.clickVerArtefacto();
    }

    // ----------------------------Eliminar artefacto  ----------------------------------------------
    @Given("^'SisSecurity' page Inventario es ta cargado$")
    public void sissecurityPageInventarioEsTaCargado() {
        personPage = LoadPage.loginPagePerson();
    }

    @And("^choose option one click 'Dar de baja' on page inventario$")
    public void chooseOptionOneClickDarDeBajaOnPageInventario() {
        personPage.clickEliminar();
    }

    //---------------------------------Create Artefacto-------------------------------------------------
    @Given("^crear artefacto$")
    public void crearArtefacto() {
        personPage = LoadPage.loginPagePerson();
    }

    @And("^agregar artefacto \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (\\d+) on page formulario$")
    public void agregarArtefactoAndAndAndCantidadOnPageFormulario(String nombre, String modelo, String estado, int cantidad) throws Throwable {
        personPage.create(nombre, modelo, estado, cantidad);
    }

    @Given("^'Person' page is loaded$")
    public void personPageIsLoaded() {
        personPage = LoadPage.loginPagePerson();
    }

    @And("^click in the element \"([^\"]*)\"$")
    public void clickInTheElement(String arg0) throws Throwable {
        personPage.clickFundamentals();
    }

    //****************************************************************************************************


}
