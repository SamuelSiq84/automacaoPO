package web.steps;

import web.commons.ScrollPage;
import web.map.ProdutoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoStep extends ProdutoMap {

    ScrollPage scrollPage = new ScrollPage(driver);

    public ProdutoStep(WebDriver driver) {
        super(driver);
    }
    public ProdutoStep acessarProdutoHome(){
        btnProdutos.click();
        return this;
    }
    public ProdutoStep iframeAd(){
        driver.switchTo().frame(driver.findElement(By.id("aswift_6")));
        fecharAd.click();
    return this;
    }
    public ProdutoStep buscarProdutoPorNome(String produto){
        campoBusca.sendKeys(produto);
        btnLupa.click();
        scrollPage.scrollDown();
        btnViewProduct.click();

    return this;
    }




}
