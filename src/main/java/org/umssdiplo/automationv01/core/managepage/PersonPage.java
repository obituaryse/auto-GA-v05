package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

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
}
