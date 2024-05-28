package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;





    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;


    }
}
