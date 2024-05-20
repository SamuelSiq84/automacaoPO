package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.BasePage;

public class LoginMap extends BasePage {
    public LoginMap(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(), 'Signup / Login')]")
    public WebElement btnLogin;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    public WebElement submit;
}
