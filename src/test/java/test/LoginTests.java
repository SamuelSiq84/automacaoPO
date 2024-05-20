package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.LoginStep;

import java.time.Duration;

@DisplayName("Testes Automatizados da Funcionalide de Login")

public class LoginTests {

    private WebDriver driver;

    @BeforeEach
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

    }

    @Test
    @DisplayName("Realizar acessar a Home Page")
    public void acessarHomeLogin(){
        LoginStep loginStep = new LoginStep(driver);
        loginStep
                .acessarHomePage("https://automationexercise.com/")
                .acessarLoginHome()
                .acessarComUsuarioValido();
    }
    @AfterEach
    public void tearDown(){
        //driver.quit();
    }



}
