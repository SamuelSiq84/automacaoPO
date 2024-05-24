package web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import web.commons.ScrollPage;
import web.steps.HomeStep;
import web.steps.LoginStep;
import web.steps.ProdutoStep;

import java.time.Duration;

@DisplayName("Testes Automatizados")

public class WebTests {

    public WebDriver driver;
    ProdutoStep produtoStep = new ProdutoStep(driver);



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
                .acessarProdutoHome()
                .iframeAd()
                .buscarProdutoPorNome("Sleeveless Dress");
        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(), 'Sleeveless Dress')]"))
                .isDisplayed(),true,"Realizado busca pela descrição do produto com sucesso");
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }



}
