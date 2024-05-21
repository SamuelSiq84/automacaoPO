package steps;

import map.HomeMap;
import org.openqa.selenium.WebDriver;

public class HomeStep extends HomeMap {

    public HomeStep(WebDriver driver) {
        super(driver);
    }

    public HomeStep acessarHomePage(String url){
        driver.get(url);
        return this;
    }
}
