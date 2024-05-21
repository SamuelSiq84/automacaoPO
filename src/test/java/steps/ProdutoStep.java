package steps;

import map.ProdutoMap;
import org.openqa.selenium.WebDriver;

public class ProdutoStep extends ProdutoMap {
    public ProdutoStep(WebDriver driver) {
        super(driver);
    }
    public ProdutoStep acessarProdutoHome(){
        btnProdutos.click();

        return this;
    }
}
