package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.BasePage;

public class ProdutoMap extends BasePage {
    public ProdutoMap(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[contains(text(), ' Products')]")
    public WebElement btnProdutos;

    @FindBy(xpath = "//*[@id=dismiss-button]")
    public WebElement fecharPopUp;
}
