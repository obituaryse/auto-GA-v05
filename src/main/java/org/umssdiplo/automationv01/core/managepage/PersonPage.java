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
}
