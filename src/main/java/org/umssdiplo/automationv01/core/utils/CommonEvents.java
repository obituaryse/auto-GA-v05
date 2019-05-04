package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.util.List;

public class CommonEvents {

    /**
     * This method set text content to web element.
     *
     * @param webElement Is web element.
     * @param content    Is the content that will be set to the web element.
     */
    public static void setInputField(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(content);
    }

    /**
     * This method perform a click action in a web element.
     *
     * @param webElement Is the web element that will be pressed.
     */
    public static void clickButton(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    /**
     * This method perform a click in a non visible element in the UI.
     *
     * @param webElement the WebElement non visible in the UI.
     */
    public static void jsClickElement(WebElement webElement) {
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].click();", webElement);
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isVisible(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method verifies if a web element is visible.
     *
     * @param webElement is the web element.
     * @return true if web element is visible or false if it isn't visible.
     */
    public static boolean isPresent(WebElement webElement) {
        try {
            return webElement.isEnabled();
        } catch (NoSuchElementException e) {
            System.out.println("Element do not exits.");
            return false;
        }
    }

    /**
     * This method perform a search in a WebElement list based on a content string parameter.
     *
     * @param elements is the WebElements lists.
     * @param content  is the content parameter.
     * @return the WebElement search result.
     */
    public static WebElement findWebElement(List<WebElement> elements, String content) {
        return elements.stream()
                .filter(element -> content.equals(element.getText()))
                .findAny()
                .orElse(null);
    }

    /**
     * This method return the text content of a WebElement.
     *
     * @param webElement is the WebElement to extract the text.
     * @return the text content of the WebElement.
     */
    public static String getTextContent(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * This method get title of current page.
     *
     * @return title of the current page.
     */
    public static String getPageTitle() {
        return ManageDriver.getInstance().getWebDriver().getTitle();
    }

    /**
     * This method press enter key to web element.
     *
     * @param webElement is the WebElement.
     */
    public static void pressEnterKey(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public static WebElement findLevelByLevel(String element) {
        WebElement units = null;  //span[contains(text(),'Choose a response')]
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//ul[@class='block-col col-md-4 col-md-offset-2 col-sm-6 col-xs-12']")).size() > 0)
            units = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//ul[@class='block-col col-md-4 col-md-offset-2 col-sm-6 col-xs-12']"));
        WebElement unit = null;
        System.out.println("elelelele "+units.toString());
        if (units.findElements(By.xpath("//h4[contains(text(),'" + element + "')]")).size() > 0) {
            unit = units.findElement(By.xpath("//h4[contains(text(),'" + element + "')]/parent::div/parent::div/parent::a"));
            System.out.println("encooooomm"+unit.toString());
        }
        return unit;
    }

    public static WebElement getUnit(String unit) {
        WebElement unitElement = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//h3[contains(text(),'" + unit + "')]")).size() > 0)
            unitElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//h3[contains(text(),'" + unit + "')]/parent::div/parent::article"));


        /*if (units.findElements(By.xpath("//*[contains(text(),'" + element + "')]")).size() > 0)
            unit = units.findElement(By.xpath("//*[contains(text(),'" + element + "')]"));*/
        return unitElement;
    }

    public static WebElement getActivityToStart(WebElement unit,String activity) {
        WebElement element = null;
        System.out.println("ANTES DE BUSCARRR");
        System.out.println(unit.getText());
        element = unit.findElement(By.xpath(".//div[contains(text(),'" + activity + "')]/parent::li"));
        System.out.println("ElementPPPPP"+element.toString());
        System.out.println("ElementPPPPP"+element.getText());
        return element.findElement(By.xpath(".//button[contains(text(),'Start')]"));
    }

    public static void clickElement(WebElement level) {
        level.click();
    }

    public static WebElement findElementByText(String option) {
        WebElement unitElement = null;
        if (option.equals("play")){
            unitElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[4]/article/div[2]/div/div[2]/div/span[3]"));
        }else if (option.equals("two")){
            unitElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[6]/article/div[2]/div/div[3]/div/span[3]"));
        }else{
            if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath(".//p[contains(text(),'" + option + "')]")).size() > 0) {
                unitElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(".//p[contains(text(),'" + option + "')]"));
                System.out.println("ENCONTRADOOO "+unitElement.toString());
                System.out.println("ENCONTRADOOO "+unitElement.getText());
            }
        }
        return unitElement;
    }

    public static WebElement findElementByXpath(String element) {
        WebElement webElement = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath(element)).size() > 0){
            webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(element));
        }
        return  webElement;
    }

    public static void waitWebElementVisible(WebElement element){
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitWebElementClickable(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitWebElementLocated(String name) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'" + name + "')]")));
    }

    public static WebElement selectAswer(WebElement elementFalseTrue, String answer, int question) {
        List<WebElement> resp =  elementFalseTrue.findElements(By.xpath(".//p[contains(text(),'" + answer + "')]"));
        for (int i = 0; i < resp.size(); i++) {
            System.out.println("RESPESTAD "+resp.get(i).toString());
            System.out.println("RESPESTAD "+resp.get(i).getText());
        }

        return resp.get(question-1);
    }

    /*public static void setElement() {
        List<WebElement> resp =  questions.findElements(By.xpath(".//p[@class='ng-scope']"));
        List<WebElement> resp2 =  resp.get(0).findElements(By.xpath(".//input[@class='iap-fill-drop-aprox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']"));
        for (int i = 0; i < resp2.size(); i++) {
            resp2.get(i).sendKeys("jaja");
        }
    }*/

    public static void seTwotElement(WebElement questions, int question, String arg1, String arg2) {
        List<WebElement> resp =  questions.findElements(By.xpath(".//p[@class='ng-scope']"));
        List<WebElement> resp2 =  resp.get(question-1).findElements(By.xpath(".//input[@class='iap-fill-drop-aprox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']"));
        WebElement element1 = resp2.get(0);
        WebElement element2 = resp2.get(1);
        waitWebElementVisible(element1);
        waitWebElementVisible(element2);
        element1.sendKeys(arg1);
        element2.sendKeys(arg2);
    }

    public static void seTreetElement(WebElement questions, int question, String arg1, String arg2, String arg3) {
        List<WebElement> resp =  questions.findElements(By.xpath(".//p[@class='ng-scope']"));
        List<WebElement> resp2 =  resp.get(question-1).findElements(By.xpath(".//input[@class='iap-fill-drop-aprox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']"));
        WebElement element1 = resp2.get(0);
        WebElement element2 = resp2.get(1);
        WebElement element3 = resp2.get(2);
        waitWebElementVisible(element1);
        waitWebElementVisible(element2);
        waitWebElementVisible(element3);
        element1.sendKeys(arg1);
        element2.sendKeys(arg2);
        element3.sendKeys(arg3);
    }

    public static void setFourElement(WebElement questions, int question, String arg1, String arg2, String arg3, String arg4) {
        List<WebElement> resp =  questions.findElements(By.xpath(".//p[@class='ng-scope']"));
        List<WebElement> resp2 =  resp.get(question-1).findElements(By.xpath(".//input[@class='iap-fill-drop-aprox ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty']"));
        WebElement element1 = resp2.get(0);
        WebElement element2 = resp2.get(1);
        WebElement element3 = resp2.get(2);
        WebElement element4 = resp2.get(3);
        waitWebElementVisible(element1);
        waitWebElementVisible(element2);
        waitWebElementVisible(element3);
        waitWebElementVisible(element4);
        element1.sendKeys(arg1);
        element2.sendKeys(arg2);
        element3.sendKeys(arg3);
        element4.sendKeys(arg4);
    }

    public static WebElement findByText(String test) {
        WebElement webElement = null;
        if (ManageDriver.getInstance().getWebDriver().findElements(By.xpath(".//span[text() = '100%']")).size() > 0)
            webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(".//span[text() = '100%']"));
        return webElement;
    }

    public static WebElement getWebElementByContent(String content){
        WebElement mio = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//*[contains(text(),'" + content + "')]")).size() > 0)
            mio = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[contains(text(),'" + content + "')]"));
        System.out.println("ANTESSS "+mio.toString());
        System.out.println("ANTESSS "+mio.getText());
        return mio;
    }

    public static void clickInNextView() {
        System.out.println("LEEEEEEEE ");
        WebElement mio = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//*[@id=\"iap-footer-fillin-b649df30-6947-4cfc-86dd-1f32bd2f4617-774\"]/div/div/div/article/span[3]")).size() > 0)
            mio = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[@id=\"iap-footer-fillin-b649df30-6947-4cfc-86dd-1f32bd2f4617-774\"]/div/div/div/article/span[3]"));
        System.out.println("TERMINADOOO "+mio.toString());
        System.out.println("TERMINADOOO "+mio.getText());
        waitWebElementClickable(mio);
        mio.click();
    }

    public static List<WebElement> findElementsByText(String text){
        List<WebElement> webElements = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + text + "')]")).size() > 0)
            webElements = ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + text + "')]"));
        return webElements;
    }

    public static List<WebElement> findWebElementsSelects() {
        List<WebElement> drop = ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//span[contains(text(),'Choose a response')]"));
        java.util.Iterator<WebElement> i = drop.iterator();
        while(i.hasNext()) {
            WebElement row = i.next();
            System.out.println(row.getText());
            System.out.println(row.toString());
        }
        return drop;
    }

    public static WebElement findElementByContent(WebElement parent, String word){
        WebElement element = null;
        if (parent.findElements(By.xpath("//span[contains(text(),'" + word + "')]")).size() > 0){
            element = parent.findElement(By.xpath("//span[contains(text(),'" + word + "')]")); //this would search any **x** as a sub-child of your list's elements
        }
        return element;
    }

    public static WebElement findElementForSpan(String content){


        //WebElement listRes = null;
        WebElement esperanza = null;
        /*if (ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//div[@class='col-xs-6 col-sm-5 col-md-4 hidden-xs']")).size() > 0){
            listRes = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//div[@class='col-xs-6 col-sm-5 col-md-4 hidden-xs']"));
            System.out.println("encoontransss");
        }

        System.out.println("YAMILLL"+content);*/
        //WebElement mio = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[3]/div/div[2]/span[1]"));

        //System.out.println("elemento000"+mio.toString());

        esperanza = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//span[contains(text(),'"+content+"')]/parent::div"));
        System.out.println("queeeeee"+esperanza.toString());
        WebElement mio = getElementByAnswerNumber(esperanza);
        return mio;
    }

    private static WebElement getElementByAnswerNumber(WebElement esperanza) {
        String getNumber = getElementXPath(ManageDriver.getInstance().getWebDriver(),esperanza);
        System.out.println("antes"+getNumber);
        getNumber = getNumber.substring(getNumber.length()-3,getNumber.length()-2);
        System.out.println("despues"+getNumber);
        int num = Integer.parseInt(getNumber);
        WebElement mio = null;
        if(num>= 0 && num <= 4){
            mio = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[3]/div/div["+(num+2)+"]/span[1]"));
        }
        return  mio;
    }

    public static String getElementXPath(WebDriver driver, WebElement element) {
        return (String)((JavascriptExecutor)driver).executeScript("gPt=function(c){if(c.id!==''){return'id(\"'+c.id+'\")'}if(c===document.body){return c.tagName}var a=0;var e=c.parentNode.childNodes;for(var b=0;b<e.length;b++){var d=e[b];if(d===c){return gPt(c.parentNode)+'/'+c.tagName+'['+(a+1)+']'}if(d.nodeType===1&&d.tagName===c.tagName){a++}}};return gPt(arguments[0]).toLowerCase();", element);
    }

    public static WebElement findElementForDrop(String content){
        WebElement webElementin = null;
        WebElement drop = null;
        System.out.println("BUSCANDO"+content);
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + content + "')]")).size() > 0)
            webElementin = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//p[contains(text(),'" + content + "')]"));

        WebElement parent = (WebElement) ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver()).executeScript(
                "return arguments[0].parentNode;", webElementin);
        if (parent.findElements(By.xpath("//span[@class='easy-droppable iap-drop-match-response']")).size() > 0) {
            drop = parent.findElement(By.xpath("//span[@class='easy-droppable iap-drop-match-response']"));
            System.out.println("encontradoo");
        }else
            System.out.println("no se encontro el elemento");

        // return ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[2]/div/div[1]/p/div/span/span[2]"));
        return drop;
    }

    public static void drapAndDropFunction(WebElement elementFrom, WebElement elementTo) {
        Actions act = new Actions(ManageDriver.getInstance().getWebDriver());
        //Dragged and dropped.
        act.dragAndDrop(elementFrom, elementTo).build().perform();
    }

    public static WebElement findElementForSpanNew(String content){
        WebElement esperanza = null;
        esperanza = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//span[contains(text(),'"+content+"')]/parent::div"));
        String index = esperanza.getAttribute("drag-index");
        int num = Integer.parseInt(index)+2;
        System.out.println("DRAKKK "+num);
        System.out.println("queeeeee"+esperanza.toString());
        return ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[3]/div/div["+num+"]/span[1]"));
    }

    public static WebElement findElementForDropByAnswer(String section, String to) {


        List<WebElement> webElementin = null;
        WebElement drop = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[@class='iap-drag-question-choice ng-isolate-scope']/p")).size() > 0)
            webElementin = ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[@class='iap-drag-question-choice ng-isolate-scope']/p"));
        java.util.Iterator<WebElement> j = webElementin.iterator();
        while(j.hasNext()) {
            WebElement row = j.next();
            System.out.println(row.getText());
        }

        for (int i = 0; i < webElementin.size(); i++) {
            System.out.println("esto se comotapara "+section+" con este otro "+webElementin.get(i).getText());
            if (webElementin.get(i).getText().contains(section)){
                if (to.equals("occupation")){
                    drop = webElementin.get(i+1);
                    break;
                }else if(to.equals("nationality")){
                    drop = webElementin.get(i+2);
                    break;
                }
            }else{
                System.out.println("no hagggsgs");
            }
        }

        System.out.println("tesxt "+drop.getText());
        System.out.println("stringg"+drop.toString());
        /*WebElement parent = (WebElement) ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver()).executeScript(
                "return arguments[0].parentNode;", webElementin);
        if (parent.findElements(By.xpath("//span[@class='easy-droppable iap-drop-match-response']")).size() > 0) {
            drop = parent.findElement(By.xpath("//span[@class='easy-droppable iap-drop-match-response']"));
            System.out.println("encontradoo");
        }else
            System.out.println("no se encontro el elemento");
*/
        // return ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[2]/div/div[1]/p/div/span/span[2]"));
        WebElement droper = null;

        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//span[@class='iap-dd-pool-into-gaps-dropped-ans ng-binding ng-scope iap-drop-box-line iap-dd-pool-into-gaps-pointer-none']")).size() > 0)
            droper = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//span[@class='iap-dd-pool-into-gaps-dropped-ans ng-binding ng-scope iap-drop-box-line iap-dd-pool-into-gaps-pointer-none']"));

        return droper;
    }

    public static void scrollPage() {
        /*JavascriptExecutor js = (JavascriptExecutor) ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]"));
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");*/

        WebElement element = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[2]/div/p/p[20]"));
        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        //Thread.sleep(500);
        /*WebElement element = driver.findElement(By.id("my-id"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();*/
    }

    public static void setInputFieldDate(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(content);
    }

    public static boolean isClickable(WebElement webe) {
        try {
            WebDriverWait wait = new WebDriverWait(ManageDriver.getInstance().getWebDriver(), 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
