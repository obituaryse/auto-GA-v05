package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;
    @FindBy(name = "password")
    private WebElement passwordInputField;
    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;
    //    **************************************************
    @FindBy(xpath = "//a[@data-uuid='d68040f2-5f8a-4297-b307-523152be9c09_1441884861']")
    private WebElement Start;
    @FindBy(xpath = "//span[@ng-click=\"selectToggle(0)\"]")
    private WebElement Question1;
    @FindBy(xpath = "//span[text()='sisters']")
    private WebElement Sister;
    @FindBy(id = "nextBtn")
    private WebElement buttonNextView;
    @FindBy(xpath = "//span[@ng-click='selectToggle(1)']")
    private WebElement Question2;
    @FindBy(xpath = "//span[text()='mother']")
    private WebElement Mother;
    @FindBy(xpath = "//span[@ng-click='selectToggle(2)']")
    private WebElement Question3;
    @FindBy(xpath = "//span[text()='father and manager']")
    private WebElement Father;
    @FindBy(xpath = "//span[@ng-click='selectToggle(3)']")
    private WebElement Question4;
    @FindBy(xpath = "//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[4]/article/div/div[1]/span/p/span/span/span/span[4]/span")
    private WebElement Sisters;
    //    **********************************************
    @FindBy(xpath = "//a[@data-uuid='d6a54a1d-79bf-444b-9998-c65a0696233d_1441884864']")
    private WebElement clickStartReading;
    @FindBy(xpath = "//*[@id=\"iap-mcq-text-option-holder-d27007e2-eceb-4c3e-93b6-f08d12e07825\"]/div[2]/div/span[3]/p")
    private WebElement FalseQ1;
    @FindBy(xpath = "//*[@id=\"iap-mcq-text-option-holder-a0738567-e983-44f1-9395-30f8ae9a5cbf\"]/div[1]/div/span[3]/p")
    private WebElement TrueQ2;
    @FindBy(xpath = "//*[@id=\"iap-mcq-text-option-holder-6179cf05-9778-4ffc-9532-6e4807b27d70\"]/div[2]/div/span[3]/p")
    private WebElement FalseQ3;

    @FindBy(xpath = "//a[@data-uuid=\"fbe74cb2-750d-4050-a175-77a4e62569bc_1441884873\"]")
    private WebElement startGramar;
    @FindBy(xpath = "//span[@ng-click='selectToggle(0)']")
    private WebElement QQ1;
    @FindBy(xpath = "//span[text()='They’re my sons.']")
    private WebElement sons;
    @FindBy(xpath = "//span[@ng-click='selectToggle(1)']")
    private WebElement QQ2;
    @FindBy(xpath = "//span[text()='I have three children.']")
    private WebElement children;
    @FindBy(xpath = "//span[@ng-click='selectToggle(2)']")
    private WebElement QQ3;
    @FindBy(xpath = "//span[text()='No, she’s very young.']")
    private WebElement young;
    @FindBy(xpath = "//span[@ng-click='selectToggle(3)']")
    private WebElement QQ4;
    @FindBy(xpath = "//span[text()='Twenty-five.']")
    private WebElement twenty;
    @FindBy(xpath = "//span[@ng-click='selectToggle(4)']")
    private WebElement QQ5;
    @FindBy(xpath = "//span[text()='He’s Julia’s grandfather.']")
    private WebElement grandfather;
    @FindBy(xpath = "//a[@data-uuid=\"28dc552c-2a81-4725-a6bd-bba5cde0fe41_1441885271\"]")
    private WebElement StarGramatic;
    @FindBy(xpath = "//span[@ng-click='selectToggle(0)']")
    private WebElement QQQ1;
    @FindBy(xpath = "//span[text()='At 8:00.']")
    private WebElement eigth;
    @FindBy(xpath = "//span[@ng-click='selectToggle(1)']")
    private WebElement QQQ2;
    @FindBy(xpath = "//span[text()='No, you’re on time.']")
    private WebElement time;
    @FindBy(xpath = "//span[@ng-click='selectToggle(2)']")
    private WebElement QQQ3;
    @FindBy(xpath = "//span[text()='Midnight.']")
    private WebElement midnight;
    @FindBy(xpath = "//span[@ng-click='selectToggle(3)']")
    private WebElement QQQ4;
    @FindBy(xpath = "//span[text()='At the bookstore.']")
    private WebElement bookstore;
    @FindBy(xpath = "//span[@ng-click='selectToggle(4)']")
    private WebElement QQQ5;
    @FindBy(xpath = "//span[text()='Saturday.']")
    private WebElement saturday;
    @FindBy(xpath = "//span[@ng-click='selectToggle(5)']")
    private WebElement QQQ6;
    @FindBy(xpath = "//span[text()='On April 1st.']")
    private WebElement april;
    //    ***************************************************************
    @FindBy(id = "0")
    private WebElement VerAttefacto;

    @FindBy(id = "2")
    private WebElement Eliminar;

    @FindBy(id = "nombreArtefacto")
    private WebElement nombreArt;
    @FindBy(id = "modeloArtefacto")
    private WebElement modeloArt;
    @FindBy(id = "estadoArtefacto")
    private WebElement estadoArt;
    @FindBy(id = "cantidadArtefacto")
    private WebElement cantidadArt;
    @FindBy(id = "Add")
    private WebElement add;





    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public void clickStart() {
        CommonEvents.clickButton(Start);
    }

    public void clickQ1() {
        CommonEvents.clickButton(Question1);
    }

    public String getViewQ1() {
        String aux = Sister.getText();
        CommonEvents.clickButton(Sister);
        return aux;
    }

    public void nextToQ() {
        CommonEvents.clickButton(buttonNextView);
    }

    public void clickQ2() {
        CommonEvents.clickButton(Question2);
    }

    public String getViewQ2() {
        String aux = Mother.getText();
        CommonEvents.clickButton(Mother);
        return aux;
    }

    public void clickQ3() {
        CommonEvents.clickButton(Question3);
    }

    public String getViewQ3() {
        String aux = Father.getText();
        CommonEvents.clickButton(Father);
        return aux;
    }

    public void clickQ4() {
        CommonEvents.clickButton(Question4);
    }

    public String getViewQ4() {
        String aux = Sisters.getText();
        CommonEvents.clickButton(Sisters);
        return aux;
    }

    public void clickStartReading() {
        CommonEvents.clickButton(clickStartReading);
    }

    public String FalseQ1() {
        String aux = FalseQ1.getText();
        CommonEvents.clickButton(FalseQ1);
        return aux;
    }

    public String TrueQ2() {
        String aux = TrueQ2.getText();
        CommonEvents.clickButton(TrueQ2);
        System.out.println(aux);
        return aux;
    }

    public String FalseQ3() {
        String aux = FalseQ3.getText();
        CommonEvents.clickButton(FalseQ3);
        return aux;
    }


    public void startGramarr() {
        CommonEvents.clickButton(startGramar);
    }

    public void clickQQ1() {
        CommonEvents.clickButton(QQ1);
    }

    public String getViewQQ1() {
        String aux = sons.getText();
        CommonEvents.clickButton(sons);
        return aux;
    }

    public void clickQQ2() {
        CommonEvents.clickButton(QQ2);
    }

    public String getViewQQ2() {
        String aux = children.getText();
        CommonEvents.clickButton(children);
        return aux;
    }

    public void clickQQ3() {
        CommonEvents.clickButton(QQ3);
    }

    public String getViewQQ3() {
        String aux = young.getText();
        CommonEvents.clickButton(young);
        return aux;
    }

    public void clickQQ4() {
        CommonEvents.clickButton(QQ4);
    }

    public String getViewQQ4() {
        String aux = twenty.getText();
        CommonEvents.clickButton(twenty);
        return aux;
    }

    public void clickQQ5() {
        CommonEvents.clickButton(QQ5);
    }

    public String getViewQQ5() {
        String aux = grandfather.getText();
        CommonEvents.clickButton(grandfather);
        return aux;
    }

    public void startGramartic() {
        CommonEvents.clickButton(StarGramatic);
    }

    public void clickQQQ1() {
        CommonEvents.clickButton(QQQ1);
    }

    public String getViewQQQ1() {
        String aux = eigth.getText();
        CommonEvents.clickButton(eigth);
        return aux;
    }

    public void clickQQQ2() {
        CommonEvents.clickButton(QQQ2);
    }

    public String getViewQQQ2() {
        String aux = time.getText();
        CommonEvents.clickButton(time);
        return aux;
    }

    public void clickQQQ3() {
        CommonEvents.clickButton(QQQ3);
    }

    public String getViewQQQ3() {
        String aux = midnight.getText();
        CommonEvents.clickButton(midnight);
        return aux;
    }

    public void clickQQQ4() {
        CommonEvents.clickButton(QQQ4);
    }

    public String getViewQQQ4() {
        String aux = bookstore.getText();
        CommonEvents.clickButton(bookstore);
        return aux;
    }

    public void clickQQQ5() {
        CommonEvents.clickButton(QQQ5);
    }

    public String getViewQQQ5() {
        String aux = saturday.getText();
        CommonEvents.clickButton(saturday);
        return aux;
    }

    public void clickQQQ6() {
        CommonEvents.clickButton(QQQ6);
    }

    public String getViewQQQ6() {
        String aux = april.getText();
        CommonEvents.clickButton(april);
        return aux;
    }

    //    *************************************************************************
    public void clickVerArtefacto() {
        CommonEvents.clickButton(VerAttefacto);
    }

    public void clickEliminar() {
        CommonEvents.clickButton(Eliminar);
    }

    //---------------------------------Crear Artefacto-----------------------------------------
    public void create(String nombre, String modelo, String estado, int cantidad) {
        System.out.println("Imprimiendo = " + " - " + nombre + " - " + modelo + " - " + estado + " - " + cantidad + " - ");
        CommonEvents.setInputField(nombreArt, nombre);
        CommonEvents.setInputField(modeloArt, modelo);
        CommonEvents.setInputField(estadoArt, estado);
//        CommonEvents.setInputField(cantidadArt,cantidad);
        CommonEvents.clickButton(add);
    }


}
