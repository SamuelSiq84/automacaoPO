package web.map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import web.BasePage;
import web.commons.ManipularElementos;

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

    @FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
    public WebElement addCar;

    @FindBy(xpath = "//u[contains(text(), 'View Cart')]")
    public WebElement btnViewCar;

    @FindBy(xpath = "//a[contains(text(), 'Proceed To Checkout')]")
    public WebElement btnCheckoutCar;

    @FindBy(xpath = "//li[contains(text(), 'Shopping Cart')]")
    public WebElement lblshopCar;

    @FindBy(xpath = "//h4[contains(text(), 'Checkout')]")
    public WebElement lblCheckout;



}
