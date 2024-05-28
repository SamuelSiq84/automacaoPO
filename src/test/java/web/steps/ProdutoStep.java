package web.steps;

import org.openqa.selenium.WebElement;
import web.commons.ManipularElementos;
import web.map.ProdutoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoStep extends ProdutoMap {

    ManipularElementos manipularElementos = new ManipularElementos(driver);

    public ProdutoStep(WebDriver driver) {
        super(driver);
    }
    public ProdutoStep acessarProdutoHome(){
        btnProdutos.click();
        return this;
    }
    public ProdutoStep fecharIframeAdd(){
        manipularElementos.iframeAd();
        fecharAd.click();
        return this;
    }
    public ProdutoStep buscarProdutoPorNome(String produto){
        campoBusca.sendKeys(produto);
        btnLupa.click();
        manipularElementos.scrollDown();
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
//    public ProdutoStep validarCheckoutCar(){
//        WebElement element = driver.findElement(By.xpath("//h4[contains(text(), 'Checkout')]"));
//     return this;
//    }




}
