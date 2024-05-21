package steps;

import map.ProdutoMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoStep extends ProdutoMap {
    public ProdutoStep(WebDriver driver) {
        super(driver);
    }
    public ProdutoStep acessarProdutoHome(){
        btnProdutos.click();
        driver.findElement(By.xpath("//*[@id=card]"));
        driver.findElement(By.className("btn skip")).click();

        fecharPopUp.click();

        return this;
    }
}
