package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.HomeStep;
import steps.LoginStep;
import steps.ProdutoStep;

import java.time.Duration;

@DisplayName("Testes Automatizados")

public class WebTests {

    public WebDriver driver;

    @BeforeEach
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @Test
    @DisplayName("Realizar Login pela Home Page")
    public void acessarHomeLogin(){

        HomeStep homeStep = new HomeStep(driver);
        homeStep
                .acessarHomePage("https://automationexercise.com/");

        LoginStep loginStep = new LoginStep(driver);
        loginStep
                .acessarLoginHome()
                .acessarComUsuarioValido();
    }
    @Test
    @DisplayName("Realizar busca de produto por descrição")
    public void acessarProduto(){
        HomeStep homeStep = new HomeStep(driver);
        homeStep
                .acessarHomePage("https://automationexercise.com/");

        ProdutoStep produtoStep = new ProdutoStep(driver);
        produtoStep
                .acessarProdutoHome();

    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }



}
