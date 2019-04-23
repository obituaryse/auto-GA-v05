package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class PumaPage extends BasePage {

    @FindBy(xpath = "html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement tabHombre;

    @FindBy(xpath = "html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement elementFutbol;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/a/img[2]")
    private WebElement hoverItem;

    @FindBy(xpath = "html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/a/div[2]/div[2]/span[1]")
    private WebElement elementZapatilla;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;


    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[1]/a/img[2]")
    private WebElement item;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/button/span")
    private WebElement selectTalla;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[1]/button")
    private WebElement selectItem;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[3]/div[2]/div[3]/div/div/form/div[3]/button")
    private WebElement buttonCarrito;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[1]/div[2]/div/p/span[3]")
    private WebElement bagCount;

    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div[1]/div[3]/div/a[1]")
    private WebElement buttonVerCarrito;


    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[1]/div[1]/div[2]/div[1]/div/div[3]/section/div[4]/div/div[2]")
    private WebElement priceTotal;

    private String priceShoe;

    public void hoverToElement(String element){
        CommonEvents.hoverToElement(tabHombre);
    }

    public void clickInFutbol() {
        CommonEvents.waitWebElementIsVisible(elementFutbol);
        CommonEvents.clickButton(elementFutbol);
    }

    public void saveShoePrice(String item){
        CommonEvents.waitWebElementLocated(item);
        CommonEvents.hoverToElement(hoverItem);
        priceShoe = elementZapatilla.getText();
        System.out.println("el precio  de la zapatilla es "+priceShoe);
    }

    public void clickInItem() {
        CommonEvents.clickButton(item);
    }

    public void selectTalla(String talla) {
        CommonEvents.clickButton(selectTalla);
        CommonEvents.clickButton(selectItem);
    }

    public void clickInButton(String button) {
        CommonEvents.clickButton(buttonCarrito);
    }

    public int getViewShoopingBag() {
        String aux = bagCount.getText();
        aux = aux.replaceAll("\\D+","");
        System.out.println("jejeje  "+aux);
        int num = Integer.parseInt(aux);
        return num;
    }

    public void clickInButton2() {
        CommonEvents.clickButton(buttonVerCarrito);
    }

    public boolean getTitle(String title) {
        String xpathFinder = "//a[contains(@title,'"+title+"')]";
        System.out.println(xpathFinder);
        WebElement aux = CommonEvents.findElementByXpath(xpathFinder);
        if (aux != null)
            return true;
        else
            return false;
    }

    public float getPriceShoe(){
        priceShoe = priceShoe.replaceAll("[^0-9?!\\.]","");
        return Float.parseFloat(priceShoe);
    }

    public String getPriceTotal(){
        String aux = priceTotal.getText();
        aux = aux.replaceAll("[^0-9?!\\.]","");
        return aux;
    }

}
