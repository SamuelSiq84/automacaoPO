package web.commons;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.BasePage;
import web.steps.ProdutoStep;

public class ManipularElementos extends BasePage {
    public ManipularElementos(WebDriver driver) {
        super(driver);
    }


    public ManipularElementos scrollDown(){
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
        jsExecuter.executeScript("window.scrollTo(0,500)");
        return this;
    }
    public ManipularElementos iframeAd(){
        driver.switchTo().frame(driver.findElement(By.id("aswift_6")));
        return this;
    }

}
