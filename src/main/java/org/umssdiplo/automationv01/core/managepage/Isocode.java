package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Isocode extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerDialog;

    @FindBy(id = "personas")
    private WebElement personas;
    @FindBy(id = "crearPersona")
    private WebElement crearPersona;

    @FindBy(name = "nombres")
    private WebElement nombres;
    @FindBy(name = "apellidos")
    private WebElement apellidos;
    @FindBy(name = "telefono")
    private WebElement telefono;
    @FindBy(name = "direccion")
    private WebElement direccion;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name = "gridRadiosMA")
    private WebElement gridRadiosMA;
    @FindBy(name = "nacimiento")
    private WebElement nacimiento;
    @FindBy(name = "ci")
    private WebElement ci;
    @FindBy(name = "nacionalidad")
    private WebElement nacionalidad;
    @FindBy(id = "finalizarRegistro")
    private WebElement guardar;
    @FindBy(id = "regressar")
    private WebElement regresar;
    /*
     atraves del css o del name o del id se puede setear aca
    */
    /*@FindBy(id = "")
    private WebElement registrarAccidenteTab;*/

    @FindBy(id = "botonPress")
    private WebElement botonCrear;

    @FindBy(id = "actualizar2")
    private WebElement actualizar2;
    @FindBy(id = "actualizarRegistro")
    private WebElement actualizarRegistro;

    @FindBy(id = "acciya0")
    private WebElement verAccidente;

    @FindBy(xpath = "//*[@id=\"content\"]/input")
    private WebElement getPDF;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        System.out.println(username);
        System.out.println(password);
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    /*public RegistrarAccidente clickRegistrarAccidenteTab() {
        WebElement registrarAccidenteTab;
        CommonEvents.clickButton(registrarAccidenteTab);
        return RegistrarAccidente();
    }

    public Isocode(){
        CommonEvents.waitWebElementVisible(containerDialog);
    }*/
    public void clickRegistrarAccidenteTab() {
        CommonEvents.clickButton(botonCrear);
    }

    public void direccionarAlRegistroPersona() {
        CommonEvents.clickButton(personas);
        CommonEvents.clickButton(crearPersona);
    }

    public void setearParametros(String pa1, String pa2) {
        if (!pa1.equals("apellido"))
            CommonEvents.setInputField(apellidos,pa1);
        if (!pa2.equals("nombres"))
            CommonEvents.setInputField(nombres,pa2);

        CommonEvents.setInputField(telefono,"65465454");
        CommonEvents.setInputField(direccion,"temporal calle 10");
        CommonEvents.setInputField(email,"obito@gmail.com");
        CommonEvents.clickButton(gridRadiosMA);
        CommonEvents.setInputFieldDate(nacimiento,"19091990");
        CommonEvents.setInputField(ci,"541451");
        CommonEvents.setInputField(nacionalidad,"Bolivia");
    }

    public void presionarBotonGuardar(String boton) {
        if (CommonEvents.isClickable(guardar))
            CommonEvents.clickButton(guardar);
        else
            System.out.println("error en el test");

    }

    public boolean validacionDelBoton() {
        if (CommonEvents.isClickable(guardar))
            return true;
        else
            return false;
    }

    public void redireccionarAlAccidente(String arg0) {
        /*BY.xp
                CommonEvents.
        WebElement aux = CommonEvents.findWebElement(By.xpath("/html/body/app-root/div/app-accidentes/table/tbody"),arg0);*/
        CommonEvents.clickButton(guardar);
    }

    public void registrarDePersona(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        System.out.println(arg0);
        CommonEvents.setInputField(nombres,arg0);
        CommonEvents.setInputField(apellidos,arg1);
        CommonEvents.setInputField(telefono,arg6);
        CommonEvents.setInputField(direccion,arg2);
        CommonEvents.setInputField(email,arg3);
        CommonEvents.clickButton(gridRadiosMA);
        CommonEvents.setInputFieldDate(nacimiento,arg4);
        CommonEvents.setInputField(ci,arg7);
        CommonEvents.setInputField(nacionalidad,arg5);
        if (CommonEvents.isClickable(guardar))
            CommonEvents.clickButton(guardar);
        else
            System.out.println("error en el test");

    }

    public void clickRegistrarPersona() {
        CommonEvents.clickButton(personas);
        CommonEvents.clickButton(crearPersona);
    }

    public void verificarElRegistro() {
        System.out.println("error en el test");
    }

    public void mostrarLista(String arg0) {
        CommonEvents.clickButton(verAccidente);
    }

    public void clickActualizarPersona() {
        CommonEvents.clickButton(personas);
        CommonEvents.clickButton(actualizar2);
    }

    public boolean actualizarFormularioPersona(String nombre) {
        CommonEvents.setInputField(nombres,nombre);
        CommonEvents.clickButton(actualizarRegistro);
        return  true;
    }

    public void darClickImprimir() {
        CommonEvents.clickButton(getPDF);
    }
}
