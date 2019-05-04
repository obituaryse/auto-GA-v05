package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

import java.util.List;

public class PersonPage  extends BasePage  {
    @FindBy(xpath = "/html/body/section/section/section[2]/ul[1]/li[2]/a/div/div[2]")
    private WebElement buttonass;

    @FindBy(id = "nextBtn")
    private WebElement buttonNextView;

    private List<WebElement> webElementsFalse;

    private List<WebElement> webElementsTrue;

    @FindBy(xpath = "/html/body/section/section/section/div/div/article[2]/div[2]/ul/li[1]/div[2]/a/button")
    private WebElement startUnitOne;

    @FindBy(xpath = "/html/body/section/section/section/div/div/article[2]/div[2]/ul/li[3]/div[2]/a/button")
    private WebElement startUnitTwo;

    @FindBy(xpath = "/html/body/section/section/section/div/div/article[2]/div[2]/ul/li[4]/div[2]/a/button")
    private WebElement startUnitfour;

    private List<WebElement> selects;


    @FindBy(xpath = "//*[@class='iap-text-response iap-scroll col-sm-5 col-md-4']")
    private WebElement elementFalseTrue;

    @FindBy(xpath = "//div[@class='iap-drag-content iap-fill-content']")
    private WebElement questions;

    @FindBy(xpath = "//a[@data-uuid='a85584f7-6328-4017-b53b-80f0dbcd614c_1441883247']")
    private WebElement startUnit;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/footer/div/div/div/article/span[3]")
    private WebElement buttonNext;



    @FindBy(name = "email")
    private WebElement usernameInputField;
    @FindBy(name = "password")
    private WebElement passwordInputField;
    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;
    @FindBy(xpath = "//a[@data-uuid='d68040f2-5f8a-4297-b307-523152be9c09_1441884861']")
    private WebElement Start;
    @FindBy(xpath = "//span[@ng-click=\"selectToggle(0)\"]")
    private WebElement Question1;
    @FindBy(xpath = "//span[text()='sisters']")
    private WebElement Sister;
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
    @FindBy(xpath = "//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/article/div/div[1]/span/p[3]/span/span/span/span[4]/span")
    private WebElement sons;
    @FindBy(xpath = "//span[@ng-click='selectToggle(1)']")
    private WebElement QQ2;
    @FindBy(xpath = "//span[text()='I have three children.']")
    private WebElement children;
    @FindBy(xpath = "//span[@ng-click='selectToggle(2)']")
    private WebElement QQ3;
    @FindBy(xpath = "//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[3]/article/div/div[1]/span/p[3]/span/span/span/span[3]/span")
    private WebElement young;
    @FindBy(xpath = "//span[@ng-click='selectToggle(3)']")
    private WebElement QQ4;
    @FindBy(xpath = "//span[text()='Twenty-five.']")
    private WebElement twenty;
    @FindBy(xpath = "//span[@ng-click='selectToggle(4)']")
    private WebElement QQ5;
    @FindBy(xpath = "//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[5]/article/div/div[1]/span/p[3]/span/span/span/span[2]/span")
    private WebElement grandfather;
    @FindBy(xpath = "//a[@data-uuid=\"28dc552c-2a81-4725-a6bd-bba5cde0fe41_1441885271\"]")
    private WebElement StarGramatic;
    @FindBy(xpath = "//span[@ng-click='selectToggle(0)']")
    private WebElement QQQ1;
    @FindBy(xpath = "//span[text()='At 8:00.']")
    private WebElement eigth;
    @FindBy(xpath = "//span[@ng-click='selectToggle(1)']")
    private WebElement QQQ2;
    @FindBy(xpath = "//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[2]/article/div/div[1]/span/p[3]/span/span/span/span[1]/span")
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

    public void clickInElement(String element) {
        String xpathFinder = "//a[@href='/topnotch3e/practice/level1.html']";
        System.out.println(xpathFinder);
        WebElement elemento = CommonEvents.findElementByXpath(xpathFinder);
        CommonEvents.clickButton(elemento);
    }

    public boolean findUnitAndClickInStart(String unit, String activity) {
        WebElement units = CommonEvents.getUnit(unit);
        WebElement start = CommonEvents.getActivityToStart(units,activity);
        CommonEvents.clickButton(start);
        return true;
    }

    public boolean clickInNextView() {
        System.out.println("Clickable? " + buttonNextView.isEnabled());
        String clase = buttonNextView.getAttribute("class");
        System.out.println(buttonNextView.getAttribute("class"));
        if (clase.equals("btn button iap-footer-next-section iap-btn-grey")){
            //btn button iap-footer-next-section b-orange
            return false;
        }else{
            CommonEvents.waitWebElementVisible(buttonNextView);
            CommonEvents.clickButton(buttonNextView);
            return true;
        }
    }

    public boolean clickInAnswer(String option, int question) {
        WebElement element = CommonEvents.findElementByText(option);
        if (element != null){
            CommonEvents.waitWebElementVisible(element);
            CommonEvents.clickButton(element);
            return true;
        }else
            return false;
    }

    public void replyQuestion(String answer, int question) {
        WebElement response = CommonEvents.selectAswer(elementFalseTrue, answer, question);
        CommonEvents.waitWebElementVisible(response);
        CommonEvents.clickButton(response);
    }

    public void writeTheTwoAnswer(int question, String arg1, String arg2) {
        CommonEvents.seTwotElement(questions, question, arg1, arg2);
    }


    public void writeTheTreeAnswer(int question, String arg1, String arg2, String arg3) {
        CommonEvents.seTreetElement(questions, question, arg1, arg2, arg3);
    }

    public void writeTheFourAnswer(int question, String arg1, String arg2, String arg3, String arg4) {
        CommonEvents.setFourElement(questions, question, arg1, arg2, arg3, arg4);
    }

    public String getCalification(String test) {
        System.out.println("MIREDDDDDD");
        WebElement aux = CommonEvents.findByText(test);
        CommonEvents.waitWebElementVisible(aux);
        return aux.getText();
    }

    public boolean clickInButton(String button) {
        WebElement aux = CommonEvents.getWebElementByContent(button);
        if (aux != null) {
            CommonEvents.clickButton(aux);
            return true;
        }else
            return false;
    }

    public boolean answerCorrect() {
        return true;
    }

    public void nextViewPage() {
        CommonEvents.clickInNextView();
    }

    public void clickInStart(String element) {

        if (element.equals("1")){
            CommonEvents.clickButton(startUnitOne);
        }else if (element.equals("2")){
            CommonEvents.clickButton(startUnit);
            webElementsFalse = CommonEvents.findElementsByText("False");
            webElementsTrue = CommonEvents.findElementsByText("True");
        }else if(element.equals("3")){
            CommonEvents.clickButton(startUnitTwo);
            selects = CommonEvents.findWebElementsSelects();
            System.out.println("TAMANYY"+selects.size());
        }else if(element.equals("4")){
            CommonEvents.clickButton(startUnitfour);
        }


    }

    public boolean selectAnoption(String option, int question) {
        boolean aux = false;
        if (question>=1 && question <=4){
            for (int i = 0; i < selects.size(); i++) {
                if (i == question-1){
                    System.out.println("TEXTO"+selects.get(i).getText());
                    CommonEvents.clickButton(selects.get(i));
                    WebElement opcion = CommonEvents.findElementByContent(selects.get(i),option);
                    if (opcion != null){
                        System.out.println("no es nuloooo"+opcion.getText());
                        CommonEvents.waitWebElementVisible(opcion);
                        CommonEvents.clickButton(opcion);
                        aux = true;
                    }
                }
            }
        }
        return aux;
    }

    public boolean dragAndDropOption(String from, String to) {
        WebElement elementFrom = CommonEvents.findElementForSpan(from);
        System.out.println("elemento111"+elementFrom.toString());
        WebElement elementTo = CommonEvents.findElementForDrop(to);
        System.out.println("elementoTOOO"+elementTo.toString());
        if (elementFrom!=null && elementTo!=null){
            CommonEvents.drapAndDropFunction(elementFrom,elementTo);
            return true;
        }else{
            return false;
        }

    }

    public void clickInNext() {
        System.out.println("antes de dar clickccccccccc");
        CommonEvents.clickButton(buttonNext);
    }

    public boolean dragAndDropAnswer(String from, String section, String to) {
        WebElement elementFrom = CommonEvents.findElementForSpanNew(from);
        System.out.println("elemento111"+elementFrom.toString());
        WebElement elementTo = CommonEvents.findElementForDropByAnswer(section,to);
        System.out.println("elementoTOOO"+elementTo.toString());
        CommonEvents.waitWebElementVisible(elementFrom);
        CommonEvents.waitWebElementClickable(elementFrom);
        CommonEvents.waitWebElementVisible(elementFrom);
        CommonEvents.waitWebElementClickable(elementTo);
        if (elementFrom!=null && elementTo!=null){
            CommonEvents.drapAndDropFunction(elementFrom,elementTo);
            return true;
        }else{
            return false;
        }
    }

    public void downScrollbar() {
        CommonEvents.scrollPage();
    }

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

    public boolean getViewQQ1() {
        CommonEvents.clickButton(sons);
        return true;
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

    public void clickFundamentals() {
        String xpathFinder = "/html/body/section/section/section[2]/ul[1]/li[1]/a";
        System.out.println(xpathFinder);
        WebElement elemento = CommonEvents.findElementByXpath(xpathFinder);
        CommonEvents.clickButton(elemento);
    }
}
