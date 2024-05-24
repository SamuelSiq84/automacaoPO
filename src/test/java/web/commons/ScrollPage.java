package web.commons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import web.BasePage;

public class ScrollPage extends BasePage {
    public ScrollPage(WebDriver driver) {
        super(driver);
    }
    public ScrollPage scrollDown(){
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
        jsExecuter.executeScript("window.scrollTo(0,500)");
    return this;
    }
}
