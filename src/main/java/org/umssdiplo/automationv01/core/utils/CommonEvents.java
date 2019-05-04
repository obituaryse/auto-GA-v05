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
    public static void setInputFieldDate(WebElement webElement, String content) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
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

    public static boolean isClickable(WebElement webe) {
        try {
            WebDriverWait wait = new WebDriverWait(ManageDriver.getInstance().getWebDriver(), 5);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        } catch (Exception e) {
            return false;
        }
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

    public static List<WebElement> findWebElementBy(String content) {
        List<WebElement> drop = ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'Choose a response')]"));
        java.util.Iterator<WebElement> i = drop.iterator();
        while(i.hasNext()) {
            WebElement row = i.next();
            System.out.println(row.getText());
            System.out.println(row.toString());
        }
        return drop;
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

    public static void waitWebElementVisible(WebElement element){
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement findElementByXpath(String element) {
        WebElement webElement = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath(element)).size() > 0){
            webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(element));
        }
        return  webElement;
    }

    public static List<WebElement> findElementsByText(String text){
        List<WebElement> webElements = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + text + "')]")).size() > 0)
            webElements = ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + text + "')]"));
        return webElements;
    }

    public static WebElement findElementByContent(WebElement parent, String word){
        WebElement element = null;
        if (parent.findElements(By.xpath("//span[contains(text(),'" + word + "')]")).size() > 0){
            element = parent.findElement(By.xpath("//span[contains(text(),'" + word + "')]")); //this would search any **x** as a sub-child of your list's elements
        }
        return element;
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

    public static WebElement findElementForSpanNew(String content){
        WebElement esperanza = null;
        esperanza = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//span[contains(text(),'"+content+"')]/parent::div"));
        String index = esperanza.getAttribute("drag-index");
        int num = Integer.parseInt(index)+2;
        System.out.println("DRAKKK "+num);
        System.out.println("queeeeee"+esperanza.toString());
        return ManageDriver.getInstance().getWebDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div[1]/div[4]/div[1]/article/div[3]/div/div["+num+"]/span[1]"));
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
        Actions act=new Actions(ManageDriver.getInstance().getWebDriver());
        //Dragged and dropped.
        act.dragAndDrop(elementFrom, elementTo).build().perform();
    }

    public static WebElement getWebElementByContent(String content){
        WebElement mio = null;
        if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//*[contains(text(),'" + content + "')]")).size() > 0)
            mio = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[contains(text(),'" + content + "')]"));
        return mio;
    }

    public static WebElement findByText(String text){
        WebElement webElement = null;
        if (ManageDriver.getInstance().getWebDriver().findElements(By.xpath(".//span[text() = '100%']")).size() > 0)
            webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(".//span[text() = '100%']"));
        //webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath(".//span[text() = '100%']"));
        /*WebElement parent = (WebElement) ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver()).executeScript(
                "return arguments[0].parentNode;", webElement);*/
        //WebElement parent = webElement.findElement(By.xpath("./.."));
        //WebElement parent2 = parent.findElement(By.xpath("./.."));
        //if(ManageDriver.getInstance().getWebDriver().findElements(By.xpath("//p[contains(text(),'" + text + "')]")).size() > 0)
        //webElement = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("//*[@id=\"preview_iap\"]/div/div/section/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div[3]/div/article/div[1]/div/span/span/span/span"));
        return webElement;
    }

    public static void jejejejej() {
        System.setProperty("webdriver.chrome.driver"," E://Selenium//Selenium_Jars//chromedriver.exe");
        WebDriver  driver= ManageDriver.getInstance().getWebDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //Element(BANK) which need to drag.
        WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element(DEBIT SIDE) on which need to drop.
        WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Element(SALES) which need to drag.
        WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));

        //Element(500) which need to drag.
        WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(DEBIT SIDE) on which need to drop.
        WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));

        //Element(500) which need to drag.
        WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));

        //Element(CREDIT SIDE) on which need to drop.
        WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));

        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        //BANK drag and drop.
        act.dragAndDrop(From1, To1).build().perform();

        //SALES drag and drop.
        act.dragAndDrop(From2, To2).build().perform();

        //500 drag and drop debit side.
        act.dragAndDrop(From3, To3).build().perform();

        //500 drag and drop credit side.
        act.dragAndDrop(From4, To4).build().perform();

        //Verifying the Perfect! message.
        if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())
        {
            System.out.println("Perfect Displayed !!!");
        }
        else
        {
            System.out.println("Perfect not Displayed !!!");
        }
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

    public static boolean like(String str, String expr) {
        expr = expr.toLowerCase(); // ignoring locale for now
        expr = expr.replace(".", "\\."); // "\\" is escaped to "\" (thanks, Alan M)
        // ... escape any other potentially problematic characters here
        expr = expr.replace("?", ".");
        expr = expr.replace("%", ".*");
        str = str.toLowerCase();
        System.out.println("AHHHH "+str+" EXPRESION "+expr);
        return str.matches(expr);
    }

    public static void waitWebElementClickable(WebElement webElement) {
        ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
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
}
