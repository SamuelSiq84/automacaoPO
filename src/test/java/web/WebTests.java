package web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import web.map.ProdutoMap;
import web.steps.HomeStep;
import web.steps.LoginStep;
import web.steps.ProdutoStep;

import java.time.Duration;

@DisplayName("Testes Automatizados")

public class WebTests {

    public WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    HomeStep homeStep;
    ProdutoStep produtoStep;
    LoginStep loginStep;



    @BeforeEach
    public void Setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        ProdutoStep produtoStep = new ProdutoStep(driver);
        HomeStep homeStep = new HomeStep(driver);
    }

    @Test
    @DisplayName("Realizar Login pela Home Page")
    public void acessarHomeLogin(){

        homeStep
                .acessarHomePage("https://automationexercise.com/");
        loginStep
                .acessarLoginHome()
                .acessarComUsuarioValido();
    }
    @Test
    @DisplayName("Realizar busca de produto por descrição")
    public void acessarProduto(){

        homeStep
                .acessarHomePage("https://automationexercise.com/");
        produtoStep
                .acessarProdutoHome()
                .fecharIframeAdd()
                .buscarProdutoPorNome("Sleeveless Dress");

        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(), 'Sleeveless Dress')]"))
                .isDisplayed(),true,"Realizado busca pela descrição do produto com sucesso");
    }
    @Test
    @DisplayName("Realizar busca por descrição produto adicionando ao carrinho")
    public void adicionarProdutoCarrinho(){

        homeStep
                .acessarHomePage("https://automationexercise.com/");
        produtoStep
                .acessarProdutoHome()
                .fecharIframeAdd()
                .buscarProdutoPorNome("Sleeveless Dress")
                .clicarAddCarrinho()
                .validarPopAddCar();

        Assert.assertEquals(driver.findElement(By.xpath("//li[contains(text(), 'Shopping Cart')]"))
                .isDisplayed(),true,"Produto adicionado com sucesso");
    }
    @Test
    @DisplayName("Realizar o checkout do pedido")
    public void realizarCheckoutPedido(){

        homeStep
                .acessarHomePage("https://automationexercise.com/");
        produtoStep
                .acessarProdutoHome()
                .fecharIframeAdd()
                .buscarProdutoPorNome("Frozen Tops For Kids")
                .clicarAddCarrinho()
                .validarPopAddCar()
                .clicarCheckoutCar();

        Assert.assertEquals(driver.findElement(By.xpath("//h4[contains(text(), 'Checkout')]"))
                .isDisplayed(),true,"Checkout do pedido realizado com sucesso");
    }
    @AfterEach
    public void tearDown(){
        driver.quit();
    }




}
