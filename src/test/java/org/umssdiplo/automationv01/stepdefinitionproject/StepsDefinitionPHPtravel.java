package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^click 'button Start' in  page Listening$")
    public void clickButtonStartInPageListening() {
        login.clickStart();
    }

    @And("^choose 'options' in page question one$")
    public void chooseOptionsInPageQuestionOne() {
        login.clickQ1();
    }

    @Then("^select 'options correct' press option sister$")
    public void selectOptionsCorrectPressOptionSister() {
        String valueActual = login.getViewQ1();
        String valueEsperado = "sisters";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^click in the next view$")
    public void clickInTheNextView() {
        login.nextToQ();
    }

    @And("^choose 'options' in page question two$")
    public void chooseOptionsInPageQuestionTwo() {
        login.clickQ2();
    }

    @Then("^select 'options correct' press option mother$")
    public void selectOptionsCorrectPressOptionMother() {
        String valueActual = login.getViewQ2();
        String valueEsperado = "mother";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'options' in page question three$")
    public void chooseOptionsInPageQuestionThree() {
        login.clickQ3();
    }

    @Then("^select 'options correct' press option father$")
    public void selectOptionsCorrectPressOptionFather() {
        String valueActual = login.getViewQ3();
        String valueEsperado = "father and manager";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'options' in page question four$")
    public void chooseOptionsInPageQuestionFour() {
        login.clickQ4();
    }

    @Then("^select 'options correct' press option sisters$")
    public void selectOptionsCorrectPressOptionSisters() {
        String valueActual = login.getViewQ4();
        String valueEsperado = "sisters";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    //****************************************************
    @And("^click 'button Start' in  page Reading$")
    public void clickButtonStartInPageReading() {
        login.clickStartReading();
    }

    @Then("^choose 'options radio button' in page question one$")
    public void chooseOptionsRadioButtonInPageQuestionOne() {
        String valueActual = login.FalseQ1();
        String valueEsperado = "False";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @Then("^choose 'options radio button' in page question two$")
    public void chooseOptionsRadioButtonInPageQuestionTwo() {
        String valueActual = login.TrueQ2();
        String valueEsperado = "True";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @Then("^choose 'options radio button' in page question three$")
    public void chooseOptionsRadioButtonInPageQuestionThree() {
        String valueActual = login.FalseQ3();
        String valueEsperado = "False";
        Assert.assertEquals(valueActual, valueEsperado);
    }


    @And("^click 'button Start' in page gramar$")
    public void clickButtonStartInPageGramar() {
        login.startGramarr();
    }

    @And("^choose 'option' in page question one$")
    public void chooseOptionInPageQuestionOne() {
        login.clickQQ1();
    }

    @Then("^select 'options correct' press option sons$")
    public void selectOptionsCorrectPressOptionSons() {
        String valueActual = login.getViewQQ1();
        String valueEsperado = "They’re my sons.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question two$")
    public void chooseOptionInPageQuestionTwo() {
        login.clickQQ2();
    }

    @Then("^select 'options correct' press option children$")
    public void selectOptionsCorrectPressOptionChildren() {
        String valueActual = login.getViewQQ2();
        String valueEsperado = "I have three children.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question three$")
    public void chooseOptionInPageQuestionThree() {
        login.clickQQ3();
    }

    @Then("^select 'options correct' press option young$")
    public void selectOptionsCorrectPressOptionYoung() {
        String valueActual = login.getViewQQ3();
        String valueEsperado = "No, she’s very young.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question four$")
    public void chooseOptionInPageQuestionFour() {
        login.clickQQ4();
    }

    @Then("^select 'options correct' press option twenty$")
    public void selectOptionsCorrectPressOptionTwenty() {
        String valueActual = login.getViewQQ4();
        String valueEsperado = "Twenty-five.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in page question five$")
    public void chooseOptionInPageQuestionFive() {
        login.clickQQ5();
    }

    @Then("^select 'options correct' press option grandfather$")
    public void selectOptionsCorrectPressOptionGrandfather() {
        String valueActual = login.getViewQQ5();
        String valueEsperado = "He’s Julia’s grandfather.";
        Assert.assertEquals(valueActual, valueEsperado);

    }

    @And("^click 'button Start' in page gramartic$")
    public void clickButtonStartInPageGramartic() {
        login.startGramartic();
    }

    @And("^choose 'option' in Five page question one$")
    public void chooseOptionInFivePageQuestionOne() {
        login.clickQQQ1();
    }

    @Then("^select 'options correct' press option eigth$")
    public void selectOptionsCorrectPressOptionEigth() {
        String valueActual = login.getViewQQQ1();
        String valueEsperado = "At 8:00.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question two$")
    public void chooseOptionInFivePageQuestionTwo() {
        login.clickQQQ2();
    }

    @Then("^select 'options correct' press option time$")
    public void selectOptionsCorrectPressOptionTime() {
        String valueActual = login.getViewQQQ2();
        String valueEsperado = "No, you’re on time.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question three$")
    public void chooseOptionInFivePageQuestionThree() {
        login.clickQQQ3();
    }

    @Then("^select 'options correct' press option midnight$")
    public void selectOptionsCorrectPressOptionMidnight() {
        String valueActual = login.getViewQQQ3();
        String valueEsperado = "Midnight.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question four$")
    public void chooseOptionInFivePageQuestionFour() {
        login.clickQQQ4();
    }

    @Then("^select 'options correct' press option bookstore$")
    public void selectOptionsCorrectPressOptionBookstore() {
        String valueActual = login.getViewQQQ4();
        String valueEsperado = "At the bookstore.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question five$")
    public void chooseOptionInFivePageQuestionFive() {
        login.clickQQQ5();
    }

    @Then("^select 'options correct' press option saturday$")
    public void selectOptionsCorrectPressOptionSaturday() {
        String valueActual = login.getViewQQQ5();
        String valueEsperado = "Saturday.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^choose 'option' in Five page question six$")
    public void chooseOptionInFivePageQuestionSix() {
        login.clickQQQ6();
    }

    @Then("^select 'options correct' press option april$")
    public void selectOptionsCorrectPressOptionApril() {
        String valueActual = login.getViewQQQ6();
        String valueEsperado = "On April 1st.";
        Assert.assertEquals(valueActual, valueEsperado);
    }

    //    *****************************************************************************
    @Given("^'SisSecurity' page inventario is loaded$")
    public void sissecurityPageInventarioIsLoaded() {
        login = LoadPage.loginPage2();
    }

    @And("^choose option one click 'Ver detalles' on page inventario$")
    public void chooseOptionOneClickVerDetallesOnPageInventario() {
        login.clickVerArtefacto();
    }

    // ----------------------------Eliminar artefacto  ----------------------------------------------
    @Given("^'SisSecurity' page Inventario es ta cargado$")
    public void sissecurityPageInventarioEsTaCargado() {
        login = LoadPage.loginPage2();
    }

    @And("^choose option one click 'Dar de baja' on page inventario$")
    public void chooseOptionOneClickDarDeBajaOnPageInventario() {
        login.clickEliminar();
    }

    //---------------------------------Create Artefacto-------------------------------------------------
    @Given("^crear artefacto$")
    public void crearArtefacto() {
        login = LoadPage.loginPage3();
    }

    @And("^agregar artefacto \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (\\d+) on page formulario$")
    public void agregarArtefactoAndAndAndCantidadOnPageFormulario(String nombre, String modelo, String estado, int cantidad) throws Throwable {
        login.create(nombre, modelo, estado, cantidad);
    }

    //****************************************************************************************************




}
