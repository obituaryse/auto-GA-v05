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

    @FindBy(className = "gl-product-card__details")
    private WebElement elementZapatilla;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;


    public void hoverToElement(String element){
        CommonEvents.hoverToElement(tabHombre);
    }

    public void clickInFutbol() {
        CommonEvents.clickButton(elementFutbol);
    }
}
