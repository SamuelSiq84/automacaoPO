package web.map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.BasePage;

public class ProdutoMap extends BasePage {
    public ProdutoMap(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(), ' Products')]")
    public WebElement btnProdutos;

    @FindBy(id = "dismiss-button")
    public WebElement fecharAd;

    @FindBy(id = "search_product")
    public WebElement campoBusca;

    @FindBy(id = "submit_search")
    public WebElement btnLupa;

    @FindBy(xpath = "//i[contains(@class, 'fa fa-plus-square')]")
    public WebElement btnViewProduct;


}
