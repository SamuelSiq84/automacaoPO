package web.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.commons.ManipularElementos;
import web.map.ProdutoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoStep extends ProdutoMap {

//    ManipularElementos manipularElementos = new ManipularElementos(driver);

    ManipularElementos resolvers = new ManipularElementos(driver);

   ProdutoMap produtoMap;

    public ProdutoStep(WebDriver driver) {
        super(driver);
    }
    public ProdutoStep acessarProdutoHome(){
        btnProdutos.click();
        return this;
    }
    public ProdutoStep fecharIframeAdd(){
        resolvers.iframeAd();
        fecharAd.click();
        return this;
    }
    public ProdutoStep buscarProdutoPorNome(String produto){
        campoBusca.sendKeys(produto);
        btnLupa.click();
        resolvers.scrollDown();
        btnViewProduct.click();

    return this;
    }
    public ProdutoStep clicarAddCarrinho(){
        addCar.click();
        return this;
    }

    public ProdutoStep validarPopAddCar(){
        driver.findElement(By.xpath("//h4[contains(text(), 'Added!')]"));
        btnViewCar.click();
    return this;

    }
    public ProdutoStep clicarCheckoutCar(){
        btnCheckoutCar.click();
    return this;
    }
//    @FindBy(xpath = "//h4[contains(text(), 'Checkout')]")
//    public WebElement lblcheckout;





}
