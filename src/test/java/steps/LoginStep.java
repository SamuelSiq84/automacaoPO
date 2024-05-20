package steps;

import map.LoginMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStep extends LoginMap {

    LoginMap loginMap;
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public LoginStep acessarHomePage(String url){
        driver.get(url);
        return this;
    }

    public LoginStep acessarLoginHome(){
        btnLogin.click();
        return this;
    }
    public LoginStep acessarComUsuarioValido(){
        email.sendKeys("test@test.com");
        password.sendKeys("123456");
        submit.click();
        return this;
    }


}
