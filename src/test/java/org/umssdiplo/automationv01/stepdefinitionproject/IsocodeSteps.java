package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Isocode;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class IsocodeSteps {

    private Isocode isocode;

    @Given("^se realize un registro de una nueva persona$")
    public void seRealizeUnRegistroDeUnaNuevaPersona() {
        isocode = LoadPage.loginPageIsocode();
        isocode.direccionarAlRegistroPersona();
    }

    @And("^que los parametros \"([^\"]*)\" y \"([^\"]*)\" esten nulos$")
    public void queLosParametrosYEstenNulos(String arg0, String arg1) throws Throwable {
        isocode.setearParametros(arg0, arg1);
    }

    @When("^se presione el boton \"([^\"]*)\"$")
    public void sePresioneElBoton(String arg0) throws Throwable {
        isocode.presionarBotonGuardar(arg0);
    }

    @Then("^no deberia registrarse una persona$")
    public void noDeberiaRegistrarseUnaPersona() {
        boolean aux = isocode.validacionDelBoton();
        Assert.assertTrue(aux,"No se pudo  registrar el elemento ");
    }

    @Given("^se encuentre dentro de la pagina$")
    public void seEncuentreDentroDeLaPagina() {
        isocode = LoadPage.loginPageIsocode();
    }

    @And("^se redireccione al detalle del accidente \"([^\"]*)\"$")
    public void seRedireccioneAlDetalleDelAccidente(String arg0) throws Throwable {
        isocode.mostrarLista(arg0);
        //isocode.redireccionarAlAccidente(arg0);
    }

    @And("^registrar formulario con los datos \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\" y \"([^\"]*)\"$")
    public void registrarFormularioConLosDatosYYYYYYY(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        isocode.registrarDePersona(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @Given("^registro de una persona a traves de interfaz$")
    public void registroDeUnaPersonaATravesDeInterfaz() {
        isocode = LoadPage.loginPageIsocode();
    }

    @And("^ingresar a interfaz de registro$")
    public void ingresarAInterfazDeRegistro() {
        isocode.clickRegistrarPersona();
    }

    @Given("^actualizacion de una persona por interfaz$")
    public void actualizacionDeUnaPersonaPorInterfaz() {
        isocode = LoadPage.loginPageIsocode();
    }

    @And("^ingreasr a interfaz de actualizacion$")
    public void ingreasrAInterfazDeActualizacion() {
        isocode.clickActualizarPersona();
    }

    @And("^realizar la actualizacion del nombre por \"([^\"]*)\"$")
    public void realizarLaActualizacionDelNombrePor(String arg0) throws Throwable {
        boolean aux = isocode.actualizarFormularioPersona(arg0);
        Assert.assertTrue(aux,"No se pudo  actualizar el elemento "+arg0);
    }

    @And("^dar click al boton imprimir$")
    public void darClickAlBotonImprimir() {
        isocode.darClickImprimir();
    }
}
